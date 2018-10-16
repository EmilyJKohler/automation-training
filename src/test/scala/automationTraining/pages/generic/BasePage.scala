package automationTraining.pages.generic

import automationTraining.pages.GovUkPage.driver
import automationTraining.utils.Driver
import org.scalatest.Matchers
import org.scalatest.selenium.WebBrowser

trait BasePage extends Driver with Matchers with WebBrowser {

  val url = ""

  def navigateTo(): Unit = go to url


}
