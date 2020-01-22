package io.swagger.server.model


/**
 * An object containing basic packaging information about this item
 *
 * @param quantity Package quantity
 * @param size Package size
 */
case class BrandedFoodObject_package (
  quantity: Option[Int],
  size: Option[String]
)

