package io.swagger.server.model


/**
 * An object containing additional information on the countries where this item is found
 *
 * @param english_speaking The number of countries where English is the country's primary language
 * @param non_english_speaking The number of countries where English is not the country's primary language
 */
case class BrandedFoodObject_country_details (
  english_speaking: Option[Int],
  non_english_speaking: Option[Int]
)

