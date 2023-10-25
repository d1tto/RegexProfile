package parser

import grammar.antlr4.PCREParser.*
import grammar.antlr4.*
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.{ParseTree, TerminalNode}
import org.antlr.v4.runtime.*
import scala.jdk.CollectionConverters.*
import scala.language.implicitConversions
import scala.collection.mutable

class RegexFeature(val pattern: String) extends PCREBaseVisitor[Unit] {
  private val features = mutable.Set.empty[String]
  private val matchedFeatures = mutable.Set.empty[String]

  def addFeature(feature: String): Unit = features += feature

  def getMatchFeatures: Set[String] = matchedFeatures.toSet

  def hasFeature: Boolean = matchedFeatures.nonEmpty

  private object ThrowingErrorListener {
    val INSTANCE = new ThrowingErrorListener
  }

  class ThrowingErrorListener extends BaseErrorListener {
    @throws[ParseCancellationException]
    override def syntaxError(recognizer: Recognizer[?,?], offendingSymbol: Object, line: Int, charPositionInLine: Int, msg: String, e: RecognitionException): Unit = {
      throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg)
    }
  }

  def parse(): Unit = {
    val lexer = new PCRELexer(CharStreams.fromString(pattern))
    lexer.removeErrorListeners()
    lexer.addErrorListener(ThrowingErrorListener.INSTANCE)
    val parser = new PCREParser(new CommonTokenStream(lexer))
    parser.removeErrorListeners()
    parser.addErrorListener(ThrowingErrorListener.INSTANCE)
    try {
      val context = parser.parse()
      features.map(f => f.toLowerCase)
      visitParse(context)
    } catch {
      case e: Exception =>
    }
  }

  override def visitParse(ctx: PCREParser.ParseContext): Unit = {
    ctx.children.forEach(visitParseTree)
  }

  def visitParseTree(tree: ParseTree): Unit = {
    tryMatchFeature(tree)
    getChildren(tree).foreach(visitParseTree)
  }

  private def tryMatchFeature(tree: ParseTree): Unit = {
    features.foreach(feature => {
      val clazz = tree.getClass.getName.toLowerCase()
      if (clazz.contains(feature)) {
        matchedFeatures += feature
      }
    })
  }

  private def getChildren(tree: ParseTree): List[ParseTree] = {
    val res = mutable.ListBuffer.empty[ParseTree]
    for (i <- 0 until tree.getChildCount) {
      res += tree.getChild(i)
    }
    res.toList
  }
}

object Runner extends App {
  val parser = new RegexFeature("(.{1,2}(111)(((?=ccc)))\\1)+")
  parser.addFeature("backreference")
  parser.addFeature("lookaround")
  parser.parse()
  val f = parser.getMatchFeatures
  println(f)
}
