

package stepdefinitions;
import Pages.HomePage;
import Pages.TryEditorPage;
import Pages.stackPage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class stackPagedef {
	HomePage hp;
	stackPage sp=new stackPage();
	TryEditorPage tp=new TryEditorPage();
	String excelDataPath=sp.getExcelPath();
	@Given("The user is in the Home page after sign-in for stack")
	public void the_user_is_in_the_home_page_after_sign_in_for_stack() {
	    hp=new HomePage();
	}

	@When("The user selects stack item by clicking the Getting Started Link")
	public void the_user_selects_stack_item_by_clicking_the_getting_started_link() {
	    hp.clickStackLink();
	}

	@Then("The user should be directed to stack Data Structure Page")
	public void the_user_should_be_directed_to_stack_data_structure_page() {
	    Assert.assertEquals(hp.validatePageTitle(), "Stack");
	}

	@Given("The user is in the Stack page after Sign in")
	public void the_user_is_in_the_stack_page_after_sign_in() {
	    hp.clickStackLink();
	}

	@When("The user clicks the following {string} and {int} in stack page")
	public void the_user_clicks_the_following_and_in_stack_page(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet1");
	    String pageName=data.get(int1).get("Links");
	    sp.checkStackPageLink(pageName);
	}

	@Then("The user should be redirected to {string} and {int} page in stack data structure")
	public void the_user_should_be_redirected_to_and_page_in_stack_data_structure(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet1");
	    String expectedPage=data.get(int1).get("Expected Result");
	    Assert.assertEquals(hp.validatePageTitle(), expectedPage);
	}

	@Given("The user is in the {string} and {int} page in stack page")
	public void the_user_is_in_the_and_page_in_stack_page(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet1");
	    String pageName=data.get(int1).get("Links");
	    hp.clickStackLink();
	    sp.checkStackPageLink(pageName);
	}

	@When("The user clicks the tryEditor button in subpages of stack")
	public void the_user_clicks_the_try_editor_button_in_subpages_of_stack() {
	    sp.checkTryEditorLink();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in stack page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_stack_page() {
	    Assert.assertEquals(hp.validatePageTitle(), "Assessment");
	}

	@Given("The user is in the tryEditor page of corresponding {string} and {int} page in stack data structure")
	public void the_user_is_in_the_try_editor_page_of_corresponding_and_page_in_stack_data_structure(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet1");
	    String pageName=data.get(int1).get("Links");
	    hp.clickStackLink();
	    sp.checkStackPageLink(pageName);
	    sp.checkTryEditorLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor in stack page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_stack_page() {
	    tp.checkCode(" ");
	}

	@Then("The user should not see any error message or output in the Editor of stack page")
	public void the_user_should_not_see_any_error_message_or_output_in_the_editor_of_stack_page() {
	    Assert.assertEquals(tp.isAlertPresent(), false);
	}
	

	@Given("The user is in the tryEditor page of {string} and {int} of Stack Page")
	public void the_user_is_in_the_try_editor_page_of_and_of_stack_page(String string, Integer int1) throws InvalidFormatException, IOException {
	    hp.clickStackLink();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet2");
	    String pageName=data.get(int1).get("Links");
	    sp.checkStackPageLink(pageName);
	    sp.checkTryEditorLink();
	    }


	@When("The user clicks the Run button the following {string} and {int} in the Editor of corresponding sub page of stack")
	public void the_user_clicks_the_run_button_the_following_and_in_the_editor_of_corresponding_sub_page_of_stack(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet2");
	    String invalidCode=data.get(int1).get("InvalidCode");
	    tp.checkCode(invalidCode);
	}

	@Then("The user should see an error message in alert window in corresponding stack Page")
	public void the_user_should_see_an_error_message_in_alert_window_in_corresponding_stack_page() {
		Assert.assertEquals(tp.isAlertPresent(), true);
	}

	@Given("The user is in the tryEditor page {string} and {int} and writes an invalidcodes in Editor and click the Run button of corresponding Stack Page")
	public void the_user_is_in_the_try_editor_page_and_and_writes_an_invalidcodes_in_editor_and_click_the_run_button_of_corresponding_stack_page(String string, Integer int1) throws InvalidFormatException, IOException {
	    hp.clickStackLink();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet2");
	    String pageName=data.get(int1).get("Links");
	    String invalidCode=data.get(int1).get("InvalidCode");
	    sp.checkStackPageLink(pageName);
	    sp.checkTryEditorLink();
	    tp.checkCode(invalidCode);
	}

	@When("The user clicks the ok button of error alert window of that Stack Page")
	public void the_user_clicks_the_ok_button_of_error_alert_window_of_that_stack_page() {
	   tp.acceptAlert();
	}

	@Then("The user should remain in the tryEditor page with Run button in corresponding stack Page")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button_in_corresponding_stack_page() {
	    Assert.assertEquals(hp.validatePageTitle(), "Assessment");
	}
	@Given("The user is in the tryEditor page of {string} and {int} of Stack Page for valid code")
	public void the_user_is_in_the_try_editor_page_of_and_of_stack_page_for_valid_code(String string, Integer int1) throws InvalidFormatException, IOException {
	    hp.clickStackLink();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet3");
	    String pageName=data.get(int1).get("Links");
	    sp.checkStackPageLink(pageName);
	    sp.checkTryEditorLink();
	    }
	
	@When("The user clicks the Run button the following {string} and {int} with valid code in the Editor of corresponding sub page of stack")
	public void the_user_clicks_the_run_button_the_following_and_with_valid_code_in_the_editor_of_corresponding_sub_page_of_stack(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet3");
	    String validcode=data.get(int1).get("ValidCode");
	    tp.checkCode(validcode);
	}

	@Then("The user should able to see an {string} and {int} in corresponding stack tryeditor page")
	public void the_user_should_able_to_see_an_and_in_corresponding_stack_tryeditor_page(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet3");
	    String expectedResult=data.get(int1).get("Expected Result");
	    Assert.assertEquals(tp.validateOutput(), expectedResult);
	}


}
