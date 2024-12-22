package stepdefinitions;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayLoginstep extends DriverFactory {
	@When("User Clicks Get Started button")
	public void user_clicks_get_started_button() {
		By getStartedBtn=By.className("btn");
		driver.findElement(getStartedBtn).click();


	}
	@When("User clicks on the signin link")
	public void user_clicks_on_the_signin_link() {
		By lnk_signin=By.xpath("//a[@href='/login']");
		driver.findElement(lnk_signin).click();
	}
	@When("User enters the username as passionate_coders")
	public void user_enters_the_username_as_passionate_coders() {
		By txt_UserName = By.name("username");
				
		driver.findElement(txt_UserName).sendKeys("passionate_coders");
		}
	@When("User enters the password as pa$$word123")
	public void user_enters_the_password_as_pa$$word123() {
		By txt_Password = By.name("password");
		driver.findElement(txt_Password).sendKeys("pa$$word123");

	}
	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
		By btn_login = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
		driver.findElement(btn_login).click();
	}


}
