package Pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import DriverManager.DriverFactory;

public class TryEditorPage extends DriverFactory{

	By textArea=By.xpath("//textarea[@tabindex='0']");
	By runBtn=By.xpath("//button[text()='Run']");
	By outputText=By.xpath("//*[@id='output']");

	public void checkCode(String code) {
		   driver.findElement(textArea).sendKeys(code);
			driver.findElement(runBtn).click();
			validateOutput();
	}
	public String validateOutput() {
		if (isAlertPresent(driver)) {
			// Alert is present, handle it
			Alert alert = driver.switchTo().alert();
			String alertText=alert.getText();
			System.out.println("Alert Text: " + alertText);
			alert.accept();  // Or alert.dismiss() depending on the action you want to take
			return alertText;
			
		} else {
			System.out.println(driver.findElement(outputText).getText());
			return driver.findElement(outputText).getText();
		}

	}
	public static boolean isAlertPresent(WebDriver driver) {
		try {
			driver.switchTo().alert();  // Try to switch to the alert
			return true;  // Alert is present
		} catch (NoAlertPresentException e) {
			return false;  // No alert is present
		}
	}
}
