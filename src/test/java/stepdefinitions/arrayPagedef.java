package stepdefinitions;

import org.testng.Assert;

import Pages.ArrayEditorPage;
import Pages.ArrayHomePage;
import Pages.TryEditorArrayPage;
import Pages.arrayPage;
import Pages.arrayPracticeQuestionsPage;
import DriverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


class arrayPagedef extends DriverFactory {
	public arrayPagedef()
	{
		super();
	}
	ArrayHomePage ahp=new ArrayHomePage();
    arrayPage ap=new arrayPage();
    TryEditorArrayPage tp=new TryEditorArrayPage();
    arrayPracticeQuestionsPage pp=new arrayPracticeQuestionsPage();
    ArrayEditorPage ae=new ArrayEditorPage();

    @Given("The user is in the home page after signin for Array")
    public void the_user_is_in_the_home_page_after_signin_for_array() {
	    Assert.assertEquals("NumpyNinja", ap.validatePageTitle());
    }
    @When("The user clicks Get Started button in Array panel")
    public void the_user_clicks_get_started_button_in_array_panel() {
    	ahp.click_btn_Arraygetstarted();   
    	}
    @Then("The user should be redirected to Array page")
    public void the_user_should_be_redirected_to_array_page() {
        Assert.assertEquals("Array", ap.validatePageTitle());
        }



}











