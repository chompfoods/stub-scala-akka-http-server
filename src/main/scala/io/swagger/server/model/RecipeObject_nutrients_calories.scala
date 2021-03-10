package io.swagger.server.model


/**
 * @param title Nutrient name
 * @param value The amount of this nutrient in this recipe
 * @param percent The daily recommended percent total for this nutrient
 */
case class RecipeObject_nutrients_calories (
  title: Option[String],
  value: Option[String],
  percent: Option[String]
)

