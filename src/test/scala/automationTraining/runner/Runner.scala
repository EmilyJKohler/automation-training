package automationTraining.runner

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/feature"),
  glue = Array("automationTraining.steps"),
  format = Array ("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = Array("~@Ignore")
)
class Runner {

}
