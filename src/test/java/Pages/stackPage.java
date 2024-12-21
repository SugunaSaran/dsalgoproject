
package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import DriverManager.DriverFactory;

public class stackPage extends DriverFactory{
	public stackPage() {
		super();
		HomePage hp=new HomePage();
		hp.clickStackLink();
	}
	By operationsInStack=By.xpath("//a[@href='operations-in-stack']");
	By implementation=By.xpath("//a[@href='implementation']");
	By applications=By.xpath("//a[@href='stack-applications']");
	By practice=By.xpath("//a[@href='/stack/practice']");
	
	public void checkOperationsLink() {
		driver.findElement(operationsInStack).click();
		System.out.println("Title of the page is :"+driver.getTitle());
		checkTryEditorLink();
	}
	
	public void checkTryEditorLink() {
		By tryeditor=By.xpath("//a[@href='/tryEditor']");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(tryeditor)).perform();
		driver.findElement(tryeditor).click();
		TryEditorPage tp=new TryEditorPage();
		tp.checkCode("print('hi')");
	}
	public String validateOperationsLink() {
		return driver.getTitle();
	}
	
	public void checkImplementationLink() {
		driver.findElement(implementation).click();
		checkTryEditorLink();
	}
	public String validateImplementationLink() {
		return driver.getTitle();
	}
	public void checkApplicationLink() {
		driver.findElement(applications).click();
		checkTryEditorLink();
	}
	public String validateApplicationsLink() {
		return driver.getTitle();
	}
	public void clickPracticeLink() {
		checkOperationsLink();
		driver.findElement(practice).click();
	}
	
	
}
