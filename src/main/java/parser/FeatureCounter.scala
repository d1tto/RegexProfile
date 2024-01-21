package parser

import java.io.{File, PrintWriter}
import java.nio.charset.Charset
import scala.io.*

object FeatureCounter extends App {
  val input = ""

  go(input)

  def go(path: String): Unit = {
    val regexes = getRegexes(path)
    val regexToFeature = regexes.map(regex => {
      val feature = {
        val x = new RegexFeature(regex)
        x.parse()
        x.feature
      }
      (regex, feature)
    })

    // capture group == 1
    val cgEqual1 = regexToFeature.count { case (regex, feature) =>
      val count = feature(Feature.CaptureGroup)
      count == 1
    }
    // capture group > 1
    val cgGT1 = regexToFeature.count { case (regex, feature) =>
      val count = feature(Feature.CaptureGroup)
      count > 1
    }
    // backref == 1
    val backrefEqual1 = regexToFeature.count { case (regex, feature) =>
      val count = feature(Feature.BackReference)
      count == 1
    }
    // backref > 1
    val backrefGT1 = regexToFeature.count { case (regex, feature) =>
      val count = feature(Feature.BackReference)
      count > 1
    }
    // backref != 0 && cg == 1
    val xxx = regexToFeature.count { case (regex, feature) =>
      val count1 = feature(Feature.BackReference)
      val count2 = feature(Feature.CaptureGroup)
      count1 != 0 && count2 == 1
    }

    println(s"data set path: $path")
    println(s"data set size: ${regexes.size}")
    println(s"capture group == 1: $cgEqual1")
    println(s"capture group >  1: $cgGT1")
    println(s"backreference == 1: $backrefEqual1")
    println(s"backreference >  1: $backrefGT1")
    println(s"backreference != 0 && cg == 1: $xxx")
  }

  private def getRegexes(path: String): List[String] = {
    val file = Source.fromFile(path)(codec = Codec.UTF8)
    val res = file.getLines().toList
    res
  }
}
