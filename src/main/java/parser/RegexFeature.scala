package parser

import scala.collection.mutable

enum Feature {
  case CaptureGroup, BackReference
}

class RegexFeature(pattern: String) {
  private val featureMap = Map(
    Feature.CaptureGroup -> List("capture1", "capture2", "capture3", "capture4"),
    Feature.BackReference -> List(
      "backreference1", "backreference2", "backreference3", "backreference4",
      "backreference5", "backreference6", "backreference7", "backreference8",
      "backreference9"
    )
  )

  private val _features = mutable.Map.empty[Feature, Integer] withDefaultValue 0

  def parse(): Unit = {
    val lowLevelFeature = {
      val impl = new RegexFeatureImpl(pattern)
      featureMap.flatMap(_._2).foreach(impl.addFeature)
      impl.parse()
      impl.getMatchFeatures
    }

    val rev = featureMap.flatMap { case (feature, strs) => strs.map(_ -> feature) }
    lowLevelFeature.foreach((str, count) => {
      val feature = rev(str)
      _features(feature) += count
    })
  }

  def feature: Map[Feature, Integer] = _features.toMap withDefaultValue 0
}

object RegexFeatureExample extends App {
  val parser = new RegexFeature("(.{1,2}(111)(((?=ccc)))\\1)+")
  parser.parse()
  val f = parser.feature
  println(f)
}