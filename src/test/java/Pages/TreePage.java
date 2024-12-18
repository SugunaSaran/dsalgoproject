package Pages;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import DriverManager.DriverFactory;
public class TreePage extends DriverFactory {
	public TreePage() {
		super();
	}
	By Overview of Trees=By.xpath("/html/body/div[2]/ul[1]/a");
	By Terminologies=By.xpath("/html/body/div[2]/ul[2]/a");
	
	
	public void checkOperationsLink() {
		initialization();
	}
	
}
