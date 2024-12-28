package testrunners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	     glue = {"stepdefinitions","hooks"},

	     tags="@arraypage"

	    
 
           )
	

public class TestRunner extends AbstractTestNGCucumberTests {    
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
	    
	}
}
