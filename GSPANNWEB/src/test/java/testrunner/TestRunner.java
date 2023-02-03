package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
		
		features="src/test/resources/features",
		glue="com.step.definitions",
		//plugin = {"pretty","io.qameta.allure.cucumber7jvm"},
		plugin = {"pretty","html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome = true,
		publish = true,
		tags  = "@smoke"
		
)
public class TestRunner{

}
