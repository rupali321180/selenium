package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinationclass {
    
	public WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   WebDriverManager.firefoxdriver().setup();
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.get("http://106.51.87.42:9007/");
	}

	@When("User enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.id("email")).sendKeys("doctor1@gmail.com");
	    driver.findElement(By.id("password")).sendKeys("123456");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).isDisplayed();
	    System.out.println("hello");
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}



}
