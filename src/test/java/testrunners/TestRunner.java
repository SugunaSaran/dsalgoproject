package testrunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

	    

	    features = "src/test/resources/features/dataStructuresIntroductionPage.feature",

	  

	    glue = {"stepdefinitions","hooks"},
	    tags="@data"
	   

	            )
	

public class TestRunner extends AbstractTestNGCucumberTests {


	    
	}


