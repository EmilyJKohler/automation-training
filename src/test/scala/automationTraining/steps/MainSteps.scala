package automationTraining.steps

import automationTraining.pages.GovUkPage
import cucumber.api.scala.{EN, ScalaDsl}

class MainSteps extends ScalaDsl with EN {


  When("""^A user navigates to Gov UK$""") { () =>
  GovUkPage.navigateTo()

  }

  Then("""^They will be on the correct page$""") { () =>
  GovUkPage.checkHeader()

  }
}
