package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/google.feature",glue="stepDefinitions",monochrome=true,plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber-reports/Cucumber.xml"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {
}
