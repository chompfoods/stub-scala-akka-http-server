package io.swagger.server.model


/**
 * An object containing this item's compatibility grades for each supported diet
 *
 * @param url URL to the recipe. You must link back to the recipe when displaying it.
 * @param images 
 * @param source The source of the recipe. You must attribute this source when displaying this recipe.
 * @param cuisine This recipe's cuisine
 * @param created The date when this recipe was created
 * @param modified The date when this recipe was most recently modified
 * @param nutrients_notice Additional information about this recipe's nutrients
 */
case class RecipeObject_meta (
  url: Option[String],
  images: Option[RecipeObject_meta_images],
  source: Option[String],
  cuisine: Option[String],
  created: Option[String],
  modified: Option[String],
  nutrients_notice: Option[String]
)

