package io.swagger.server.model


/**
 * An object containing this item's ingredients in order of highest value to least
 *
 * @param chomp This item's ingredients as seen on ChompThis.com
 * @param usda This branded food item's ingredients according to the USDA
 */
case class BrandedFoodObject_ingredients (
  chomp: Option[String],
  usda: Option[String]
)

