package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class HomePage extends Base {
	// pagefactory = identify element + function of the element
	
	@FindBy(name="userName")
	WebElement usernameTxtField;
	
	@FindBy(name="password")
	WebElement passwordTxtField;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String username) {
		usernameTxtField.sendKeys(username);
	}
	
	public void typePassword(String password) {
		passwordTxtField.sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		submitBtn.click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
