package step_definations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import testBase.Base;

public class HomePageTest extends Base{
	HomePage hp;
	LoginPage lp;
	
	public HomePageTest(){
		super();
		hp = new HomePage();
		lp = new LoginPage();
	}
	
	@Given("user is in homepage")
	public void user_is_in_homepage() {
		initialization();
		Assert.assertEquals(hp.getHomePageTitle(), "Welcome: Mercury Tours");
	}

	@When("user provided valid username & password")
	public void user_provided_valid_username_password() {
		hp.typeUsername(prop.getProperty("username"));
		hp.typePassword(prop.getProperty("password"));
	}

	@When("click submit button")
	public void click_submit_button() {
		hp.clickSubmitBtn();    
	}

	@Then("user is able to sign in")
	public void user_is_able_to_sign_in() {
	    Assert.assertEquals(lp.getLoginPageTitle(), "Login: Mercury Tours");
	    Assert.assertEquals(lp.getLoginSuccessMsg(), "Login Successfully");
	    tearDown();
	}

}
