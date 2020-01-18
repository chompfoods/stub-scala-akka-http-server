package io.swagger.server.model


/**
 * An object containing this item's compatibility grades for each supported diet
 *
 * @param vegan 
 * @param vegetarian 
 * @param gluten_free 
 */
case class BrandedFoodObject_diet_labels (
  vegan: Option[BrandedFoodObject_diet_labels_vegan],
  vegetarian: Option[BrandedFoodObject_diet_labels_vegetarian],
  gluten_free: Option[BrandedFoodObject_diet_labels_gluten_free]
)

