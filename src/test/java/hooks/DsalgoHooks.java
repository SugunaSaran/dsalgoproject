package hooks;

import DriverManager.DriverFactory;
import Utilities.LoggerLoad;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DsalgoHooks extends DriverFactory {
		
	@Before
	public void beforeScenario(Scenario scenario)
	{
		initialization();
		LoggerLoad.info("Loading the driver in  "+configReader.getBrowser());
		System.out.println("Scenario name-Before Scenario: ");
		System.out.println(scenario.getName());
		LoggerLoad.info("-------------------------------------------------------");
		LoggerLoad.info("Scenario Name: "+scenario.getName());
		LoggerLoad.info("-------------------------------------------------------");
		
	}
	@After
	public void afterScenario(Scenario scenario)
	{
		boolean failed=scenario.isFailed();
		System.out.println("is Failed? "+failed);
		LoggerLoad.info("Closing driver");
		driver.quit();
	}
}

	
		
