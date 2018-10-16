package automationTraining.pages

import automationTraining.pages.generic.BasePage

object GovUkPage extends BasePage {

  override val url = "https://www.gov.uk/"

  def checkHeader(): Unit = find(cssSelector("h1")).get.text shouldBe "Welcome to GOV.UK"

}
