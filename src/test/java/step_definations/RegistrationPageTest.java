package step_definations;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.RegistrationPage;
import testBase.Base;

public class RegistrationPageTest extends Base{
	RegistrationPage rp;
	HomePage hp;
	
	public RegistrationPageTest(){
		super();
		rp = new RegistrationPage();
		hp = new HomePage();
	}

	@Given("user is in register page")
	public void user_is_in_register_page() {
		initialization();
		hp.clickRegisterLink();
		Assert.assertEquals(rp.getRegisterPageTitle(), "Register: Mercury Tours");
	}

	@When("user provides all the valid credentials")
	public void user_provides_all_the_valid_credentials() {
	    rp.typeUserName(prop.getProperty("Rusername"));
	}

	@When("clicks submit button")
	public void clicks_submit_button() {
	    rp.clickSubmitBtn();
	}

	@Then("user should be able to register")
	public void user_should_be_able_to_register() {
	   Assert.assertEquals(rp.getRegisteredMsg(), "Note: Your user name is Tom123.");
	   tearDown();
	}
}
