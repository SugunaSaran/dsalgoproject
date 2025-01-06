package stepdefinitions;

import org.testng.Assert;

import DriverManager.DriverFactory;
import Pages.RegisterPO;
import Pages.loginPage;
import io.cucumber.java.en.*;

public class RegisterSD extends DriverFactory{

	loginPage loginObj = new loginPage(DriverFactory.getDriver());
	RegisterPO registerObj = new RegisterPO(DriverFactory.getDriver());
	
	@Given("User is in registration page link")
	public void user_is_in_registration_page_link() {
		loginObj.getStarted();
		registerObj.click_register();
		
	}
	
	@When("User enter valid {string} and invalid {string} ,invalid password confirmation {string} Enter")
	public void user_enter_valid_and_invalid_invalid_password_confirmation_enter(String string, String string2, String string3) {
		registerObj.EnterValues(string,string2,string3);
	}
	
	@Then("The user sees the unsuccessful registration with error message {string}")
	public void the_user_sees_the_unsuccessful_registration_with_error_message(String string) {
		String actualMessage = registerObj.getErrorMsg();
		System.out.println(actualMessage);
		String expectedMessage= "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@When("User enter empty username or  password or password confirmation - Enter")
	public void user_enter_empty_username_or_password_or_password_confirmation_enter() {
		String string ="";
		String string2 ="";
		String string3="";
		registerObj.EnterValues(string,string2,string3);
	}
	
	@Then("The user sees a warning message {string}")
	public void the_user_sees_a_warning_message(String string) {
		Assert.assertEquals("Registration", registerObj.validatePageTitle());
	}

	@When("User enter valid {string} and valid {string} ,invalid password confirmation {string} Enter")
	public void user_enter_valid_and_valid_invalid_password_confirmation_enter(String string, String string2, String string3) {
		registerObj.EnterValues(string,string2,string3);
	}
	
	@When("User enter existing {string} Enter")
	public void user_enter_existing_enter(String string) {
	}
	
	@When("User enter mismatched password or password confirmation - Enter")
	public void user_enter_mismatched_password_or_password_confirmation_enter() {
		registerObj.EnterValues(configReader.getUserName(), configReader.getPassword(),"test");
	}
	
	@Then("The user sees a error message {string}")
	public void the_user_sees_a_error_message(String string) {
	}
	
	@Then("The registration should be unsuccessfull with error messages with  {string}")
	public void the_registration_should_be_unsuccessfull_with_error_messages_with(String string) {
		String actualMessage = registerObj.getErrorMsg();
		System.out.println(actualMessage);
		String expectedMessage= "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
}
