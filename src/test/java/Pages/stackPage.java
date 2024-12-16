package Pages;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import DriverManager.DriverFactory;

public class stackPage extends DriverFactory{
	public stackPage() {
		super();
	}
	By operationsInStack=By.xpath("//a[@href='operations-in-stack']");
	By implementation=By.xpath("//a]@href='implementation']");
	By applications=By.xpath("//a[@href='stack-applications']");
	
	public void checkOperationsLink() {
		initialization();
	}
	
}
