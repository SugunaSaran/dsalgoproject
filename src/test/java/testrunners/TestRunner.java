package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features/linkedListPage.feature",
	  

	    glue = {"stepdefinitions","hooks"},
	   

	            tags= "@list"
	            )
	

public class TestRunner extends AbstractTestNGCucumberTests {


	    
	}
