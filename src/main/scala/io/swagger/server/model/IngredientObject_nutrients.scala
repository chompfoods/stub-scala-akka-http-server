package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information for a specific nutrient found in this food item
 *
 * @param name Nutrient name
 * @param per_100g Amount of the nutrient per 100g of food
 * @param measurement_unit The unit used for the measure of this nutrient
 * @param min Minimum nutrient value
 * @param max Maximum nutrient value
 * @param median Median nutrient value
 * @param rank Nutrient rank
 * @param data_points Number of observations on which the value is based
 * @param footnote Comments on any unusual aspect of the food nutrient. Examples might include why a nutrient value is different than typically expected.
 * @param description Description of the nutrient source
 */
case class IngredientObject_nutrients (
  name: Option[String],
  per_100g: Option[BigDecimal],
  measurement_unit: Option[String],
  min: Option[BigDecimal],
  max: Option[BigDecimal],
  median: Option[BigDecimal],
  rank: Option[Int],
  data_points: Option[Int],
  footnote: Option[String],
  description: Option[String]
)

