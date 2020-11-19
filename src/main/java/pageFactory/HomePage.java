package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testBase.Base;

public class HomePage extends Base {
	// pagefactory = identify element + function of the element
	
	// 1st option not working
//	@FindBy(name="userName")
//	WebElement usernameTxtField;
	
	// 2nd option not working
//	@FindBy(how=How.NAME, using="userName")
//	WebElement usernameTxtField;
	
	// 3rd option working
	By usernameTxtField = By.name("userName");
	
//	@FindBy(name="password")
//	WebElement passwordTxtField;
	
//	@FindBy(how=How.NAME, using="password")
//	WebElement passwordTxtField;
	
	 By passwordTxtField = By.name("password");
	
//	@FindBy(name="submit")
//	WebElement submitBtn;
	
//	@FindBy(how=How.NAME, using="submit")
//	WebElement submitBtn;
	 
	 By submitBtn = By.name("submit");
	 
	 By registerLink = By.linkText("REGISTER");
	 
	 By signOnLink = By.linkText("SIGN-ON");
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public void typeUsername(String username) {
		driver.findElement(usernameTxtField).sendKeys(username);
	}
	
	public void typePassword(String password) {
		driver.findElement(passwordTxtField).sendKeys(password);
	}
	
	public void clickSubmitBtn() {
		driver.findElement(submitBtn).click();
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickRegisterLink() {
		driver.findElement(registerLink).click();
	}
	
	public void clickSignOnLink() {
		driver.findElement(signOnLink).click();
	}

}
