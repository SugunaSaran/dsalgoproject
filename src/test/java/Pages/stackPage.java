
package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import DriverManager.DriverFactory;

public class stackPage extends DriverFactory{
	public stackPage() {
		super();
	}

	By operationsInStack=By.xpath("//a[@href='operations-in-stack']");
	By implementation=By.xpath("//a[@href='implementation']");
	By applications=By.xpath("//a[@href='stack-applications']");
	By practice=By.xpath("//a[@href='/stack/practice']");
	public void checkStackPageLink(String pageName) {
		if(pageName.equalsIgnoreCase("operations-in-stack"))
			driver.findElement(operationsInStack).click();
		else if(pageName.equalsIgnoreCase("implementation"))
			driver.findElement(implementation).click();
		else if(pageName.equalsIgnoreCase("applications"))
			driver.findElement(applications).click();
		else if(pageName.equalsIgnoreCase("practice-questions"))
			clickPracticeLink();
		
	}

	public void checkTryEditorLink() {
		By tryeditor=By.xpath("//a[@href='/tryEditor']");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(tryeditor)).perform();
		driver.findElement(tryeditor).click();
	}
	public void clickPracticeLink() {
		driver.findElement(applications).click();
		driver.findElement(practice).click();
	}


}
