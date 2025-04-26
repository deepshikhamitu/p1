package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/gmailLogin.feature",glue="stepDefinitions",monochrome=true,plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class gmailRunner extends AbstractTestNGCucumberTests {

}
