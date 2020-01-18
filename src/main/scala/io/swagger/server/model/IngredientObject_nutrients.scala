package io.swagger.server.model


/**
 * An object containing nutrient information from each source
 *
 * @param usda An array containing an object for each nutrient data point as found in the USDA database
 */
case class IngredientObject_nutrients (
  usda: Option[List[BrandedFoodObject_nutrients_usda]]
)

