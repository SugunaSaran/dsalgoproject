package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import DriverManager.DriverFactory;

public class QueuePage extends DriverFactory{

	public QueuePage() {
		super();
	}
	By implementationList=By.xpath("//a[@href='implementation-lists']");
	By implementationCollections=By.xpath("//a[@href='implementation-collections']");
	By implementationarray=By.xpath("//a[@href='Implementation-array']");
	By queueOperation=By.xpath("//a[@href='QueueOp']");
	By practiceQuestion=By.xpath("//a[@href='/queue/practice']");
	
	/*public void checkImplementationListLink() {
		driver.findElement(implementationList).click();
	}
	
	
	public String validatePageLink() {
		if(driver.getPageSource().trim().isEmpty())
			return " ";
		else
			return driver.getTitle();
	}
	
	public void checkImplementationCollectionsLink() {
		driver.findElement(implementationCollections).click();
	}
	
	public void checkImplementationArrayLink() {
		driver.findElement(implementationarray).click();
	}
	public void checkQueueOperationLink() {
		driver.findElement(queueOperation).click();
	}
	public void clickPracticeLink() {
		checkImplementationCollectionsLink();
		driver.findElement(practiceQuestion).click();
	}*/
	public void checkQueuePageLink(String pageName) {
		if(pageName.equalsIgnoreCase("implementation-lists"))
			driver.findElement(implementationList).click();
		else if(pageName.equalsIgnoreCase("implementation-collections.deque"))
			driver.findElement(implementationCollections).click();
		else if(pageName.equalsIgnoreCase("implementation-array"))
			driver.findElement(implementationarray).click();
		else if(pageName.equalsIgnoreCase("queue operations"))
			driver.findElement(queueOperation).click();
		else if(pageName.equalsIgnoreCase("practice questions"))
			clickPracticeLink();
		
	}
	public void checkTryEditorLink() {
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
