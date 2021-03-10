package io.swagger.server.model


/**
 * An object containing information for this specific item.
 *
 * @param id Unique recipe ID
 * @param title Recipe title
 * @param meta 
 * @param categories 
 * @param author The author of this recipe. You must attribute this author when displaying this recipe.
 * @param keywords 
 * @param topics 
 * @param attributes 
 * @param ingredients An array containing this recipe's ingredients
 * @param base_ingredients 
 * @param nutrients 
 * @param diabetic_exchanges 
 */
case class RecipeObject_items (
  id: Option[String],
  title: Option[String],
  meta: Option[RecipeObject_meta],
  categories: Option[List[String]],
  author: Option[String],
  keywords: Option[List[String]],
  topics: Option[List[String]],
  attributes: Option[RecipeObject_attributes],
  ingredients: Option[List[RecipeObject_ingredients]],
  base_ingredients: Option[List[String]],
  nutrients: Option[RecipeObject_nutrients],
  diabetic_exchanges: Option[List[String]]
)

