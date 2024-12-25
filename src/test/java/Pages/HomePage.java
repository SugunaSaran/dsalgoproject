package Pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import DriverManager.DriverFactory;

public class HomePage extends DriverFactory{
	public HomePage() {
		By getStartedBtn=By.className("btn");
		By loginBtn=By.xpath("//a[@href='/login']");
		driver.findElement(getStartedBtn).click();
		driver.findElement(loginBtn).click();
		loginPage lp=new loginPage(driver);
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());
	}
	
	By stack=By.xpath("//a[@href='stack']");
	By queue=By.xpath("//a[@href='queue']");
	By datastructuresLink=By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a");
	By stackdropdown=By.xpath("//a[@href='/stack']");
	By queuedropdown=By.xpath("//a[@href='/queue']");
	By btn_ArraygetStarted=By.xpath("//a[@href='array']");
    By Graph=By.xpath("//a[@href='Graph']");
	By Graphdropdown=By.xpath("//a[@href='/Graph']");
	By Tree=By.xpath("//a[@href='Tree']");
	By treedropdown=By.xpath("//a[@href='/tree']");
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
		driver.findElement(Graph).click();
	}
	
	public void clickGraphFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(Graphdropdown).click();
	}
	public void clickTreeLink() {
		driver.findElement(Tree).click();
	}
	
	public void clickTreeFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(treedropdown).click();
	}

}