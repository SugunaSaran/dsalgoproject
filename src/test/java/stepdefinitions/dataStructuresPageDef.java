
package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import DataProvider.ExcelReader;
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
	String excelDataPath=ap.getExcelPath();




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
	@Given("The user is in the tryEditor page of Time Complexity page")
	public void the_user_is_in_the_try_editor_page_of_time_complexity_page() {
		dp.click_dataGetStarted();
		dp.navigate_time_complexity();
		tp.click_tryEditor();
	}
	@When("The user clicks the Run button without entering the code in the Editor-data intro")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_data_intro() {
	    tp.click_run();	
	    }
	@Then("The user should not get any error message in alert window-data intro")
	public void the_user_should_not_get_any_error_message_in_alert_window_data_intro() {
		Assert.assertEquals(false,tp.isAlertPresent());    
		}
	@When("The user enters the invalid_code {int} from sheetname {string} in Editor and click the Run button-data")
	public void the_user_enters_the_invalid_code_from_sheetname_in_editor_and_click_the_run_button_data(Integer int1, String string) throws InvalidFormatException, IOException {
		 ExcelReader reader=new ExcelReader();
		    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet1");
		    
		    String invalidCode=data.get(int1).get("invalid_data");
		    tp.enter_input(invalidCode);
		    tp.click_run();
	}
	@Then("The user should able to see an error message in alert window-data")
	public void the_user_should_able_to_see_an_error_message_in_alert_window_data() {
		Assert.assertEquals(true,tp.isAlertPresent()); 
		tp.capture_alert();
	    	}
	@When("The user enters the valid_code {int} from sheetname {string} in Editor and click the Run button-data")
	public void the_user_enters_the_valid_code_from_sheetname_in_editor_and_click_the_run_button_data(Integer int1, String string) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet2");
	    String validcode=data.get(int1).get("valid_data");
	    tp.enter_input(validcode);
	    tp.click_run();
    	
	}
	@Then("The user should able to see output {int} in the console-data")
	public void the_user_should_able_to_see_output_in_the_console_data(Integer int1) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
	    List<Map<String, String>> data = reader.getData(excelDataPath, "Sheet2");
	    
	    String expectedResult=data.get(int1).get("Output");
	    Assert.assertEquals(tp.get_outputText(), expectedResult);
	    	}
	@When("The user clicks Practice Questions link-data")
	public void the_user_clicks_practice_questions_link_data() {
		dp.navigate_data_practice();	
		}
	@Then("The user should be redirected to Practice Questions page-data")
	public void the_user_should_be_redirected_to_practice_questions_page_data() {
		Assert.assertEquals("Practice Questions", ap.validatePageTitle());
	}

@Then("The user should be redirected to a page having an try Editor with a Run button to test in Array page")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_array_page() {
	Assert.assertEquals(ap.validatePageTitle(), "Assessment");
    
}

	    	}












