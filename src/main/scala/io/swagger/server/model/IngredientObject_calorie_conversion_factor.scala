package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing the multiplication factors to be used when calculating energy from macronutrients for a specific food.
 *
 * @param protein_value The multiplication factor for protein
 * @param fat_value The multiplication factor for fat
 * @param carbohydrate_value The multiplication factor for carbohydrates
 */
case class IngredientObject_calorie_conversion_factor (
  protein_value: Option[BigDecimal],
  fat_value: Option[BigDecimal],
  carbohydrate_value: Option[BigDecimal]
)

