package Stepdefrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression",features= {"src\\test\\resources\\featuretags"},
   glue= {"Stepdefination1"},plugin = {"pretty","html:target/htmlreport.html"})
public class Featuretagrun extends AbstractTestNGCucumberTests
{

}
