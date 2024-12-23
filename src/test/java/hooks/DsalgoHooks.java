package hooks;

import DriverManager.DriverFactory;
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
		System.out.println("Scenario name-Before Scenario: ");
		System.out.println(scenario.getName());
		
	}
	@After
	public void afterScenario(Scenario scenario)
	{
		boolean failed=scenario.isFailed();
		System.out.println("is Failed? "+failed);
		driver.quit();
	}


}
