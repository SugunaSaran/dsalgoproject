package testrunners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	     glue = {"stepdefinitions","hooks"},
	     tags="@queuepage and @stackpage"
 
           )
	

public class TestRunner extends AbstractTestNGCucumberTests {    
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
	    
	}
}