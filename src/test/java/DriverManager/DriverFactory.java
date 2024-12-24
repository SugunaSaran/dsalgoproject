package DriverManager;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import DataProvider.ConfigFileReader;

public class DriverFactory {
	public static WebDriver driver;
	public static ConfigFileReader configReader;
	public DriverFactory()
	{
		configReader=new ConfigFileReader();
	}
	public static void initialization() {
		String browserName=configReader.getBrowser();
		if(browserName.equals("chrome"))
			driver=new ChromeDriver();
		else if(browserName.equals("firefox"))
			driver=new FirefoxDriver();
		else if(browserName.equals("edge"))
			driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(configReader.getImplicitlyWait()));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(configReader.getApplicationUrl());
	}

}
