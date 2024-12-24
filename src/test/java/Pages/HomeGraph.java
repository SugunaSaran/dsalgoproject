package Pages;
import org.openqa.selenium.By;
import DriverManager.DriverFactory;

public class HomeGraph extends DriverFactory {
	public HomeGraph() {
		
				By getStartedBtn=By.className("btn");
				By loginBtn=By.xpath("//a[@href='/login']");
				driver.findElement(getStartedBtn).click();
				driver.findElement(loginBtn).click();
				loginPage lp=new loginPage(driver);
				lp.enterLogin(configReader.getUserName(), configReader.getPassword());
			
		}
	
	
	By Graph=By.xpath("//a[@href='Graph']");
	
	By datastructuresLink=By.xpath("//a[text()='Data Structures']");
	By Graphdropdown=By.xpath("//a[@href='/Graph']");
	
	
	public void clickGraphLink() {
		driver.findElement(Graph).click();
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public void clickGraphFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(Graphdropdown).click();
	}
	
		
	}
	


