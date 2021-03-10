package io.swagger.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.unmarshalling.FromRequestUnmarshaller
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import io.swagger.server.AkkaHttpHelper._
import io.swagger.server.model.BrandedFoodObject
import io.swagger.server.model.IngredientObject
import io.swagger.server.model.RecipeObject

class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {
  import defaultMarshaller._

  lazy val route: Route =
    path() { () => 
      get {
        parameters("code".as[String], "user_id".as[String].?) { (code, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.foodBrandedBarcodePhpGet(code = code, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("name".as[String], "limit".as[Int].?, "page".as[Int].?, "user_id".as[String].?) { (name, limit, page, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.foodBrandedNamePhpGet(name = name, limit = limit, page = page, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("allergen".as[String].?, "brand".as[String].?, "category".as[String].?, "country".as[String].?, "diet".as[String].?, "ingredient".as[String].?, "keyword".as[String].?, "mineral".as[String].?, "nutrient".as[String].?, "palm_oil".as[String].?, "trace".as[String].?, "vitamin".as[String].?, "limit".as[Int].?, "page".as[Int].?, "user_id".as[String].?) { (allergen, brand, category, country, diet, ingredient, keyword, mineral, nutrient, palmOil, trace, vitamin, limit, page, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.foodBrandedSearchPhpGet(allergen = allergen, brand = brand, category = category, country = country, diet = diet, ingredient = ingredient, keyword = keyword, mineral = mineral, nutrient = nutrient, palmOil = palmOil, trace = trace, vitamin = vitamin, limit = limit, page = page, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("find".as[String], "limit".as[Int].?, "user_id".as[String].?) { (find, limit, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.foodIngredientSearchPhpGet(find = find, limit = limit, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("id".as[String], "user_id".as[String].?) { (id, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.recipeIdPhpGet(id = id, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("list".as[String], "limit".as[Int].?, "page".as[Int].?, "user_id".as[String].?) { (list, limit, page, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.recipeIngredientPhpGet(list = list, limit = limit, page = page, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("limit".as[Int].?, "user_id".as[String].?) { (limit, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.recipeRandomPhpGet(limit = limit, userId = userId)
               
             
            }
         
        }
      }
    } ~
    path() { () => 
      get {
        parameters("title".as[String], "excluded_cuisine".as[String].?, "included_cuisine".as[String].?, "excluded_ingredient".as[String].?, "included_ingredient".as[String].?, "nutrients_required".as[Int].?, "limit".as[Int].?, "page".as[Int].?, "user_id".as[String].?) { (title, excludedCuisine, includedCuisine, excludedIngredient, includedIngredient, nutrientsRequired, limit, page, userId) =>
          
            formFields() { () =>
              
                
                  defaultService.recipeSearchPhpGet(title = title, excludedCuisine = excludedCuisine, includedCuisine = includedCuisine, excludedIngredient = excludedIngredient, includedIngredient = includedIngredient, nutrientsRequired = nutrientsRequired, limit = limit, page = page, userId = userId)
               
             
            }
         
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
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedBarcodePhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def foodBrandedBarcodePhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedBarcodePhpGet(code: String, userId: Option[String])
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodBrandedNamePhpGet200(responseBrandedFoodObject: BrandedFoodObject)(implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route =
    complete((200, responseBrandedFoodObject))
  def foodBrandedNamePhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodBrandedNamePhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedNamePhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def foodBrandedNamePhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedNamePhpGet(name: String, limit: Option[Int], page: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodBrandedSearchPhpGet200(responseBrandedFoodObject: BrandedFoodObject)(implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route =
    complete((200, responseBrandedFoodObject))
  def foodBrandedSearchPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodBrandedSearchPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodBrandedSearchPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def foodBrandedSearchPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching foods.  , DataType: BrandedFoodObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodBrandedSearchPhpGet(allergen: Option[String], brand: Option[String], category: Option[String], country: Option[String], diet: Option[String], ingredient: Option[String], keyword: Option[String], mineral: Option[String], nutrient: Option[String], palmOil: Option[String], trace: Option[String], vitamin: Option[String], limit: Option[Int], page: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]): Route

  def foodIngredientSearchPhpGet200(responseIngredientObject: IngredientObject)(implicit toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]): Route =
    complete((200, responseIngredientObject))
  def foodIngredientSearchPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def foodIngredientSearchPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def foodIngredientSearchPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def foodIngredientSearchPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching ingredient foods.  , DataType: IngredientObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def foodIngredientSearchPhpGet(find: String, limit: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]): Route

  def recipeIdPhpGet200(responseRecipeObject: RecipeObject)(implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route =
    complete((200, responseRecipeObject))
  def recipeIdPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def recipeIdPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def recipeIdPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def recipeIdPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching recipes.  , DataType: RecipeObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def recipeIdPhpGet(id: String, userId: Option[String])
      (implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route

  def recipeIngredientPhpGet200(responseRecipeObject: RecipeObject)(implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route =
    complete((200, responseRecipeObject))
  def recipeIngredientPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def recipeIngredientPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def recipeIngredientPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def recipeIngredientPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching recipes.  , DataType: RecipeObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def recipeIngredientPhpGet(list: String, limit: Option[Int], page: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route

  def recipeRandomPhpGet200(responseRecipeObject: RecipeObject)(implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route =
    complete((200, responseRecipeObject))
  def recipeRandomPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def recipeRandomPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def recipeRandomPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def recipeRandomPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching recipes.  , DataType: RecipeObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def recipeRandomPhpGet(limit: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route

  def recipeSearchPhpGet200(responseRecipeObject: RecipeObject)(implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route =
    complete((200, responseRecipeObject))
  def recipeSearchPhpGet400: Route =
    complete((400, "**Validation error** - Invalid parameters or request. "))
  def recipeSearchPhpGet401: Route =
    complete((401, "**Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** "))
  def recipeSearchPhpGet404: Route =
    complete((404, "**Not found** - No food items were found. "))
  def recipeSearchPhpGet500: Route =
    complete((500, "**Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* "))
  /**
   * Code: 200, Message: **Valid** - Will return an object containing any matching recipes.  , DataType: RecipeObject
   * Code: 400, Message: **Validation error** - Invalid parameters or request. 
   * Code: 401, Message: **Unauthorized** - Invalid API key, unauthorized access, or usage limits exceeded. ***[More information &amp;raquo;](https://desk.zoho.com/portal/chompthis/kb/articles/what-is-a-rate-limit)*** 
   * Code: 404, Message: **Not found** - No food items were found. 
   * Code: 500, Message: **Server error** - Internal server error, request failed, or base error. *Please **[contact us](https://chompthis.com/api/ticket-new.php)** if you see this.* 
   */
  def recipeSearchPhpGet(title: String, excludedCuisine: Option[String], includedCuisine: Option[String], excludedIngredient: Option[String], includedIngredient: Option[String], nutrientsRequired: Option[Int], limit: Option[Int], page: Option[Int], userId: Option[String])
      (implicit toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]): Route

}

trait DefaultApiMarshaller {

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerBrandedFoodObject: ToEntityMarshaller[BrandedFoodObject]

  implicit def toEntityMarshallerIngredientObject: ToEntityMarshaller[IngredientObject]

  implicit def toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]

  implicit def toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]

  implicit def toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]

  implicit def toEntityMarshallerRecipeObject: ToEntityMarshaller[RecipeObject]

}

