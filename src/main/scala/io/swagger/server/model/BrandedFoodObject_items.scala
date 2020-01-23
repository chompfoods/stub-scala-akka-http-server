package io.swagger.server.model


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
 * @param diet_labels 
 * @param diet_flags An array of ingredient objects that were flagged while grading this item for compatibility with each diet
 * @param packaging_photos 
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
 * @param description A description of this item
 * @param keywords An array of keywords that can be used to describe this item
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
  diet_labels: Option[BrandedFoodObject_diet_labels],
  diet_flags: Option[List[BrandedFoodObject_diet_flags]],
  packaging_photos: Option[BrandedFoodObject_packaging_photos],
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
  description: Option[String],
  keywords: Option[List[String]]
)

