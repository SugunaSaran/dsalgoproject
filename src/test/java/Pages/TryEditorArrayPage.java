package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import DriverManager.DriverFactory;

public class TryEditorArrayPage extends DriverFactory {
	WebDriver driver;
	public TryEditorArrayPage() {
		this.driver=DriverFactory.getDriver();
	}
	//locators
		By btn_tryEditor=By.xpath("//a[@href=\"/tryEditor\"]");
		By textArea=By.xpath("//textarea[@tabindex='0']");
		By runBtn=By.xpath("//button[text()='Run']");
		By outputText=By.xpath("//*[@id='output']");
		
		//Action Methods
		public void enter_input(String code)
		{
			driver.findElement(textArea).sendKeys(code);
		}
		public void click_run()
		{
			driver.findElement(runBtn).click();
		}
		public void click_tryEditor()
		{
			driver.findElement(btn_tryEditor).click();
		}
		
		public boolean isAlertPresent(){
		    try{
		        driver.switchTo().alert();
		        return true;
		    }
		    catch (NoAlertPresentException e){
		        return false;
		    }
		}

		public void capture_alert()
		{
			Alert alert = driver.switchTo().alert(); // switch to alert

			String alertMessage= driver.switchTo().alert().getText(); // capture alert message
	        System.out.println(alertMessage); // Print Alert Message
		
		}
		
		
		public String get_outputText()
		{
			String consoleOutput=driver.findElement(outputText).getText();
			return consoleOutput;
		}
		

}