package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;
import Pages.loginPage;
import io.cucumber.java.en.Given;

public class ArrayLoginstep extends DriverFactory {
	WebDriver driver; 
	public ArrayLoginstep() {
		this.driver=DriverFactory.getDriver();
	}
	
@Given("The user is in the home page after sign-in.")
public void the_user_is_in_the_home_page_after_sign_in() {
	By getStartedBtn=By.className("btn");
	 driver.findElement(getStartedBtn).click();
	By lnk_signin=By.xpath("//a[@href='/login']");
	driver.findElement(lnk_signin).click();
	By txt_UserName = By.name("username");
	driver.findElement(txt_UserName).sendKeys("passionate_coders");
	By txt_Password = By.name("password");
	driver.findElement(txt_Password).sendKeys("pa$$word123");
	By btn_login = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
	driver.findElement(btn_login).click();
}

}
