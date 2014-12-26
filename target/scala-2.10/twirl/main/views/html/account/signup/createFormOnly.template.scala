
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object createFormOnly extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

"""),format.raw/*8.1*/("""<h3>"""),_display_(/*8.6*/Messages("signup.new")),format.raw/*8.28*/("""</h3>

"""),_display_(/*10.2*/form(controllers.account.routes.Signup.save())/*10.48*/ {_display_(Seq[Any](format.raw/*10.50*/("""

    """),format.raw/*12.5*/("""<fieldset>
        """),_display_(/*13.10*/inputText(
        signupForm("username"),
        'placeholder -> Messages("username"),
        '_label -> null,
        'class -> "form-control"
        )),format.raw/*18.10*/("""
        """),_display_(/*19.10*/inputText(
            signupForm("email"),
            'placeholder -> Messages("email"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputText(
            signupForm("fullname"),
            'placeholder -> Messages("fullname"),
            '_label -> null,
            'class -> "form-control"
        )),format.raw/*30.10*/("""
        """),_display_(/*31.10*/inputPassword(
            signupForm("inputPassword"),
            '_label -> null,
            'placeholder -> Messages("password"),
            'class -> "form-control"
        )),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</fieldset>

    <div class="form-actions">
        <input type="submit" class="btn btn-primary" value=""""),_display_(/*40.62*/Messages("signup.signup")),format.raw/*40.87*/("""">
    </div>
""")))}),format.raw/*42.2*/("""

"""))}
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Dec 24 14:58:40 IST 2014
                  SOURCE: /home/anshika/play/SaralHRM/app/views/account/signup/createFormOnly.scala.html
                  HASH: 18cf188f818ded30e7b23a66ad01ebd50945feb7
                  MATRIX: 767->1|902->65|934->89|1030->41|1058->60|1088->155|1116->157|1146->162|1188->184|1222->192|1277->238|1317->240|1350->246|1397->266|1574->422|1611->432|1798->598|1835->608|2028->780|2065->790|2267->971|2299->976|2431->1081|2477->1106|2522->1121
                  LINES: 26->1|28->4|28->4|31->1|33->4|33->6|35->8|35->8|35->8|37->10|37->10|37->10|39->12|40->13|45->18|46->19|51->24|52->25|57->30|58->31|63->36|64->37|67->40|67->40|69->42
                  -- GENERATED --
              */
          