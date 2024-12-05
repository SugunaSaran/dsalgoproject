package stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

public class Login_Test_Bstack_SD {
	public static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		 
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() {
		driver.get("https://www.saucedemo.com/");
	}
	
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	   driver.findElement(By.name("user-name")).sendKeys(string);
	   driver.findElement(By.id("password")).sendKeys(string2);
	   driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() {
	    System.out.println("Login successfully");
	}

	@When("User LogOut from the Application")
	public void user_log_out_from_the_application() {
		driver.findElement(By.id("react-burger-menu-btn")).click();
	    driver.findElement(By.id("logout_sidebar_link")).click();
	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_log_out_successfully() {
		System.out.println("User logged out successfully");
	    
	}




}
