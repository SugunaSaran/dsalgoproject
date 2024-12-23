package testrunners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(

	    

	    features = "src/test/resources/features/ArrayLogin.feature",

	  

	    glue = {"stepdefinitions","hooks"},
	    tags="@Array"
	   

	            )
	

public class TestRunner extends AbstractTestNGCucumberTests {


	    
	}


