import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String URL = driver.getCurrentUrl();
		if(URL.equalsIgnoreCase("https://www.saucedemo.com/inventory.html" )) {
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			driver.findElement(By.className("shopping_cart_link")).click();
			driver.findElement(By.id("checkout")).click();
			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/checkout-step-one.html")) {
				driver.findElement(By.id("first-name")).sendKeys("suguna");
				driver.findElement(By.id("last-name")).sendKeys("saran");
				driver.findElement(By.id("postal-code")).sendKeys("12345");
				driver.findElement(By.id("continue")).click();
			}
			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/checkout-step-two.html")) {
				driver.findElement(By.id("finish")).click();
				String message=driver.findElement(By.id("checkout_complete_container")).getText();
				System.out.println(message);
			}
		}
	}

	

}
