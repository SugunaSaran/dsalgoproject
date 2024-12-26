package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;

public class arrayPracticeQuestionsPage extends DriverFactory{
	WebDriver driver;
	public arrayPracticeQuestionsPage () {
		this.driver=DriverFactory.getDriver();
	}
	//locators
	By lnk_SearchtheArray=By.xpath("//a[text()='Search the array']");
	By lnk_MaxConsecutiveOnes=By.xpath("//a[text()='Max Consecutive Ones']");
	By lnk_FindNumbers=By.xpath("//a[text()='Find Numbers with Even Number of Digits']");
	By lnk_SquaresofaSortedArray=By.xpath("//a[text()='Squares of  a Sorted Array']");
	
	//Action Methods
	public void click_searchthearray()
	{
		driver.findElement(lnk_SearchtheArray).click();
	}
	public void click_max()
	{
		driver.findElement(lnk_MaxConsecutiveOnes).click();
	}
	public void click_findnumbers()
	{
		driver.findElement(lnk_FindNumbers).click();
	}
	public void click_squares()
	{
		driver.findElement(lnk_SquaresofaSortedArray).click();
	
	
}
}
   

