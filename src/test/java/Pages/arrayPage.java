package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class arrayPage extends DriverFactory{
	public arrayPage() {
		super();
	}
	By lnk_ArraysinPython =By.xpath("//a[@href='arrays-in-python']");
	By lnk_ArraysUsingList=By.xpath("//a[text()='Arrays Using List']");
	By lnk_BasicOperationsinLists=By.xpath("//a[text()=\"Basic Operations in Lists\"]");
	By lnk_ApplicationsofArray=By.xpath("//a[text()=\"Applications of Array\"]");
	By lnk_PracticeQuestions=By.xpath("//a[text()=\"Practice Questions\"]");
	
	public void navigate_arraysinPythonPage() {
	 driver.findElement(lnk_ArraysinPython).click();
		}
	public String validatePageTitle() {
		return driver.getTitle();
	}

    public void navigate_ArraysUsingListPage() {
    	//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,350)", "");

    	driver.findElement(lnk_ArraysUsingList).click();
		
	}
    public void navigate_BasicOperationsinListsPage() {
    	driver.findElement(lnk_BasicOperationsinLists).click();

		
	}
   public void navigate_ApplicationsofArrayPage() {
	   driver.findElement(lnk_ApplicationsofArray).click();
		
	}
   public void navigate_PracticeQuestionsPage() {
	   driver.findElement(lnk_PracticeQuestions).click(); 
		
	
}
}




	

