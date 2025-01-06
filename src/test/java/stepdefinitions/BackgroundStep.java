package stepdefinitions;
import org.openqa.selenium.WebDriver;

import DataProvider.ConfigFileReader;
import DriverManager.DriverFactory;
import Pages.loginPage;
import io.cucumber.java.en.Given;

public class BackgroundStep extends DriverFactory {
	WebDriver driver;
	ConfigFileReader configReader=new ConfigFileReader();
	loginPage lp=new loginPage(driver);
	public BackgroundStep() {
		this.driver=DriverFactory.getDriver();
	}


	@Given("The user is in the home page after sign-in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		lp.getStarted();
		lp.clkSignin();
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());
	   }


}
