package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import DriverManager.DriverFactory;

public class HomePage extends DriverFactory{
	public HomePage() {
		super();
		initialization();
		By getStartedBtn=By.className("btn");
		By loginBtn=By.xpath("//a[@href='/login']");
		driver.findElement(getStartedBtn).click();
		driver.findElement(loginBtn).click();
		loginPage lp=new loginPage(driver);
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());
	}
	
	By stack=By.xpath("//a[@href='stack']");
	By queue=By.xpath("//a[@href='queue']");
	By datastructuresLink=By.xpath("//a[text()='Data Structures']");
	By stackdropdown=By.xpath("//a[@href='/stack']");
	By queuedropdown=By.xpath("//a[@href='/queue']");
	By btn_ArraygetStarted=By.xpath("//a[@href='array']");
	
	public void clickStackLink() {
		driver.findElement(stack).click();
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public void clickStackFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(stackdropdown).click();
	}
	public void clickQueueLink() {
		driver.findElement(queue).click();
	}
	public void clickQueueFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(queuedropdown).click();
	}
	public void click_btn_Arraygetstarted()
	{
		driver.findElement(btn_ArraygetStarted).click();
	}

	
}
