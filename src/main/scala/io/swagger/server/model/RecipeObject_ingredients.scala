package io.swagger.server.model


/**
 * An object containing information about a specific recipe ingredient
 *
 * @param quantity The quantity of this ingredient
 * @param description A description of this ingredient
 */
case class RecipeObject_ingredients (
  quantity: Option[String],
  description: Option[String]
)

