package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information on a specific food portion found in this item
 *
 * @param measurement_unit The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
 * @param description Comments that provide more specificity on the measure. For example, for a pizza measure the dissemination text might be 1 slice is 1/8th of a 14 inch pizza.
 * @param modifier Qualifier of the measure (e.g. related to food shape or form) (e.g. melted, crushed, diced)
 * @param gram_weight The weight of the measure in grams
 * @param data_points The number of observations on which the measure is based
 * @param footnote Comments on any unusual aspects of the measure. Examples might includes caveats on the usage of a measure, or reasons why a measure gram weight is an unexpected value.
 */
case class BrandedFoodObject_portions (
  measurement_unit: Option[String],
  description: Option[String],
  modifier: Option[String],
  gram_weight: Option[BigDecimal],
  data_points: Option[Int],
  footnote: Option[String]
)

