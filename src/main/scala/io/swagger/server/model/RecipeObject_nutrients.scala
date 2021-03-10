package io.swagger.server.model


/**
 * An object containing nutrient information for this recipe
 *
 * @param calories An array containing information for calories found in this recipe
 * @param daily_values An array containing information for this recipe's daily recommended value of certain nutrients
 * @param fat An array containing information for fat found in this recipe
 * @param carbs An array containing information for carbs found in this recipe
 * @param vitamins An array containing information for vitamins found in this recipe
 */
case class RecipeObject_nutrients (
  calories: Option[List[RecipeObject_nutrients_calories]],
  daily_values: Option[List[RecipeObject_nutrients_calories]],
  fat: Option[List[RecipeObject_nutrients_calories]],
  carbs: Option[List[RecipeObject_nutrients_calories]],
  vitamins: Option[List[RecipeObject_nutrients_calories]]
)

