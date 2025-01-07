package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
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
	
	@When("User enter existing username {string} {int}  Enter")
	public void user_enter_existing_username_enter(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
	    String username=data.get(int1).get("UserName");
	    String password=data.get(int1).get("Password");
	    String Cnf_password=data.get(int1).get("cnfPassword");
	 	registerObj.EnterValues(username,password,Cnf_password);
	}

	@Then("The user sees a error message password_mismatch:The two password fields didn’t match")
	public void the_user_sees_a_error_message_password_mismatch_the_two_password_fields_didn_t_match() throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
	    String expectedMessage=data.get(0).get("Message");
		String actualMessage = registerObj.getErrorMsg();
		Assert.assertEquals(expectedMessage, actualMessage);
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
	
	@When("User enter valid username {string} and valid password {int} ,invalid password confirmation Enter")
	public void user_enter_valid_username_and_valid_password_invalid_password_confirmation_enter(String string,Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
	    String username=data.get(int1).get("UserName");
	    String password=data.get(int1).get("Password");
	    String Cnf_password=data.get(int1).get("cnfPassword");
	 	registerObj.EnterValues(username,password,Cnf_password);
	}

	@Then("The registration should be unsuccessfull with error messages with  password_mismatch:The two password fields didn’t match")
	public void the_registration_should_be_unsuccessfull_with_error_messages_with_password_mismatch_the_two_password_fields_didn_t_match() throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
	    String expectedMessage=data.get(0).get("Message");
		String actualMessage = registerObj.getErrorMsg();
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
	@When("User enter valid {string} and invalid {int} ,invalid password")
	public void user_enter_valid_and_invalid_invalid_password(String string, Integer int1)  throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "LoginDataValid");
	    String username=data.get(int1).get("UserName");
	    String password=data.get(int1).get("Password");
	    System.out.println(username);
	    System.out.println(password);
	    
	}
	

@When("User enter valid username {string} and invalid password {int} ,invalid password confirmation confirmpassword Enter")
public void user_enter_valid_username_and_invalid_password_invalid_password_confirmation_confirmpassword_enter(String string, Integer int1) throws InvalidFormatException, IOException {
	//ExcelReader reader=new ExcelReader();
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
    String username=data.get(int1).get("UserName");
    String password=data.get(int1).get("Password");
    String Cnf_password=data.get(int1).get("cnfPassword");
 	registerObj.EnterValues(username,password,Cnf_password);
}

@When("User enter mismatched {string} password or password confirmation {int}  - Enter")
public void user_enter_mismatched_password_or_password_confirmation_enter(String string, Integer int1) throws InvalidFormatException, IOException{
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
    String username=data.get(int1).get("UserName");
    String password=data.get(int1).get("Password");
    String Cnf_password=data.get(int1).get("cnfPassword");
 	registerObj.EnterValues(username,password,Cnf_password);
}

@Then("The user sees the unsuccessful registration with error message password_mismatch:The two password fields didn’t match")
public void the_user_sees_the_unsuccessful_registration_with_error_message_password_mismatch_the_two_password_fields_didn_t_match() throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
    String expectedMessage=data.get(0).get("Message");
	String actualMessage = registerObj.getErrorMsg();
	Assert.assertEquals(expectedMessage, actualMessage);
}
@When("User enter valid {string} and valid {int} ,valid password confirmation")
public void user_enter_valid_and_valid_valid_password_confirmation(String string, Integer int1) throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "Registration_valid");
    String username=data.get(int1).get("UserName");
    String password=data.get(int1).get("Password");
    String Cnf_password=data.get(int1).get("cnfPassword");
 	registerObj.EnterValues(username,password,Cnf_password);
}

@Then("The user sees a successfull message Registration Succesfull")
public void the_user_sees_a_successfull_message_registration_succesfull() throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "Registration_valid");
    String expectedMessage=data.get(0).get("Message");
	String actualMessage = registerObj.getErrorMsg();
	Assert.assertEquals(expectedMessage, actualMessage);
}

@When("User enter numeric password {string} {int}")
public void user_enter_numeric_password(String string, Integer int1) throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
    String username=data.get(int1).get("UserName");
    String password=data.get(int1).get("Password");
    String Cnf_password=data.get(int1).get("cnfPassword");
 	registerObj.EnterValues(username,password,Cnf_password);
}

@Then("The user sees a warning message")
public void the_user_sees_a_warning_message() throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
    List<Map<String, String>> data = reader.getData(registerObj.excelPath, "RegisterInvalid");
    String expectedMessage=data.get(0).get("Message");
	String actualMessage = registerObj.getErrorMsg();
	Assert.assertEquals(expectedMessage, actualMessage);
}
}
