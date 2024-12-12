package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class stackPage {
	static WebDriver driver;
	@FindBy(xpath="//a[@href='operations-in-stack']") WebElement operationsInStack;
	@FindBy(xpath="//a]@href='implementation']") WebElement implementation;
	@FindBy(xpath="//a[@href='stack-applications']") WebElement applications;
	public void loadElements()
	{
		PageFactory.initElements(driver, this);
	}
	public void checkOperationsLink() {
		operationsInStack.click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Operations in Stack");
		}
	
}
