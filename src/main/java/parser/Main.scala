package parser

import com.github.tototoshi.csv.CSVWriter
import com.github.tototoshi.csv.defaultCSVFormat
import java.io.{File, PrintWriter}
import java.nio.charset.Charset
import scala.io.*

object Main extends App {
  val features = Set("backreference", "lookaround")
  val input = "C:\\Users\\d1tto\\Desktop\\ReDoS\\正则数据集\\java_regex.txt"

  regexFilter(features, input)

  def regexFilter(features: Set[String], input: String): Unit = {
    val inputFile = new File(input)

    val rawFileName = inputFile.getName
    val fileName = if (rawFileName.contains(".")) rawFileName.substring(0, rawFileName.lastIndexOf(".")) else rawFileName

    val output = inputFile.getParentFile.getAbsolutePath + s"/$fileName-output.txt"
    val outputFile = new File(output)
    outputFile.createNewFile()

    val writer = CSVWriter.open(outputFile)
    val regexes = getRegexes(input)
    for (i <- regexes.indices) {
      val regex = regexes(i)
      println(s"$fileName $i / ${regexes.size} $regex")
      val regexFeature = new RegexFeatureImpl(regex)
      features.foreach(f => regexFeature.addFeature(f))
      regexFeature.parse()
      if (regexFeature.hasFeature) {
        val matched = regexFeature.getMatchFeatures.mkString(", ")
        writer.writeRow(Seq(regex, matched))
        writer.flush()
      }
    }
    writer.flush()

  }

  private def getRegexes(path: String): List[String] = {
    val file = Source.fromFile(path)(codec = Codec.UTF8)
    val res = file.getLines().toList
    res
  }
}
