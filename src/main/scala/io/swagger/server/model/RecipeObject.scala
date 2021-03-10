package io.swagger.server.model


/**
 * Please read the description of each field in this API response object example. By default, the value of each field is **null**. This indicates an unknown state or that no data exists.
 *
 * @param items An array containing an object for each individual item returned by your API call.
 */
case class RecipeObject (
  items: Option[List[RecipeObject_items]]
)

