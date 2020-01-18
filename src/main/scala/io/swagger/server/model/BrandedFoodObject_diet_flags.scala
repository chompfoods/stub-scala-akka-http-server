package io.swagger.server.model


/**
 * An object containing information on an individual ingredient that was flagged as potentially not being compatible with a certain diet
 *
 * @param ingredient Ingredient name
 * @param ingredient_description Description of the ingredient
 * @param diet_label Name of the diet with which this ingredient may not be compatible
 * @param is_compatible A description of if we believe this ingredient is compatible with the diet
 * @param compatibility_level A numeric representation of if we believe this ingredient is compatible with the diet. Higher values indicate more compatibility
 * @param compatibility_description A description of how we graded this ingredient for compatibility with the diet
 * @param is_allergen Boolean representing if the ingredient is a known allergen
 */
case class BrandedFoodObject_diet_flags (
  ingredient: Option[String],
  ingredient_description: Option[String],
  diet_label: Option[String],
  is_compatible: Option[String],
  compatibility_level: Option[Int],
  compatibility_description: Option[String],
  is_allergen: Option[Boolean]
)

