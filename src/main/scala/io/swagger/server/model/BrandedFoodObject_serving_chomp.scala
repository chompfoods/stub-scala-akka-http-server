package io.swagger.server.model


/**
 * Serving information from Chomp's internal database
 *
 * @param size Serving size with measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
 */
case class BrandedFoodObject_serving_chomp (
  size: Option[String]
)

