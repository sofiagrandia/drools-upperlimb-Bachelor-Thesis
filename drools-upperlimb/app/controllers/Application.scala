package controllers

import com.google.inject.Singleton
import play.api.mvc.Results.Ok
import play.api.mvc._
import play.api.routing.JavaScriptReverseRouter
import play.mvc.Controller
import javax.inject.Inject
import entities.Patient
@Singleton
class Application @Inject() (val controllerComponents: ControllerComponents, assets: Assets) extends BaseController {


  def jsRoutes = Action { implicit request =>
    val jsTest: Seq[Patient] = null
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.DroolsController.simpleGet
      )
    )
  }

}