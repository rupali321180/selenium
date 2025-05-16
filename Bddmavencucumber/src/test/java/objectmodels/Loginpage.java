package objectmodels;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="email") 
	private WebElement uname;
	@FindBy(id="password")
	private WebElement psw;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn;

	public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}

	public void passuname(String un) {
		uname.sendKeys(un);
	}
	public void passpsw(String pws) {
		psw.sendKeys(pws);
		
	}
	public void validclk() {
		btn.click();
	}
}


