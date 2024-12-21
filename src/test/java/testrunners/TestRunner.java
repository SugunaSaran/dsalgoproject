package testrunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = {"stepdefinitions","hooks"},
	    tags="@stackpage"
	)


public class TestRunner extends AbstractTestNGCucumberTests {
	
}
