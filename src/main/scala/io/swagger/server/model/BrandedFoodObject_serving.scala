package io.swagger.server.model


/**
 * An object containing serving information for this item
 *
 * @param chomp 
 * @param usda 
 */
case class BrandedFoodObject_serving (
  chomp: Option[BrandedFoodObject_serving_chomp],
  usda: Option[BrandedFoodObject_serving_usda]
)

