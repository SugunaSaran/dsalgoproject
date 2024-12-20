package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
<<<<<<< HEAD
	    glue = "stepdefinitions",
	    tags="@loginPage"
	)
=======


	    glue = {"stepdefinitions","hooks"},
	    
	    tags="@logintag" )
>>>>>>> e03a953b1ea6c538000e46c9676a4a97ccadb591

public class TestRunner extends AbstractTestNGCucumberTests {

}
