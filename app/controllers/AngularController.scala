package controllers

import play.api.libs.concurrent.Execution.Implicits.defaultContext

import play.api.mvc.{Action, _}
import play.api.libs.json.Json

case class Cat(name: String, age: Int) {
    println("Call class Cat: " + this.hashCode())
}

object AngularController extends Controller {
  println("Call controller " + this.hashCode())

  def index = Action {
    Ok(views.html.angular())
  }

  def login = Action {
    implicit val json = Json.format[Cat]
    val result = List(Cat("Tom", 10), Cat("Jerry", 20))

    println("Call method login with object cat" + result.hashCode() + " / and controller hash is " + this.hashCode() )

    Ok(Json.toJson(result))
  }

  def getStatus = Action.async {
    def res = 1
    val futureInt = scala.concurrent.Future {res}
    futureInt.map(i => Ok("Got result: " + i))
  }
}
