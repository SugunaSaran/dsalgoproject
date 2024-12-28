
package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import DriverManager.DriverFactory;

public class HomePage extends DriverFactory{
	WebDriver driver;
	public HomePage() {
		this.driver=DriverFactory.getDriver();
		/*driver.get(configReader.getApplicationUrl());
		By getStartedBtn=By.className("btn");
		By loginBtn=By.xpath("//a[@href='/login']");
		driver.findElement(getStartedBtn).click();
		driver.findElement(loginBtn).click();
		loginPage lp=new loginPage(driver);
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());*/
	}
	By graph=By.xpath("//a[@href='graph']");
	By stack=By.xpath("//a[@href='stack']");
	By queue=By.xpath("//a[@href='queue']");
	By tree=By.xpath("//a[@href='tree']");
	By datastructuresLink=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By stackdropdown=By.xpath("//a[@href='/stack']");
	By queuedropdown=By.xpath("//a[@href='/queue']");
	By graphdropdown=By.xpath("//a[@href='/graph']");
	By treedropdown=By.xpath("//a[@href='/tree']");
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
	public void clickGraphLink() {
		driver.findElement(graph).click();
		
	}
	public void clickGraphFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(graphdropdown).click();
	}
	public void clickTreeLink() {
		driver.findElement(tree).click();
		
	}
	public void clickTreeFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(treedropdown).click();
	}

	
}
