package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class HomeTree extends DriverFactory{
	public HomeTree() {
		By getStartedBtn=By.className("btn");
		By loginBtn=By.xpath("//a[@href='/login']");
		driver.findElement(getStartedBtn).click();
		driver.findElement(loginBtn).click();
		loginPage lp=new loginPage(driver);
		lp.enterLogin(configReader.getUserName(), configReader.getPassword());
	}
	
	By Tree=By.xpath("//a[@href='Tree']");
	By datastructuresLink=By.xpath("//a[text()='Data Structures']");
	By treedropdown=By.xpath("//a[@href='/tree']");
	
	public void clickTreeLink() {
		driver.findElement(Tree).click();
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}
	public void clickStackFromDropDown() {
		driver.findElement(datastructuresLink).click();
		driver.findElement(treedropdown).click();
	}

		
	}
	
	
