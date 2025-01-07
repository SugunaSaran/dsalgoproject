
package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
import Pages.TryEditorArrayPage;
import Pages.arrayPage;
import Pages.linkedListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class linkedlistPageDef {
	linkedListPage lp=new linkedListPage();
	arrayPage ap=new arrayPage();
	TryEditorArrayPage tap=new TryEditorArrayPage();
	String excelDataPath=ap.getExcelPath();


	@When("The user clicks the Getting Started button in Linked List panel")
	public void the_user_clicks_the_getting_started_button_in_linked_list_panel() {
		lp.click_dropdown();

	}

	@When("The user selects linked list item from the drop down menu")
	public void the_user_selects_linked_list_item_from_the_drop_down_menu() throws InterruptedException {
		lp.navigate_linkedlistPage();
	}

	@Then("The user should be directed to Linked list Data Structure Page")
	public void the_user_should_be_directed_to_linked_list_data_structure_page() {
		Assert.assertEquals("Linked List", ap.validatePageTitle());
	}
	@Given("The user is in the Linked list page")
	public void the_user_is_in_the_linked_list_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
	}
	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		lp.navigate_IntroductionPage();
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
		Assert.assertEquals("Introduction", ap.validatePageTitle());
	}


	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_IntroductionPage();
	}

	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		tap.click_tryEditor();

	}
	@Then("The user should be redirected to a page having an try Editor with a Run button to test for list")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_for_list() {
		Assert.assertEquals("Assessment", ap.validatePageTitle());
	}
	@Given("The user is in the tryEditor page for list")
	public void the_user_is_in_the_try_editor_page_for_list() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_IntroductionPage();
		tap.click_tryEditor();
	}
	@When("The user clicks the Run button without entering the code in the Editor for list")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_list() {
		tap.click_run();
	}
	@Then("The user should not get any error message in alert window in list")
	public void the_user_should_not_get_any_error_message_in_alert_window_in_list() {
		Assert.assertEquals(false,tap.isAlertPresent());    }

	@When("The user enters the invalid_code {int} from sheetname {string} in Editor and click the Run button-list")
	public void the_user_enters_the_invalid_code_from_sheetname_in_editor_and_click_the_run_button_list(Integer int1, String string) throws InvalidFormatException, IOException {
		 ExcelReader reader=new ExcelReader();
		 if(reader!=null) {
		    List<Map<String, String>> data = reader.getData(excelDataPath, "Invalid");
		    
		    String invalidCode=data.get(int1).get("invalid_data");
		    tap.enter_input(invalidCode);
		 }
		    tap.click_run();

	}
	@Then("The user should able to see an error message in alert window-list")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_list() {
		tap.capture_alert();
    	Assert.assertTrue(tap.isAlertPresent());

	    	}

@When("The user enters the valid_code {int} from sheetname {string} in Editor and click the Run button-list")
public void the_user_enters_the_valid_code_from_sheetname_in_editor_and_click_the_run_button_list(Integer int1, String string) throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Valid");
	    String validcode=data.get(int1).get("valid_data");
	    tap.enter_input(validcode);
	    tap.click_run();

    
}
@Then("The user should able to see output {int} in the console-list")
public void the_user_should_able_to_see_output_in_the_console_list(Integer int1) throws InvalidFormatException, IOException {
	ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Valid");
	    
	    String expectedResult=data.get(int1).get("Output");
	    Assert.assertEquals(tap.get_outputText(), expectedResult);

    }


	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		lp.navigate_CreatingLinkedListPage();
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		Assert.assertEquals("Creating Linked LIst", ap.validatePageTitle());

	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_CreatingLinkedListPage();

	}

	@When("The user clicks Try Here button in Creating Linked List page")
	public void the_user_clicks_try_here_button_in_creating_linked_list_page() {
		tap.click_tryEditor();
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		lp.navigate_TypesofLinkedListPage();
	}

	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		Assert.assertEquals("Types of Linked List", ap.validatePageTitle());
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TypesofLinkedListPage();

	}

	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
		tap.click_tryEditor();
	}
	@Given("The user is in the tryEditor page for Types of linked list page")
	public void the_user_is_in_the_try_editor_page_for_types_of_linked_list_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TypesofLinkedListPage();
		tap.click_tryEditor();

	}

	@When("The user clicks Implement Linked list in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		lp.navigate_ImplementLinkedListinPythonPage();
	}

	@Then("The user should be redirected to Implement Linked list in Python page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		Assert.assertEquals("Implement Linked List in Python", ap.validatePageTitle());
	}

	@Given("The user is on the Implement Linked list in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TypesofLinkedListPage();
	}

	@When("The user clicks Try Here button in Implement Linked list in Python page")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
		tap.click_tryEditor();
	}
	@Given("The user is in the tryEditor page for Implement Linked list in Python page")
	public void the_user_is_in_the_try_editor_page_for_implement_linked_list_in_python_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TypesofLinkedListPage();
		tap.click_tryEditor();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		lp.navigate_TraversalPage();
	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() {
		Assert.assertEquals("Traversal", ap.validatePageTitle());
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TraversalPage();
	}

	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_try_here_button_in_traversal_page() {
		tap.click_tryEditor();
	}
	@Given("The user is in the tryEditor page for Traversal page")
	public void the_user_is_in_the_try_editor_page_for_traversal_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_TraversalPage();
		tap.click_tryEditor();
	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		lp.navigate_InsertionPage();
	}

	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_insertion_page() {
		Assert.assertEquals("Insertion", ap.validatePageTitle());
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_InsertionPage();

	}

	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_try_here_button_in_insertion_page() {
		tap.click_tryEditor();
	}
	@Given("The user is in the tryEditor page for Insertion page")
	public void the_user_is_in_the_try_editor_page_for_insertion_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_InsertionPage();
		tap.click_tryEditor();

	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		lp.navigate_DeletionPage();
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {
		Assert.assertEquals("Deletion", ap.validatePageTitle());
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() throws InterruptedException {
		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_DeletionPage();
	}

	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_try_here_button_in_deletion_page() {
		tap.click_tryEditor();
	}

	@Given("The user is in the tryEditor page for Deletion page")
	public void the_user_is_in_the_try_editor_page_for_deletion_page() throws InterruptedException {

		lp.click_dropdown();
		lp.navigate_linkedlistPage();
		lp.navigate_DeletionPage();
		tap.click_tryEditor();
	}

@When("The user clicks Practice Questions link-list")
public void the_user_clicks_practice_questions_link_list() {
	lp.navigate_prcticePage();
    }
@Then("The user should be redirected to a page having an try Editor with a Run button to test in linked list page")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_linked_list_page() {
	Assert.assertEquals(ap.validatePageTitle(), "Assessment");    
}






}
