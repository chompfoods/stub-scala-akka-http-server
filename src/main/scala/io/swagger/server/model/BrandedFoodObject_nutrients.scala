package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information for a specific nutrient found in this food item
 *
 * @param name Nutrient name
 * @param per_100g Amount of the nutrient per 100g of food
 * @param measurement_unit The unit used for the measure of this nutrient
 * @param rank Nutrient rank
 * @param data_points Number of observations on which the value is based
 * @param description Description of the nutrient source
 */
case class BrandedFoodObject_nutrients (
  name: Option[String],
  per_100g: Option[BigDecimal],
  measurement_unit: Option[String],
  rank: Option[Int],
  data_points: Option[Int],
  description: Option[String]
)

