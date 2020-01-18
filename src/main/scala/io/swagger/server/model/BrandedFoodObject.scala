package io.swagger.server.model


/**
 * Please read the description of each field in this API response object example. By default, the value of each field is __null__. This indicates an unknown state or that no data exists.
 *
 * @param items An array containing an object for each individual item returned by your API call.
 */
case class BrandedFoodObject (
  items: Option[List[BrandedFoodObject_items]]
)

