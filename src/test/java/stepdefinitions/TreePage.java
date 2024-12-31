
package stepdefinitions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
import Pages.HomePage;
import Pages.TryEditorPage;
import Pages.treePJava;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TreePage {
	HomePage hp=new HomePage();
	treePJava tjp=new treePJava();
	TryEditorPage tp=new TryEditorPage();
	String excelPath=tjp.getExcelPath();

	@When("The user selects tree item from the drop down menu")
	public void the_user_selects_tree_item_from_the_drop_down_menu() {
	   hp.clickTreeFromDropDown();
	}

	@Then("The user should be directed to tree Data Structure Page")
	public void the_user_should_be_directed_to_tree_data_structure_page() {
		Assert.assertEquals(hp.validatePageTitle(),"Tree");	
	}

	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
	    hp.clickTreeFromDropDown();
	}

	@When("The user clicks the following {string} and {int} in tree page")
	public void the_user_clicks_the_following_and_in_tree_page(String string, Integer int1) throws InvalidFormatException, IOException {
		 ExcelReader reader=new ExcelReader();
		    List<Map<String, String>> data = reader.getData(excelPath, "Sheet1");
		    String pageName=data.get(int1).get("Links");
		   tjp.checkTreePageLinks(pageName);
	}

	@Then("The user should be redirected to {string} and {int} page in tree data structure")
	public void the_user_should_be_redirected_to_and_page_in_tree_data_structure(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet1");
	    String expectedPage=data.get(int1).get("Expected Result");
	    Assert.assertEquals(tjp.validateTreePageTitles(), expectedPage);
	}

	@Given("The user is in the {string} and {int} page in tree page")
	public void the_user_is_in_the_and_row_number_page_in_tree_page(String string,Integer int1) throws InvalidFormatException, IOException {
		hp.clickTreeFromDropDown();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet1");
	    String pageName=data.get(int1).get("Links");
	    tjp.checkTreePageLinks(pageName);
	   	}
	
	    
	

	@When("The user clicks the tryEditor button in subpages of tree")
	public void the_user_clicks_the_try_editor_button_in_subpages_of_tree() {
	    tjp.checkTryEditorLink();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test in tree page")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_tree_page() {
		 Assert.assertEquals(hp.validatePageTitle(), "Assessment");
	}
	
	@Given("The user is in the tryEditor page of corresponding {string} and {int} page in tree data structure")
	public void the_user_is_in_the_try_editor_page_of_corresponding_and_page_in_tree_data_structure(String string, Integer int1) throws InvalidFormatException, IOException {
		 hp.clickTreeFromDropDown();
		    ExcelReader reader=new ExcelReader();
		    List<Map<String, String>> data = reader.getData(excelPath, "Sheet1");
		    String pageName=data.get(int1).get("Links");
		    tjp.checkTreePageLinks(pageName);
		    tjp.checkTryEditorLink();
	}

	@When("The user clicks the Run button without entering the code in the Editor in tree page")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_tree_page() {
	    tp.checkCode(" ");
	}

	@Then("The user should not see any error message or output in the Editor of tree page")
	public void the_user_should_not_see_any_error_message_or_output_in_the_editor_of_tree_page() {
		Assert.assertEquals(tp.isAlertPresent(), false);
	}

	@Given("The user is in the tryEditor page of {string} and {int} of Tree Page")
	public void the_user_is_in_the_try_editor_page_of_and_of_tree_page(String string, Integer int1) throws InvalidFormatException, IOException {
		 hp.clickTreeFromDropDown();
		    ExcelReader reader=new ExcelReader();
		    List<Map<String, String>> data = reader.getData(excelPath, "Sheet2");
		    String pageName=data.get(int1).get("Links");
		    tjp.checkTreePageLinks(pageName);
		    tjp.checkTryEditorLink();
	}

	@When("The user clicks the Run button the following {string} and {int} invalidcodes in the Editor of corresponding sub page of tree")
	public void the_user_clicks_the_run_button_the_following_and_invalidcodes_in_the_editor_of_corresponding_sub_page_of_tree(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet2");
	    String invalidcode=data.get(int1).get("InvalidCode");
	    tp.checkCode(invalidcode);
	}

	@Then("The user should see an error message in alert window in corresponding tree Page")
	public void the_user_should_see_an_error_message_in_alert_window_in_corresponding_tree_page() {
		Assert.assertEquals(tp.isAlertPresent(), true);
	}

	@Given("The user is in the tryEditor page {string} and {int} and writes an invalidcodes in Editor and click the Run button of corresponding Tree Page")
	public void the_user_is_in_the_try_editor_page_and_and_writes_an_invalidcodes_in_editor_and_click_the_run_button_of_corresponding_tree_page(String string, Integer int1) throws InvalidFormatException, IOException {
		hp.clickTreeFromDropDown();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet2");
	    String pageName=data.get(int1).get("Links");
	    String invalidCode=data.get(int1).get("InvalidCode");
	    tjp.checkTreePageLinks(pageName);
	    tjp.checkTryEditorLink();
	    tp.checkCode(invalidCode);
	}

	@When("The user clicks the ok button of error alert window of that tree page")
	public void the_user_clicks_the_ok_button_of_error_alert_window_of_that_tree_page() {
		 tp.acceptAlert();
	}

	@Then("The user should remain in the tryEditor page with Run button in correponding tree Page")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button_in_correponding_tree_page() {
		Assert.assertEquals(hp.validatePageTitle(), "Assessment");
	}

	@Given("The user is in the tryEditor page of {string} and {int} of tree Page for valid code")
	public void the_user_is_in_the_try_editor_page_of_and_of_tree_page_for_valid_code(String string, Integer int1) throws InvalidFormatException, IOException {
		hp.clickTreeFromDropDown();
	    ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet3");
	    String pageName=data.get(int1).get("Links");
	    tjp.checkTreePageLinks(pageName);
	    tjp.checkTryEditorLink();
	}

	@When("The user clicks the Run button the following {string} and {int} in the Editor of corresponding sub page of tree")
	public void the_user_clicks_the_run_button_the_following_and_in_the_editor_of_corresponding_sub_page_of_tree(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet3");
	    String validcode=data.get(int1).get("ValidCode");
	    tp.checkCode(validcode);
	}

	@Then("The user should able to see an {string} and {int} in corresponding tryEditor page of tree")
	public void the_user_should_able_to_see_an_and_in_corresponding_try_editor_page_of_tree(String string, Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelPath, "Sheet3");
	    String expectedResult=data.get(int1).get("Expected Result");
	    Assert.assertEquals(tp.validateOutput(),expectedResult);
	}



}
			
			
			
	
