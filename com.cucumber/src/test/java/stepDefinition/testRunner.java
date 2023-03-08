package stepDefinition;

import java.awt.Desktop;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue={"stepDefinition"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports/index.html",
		"json:target/JSONReports/report.json",
		"junit:target/JUNITReports/report.xml",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
         ,tags="@TC001" 
)
public class testRunner {

}
