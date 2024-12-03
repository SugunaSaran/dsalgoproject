import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class JuiceShop_Register {
	static Random rand=new Random();
	static String URL="https://juice-shop.herokuapp.com/#/register";
	static String emailid="abcdefg22"+rand.nextInt(100)+"@gmail.com";
	static String passwordtxt="Gmail@123";
	private static void register(WebDriver driver) throws InterruptedException {
		Actions act=new Actions(driver);
		By dismissBtn=By.xpath("//span[text()='Dismiss']");
		By cookieDisable=By.xpath("//a[contains(text(),'Me want it!')]");
		By email=By.id("emailControl");
		By password=By.id("passwordControl");
		By repeatPassword=By.id("repeatPasswordControl");
		By secureQuestionBox=By.xpath("//*[@id=\"mat-select-value-1\"]/span");
		By secureQuestion=By.xpath("//span[contains(text(),'Your eldest siblings middle name?')]");
		By secureAnswer=By.id("securityAnswerControl");
		By registerBtn=By.id("registerButton");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(dismissBtn).click();
		driver.findElement(cookieDisable).click();
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(passwordtxt);
		driver.findElement(repeatPassword).sendKeys(passwordtxt);
		driver.findElement(secureQuestionBox).click();
		driver.findElement(secureQuestion).click();
		driver.findElement(secureAnswer).sendKeys("Tina");
		Thread.sleep(7000);
		act.click(driver.findElement(registerBtn)).perform();
	}

	private static void addToBasket(ChromeDriver driver,JavascriptExecutor js) throws InterruptedException {
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[1]/div/mat-card/div[2]/button/span[1]/span")).click();
		js.executeScript("window.scrollBy(0,500)", "");
		WebElement elem=driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile[11]/div/mat-card/div[2]/button/span[1]/span"));
		js.executeScript("arguments[0].scrollIntoView();", elem);
		elem.click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-navbar/mat-toolbar/mat-toolbar-row/button[4]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[1]/mat-cell[3]/button[2]")).click();
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row[2]/mat-cell[3]/button[2]")).click();
		driver.findElement(By.id("checkoutButton")).click();
		driver.findElement(By.xpath("//*[@id=\"card\"]/app-address/mat-card/div/button")).click();
		addNewAddress(driver,js);
	}

	private static void addNewAddress(ChromeDriver driver, JavascriptExecutor js) throws InterruptedException {
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		//By country=By.xpath("//*[@id=\"address-form\"]/mat-form-field[1]/div/div[1]/div[3]/span");
		By country=By.xpath("//input[@placeholder='Please provide a country.']");
		By name=By.xpath("//input[@placeholder='Please provide a name.']");
		By mobileNumber=By.xpath("//input[@placeholder='Please provide a mobile number.']");
		By zipcode=By.xpath("//input[@placeholder='Please provide a ZIP code.']");
		By address=By.id("address");
		By city=By.xpath("//input[@placeholder='Please provide a city.']");
		By state=By.xpath("//input[@placeholder='Please provide a state.']");
		By submitBtn=By.id("submitButton");
		Random generate = new Random(); 
		String[] names = {"John", "Marcus", "Susan", "Henry"}; 
		String[] mobileno= {"456789043","765894324","678567456"};
		String[] zip= {"23456","30095","10020"};
		String[] addr= {"123, Peachtree st","456, Pear Rd","678 Palm Dr"};
		String[] st= {"CA","GA","IO"};
		String[] ci= {"Droovy","alaska","Miami"};
		driver.findElement(country).sendKeys("USA");
		driver.findElement(name).sendKeys(names[generate.nextInt(4)]);
		driver.findElement(mobileNumber).sendKeys(mobileno[generate.nextInt(3)]);
		driver.findElement(zipcode).sendKeys(zip[generate.nextInt(3)]);
		driver.findElement(address).sendKeys(addr[generate.nextInt(3)]);
		driver.findElement(city).sendKeys(ci[generate.nextInt(3)]);
		driver.findElement(state).sendKeys(st[generate.nextInt(3)]);

		act.click(driver.findElement(submitBtn)).perform();
		Thread.sleep(4000);

		act.click(driver.findElement(By.xpath("//*[@id=\"mat-radio-42\"]/label/span[1]/span[1]"))).perform();

		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(5000);
		act.click(driver.findElement(By.xpath("//*[text()='1 Days']"))).perform();
		act.click(driver.findElement(By.xpath("//span[text()='Continue']"))).perform();
		Thread.sleep(2000);
		addNewCard(driver);
		WebElement account=driver.findElement(By.id("navbarAccount"));
		act.click(account).perform();
		act.click(account.findElement(By.xpath("//*[@id='mat-menu-panel-0']/div/button[2]"))).perform();
		act.click(account.findElement(By.xpath("//*[@id=\"mat-menu-panel-3\"]/div/button[1]"))).perform();
		act.click(driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-order-history/mat-card/div/div/div/div/div/div[1]/div[5]/button"))).perform();
		act.click(account).perform();
		act.click(driver.findElement(By.id("navbarLogoutButton"))).perform();

	}
	private static void addNewCard(ChromeDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		By newCard=By.xpath("//*[text()=' Add a credit or debit card ']");
		By name=By.id("mat-input-14");
		By cardNo=By.id("mat-input-15");
		By expiryMonth=By.id("mat-input-16");
		By expiryYear=By.id("mat-input-17");
		By submitBtn=By.id("submitButton");
		act.click(driver.findElement(newCard)).perform();
		driver.findElement(name).sendKeys("Dava");
		driver.findElement(cardNo).sendKeys("2345577887871234");
		Select expM=new Select(driver.findElement(expiryMonth));
		expM.selectByIndex(1);
		Select expY=new Select(driver.findElement(expiryYear));
		expY.selectByVisibleText("2080");
		driver.findElement(submitBtn).click();
		driver.findElement(By.xpath("//*[@id=\"mat-expansion-panel-header-1\"]/span[1]/mat-panel-description")).click();
		driver.findElement(By.id("coupon")).sendKeys("1234567890");
		driver.findElement(By.id("applyCouponButton")).click();
		Thread.sleep(2000);
		act.click(driver.findElement(By.id("mat-radio-46"))).perform();
		act.click(driver.findElement(By.xpath("//span[text()='Continue']"))).perform();
		act.click(driver.findElement(By.xpath("//span[text()='Place your order and pay']"))).perform();

	}
	private static void login(ChromeDriver driver) {
		By emaillogin=By.id("email");
		By passwordlogin=By.id("password");
		By loginBtn=By.id("loginButton");
		driver.findElement(emaillogin).sendKeys(emailid);
		driver.findElement(passwordlogin).sendKeys(passwordtxt);
		driver.findElement(loginBtn).click();
	}
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions co=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(co);
		register(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		login(driver);
		addToBasket(driver,js);
	}

}
