package controllers

import play.api.mvc.{Action, Controller}

object ProductsController extends Controller{

  def getProductsPage = Action {
     val message: String = "Hello"
     val name: String = "World"
     val tom = Cat("Tom",20)
     val jerry = Cat("Jerry", 10)
     val cats = Seq(tom, jerry)

     Ok(views.html.products(message, name, cats))
  }
}
