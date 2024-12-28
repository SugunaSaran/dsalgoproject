
package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import Pages.*;

public class loginSD {

	ChromeDriver driver =new ChromeDriver();
	loginPage loginObj =new loginPage(driver);


	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		System.out.println("Entered home page");
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
		driver.findElement(By.xpath("//*[@id='navbarCollapse']/div[2]/ul/a[3]")).click();


	}

	@When("^The user clicks login button after entering valid (.*) and valid (.*)$")
	public void the_user_clicks_login_button_after_entering_valid_passionate_coders_and_valid_password(String userName,String passWord) {
		System.out.println("Entered signin page");
		loginObj.enterLogin(userName, passWord);
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
		System.out.println("Entered ds home page");
		driver.getPageSource().contains(string);
	}


}
