package io.swagger.server.model

import java.math.BigDecimal

/**
 * An object containing information on a specific component of this food item
 *
 * @param name The kind of component, e.g. bone
 * @param pct_weight The weight of the component as a percentage of the total weight of the food
 * @param gram_weight The weight of the component in grams
 * @param is_refuse Whether the component is refuse, i.e. not edible
 * @param data_points The number of obersvations on which the measure is based
 */
case class IngredientObject_components (
  name: Option[String],
  pct_weight: Option[BigDecimal],
  gram_weight: Option[BigDecimal],
  is_refuse: Option[Boolean],
  data_points: Option[Int]
)

