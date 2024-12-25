package testrunners;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

	    features = "src/test/resources/features/stackPage.feature",
	     glue = {"stepdefinitions","hooks"},
	     tags="@stackpage"
 
           )

	

public class TestRunner extends AbstractTestNGCucumberTests {    
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
	    
	}
}

