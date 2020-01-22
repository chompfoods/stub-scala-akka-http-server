package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information for this specific item.
 *
 * @param barcode EAN/UPC barcode
 * @param name Item name as provided by brand owner or as shown on packaging
 * @param brand The brand name that owns this item
 * @param ingredients 
 * @param `package` 
 * @param serving 
 * @param categories 
 * @param nutrients 
 * @param calorie_conversion_factor 
 * @param protein_conversion_factor The multiplication factor used to calculate protein from nitrogen
 * @param diet_labels 
 * @param diet_flags An array of ingredient objects that were flagged while grading this item for compatibility with each diet
 * @param packaging_photos 
 * @param components An array of objects containing the constituent parts of a food (e.g. bone is a component of meat)
 * @param portions An array of objects containing information on discrete amounts of a food found in this item
 * @param allergens An array of ingredients in this item that may cause allergic reactions in people
 * @param brand_list An array of brands we have associated with this item. Some items are sold by more than 1 brand.
 * @param countries An array of countries where this item is sold
 * @param country_details 
 * @param palm_oil_ingredients An array of ingredients made from palm oil
 * @param ingredient_list An array of this item's ingredients
 * @param has_english_ingredients A boolean indicating if we have English ingredients for this item
 * @param minerals An array of minerals that this item contains
 * @param traces An array of trace ingredients that may be found in this item
 * @param vitamins An array of vitamins that are found in this item
 * @param common_name Common names associated with this item. These generally clarify what the item is (e.g. when the brand name is \"BRAND's Spicy Enchilada\" the common name may be \"Chicken enchilada\")
 * @param description A description of this item
 * @param keywords An array of keywords that can be used to describe this item
 * @param footnote Comments on any unusual aspects of this item. Examples might include unusual aspects of the food overall.
 */
case class BrandedFoodObject_items (
  barcode: Option[String],
  name: Option[String],
  brand: Option[String],
  ingredients: Option[BrandedFoodObject_ingredients],
  `package`: Option[BrandedFoodObject_package],
  serving: Option[BrandedFoodObject_serving],
  categories: Option[List[String]],
  nutrients: Option[BrandedFoodObject_nutrients],
  calorie_conversion_factor: Option[BrandedFoodObject_calorie_conversion_factor],
  protein_conversion_factor: Option[BigDecimal],
  diet_labels: Option[BrandedFoodObject_diet_labels],
  diet_flags: Option[List[BrandedFoodObject_diet_flags]],
  packaging_photos: Option[BrandedFoodObject_packaging_photos],
  components: Option[List[BrandedFoodObject_components]],
  portions: Option[List[BrandedFoodObject_portions]],
  allergens: Option[List[String]],
  brand_list: Option[List[String]],
  countries: Option[List[String]],
  country_details: Option[BrandedFoodObject_country_details],
  palm_oil_ingredients: Option[List[String]],
  ingredient_list: Option[List[String]],
  has_english_ingredients: Option[Boolean],
  minerals: Option[List[String]],
  traces: Option[List[String]],
  vitamins: Option[List[String]],
  common_name: Option[String],
  description: Option[String],
  keywords: Option[List[String]],
  footnote: Option[String]
)

