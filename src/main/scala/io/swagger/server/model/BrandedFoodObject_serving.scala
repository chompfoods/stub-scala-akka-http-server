package io.swagger.server.model


/**
 * An object containing serving information for this item
 *
 * @param size Serving size
 * @param measurement_unit Measurement unit for each serving (e.g. if measure is 3 tsp, the unit is tsp)
 * @param size_fulltext Serving size description
 */
case class BrandedFoodObject_serving (
  size: Option[String],
  measurement_unit: Option[String],
  size_fulltext: Option[String]
)

