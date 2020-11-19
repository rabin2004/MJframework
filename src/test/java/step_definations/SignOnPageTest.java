package step_definations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import pageFactory.SignOnPage;
import testBase.Base;

public class SignOnPageTest extends Base{
	HomePage hm;
	SignOnPage so;
	LoginPage lp;
	
	public SignOnPageTest() {
		super();
		hm = new HomePage();
		so = new SignOnPage();
		lp = new LoginPage();
	}
	
	@Given("user is in sign-on page")
	public void user_is_in_sign_on_page() {
		initialization();
		hm.clickSignOnLink();
		Assert.assertEquals(so.getSignOnPageTitle(), "Sign-on: Mercury Tours");
	}

	@When("^user provides valid \"(.*)\" and valid \"(.*)\"$")
	public void user_provides_valid_and_valid(String username, String password) {
	    so.typeUsernameTxtField(username);
	    so.typePasswordTxtField(password);
	    so.clickSubmitBtn();
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	   Assert.assertEquals(lp.getLoginSuccessMsg(), "Login Successfully");
	   Assert.assertEquals(lp.getLoginPageTitle(), "Login: Mercury Tours");
	   tearDown();
	}

}
