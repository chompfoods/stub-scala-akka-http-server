package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.BrandedFoodObject
import io.swagger.server.model.IngredientObject

class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {
  import defaultMarshaller._

  lazy val route: Route =
    path("food" / "branded" / "barcode.php") { 
      get {
        parameters("code".as[String]) { (code) =>
          
            
              
                
                  defaultService.foodBrandedBarcodePhpGet(code = code)
               
             
           
         
        }
      }
    } ~
    path("food" / "branded" / "name.php") { 
      get {
        parameters("name".as[String], "limit".as[Int].?, "page".as[Int].?) { (name, limit, page) =>
          
            
              
                
                  defaultService.foodBrandedNamePhpGet(name = name, limit = limit, page = page)
               
             
           
         
        }
      }
    } ~
    path("food" / "branded" / "search.php") { 
      get {
        parameters("allergen".as[String].?, "brand".as[String].?, "category".as[String].?, "country".as[String].?, "diet".as[String].?, "ingredient".as[String].?, "keyword".as[String].?, "mineral".as[String].?, "nutrient".as[String].?, "palm_oil".as[String].?, "trace".as[String].?, "vitamin".as[String].?, "limit".as[Int].?, "page".as[Int].?) { (allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page) =>
          
            
              
                
                  defaultService.foodBrandedSearchPhpGet(allergen = allergen, brand = brand, category = category, country = country, diet = diet, ingredient = ingredient, keyword = keyword, mineral = mineral, nutrient = nutrient, palmOil = palmOil, trace = trace, vitamin = vitamin, limit = limit, page = page)
               
             
           
         
        }
      }
    } ~
    path("food" / "ingredient" / "search.php") { 
      get {
        parameters("find".as[Int], "list".as[Boolean], "raw".as[Boolean].?, "limit".as[Int].?) { (find, list, raw, limit) =>
          
            
              
                
                  defaultService.foodIngredientSearchPhpGet(find = find, list = list, raw = raw, limit = limit)
               
             
           
         
        }
      }
    }
}

trait DefaultApiService {

  def foodBrandedBarcodePhpGet200(responseBrandedFoodObject: BrandedFoodObject)(implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route =
    complete((200, responseBrandedFoodObject))
  def foodBrandedBarcodePhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodBrandedBarcodePhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedBarcodePhpGet403: Route =
    complete((403, "**Forbidden** - Disallowed entity. "))
  def foodBrandedBarcodePhpGet404: Route =
    complete((404, "**Not found** - No food items exist that match your query parameters. "))
  def foodBrandedBarcodePhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 403, Message: **Forbidden** - Disallowed entity. 
   * Code: 404, Message: **Not found** - No food items exist that match your query parameters. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedBarcodePhpGet(code: String)
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodBrandedNamePhpGet200(responseBrandedFoodObject: BrandedFoodObject)(implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route =
    complete((200, responseBrandedFoodObject))
  def foodBrandedNamePhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodBrandedNamePhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedNamePhpGet403: Route =
    complete((403, "**Forbidden** - Disallowed entity. "))
  def foodBrandedNamePhpGet404: Route =
    complete((404, "**Not found** - No food items exist that match your query parameters. "))
  def foodBrandedNamePhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 403, Message: **Forbidden** - Disallowed entity. 
   * Code: 404, Message: **Not found** - No food items exist that match your query parameters. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedNamePhpGet(name: String, limit: Option[Int], page: Option[Int])
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodBrandedSearchPhpGet200(responseBrandedFoodObject: BrandedFoodObject)(implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route =
    complete((200, responseBrandedFoodObject))
  def foodBrandedSearchPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodBrandedSearchPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedSearchPhpGet403: Route =
    complete((403, "**Forbidden** - Disallowed entity. "))
  def foodBrandedSearchPhpGet404: Route =
    complete((404, "**Not found** - No food items exist that match your query parameters. "))
  def foodBrandedSearchPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 403, Message: **Forbidden** - Disallowed entity. 
   * Code: 404, Message: **Not found** - No food items exist that match your query parameters. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedSearchPhpGet(allergen: Option[String], brand: Option[String], category: Option[String], country: Option[String], diet: Option[String], ingredient: Option[String], keyword: Option[String], mineral: Option[String], nutrient: Option[String], palmOil: Option[String], trace: Option[String], vitamin: Option[String], limit: Option[Int], page: Option[Int])
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodIngredientSearchPhpGet200(responseIngredientObject: IngredientObject)(implicit toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]): Route =
    complete((200, responseIngredientObject))
  def foodIngredientSearchPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodIngredientSearchPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodIngredientSearchPhpGet403: Route =
    complete((403, "**Forbidden** - Disallowed entity. "))
  def foodIngredientSearchPhpGet404: Route =
    complete((404, "**Not found** - No food items exist that match your query parameters. "))
  def foodIngredientSearchPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching ingredient foods.  , DataType: IngredientObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 403, Message: **Forbidden** - Disallowed entity. 
   * Code: 404, Message: **Not found** - No food items exist that match your query parameters. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodIngredientSearchPhpGet(find: Int, list: Boolean, raw: Option[Boolean], limit: Option[Int])
      (implicit toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]): Route

}

trait DefaultApiMarshaller {

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]

}

