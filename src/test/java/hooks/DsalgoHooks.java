package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import DriverManager.DriverFactory;
import Utilities.LoggerLoad;
import Utilities.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DsalgoHooks extends DriverFactory {
		
	@Before
	    public void setUp(Scenario scenario) {
	        // Read the browser and URL from the config file
			//String browser =System.getProperty("browser", "firefox");
			//DriverFactory.SetBrowser(browser);
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
	public void afterScenario(Scenario scenario) {
	    WebDriver driver = DriverFactory.getDriver();
	    if (scenario.isFailed()) {
	        ScreenshotUtil.captureScreenshot(driver, scenario.getName());
	    }
	   DriverFactory.quitDriver();
	}
    }

