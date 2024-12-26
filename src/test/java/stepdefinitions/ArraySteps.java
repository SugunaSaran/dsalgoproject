package stepdefinitions;
	import org.testng.Assert;
	import Pages.ArrayEditorPage;
	import Pages.HomePage;
	import Pages.TryEditorArrayPage;
	import Pages.arrayPage;
	import Pages.arrayPracticeQuestionsPage;
	import DriverManager.DriverFactory;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class ArraySteps extends DriverFactory {
		HomePage ahp=new HomePage();
	    arrayPage ap=new arrayPage();
	    TryEditorArrayPage tp=new TryEditorArrayPage();
	    arrayPracticeQuestionsPage pp=new arrayPracticeQuestionsPage();
	    ArrayEditorPage ae=new ArrayEditorPage();

	    @When("The user clicks Get Started button in Array panel")
	    public void the_user_clicks_get_started_button_in_array_panel() {
	    	ahp.click_btn_Arraygetstarted();   
	    	}
	    @Then("The user should be redirected to Array page")
	    public void the_user_should_be_redirected_to_array_page() {
	        Assert.assertEquals("Array", ap.validatePageTitle());
	        }
	    @Given("The user is in the Array page")
	    public void the_user_is_in_the_array_page() {
	    	
	    	ahp.click_btn_Arraygetstarted();
	    }

	    @When("The user clicks Arrays in Python link")
	    public void the_user_clicks_arrays_in_python_link() {
	    	ap.navigate_arraysinPythonPage();
	    	
	        }

	    @Then("The user should be redirected to Arrays in Python page")
	    public void the_user_should_be_redirected_to_arrays_in_python_page() {
	    	
	        Assert.assertEquals("Arrays in Python", ap.validatePageTitle());

	    	
	        }
	    @Given("The user is on the Arrays in Python page")
	    public void the_user_is_on_the_arrays_in_python_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_arraysinPythonPage();
	    	
	        }

	    @When("The user clicks Try Here button in Arrays in Python page")
	    public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    	tp.click_tryEditor();
	        }

	    @Then("The user should be redirected to a page having an try Editor with a Run button to test-Array")
	    public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    	System.out.println("The user is in try editor page");
	        }
	    @Given("The user is in the tryEditor page-Array")
	    public void the_user_is_in_the_try_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_arraysinPythonPage();
	    	tp.click_tryEditor();
	        }
	    @When("The user clicks the Run button without entering the code in the Editor-Array")
	    public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	    	tp.click_run();
	        }
	    @Then("The user should not get any error message in alert window-Array")
	    public void the_user_should_not_get_any_error_message_in_alert_window() {
	    	System.out.println("No alert window");
	    	
	        }
	    @When("The user write the {string} in Editor and click the Run button-Array")
	    public void the_user_write_the_in_editor_and_click_the_run_button(String invalid_code) {
	    	tp.enter_input(invalid_code);
	    	tp.click_run();
	       }

	    @Then("The user should able to see an error message in alert window-Array")
	    public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    	
	    	/*Alert alert = driver.switchTo().alert();
	        Assert.assertTrue(alert.getText().contains("Error"));
	        alert.accept();*/
	    	tp.capture_alert();
	    	Assert.assertTrue(tp.isAlertPresent());

	        }

	    @When("The user writes the valid input {string} in  python Editor and click the Run button-Array")
	    public void the_user_writes_the_valid_input_print_selenium_in_python_editor_and_click_the_run_button(String valid_code) {
	        tp.enter_input(valid_code);
	        tp.click_run();
	    }
	    @Then("The user should able to see output in the console-Array")
	    public void the_user_should_able_to_see_output_in_the_console() {
	    	Assert.assertNotNull(tp.get_outputText());
	    	
	        }
	    @When("The user clicks Arrays Using List link")
	    public void the_user_clicks_arrays_using_list_link() {
	    	
	    	ap.navigate_ArraysUsingListPage();

	        }
	    @Then("The user should be redirected to Arrays Using List page")
	    public void the_user_should_be_redirected_to_arrays_using_list_page() {
	    	Assert.assertEquals("Arrays Using List", ap.validatePageTitle());
	        }
	    @Given("The user is on the Arrays Using List page")
	    public void the_user_is_on_the_arrays_using_list_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_ArraysUsingListPage();
	        }
	    @When("The user clicks Try Here button in Arrays Using List page")
	    public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	    	
	    	tp.click_tryEditor();

	    }
	    @Given("The user is in the Arrays Using List tryEditor page")
	    public void the_user_is_in_the_arrays_using_list_try_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_ArraysUsingListPage();
	    	tp.click_tryEditor();

	    	
	        }

	    @When("The user clicks Basic Operations in Lists link")
	    public void the_user_clicks_basic_operations_in_lists_link() {
	    	ap.navigate_BasicOperationsinListsPage();
	        }
	    @Then("The user should be redirected to Basic Operations in Lists page")
	    public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	    	Assert.assertEquals("Basic Operations in Lists", ap.validatePageTitle());
	        }
	    @Given("The user is on the Basic Operations in Lists page")
	    public void the_user_is_on_the_basic_operations_in_lists_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_BasicOperationsinListsPage();
	        }
	    @When("The user clicks Try Here button in Basic Operations in Lists page")
	    public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	    		tp.click_tryEditor();

	        }

	    @Given("The user is in the Basic Operations in Lists tryEditor page")
	    public void the_user_is_in_the_basic_operations_in_lists_try_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_BasicOperationsinListsPage();
	    	tp.click_tryEditor();
	        }
	    @When("The user clicks Applications of Array link")
	    public void the_user_clicks_applications_of_array_link() {
	    ap.navigate_ApplicationsofArrayPage();
	    }
	    @Then("The user should be redirected to Applications of Array page")
	    public void the_user_should_be_redirected_to_applications_of_array_page() {
	    	 Assert.assertEquals("Applications of Array", ap.validatePageTitle());
	        }
	    @Given("The user is on the Applications of Array page")
	    public void the_user_is_on_the_applications_of_array_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_ApplicationsofArrayPage();
	        }
	    @When("The user clicks Try Here button in Applications of Array page")
	    public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	    	tp.click_tryEditor();
	        }
	    @Given("The user is in the Applications of Array tryEditor page")
	    public void the_user_is_in_the_applications_of_array_try_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	    	ap.navigate_ApplicationsofArrayPage();
	    	tp.click_tryEditor();

	        }

	    @When("The user clicks Practice Questions link-Array")
	    public void the_user_clicks_practice_questions_link() {
	    	ap.navigate_PracticeQuestionsPage();
	        }
	    @Then("The user should be redirected to Practice Questions page-Array")
	    public void the_user_should_be_redirected_to_practice_questions_page() {
	    	
	    	Assert.assertEquals("Practice Questions", ap.validatePageTitle());

	    }
	    @Given("The user is on the practice question page-Array")
	    public void the_user_is_on_the_practice_question_page() {
	        ahp.click_btn_Arraygetstarted();
	        ap.navigate_arraysinPythonPage();
	        ap.navigate_PracticeQuestionsPage();
	    }
	    @When("The user clicks Search the Array link")
	    public void the_user_clicks_search_the_array_link() {
	    	pp.click_searchthearray();
	        
	    }
	    @Then("The user should be redirected to search the array editor page")
	    public void the_user_should_be_redirected_to_search_the_array_editor_page() {
	    	Assert.assertEquals("Assessment", ap.validatePageTitle());

	     }
	    @Given("The user is on the Search the array editor page")
	    public void the_user_is_on_the_search_the_array_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	        ap.navigate_arraysinPythonPage();
	        ap.navigate_PracticeQuestionsPage();
	        pp.click_searchthearray();
	    }
	    @When("The user write the {string} in  practice page Editor and Click the Run button")
	    public void the_user_write_the_in_practice_page_editor_and_click_the_run_button(String invalid_code) throws InterruptedException {
	    	ae.Enter_inputCode(invalid_code);
	    	ae.click_run();
	       }
	    @When("The user write the {string} in  practice page Editor page and Click the Run button")
	    public void the_user_write_the_in_practice_page_editor_page_and_click_the_run_button(String valid_code) throws InterruptedException {
	    	

	    	ae.Enter_inputCode(valid_code);
	    	Thread.sleep(3000);
	    	ae.click_run();

	        }

	    @Then("The user should able to see output in the Practice page console")
	    public void the_user_should_able_to_see_output_in_the_practice_page_console() {
	    	Assert.assertNotNull(ae.get_outputText());
	    	
	        }
	    @When("The user write the {string} in  practice page Editor and Click the submit button")
	    public void the_user_write_the_in_practice_page_editor_and_click_the_submit_button(String invalid_code) {
	    	ae.Enter_inputCode(invalid_code);
	    	ae.click_submit();

	    }
	    @Then("The user see an error message Error occurred during submission in console")
	    public void the_user_see_an_error_message_error_occurred_during_submission_in_console() throws InterruptedException {
	    	Thread.sleep(2000);
	    	Assert.assertEquals(ae.get_outputText()," No tests were collected" );   
	    }

	    @When("The user write the {string} in Editor and Click the Submit button")
	    public void the_user_write_the_in_editor_and_click_the_submit_button(String valid_code) {
	    	
	    	ae.Enter_inputCode(valid_code);
	    	ae.click_submit();
	    }
	    @Then("The user see success message Submission successful")
	    public void the_user_see_success_message_submission_successful() throws InterruptedException {
	    	Thread.sleep(2000);
	    	Assert.assertEquals(ae.get_outputText(),"submission successful" );
	    }

	    @When("The user clicks Max consecutive ones link")
	    public void the_user_clicks_max_consecutive_ones_link() {
	    	pp.click_max();

	    }
	    @Then("The user should be redirected to Max consecutive ones editor page")
	    public void the_user_should_be_redirected_to_max_consecutive_ones_editor_page() {
	    	
	    	Assert.assertEquals("Assessment", ap.validatePageTitle());
	    }
	    @Given("The user is on the Max consecutive ones editor page")
	    public void the_user_is_on_the_max_consecutive_ones_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	        ap.navigate_arraysinPythonPage();
	        ap.navigate_PracticeQuestionsPage();
	        pp.click_max();

	    }

	    @When("The user clicks Find Numbers with Even Number of Digits link")
	    public void the_user_clicks_find_numbers_with_even_number_of_digits_link() {
	    pp.click_findnumbers();
	    }
	    @Then("The user should be redirected to Find Numbers with Even Number of Digits editor page")
	    public void the_user_should_be_redirected_to_find_numbers_with_even_number_of_digits_editor_page() {
	    	Assert.assertEquals("Assessment", ap.validatePageTitle()); 
	    }
	    @Given("The user is on the Find Numbers with Even Number of Digits editor page")
	    public void the_user_is_on_the_find_numbers_with_even_number_of_digits_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	        ap.navigate_arraysinPythonPage();
	        ap.navigate_PracticeQuestionsPage();
	        pp.click_findnumbers();
	    }

	    @When("The user clicks Squares of a Sorted Array link")
	    public void the_user_clicks_squares_of_a_sorted_array_link() {
	        pp.click_squares();
	    }
	    @Then("The user should be redirected to Squares of a Sorted Array editor page")
	    public void the_user_should_be_redirected_to_squares_of_a_sorted_array_editor_page() {
	    	Assert.assertEquals("Assessment", ap.validatePageTitle());

	    }
	    @Given("The user is on the Squares of a Sorted Array editor page")
	    public void the_user_is_on_the_squares_of_a_sorted_array_editor_page() {
	    	ahp.click_btn_Arraygetstarted();
	        ap.navigate_arraysinPythonPage();
	        ap.navigate_PracticeQuestionsPage();
	        pp.click_squares();
	    }


	        
	    }


	    



	




