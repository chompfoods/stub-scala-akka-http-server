package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information for this specific item.
 *
 * @param name Item name as provided by brand owner or as shown on packaging
 * @param categories 
 * @param nutrients 
 * @param calorie_conversion_factor 
 * @param protein_conversion_factor The multiplication factor used to calculate protein from nitrogen
 * @param diet_labels 
 * @param components An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
 * @param portions An array of objects containing information on discrete amounts of a food found in this item
 * @param common_names Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
 * @param description A description of this item
 * @param footnote Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
 */
case class IngredientObject_items (
  name: Option[String],
  categories: Option[List[String]],
  nutrients: Option[IngredientObject_nutrients],
  calorie_conversion_factor: Option[IngredientObject_calorie_conversion_factor],
  protein_conversion_factor: Option[BigDecimal],
  diet_labels: Option[BrandedFoodObject_diet_labels],
  components: Option[List[IngredientObject_components]],
  portions: Option[List[IngredientObject_portions]],
  common_names: Option[String],
  description: Option[String],
  footnote: Option[String]
)

