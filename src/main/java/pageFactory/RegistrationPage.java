package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class RegistrationPage extends Base {
	
	By userNameTxtField = By.id("email");
	By clickSubmit = By.name("submit");
	By registeredMsg = By.xpath("//b[contains(text(),'Note: Your user name is')]");
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typeUserName(String username) {
		driver.findElement(userNameTxtField).sendKeys(username);
	}
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	public void clickSubmitBtn() {
		driver.findElement(clickSubmit).click();
	}
	
	public String getRegisteredMsg(){
		return driver.findElement(registeredMsg).getText().trim();
	}

}
