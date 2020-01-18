package io.swagger.server.model

import java.math.BigDecimal

/**
 * @param name Nutrient name
 * @param measurement_unit The unit used for measure (e.g. if mesure is 3 tsp, the unit is tsp)
 * @param per_100g Amount of the nutrient per 100g of food
 * @param per_serving Nutrient value per serving
 * @param total Total nutrient value
 */
case class BrandedFoodObject_nutrients_chomp (
  name: Option[String],
  measurement_unit: Option[String],
  per_100g: Option[BigDecimal],
  per_serving: Option[BigDecimal],
  total: Option[BigDecimal]
)

