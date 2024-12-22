package Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import DriverManager.DriverFactory;

public class TryEditorPage extends DriverFactory{

	By textArea=By.xpath("//textarea[@tabindex='0']");
	By runBtn=By.xpath("//button[text()='Run']");
	By outputText=By.xpath("//*[@id='output']");

	public void checkCode(String code) {
		if(code!=" ") {
		WebElement textEditor = driver.findElement(textArea);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", textEditor);
		textEditor.sendKeys(code);
		}
		   //driver.findElement(textArea).sendKeys(code);
			driver.findElement(runBtn).click();
		}
	public String validateOutput() {
			if(!isAlertPresent()) {
			//System.out.println(driver.findElement(outputText).getText());
			return driver.findElement(outputText).getText();
		}
			else
				return " ";

	}
	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();  
			return true; 
		} catch (NoAlertPresentException e) {
			return false;  
		}
	}
}