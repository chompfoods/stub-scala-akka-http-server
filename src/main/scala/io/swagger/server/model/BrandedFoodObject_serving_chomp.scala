package io.swagger.server.model


/**
 * Serving information from as seen on ChompThis.com
 *
 * @param size Serving size with measurement unit (e.g. if measure is 3 tsp, the unit is tsp)
 */
case class BrandedFoodObject_serving_chomp (
  size: Option[String]
)

