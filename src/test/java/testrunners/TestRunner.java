package testrunners;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import DataProvider.BrowserConfig;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features", 
glue = { "stepdefinitions","hooks" }, 
plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
tags="@array",
publish = true)


public class TestRunner extends AbstractTestNGCucumberTests {

   @Override
	@DataProvider(parallel = true)
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
