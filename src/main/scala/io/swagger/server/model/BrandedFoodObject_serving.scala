package io.swagger.server.model


/**
 * An object containing serving information for this item
 *
 * @param size Serving size with measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
 * @param size_fulltext Serving size description
 * @param total Total servings
 */
case class BrandedFoodObject_serving (
  size: Option[String],
  size_fulltext: Option[String],
  total: Option[Int]
)

