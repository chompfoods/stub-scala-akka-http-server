package io.swagger.server.model


/**
 * A object containing a collection of photos of this item's packaging
 *
 * @param front 
 * @param nutrition 
 * @param ingredients 
 */
case class BrandedFoodObject_packaging_photos (
  front: Option[BrandedFoodObject_packaging_photos_front],
  nutrition: Option[BrandedFoodObject_packaging_photos_nutrition],
  ingredients: Option[BrandedFoodObject_packaging_photos_ingredients]
)

