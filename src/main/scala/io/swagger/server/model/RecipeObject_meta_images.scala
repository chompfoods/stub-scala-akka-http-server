package io.swagger.server.model


/**
 * An object containing this recipe's image URLs
 *
 * @param extra_large Extra large recipe image
 * @param large Large recipe image
 * @param standard Standard recipe image
 * @param grid_view Grid view recipe image
 * @param small Small recipe image
 * @param thumbnail Thumbnail recipe image
 * @param extra_small Extra small recipe image
 */
case class RecipeObject_meta_images (
  extra_large: Option[String],
  large: Option[String],
  standard: Option[String],
  grid_view: Option[String],
  small: Option[String],
  thumbnail: Option[String],
  extra_small: Option[String]
)

