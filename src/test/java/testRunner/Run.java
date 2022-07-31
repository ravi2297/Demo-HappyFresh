package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions  

				(
						features = ".//Features",
						glue = "stepDef",
						monochrome = true,
						dryRun = false,
						plugin = {"pretty","html:target/htmlReport.html"}
						
						
						)

public class Run extends AbstractTestNGCucumberTests {

}
