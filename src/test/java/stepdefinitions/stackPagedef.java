package stepdefinitions;
import Pages.HomePage;
import Pages.TryEditorPage;
import Pages.stackPage;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stackPagedef {
	HomePage hp;
	stackPage sp=new stackPage();
	TryEditorPage tp=new TryEditorPage();
	//Scenario: Verify that user is able to navigate to stack data structure page
	@Given("The user is in the Home page after sign-in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    hp=new HomePage();
	 }
	
	@When("The user clicks the Getting Started button in Stack Panel")
	public void the_user_clicks_the_getting_started_button_in_stack_panel() {
	   hp.clickStackLink();
	 }

	@Then("The user should be directed to Stack Data StructurePage")
	public void the_user_should_be_directed_to_stack_data_structure_page() {
	    Assert.assertEquals("Stack", hp.validatePageTitle());
	   
	}


	// Scenario: Verify that user is able to navigate to Operations in stack page
	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {
		hp.clickStackLink();
	  
	}

	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() {
	   sp.checkOperationsLink();
	  
	}



	@Then("The user should be directed to Operations in Stack Page")
	public void the_user_should_be_directed_to_operations_in_stack_page() {
		Assert.assertEquals("Operations in Stack", sp.validatePageLink());
	}
	
	//Scenario: Verify that user is able to navigate to try Editor page for Operations in Stack page
	@Given("The user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
	    hp.clickStackLink();
	    sp.checkOperationsLink();
	  
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
	   sp.checkTryEditorLink();
	  
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    Assert.assertEquals(sp.validatePageLink(), "Assessment");
	  
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
	    hp.clickStackLink();
	    sp.checkOperationsLink();
	    sp.checkTryEditorLink();
	  }

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	  tp.checkCode(" ");
	 
	 }

	@Then("The user should not see any error message or output")
	public void the_user_should_not_see_any_error_message_or_output() {
		 Assert.assertEquals(false,tp.isAlertPresent());
	 }

@When("The user write the invalid code in Editor and click the Run button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
		tp.checkCode("system.out.println");
	  
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    Assert.assertEquals(true, tp.isAlertPresent());
	  
	}
	//Scenario: Verify that user receives error for invalid python code for Operations in Stack page
	@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
	public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
		 	hp.clickStackLink();
		    sp.checkOperationsLink();
		    sp.checkTryEditorLink();
		    tp.checkCode("system");
		    }
	
	@When("The user clicks the ok button of error alert window")
	public void the_user_clicks_the_ok_button_of_error_alert_window() {
	   tp.acceptAlert();	  
	}

	@Then("The user should remain in the tryEditor page with Run button")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
		 Assert.assertEquals(sp.validatePageLink(), "Assessment");
	  
	}
	//
	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
		tp.checkCode("print('hi')");
	  
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		Assert.assertEquals(tp.validateOutput(), "hi");
	}

	@When("The user clicks implementation link")
	public void the_user_clicks_implementation_link() {
	    sp.checkImplementationLink();
	  
	}

	@Then("The user be directed to implementation Page")
	public void the_user_be_directed_to_implementation_page() {
	    Assert.assertEquals(sp.validatePageLink(), "Implementation");
	  
	}

	@Given("The user is on the implementation page")
	public void the_user_is_on_the_implementation_page() {
		hp.clickStackLink();
	    sp.checkImplementationLink();
	  
	}

	@When("The user clicks Try Here button in implementation page")
	public void the_user_clicks_try_here_button_in_implementation_page() {
	    sp.checkTryEditorLink();
	  
	}
	
	@When("The user clicks applications link")
	public void the_user_clicks_applications_link() {
	    sp.checkApplicationLink();
	}

	@Then("The user be directed to application Page")
	public void the_user_be_directed_to_application_page() {
		Assert.assertEquals(sp.validatePageLink(), "Applications");  
	}

	@Given("The user is on the application page")
	public void the_user_is_on_the_application_page() {
	    hp.clickStackLink();
	    sp.checkApplicationLink();
	  
	}

	@When("The user clicks Try Here button in application page")
	public void the_user_clicks_try_here_button_in_application_page() {
	   sp.checkTryEditorLink();
	  
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
	    sp.clickPracticeLink();
	  
	}

	@Then("The user should be directed to practice Page")
	public void the_user_be_directed_to_practice_page() {
		Assert.assertEquals(sp.validatePageLink(), "Practice Questions");  
	}
	@Given("The user is in the tryEditor page in Implementation page")
	public void the_user_is_in_the_try_editor_page_in_implementation_page() {
	    hp.clickStackLink();
	    sp.checkImplementationLink();
	    sp.checkTryEditorLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor of Implementation page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_of_implementation_page() {
	   tp.checkCode(" ");
	}

	@Then("The user should not see any error message or output in Implementation page text Editor")
	public void the_user_should_not_see_any_error_message_or_output_in_implementation_page_text_editor() {
	    Assert.assertEquals(false, tp.isAlertPresent());
	}

	@When("The user write the invalid code in Editor and click the Run button of Implementation page")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_of_implementation_page() {
	    tp.checkCode("system.out");
	}

	@Then("The user should able to see an error message in alert window in Implementation page text Editor")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_in_implementation_page_text_editor() {
	    Assert.assertEquals(true, tp.isAlertPresent());
	}

	@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run button in Implementation page")
	public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_in_implementation_page() {
	    hp.clickStackLink();
	    sp.checkImplementationLink();
	    sp.checkTryEditorLink();
	    tp.checkCode("system.out");
	}

	@Then("The user should remain in the tryEditor page with Run button of Implementation page")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_implementation_page() {
	     Assert.assertEquals(sp.validatePageLink(), "Assessment");
	   
	}

	@When("The user write the valid code in Editor and click the Run button of Implementation page")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_implementation_page() {
	    tp.checkCode("print('hello')");
	}

	@Then("The user should able to see output in the console of Implementation page")
	public void the_user_should_able_to_see_output_in_the_console_of_implementation_page() {
	    Assert.assertEquals(tp.validateOutput(), "hello");
	}

	@Given("The user is in the tryEditor page of applications page")
	public void the_user_is_in_the_try_editor_page_of_applications_page() {
	    hp.clickStackLink();
	    sp.checkApplicationLink();
	    sp.checkTryEditorLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor in applications page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_applications_page() {
	    tp.checkCode(" ");
	}

	@Then("The user should not see any error message or output in try Editor of applications page")
	public void the_user_should_not_see_any_error_message_or_output_in_try_editor_of_applications_page() {
		Assert.assertEquals(false, tp.isAlertPresent());
	}

	@When("The user write the invalid code in Editor and click the Run button in applications page")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_in_applications_page() {
		tp.checkCode("system.out");
	}

	@Then("The user should able to see an error message in alert window of applications page")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_of_applications_page() {
		Assert.assertEquals(true, tp.isAlertPresent());
	}

	@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run button of applications page")
	public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_of_applications_page() {
		    hp.clickStackLink();
		    sp.checkApplicationLink();
		    sp.checkTryEditorLink();
		    tp.checkCode("system.out");
	}

	@Then("The user should remain in the tryEditor page with Run button of applications page")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_applications_page() {
		Assert.assertEquals(sp.validatePageLink(), "Assessment");
	}

	@When("The user write the valid code in Editor and click the Run button of applications page")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_applications_page() {
		tp.checkCode("print('applications')");
	}

	@Then("The user should able to see output in the console of applications page")
	public void the_user_should_able_to_see_output_in_the_console_of_applications_page() {
	    Assert.assertEquals(tp.validateOutput(), "applications");
	}





}

	