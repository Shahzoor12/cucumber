package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"stepDefinition"},
monochrome=true,
plugin= {"html:target/cucumber-html-report","json:target/cucumberreports","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adaptor.ExtentCucumberAdapter:"}
//tags="@smoke" 
)
public class testRunner {

}
