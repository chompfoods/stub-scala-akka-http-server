package io.swagger.server.model


/**
 * An object containing photos of this item's nutrition label
 *
 * @param small Small photo of this item's nutrition label
 * @param thumb Thumbnail photo of this item's nutrition label
 * @param display Full-sized photo of this item's nutrition label
 */
case class BrandedFoodObject_packaging_photos_nutrition (
  small: Option[String],
  thumb: Option[String],
  display: Option[String]
)

