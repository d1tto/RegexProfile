package parser

import grammar.antlr4.PCREParser.*
import grammar.antlr4.*
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.{ParseTree, TerminalNode}
import org.antlr.v4.runtime.*
import scala.jdk.CollectionConverters.*
import scala.language.implicitConversions
import scala.collection.mutable

class RegexFeatureImpl(val pattern: String) extends PCREBaseVisitor[Unit] {
  private val features = mutable.Set.empty[String]
  private val matchedFeatures = mutable.Map.empty[String, Integer] withDefaultValue 0

  def addFeature(feature: String): Unit = features += feature

  def getMatchFeatures: Map[String, Integer] = matchedFeatures.toMap

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
    val clazz = tree.getClass.getName.toLowerCase()
    features.foreach(feature => {
      if (clazz.contains(feature)) {
        matchedFeatures(feature) += 1
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

object RegexFeatureImplExample extends App {
  val parser = new RegexFeatureImpl("(.{1,2}(111)(((?=ccc)))\\1)+")
  parser.addFeature("backreference1")
  parser.addFeature("lookaround")
  parser.parse()
  val f = parser.getMatchFeatures
  println(f)
}
