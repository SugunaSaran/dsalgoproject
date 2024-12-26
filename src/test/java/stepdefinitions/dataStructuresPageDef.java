
package stepdefinitions;

import org.testng.Assert;

import Pages.TryEditorArrayPage;
import Pages.arrayPage;
import Pages.dataStructureIntroductionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dataStructuresPageDef {
	dataStructureIntroductionPage dp =new dataStructureIntroductionPage();
	arrayPage ap=new arrayPage();
	TryEditorArrayPage tp=new TryEditorArrayPage();



	@When("The user clicks the Getting Started button in Data Structures-Introduction panel")
	public void the_user_clicks_the_getting_started_button_in_data_structures_introduction_panel() {
		dp.click_dataGetStarted();

	}
	@Then("The user should be directed to  Data Structure introduction Page")
	public void the_user_should_be_directed_to_data_structure_introduction_page() {
		Assert.assertEquals("Data Structures-Introduction", ap.validatePageTitle());
	}

	@Given("The user is in the Data Structures-Introduction page")
	public void the_user_is_in_the_data_structures_introduction_page() {
		dp.click_dataGetStarted();
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		dp.navigate_time_complexity();
	}

	@Then("The user should be redirected to Time Complexity page")
	public void the_user_should_be_redirected_to_time_complexity_page() {
		Assert.assertEquals("Time Complexity", ap.validatePageTitle());
	}

	@Given("The user is on the Time Complexity page")
	public void the_user_is_on_the_time_complexity_page() {
		dp.click_dataGetStarted();
		dp.navigate_time_complexity();
	}

	@When("The user clicks Try Here button in Time Complexity page")
	public void the_user_clicks_try_here_button_in_time_complexity_page() {
		tp.click_tryEditor();

	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		dp.click_dataGetStarted();
		dp.navigate_time_complexity();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test-Data structures")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_data_structures() {
		Assert.assertEquals("Assessment", ap.validatePageTitle());
	}

	@Given("The user is in the tryEditor page of data structure introduction")
	public void the_user_is_in_the_try_editor_page_of_data_structure_introduction() {
		dp.click_dataGetStarted();
		dp.navigate_time_complexity();
		tp.click_tryEditor();
	}
	@Then("The user should not get any error message in alert window for data intro")
	public void the_user_should_not_get_any_error_message_in_alert_window_for_data_intro() {
		Assert.assertEquals(false,tp.isAlertPresent());    
	}

	@When("The user write the {string} in Editor and click the Run button")
	public void the_user_write_the_in_editor_and_click_the_run_button(String invalid_code) {
		tp.enter_input(invalid_code); 
		tp.click_run();
	}

	@When("The user clicks Practice Questions link of time Complexity")
	public void the_user_clicks_practice_questions_link_of_time_complexity() {
		dp.navigate_data_practice();
	}
	@Then("The user should be redirected to Practice Questions page of Time Complexity")
	public void the_user_should_be_redirected_to_practice_questions_page_of_time_complexity() {
		Assert.assertEquals(" Practice Questions ", ap.validatePageTitle());
	}

	@When("The user write the {string} in Editor and click the Run button in data intro")
	public void the_user_write_the_in_editor_and_click_the_run_button_in_data_intro(String valid_code) {
		tp.enter_input(valid_code);
		tp.click_run();
	}
	@Then("The user should able to see an error message in alert window for data intro")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_for_data_intro() {
		tp.capture_alert();
		Assert.assertTrue(tp.isAlertPresent());
	}
	@Then("The user should able to see output in the console for data intro")
	public void the_user_should_able_to_see_output_in_the_console_for_data_intro() {
		Assert.assertNotNull(tp.get_outputText());


	}







}
