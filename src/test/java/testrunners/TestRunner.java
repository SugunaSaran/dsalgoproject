package testrunners;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/features",
	     glue = {"stepdefinitions","hooks"},
	     tags="@graphpage",
	     plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	     publish=true
 
           )
	

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
	    
	}
}
