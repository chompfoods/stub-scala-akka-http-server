package io.swagger.server.model


/**
 * An object containing nutrient information from multiple sources
 *
 * @param chomp An array containing an object for each nutrient data point
 * @param usda An array containing an object for each nutrient data point as found in the USDA database
 */
case class BrandedFoodObject_nutrients (
  chomp: Option[List[BrandedFoodObject_nutrients_chomp]],
  usda: Option[List[BrandedFoodObject_nutrients_usda]]
)

