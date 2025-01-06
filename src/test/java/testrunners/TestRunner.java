package testrunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import DataProvider.BrowserConfig;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", glue = { "stepdefinitions",
		"hooks" }, tags = "@graph", plugin = { "pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true)

public class TestRunner extends AbstractTestNGCucumberTests {

	

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();

	}
	@BeforeTest

	@Parameters({"browser"})

	public void defineBrowser(@Optional("chrome")String browser) throws Throwable {

		BrowserConfig.setBrowserType(browser);
		System.out.println(browser);

	}

}
