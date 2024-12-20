package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
<<<<<<< HEAD
	    glue = {"stepdefinitions","hooks"}
=======
	    glue = "stepdefinitions",
	    tags="@logintag"
>>>>>>> 87cd725e9625eaca5129944ef02dafb32a7446ea
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
