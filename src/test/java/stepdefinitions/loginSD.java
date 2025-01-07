package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
import DriverManager.DriverFactory;
import io.cucumber.java.en.*;
import Pages.*;

public class loginSD extends DriverFactory {


	loginPage loginObj = new loginPage(DriverFactory.getDriver());
	

	@Given("The user is on the DSAlgo Signin Page")
	public void the_user_is_on_the_ds_algo_signin_page() {
		//driver.findElement(By.xpath("//button[@class='btn']")).click();
		loginObj.getStarted();

	}

	@When("The user clicks login button after entering invalid {string} and invalid {string}")
	public void the_user_clicks_login_button_after_entering_invalid_and_invalid(String string, String string2) {
		loginObj.clkSignin();
		loginObj.enterLogin(string, string2);

	}


	@Then("The user see the warning messsage {string}")
	public void the_user_see_the_warning_messsage(String string) {
		String actualMessage = loginObj.getErrorMsg();
		System.out.println(actualMessage);
		String expectedMessage= "Invalid Username and Password";
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("The user clicks login button after entering valid username and valid password")
	public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
		//driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
		loginObj.clkSignin();
		loginObj.enterLogin(configReader.getUserName(), configReader.getPassword());
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {	
		String actualMessage = loginObj.getErrorMsg();
		System.out.println(actualMessage);
		String expectedMessage= "You are logged in";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	
	@When("The user clicks login button after entering invalid {string} and invalid {int}")
	public void the_user_clicks_login_button_after_entering_invalid_and_invalid(String string, Integer int1)  throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(loginObj.excelPath, "Login_Invalid");
	    String username=data.get(int1).get("UserName");
	    String password=data.get(int1).get("Password");
	    loginObj.clkSignin();
		loginObj.enterLogin(username, password);
	}
	@Then("The user see the warning messsage Invalid Username and Password")
	public void the_user_see_the_warning_messsage_invalid_username_and_password() throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(loginObj.excelPath, "Login_Invalid");
	    String expectedMessage=data.get(0).get("Message");
		String actualMessage = loginObj.getErrorMsg();
		Assert.assertEquals(expectedMessage, actualMessage);
	}


	@When("The user clicks the getStarted of {string}")
	public void the_user_clicks_the_get_started_of(String string) {
		loginObj.homeGetStarted(string);
	}

	@Then("the user stays in homepage with message {string}")
	public void the_user_stays_in_homepage_with_message(String string) {
		//WebElement errorMessage = driver.findElement(By.xpath("//div[@role='alert']"));
		String actualMessage = loginObj.getErrorMsg();
		System.out.println(actualMessage);
		String expectedMessage= "You are not logged in";
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	@When("The user clicks the list of {string}")
	public void the_user_clicks_the_list_of(String string) {
		loginObj.homeDropDown(string);
	}
	
	
	@Then("the user stays in homepage")
	public void the_user_stays_in_homepage() {
		//WebElement profileText = driver.findElement(By.xpath("//*[contains(text(), 'sign out')]"));
		String actualMessage = loginObj.clk_signout();
		System.out.println(actualMessage);

		Assert.assertNotNull(actualMessage);;
	}
	
	@Then("the user stays in homepage without signin")
	public void the_user_stays_in_homepage_without_signin() {
		
		String actualMessage = loginObj.chk_signin();
		System.out.println(actualMessage);

		Assert.assertNotNull(actualMessage);;
	}

	@When("User enter empty username or  password")
	public void user_enter_empty_username_or_password() {
		String username ="";
		String password="";
		loginObj.clkSignin();
		loginObj.enterLogin(username, password);
		
		
		
	}
	@Then("The user sees a message {string}")
	public void the_user_sees_a_message(String string) {
		
		Assert.assertEquals("Login", loginObj.validatePageTitle());
	}


}

