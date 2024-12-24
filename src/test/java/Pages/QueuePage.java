package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import DriverManager.DriverFactory;
import Utilities.LoggerLoad;

public class QueuePage extends DriverFactory{

	public QueuePage() {
		super();
	}
	By implementationList=By.xpath("//a[@href='implementation-lists']");
	By implementationCollections=By.xpath("//a[@href='implementation-collections']");
	By implementationarray=By.xpath("//a[@href='Implementation-array']");
	By queueOperation=By.xpath("//a[@href='QueueOp']");
	By practiceQuestion=By.xpath("//a[@href='/queue/practice']");
	
	public void checkQueuePageLink(String pageName) {
		if(pageName.equalsIgnoreCase("implementation-lists")) {
			driver.findElement(implementationList).click();
			LoggerLoad.info("Clicking the implementation-lists link of stack page");
		}
		else if(pageName.equalsIgnoreCase("implementation-collections.deque")) {
			driver.findElement(implementationCollections).click();
			LoggerLoad.info("Clicking the implementation-collections.deque link of stack page");
		}
		else if(pageName.equalsIgnoreCase("implementation-array")) {
			driver.findElement(implementationarray).click();
			LoggerLoad.info("Clicking the implementation-array link of stack page");
		}
		else if(pageName.equalsIgnoreCase("queue operations")) {
			driver.findElement(queueOperation).click();
			LoggerLoad.info("Clicking the queue operations link of stack page");
		}
		else if(pageName.equalsIgnoreCase("practice questions")) {
			clickPracticeLink();
			LoggerLoad.info("Clicking the practice questions link of stack page");
		}
		
	}
	public String getExcelPath() {
		return configReader.getQueueDataPath();
	}
	public void checkTryEditorLink() {
		LoggerLoad.info("clicking the tryEditor link");
		By tryeditor=By.xpath("//a[@href='/tryEditor']");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(tryeditor)).perform();
		driver.findElement(tryeditor).click();
	}
	public void clickPracticeLink() {
		checkQueuePageLink("queue operations");
		driver.findElement(practiceQuestion).click();
	}


}
