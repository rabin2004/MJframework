package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class SignOnPage extends Base{

	By usernameTxtField = By.name("userName");
	By passwordTxtField = By.name("password");
	By submitBtn = By.name("submit");
//	@FindBy(name="userName")
//	WebElement usernameTxtField;
//	
//	@FindBy(name="password")
//	WebElement passwordTxtField;
//	
//	@FindBy(name="submit")
//	WebElement submitBtn;
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsernameTxtField(String username) {
		driver.findElement(usernameTxtField).sendKeys(username);
	}
	
	public void typePasswordTxtField(String password) {
		driver.findElement(passwordTxtField).sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	
	public String getSignOnPageTitle() {
		return driver.getTitle();
	}
	
}
