package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import DriverManager.DriverFactory;
import Utilities.LoggerLoad;

public class ArrayEditorPage extends DriverFactory{
	WebDriver driver;
	public ArrayEditorPage() {
		this.driver=DriverFactory.getDriver();
	}
	//locators
	
		By btn_run =By.xpath("//*[contains(text(),'Run')]");
		By btn_Submit =By.xpath("//input[@type='submit']");
		By txt_editor =By.xpath("//*[@id='editor']");
		By outputText=By.xpath("//*[@id='output']");
		
		//Action methods
		public void Enter_inputCode(String code)  {
			

	By def=By.xpath("//*[@class=\"CodeMirror-code\"]");
	Actions actions=new Actions(driver);
			actions.moveToElement(driver.findElement(def)).click()
	        .sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.BACK_SPACE).perform();
	actions.keyDown(Keys.CONTROL);
	actions.sendKeys("a");
	actions.keyUp(Keys.CONTROL);
	actions.perform();
	actions.moveToElement(driver.findElement(def)).sendKeys(Keys.BACK_SPACE).perform();
	actions.moveToElement(driver.findElement(def)).sendKeys(code).perform();
}
	    public void click_run() {
	    	driver.findElement(btn_run).click();
	    	
			
		}
	    public void click_submit() {
	    	driver.findElement(btn_Submit).click();
			
		}
	    public String get_outputText()
		{
			return driver.findElement(outputText).getText();
			
		}


	
}