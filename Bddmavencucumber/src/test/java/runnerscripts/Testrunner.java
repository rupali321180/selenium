package runnerscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features = {"src/test/resources/features"},
glue = {"stepdefination"},plugin = {"pretty","html:target/htmlreport1.html"})

public class Testrunner extends AbstractTestNGCucumberTests {

}
