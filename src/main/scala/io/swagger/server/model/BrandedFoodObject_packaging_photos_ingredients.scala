package io.swagger.server.model


/**
 * An object containing photos of the ingredients on this item's packaging
 *
 * @param small Small photo of the ingredients on this item's packaging
 * @param thumb Thumbnail photo of the ingredients on this item's packaging
 * @param display Full-sized photo of the ingredients on this item's packaging
 */
case class BrandedFoodObject_packaging_photos_ingredients (
  small: Option[String],
  thumb: Option[String],
  display: Option[String]
)

