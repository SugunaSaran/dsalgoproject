package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;
import Pages.loginPage;
import io.cucumber.java.en.Given;

public class Backgroundstep extends DriverFactory {
	WebDriver driver;
	public Backgroundstep() {
		this.driver=DriverFactory.getDriver();
	}


	@Given("The user is in the home page after sign-in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		By getStartedBtn=By.className("btn");
		driver.findElement(getStartedBtn).click();
		By loginBtn=By.xpath("//a[@href='/login']");;
		driver.findElement(loginBtn).click();
		loginPage lp=new loginPage(driver);
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());

	
	    	}


}
