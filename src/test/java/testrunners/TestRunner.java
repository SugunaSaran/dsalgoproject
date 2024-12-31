package testrunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import DataProvider.BrowserConfig;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//plugin = {"json:target/allure-results/cucumber.json"},
	    features = "src/test/resources/features",
	     glue = {"stepdefinitions","hooks"},
	     tags="@stackpage or @queuepage",
	     //plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	     //plugin = {"json:target/allure-results/cucumber.json"},
	     publish=true
         )
	
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeTest

	@Parameters({"browser"})

	public void defineBrowser(String browser) throws Throwable {

		BrowserConfig.setBrowserType(browser);
		System.out.println(browser);

	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();

	}

}
