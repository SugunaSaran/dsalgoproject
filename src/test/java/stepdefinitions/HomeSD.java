package stepdefinitions;

import org.testng.Assert;

import DriverManager.DriverFactory;
import Pages.HomePage;
import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSD extends DriverFactory {
	
	HomePage homeObj = new HomePage();
	loginPage loginObj = new loginPage(DriverFactory.getDriver());
	
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		loginObj.getStarted();
		loginObj.clkSignin();
		loginObj.enterLogin(configReader.getUserName(), configReader.getPassword());
	}
	
	@When("The user clicks the list of {string} after signin")
	public void the_user_clicks_the_list_of_after_signin(String string) {
		loginObj.homeDropDown(string);
	}

	@Then("the user goes to {string} homepage")
	public void the_user_goes_to_homepage(String string) {		
		if(string.equalsIgnoreCase("Array"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Array", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("Linked List"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Linked List", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("Stack"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Stack", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("Queue"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Queue", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("Tree"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Tree", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("Graph"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Graph", loginObj.validatePageTitle());
		}
		if(string.equalsIgnoreCase("DS"))
		{
		System.out.println(homeObj.validatePageTitle().toString());
		 Assert.assertEquals("Data Structures-Introduction", loginObj.validatePageTitle());
		}
	}
	
	@When("The user clicks the getStarted of {string} in homepage")
	public void the_user_clicks_the_get_started_of_in_homepage(String string) {
		loginObj.homeGetStarted(string);
	}
	
	

}
