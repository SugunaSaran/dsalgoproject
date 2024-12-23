
package stepdefinitions;


import org.testng.Assert;

import Pages.Graph;
import Pages.HomeGraph;

import Pages.TryEditorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSD {
	HomeGraph G;
      Graph gp=new Graph();
	TryEditorPage tp=new TryEditorPage();
	@Given("The user is in the Graph page after Sign in")
	public void the_user_is_in_the_graph_page_after_sign_in() {
		 G=new HomeGraph();
	   
	}

	@When("The user clicks the Getting Started button in Graph Panel")
	public void the_user_clicks_the_getting_started_button_in_graph_panel() {
		G.clickGraphLink();
	    
	}


	@Then("The user should be directed to Graph Data StructurePage")
	public void the_user_should_be_directed_to_graph_data_structure_page() {
		 Assert.assertEquals("Graph", G.validatePageTitle());
		   
	  
	}
	@Given("The user is in the Graph data structure after Sign in")
	public void the_user_is_in_the_graph_data_structure_after_sign_in() {
		G.clickGraphLink();
	  
	}

	@When("The user clicks Graph page in graph Data structure")
	public void the_user_clicks_graph_page_in_graph_data_structure() {
		gp.checkGraphLink();
	   
	}

	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {
		Assert.assertEquals("Graph", gp.validateGraphlink()); 
	}

	//Scenario: Verify that user is able to navigate to try Editor page for Graph page
@Given("The user is on the Graph page")
public void the_user_is_on_the_graph_page() {
	G.clickGraphLink();
    gp.checkGraphLink();
  
}

@When("The user clicks Try Here button in Graph page")
public void the_user_clicks_try_here_button_in_graph_page() {
	 gp.checkTryEditorLink();
}
@Then("The user should be redirected to a page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
    Assert.assertEquals(gp.validateGraphlink(), "Assessment");
  
}

@Given("The user is in the tryEditor page")
public void the_user_is_in_the_try_editor_page() {
    G.clickGraphLink();
    gp.checkGraphLink();
    gp.checkTryEditorLink();
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
//Scenario: Verify that user receives error for invalid python code for Graph page
@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
	 	G.clickGraphLink();
	    gp.checkGraphRepresentation();
	    gp.checkTryEditorLink();
	    tp.checkCode("System");
	    }

@When("The user clicks the ok button of error alert window")
public void the_user_clicks_the_ok_button_of_error_alert_window() {
   tp.acceptAlert();	  
}

@Then("The user should remain in the tryEditor page with Run button")
public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
	 Assert.assertEquals(gp.validateGraphlink(), "Assessment");
  
}

@When("The user write the valid code in Editor and click the Run button")
public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
	tp.checkCode("print('hi')");
  
}

@Then("The user should able to see output in the console")
public void the_user_should_able_to_see_output_in_the_console() {
	Assert.assertEquals(tp.validateOutput(), "hi");
}


@Given("The user is on the Graph Representations page")
public void the_user_is_on_the_graph_representations_page() {
	gp.checkGraphRepresentation();
}
@When("The user clicks Graph Representations page in graph Data structure")
public void the_user_clicks_graph_representations_page_in_graph_data_structure() {
	 Assert.assertEquals(gp.validateGraphRepresentationsLink(), "Graph Representation");
	  
    
}

@Then("The user should be directed to Graph Representations Page")
public void the_user_should_be_directed_to_graph_representations_page() {
    
	G.clickGraphLink();
    gp.checkGraphRepresentation();
  
}
//Scenario: Verify that user receives error for invalid python code for Graph page
@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button1() {
	 	G.clickGraphLink();
	    gp.checkGraphRepresentation();
	    gp.checkTryEditorLink();
	    tp.checkCode("system");
	    }

@When("The user clicks the ok button of error alert window")
public void the_user_clicks_the_ok_button_of_error_alert_window1() {
 tp.acceptAlert();	  
}

@Then("The user should remain in the tryEditor page with Run button")
public void the_user_should_remain_in_the_try_editor_page_with_run_button1() {
	 Assert.assertEquals(gp.validateGraphRepresentationsLink(), "Assessment");

}

@When("The user write the valid code in Editor and click the Run button")
public void the_user_write_the_valid_code_in_editor_and_click_the_run_button1() {
	tp.checkCode("print('hi')");

}

@Then("The user should able to see output in the console")
public void the_user_should_able_to_see_output_in_the_console1() {
	Assert.assertEquals(tp.validateOutput(), "hi");
}

}
