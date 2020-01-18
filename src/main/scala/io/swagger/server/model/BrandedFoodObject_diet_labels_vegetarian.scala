package io.swagger.server.model


/**
 * An object containing information on this item's compatibility with Vegetarian diets
 *
 * @param name Diet name
 * @param is_compatible Boolean describing if this item is compatible with this diet
 * @param compatibility_level Numeric representation of how compatible this item is with this diet. Higher values indicate more compatibility
 * @param confidence Boolean that indicates if we are confident in how this item is graded for this diet
 * @param confidence_description Description of our confidence that this item was graded correctly
 */
case class BrandedFoodObject_diet_labels_vegetarian (
  name: Option[String],
  is_compatible: Option[Boolean],
  compatibility_level: Option[Int],
  confidence: Option[Int],
  confidence_description: Option[String]
)

