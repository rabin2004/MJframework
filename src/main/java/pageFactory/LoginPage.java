package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class LoginPage extends Base {

	@FindBy(xpath="//h3[text()='Login Successfully']")
	WebElement LoginSuccessMsg;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginSuccessMsg() {
		return LoginSuccessMsg.getText();
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
}
