package stepdefinitions;
import java.util.List;

import org.testng.Assert;

import Pages.HomePage;
import Pages.QueuePage;
import Pages.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class queuePagedef {
	HomePage hp;
	QueuePage qp=new QueuePage();
	TryEditorPage tp=new TryEditorPage();

	@Given("The user is in the Home page after sign-in for queue")
	public void the_user_is_in_the_home_page_after_sign_in() {
		hp=new HomePage();
	}

	@When("The user selects queue item from the drop down menu")
	public void the_user_selects_queue_item_from_the_drop_down_menu() {
		hp.clickQueueFromDropDown();

	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		Assert.assertEquals("Queue", hp.validatePageTitle());		  
	}


	@Given("The user is in the Queue page after Sign in")
	public void the_user_is_in_the_queue_page_after_sign_in() {
		hp.clickQueueFromDropDown();
	}

	@When("The user clicks the following {string} in queue page")
	public void the_user_clicks_the_following_in_queue_page(String string) {
		qp.checkQueuePageLink(string);
	}

	@Then("The user should be redirected to {string} page in queue data structure")
	public void the_user_should_be_redirected_to_page_in_queue_data_structure(String string) {
		Assert.assertEquals(hp.validatePageTitle(), string);
	}
	@Given("The user is in the {string} page in queue page")
	public void the_user_is_in_the_page_in_queue_page(String string) {
		hp.clickQueueFromDropDown();
		qp.checkQueuePageLink(string);
	}

	@When("The user clicks the tryEditor button in subpages of queue")
	public void the_user_clicks_the_try_editor_button_in_subpages_of_queue() {
		qp.checkTryEditorLink();
	}
	@Given("The user is in the tryEditor page of corresponding {string} page in queue data structure")
	public void the_user_is_in_the_try_editor_page_of_corresponding_page_in_queue_data_structure(String string) {
		hp.clickQueueFromDropDown();
		qp.checkQueuePageLink(string);
		qp.checkTryEditorLink();
	}

	@Given("The user is in the tryEditor page of {string} of Queue Page")
	public void the_user_is_in_the_try_editor_page_of_subpages_of_queue_page(String string) {
		hp.clickQueueFromDropDown();
		qp.checkQueuePageLink(string);
		qp.checkTryEditorLink();
	}

	@When("The user clicks the Run button the following {string} in the Editor of corresponding sub page of queue")
	public void the_user_clicks_the_run_button_the_following_in_the_editor_of_corresponding_sub_page_of_queue(String string) {
		tp.checkCode(string);
	}

	@Then("The user should see an error message in alert window in corresponding Page")
	public void the_user_should_see_an_error_message_in_alert_window_in_corresponding_page() {
		Assert.assertEquals(tp.isAlertPresent(), true);
	}
	@Given("The user is in the tryEditor page {string} and writes an {string} in Editor and click the Run button of corresponding Page")
	public void the_user_is_in_the_try_editor_page_and_writes_an_in_editor_and_click_the_run_button_of_corresponding_page(String string,String string1) {
		hp.clickQueueFromDropDown();
		qp.checkQueuePageLink(string);
		qp.checkTryEditorLink();
		tp.checkCode(string1);
	}

	@When("The user clicks the ok button of error alert window of that Page")
	public void the_user_clicks_the_ok_button_of_error_alert_window_of_that_page() {
		tp.acceptAlert();
	}

	@Then("The user should remain in the tryEditor page with Run button in correponding Page")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button_in_correponding_page() {
		Assert.assertEquals(hp.validatePageTitle(), "Assessment");
	}

	@Then("The user should able to see an {string} in corresponding tryEditor page")
	public void the_user_should_able_to_see_an_in_corresponding_try_editor_page(String string) {
		Assert.assertEquals(tp.validateOutput(), string);
	}







}


