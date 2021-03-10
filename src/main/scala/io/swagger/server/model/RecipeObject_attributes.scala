package io.swagger.server.model


/**
 * An object containing recipe attributes
 *
 * @param prep_time The time it takes to prep this recipe
 * @param total_time The total time it takes to make this recipe
 * @param servings The number of servings this recipe makes
 * @param serving_size The size of each serving
 */
case class RecipeObject_attributes (
  prep_time: Option[String],
  total_time: Option[String],
  servings: Option[String],
  serving_size: Option[String]
)

