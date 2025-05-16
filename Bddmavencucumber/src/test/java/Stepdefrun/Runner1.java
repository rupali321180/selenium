package Stepdefrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags="",features = {"src/test/resources/features"},
glue={"Stepdefination1"},plugin = {"pretty","html:target/htmlreport.html"})
public class Runner1 extends AbstractTestNGCucumberTests{

}
