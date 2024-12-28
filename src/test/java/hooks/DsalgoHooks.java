package hooks;

import DriverManager.DriverFactory;
import Utilities.LoggerLoad;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DsalgoHooks extends DriverFactory {
		
	@Before
	    public void setUp(Scenario scenario) {
	        // Read the browser and URL from the config file
		 	LoggerLoad.info("Loading the driver in  "+configReader.getBrowser());
			System.out.println("Scenario name-Before Scenario: ");
			System.out.println(scenario.getName());
			LoggerLoad.info("-------------------------------------------------------");
			LoggerLoad.info("Scenario Name: "+scenario.getName());
			LoggerLoad.info("-------------------------------------------------------");
	        
	        // Set the URL for navigation
	        String url = configReader.getApplicationUrl();
	        WebDriver driver = DriverFactory.getDriver();
	        driver.get(url);
	        driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(configReader.getImplicitlyWait()));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			//System.out.println("Active thread count before scenario: " + Thread.activeCount());
	    }

	    @After
	    public void tearDown() {
	    	//System.out.println("Active thread count after scenario: " + Thread.activeCount());
	        DriverFactory.quitDriver();
	    }
}

	
		