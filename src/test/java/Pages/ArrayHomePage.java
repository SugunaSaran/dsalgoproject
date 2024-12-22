package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class ArrayHomePage extends DriverFactory {
	public ArrayHomePage() {
		super();
	}

	//locators
	By btn_ArraygetStarted=By.xpath("//a[@href='array']");
	//Action method
	public void click_btn_Arraygetstarted()
	{
		driver.findElement(btn_ArraygetStarted).click();
	}

}
