
package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import DriverManager.DriverFactory;
import Utilities.LoggerLoad;
import freemarker.log.Logger;

public class stackPage extends DriverFactory{
	public stackPage() {
		super();
	}

	By operationsInStack=By.xpath("//a[@href='operations-in-stack']");
	By implementation=By.xpath("//a[@href='implementation']");
	By applications=By.xpath("//a[@href='stack-applications']");
	By practice=By.xpath("//a[@href='/stack/practice']");
	
	public void checkStackPageLink(String pageName) {
		if(pageName.equalsIgnoreCase("operations-in-stack")) {
			driver.findElement(operationsInStack).click();
			LoggerLoad.info("Clicking the operations-in-stack link of stack page");
		}
		else if(pageName.equalsIgnoreCase("implementation")) {
			driver.findElement(implementation).click();
			LoggerLoad.info("Clicking the implementation link of stack page");
		}
		else if(pageName.equalsIgnoreCase("applications"))
			checkApplicationsLink();
		else if(pageName.equalsIgnoreCase("practice-questions"))
			clickPracticeLink();
		
	}
	public String getExcelPath() {
		return configReader.getStackDataPath();
	}
	public void checkApplicationsLink() {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(applications)).perform();
		driver.findElement(applications).click();
		LoggerLoad.info("Clicking the applications link of stack page");
	}
	public void checkTryEditorLink() {
		By tryeditor=By.xpath("//a[@href='/tryEditor']");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(tryeditor)).perform();
		driver.findElement(tryeditor).click();
		LoggerLoad.info("Clicking the tryEditor link");
	}
	public void clickPracticeLink() {
		driver.findElement(applications).click();
		driver.findElement(practice).click();
		LoggerLoad.info("Clicking the practice questions link of stack page");
	}


}