package io.swagger.server.model


/**
 * An object containing photos of the front of this item's packaging
 *
 * @param small Small photo of the front of this item's packaging
 * @param thumb Thumbnail photo of the front of this item's packaging
 * @param display Full-sized photo of the front of this item's packaging
 */
case class BrandedFoodObject_packaging_photos_front (
  small: Option[String],
  thumb: Option[String],
  display: Option[String]
)

