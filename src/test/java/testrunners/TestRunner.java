package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepdefinitions","hooks"},

	    
	

public class TestRunner extends AbstractTestNGCucumberTests {
=======
         tags= "@logintag"
	    )
	 


	    
 class TestRunner extends AbstractTestNGCucumberTests {
	
}
