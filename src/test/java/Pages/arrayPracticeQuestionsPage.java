package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class arrayPracticeQuestionsPage extends DriverFactory{
	
	public arrayPracticeQuestionsPage () {
		super(); 
	}
	
//Locators
	
	By lnk_SearchtheArray =By.xpath("//a[@href='/question/1']");
	By lnk_MaxConsecutiveOnes =By.xpath("//a[@href='/question/2']");
	By lnk_FindNumberswithEvenNumbersofDigits =By.xpath("//a[@href='/question/3']");
	By lnk_SquaresofaSortedArray =By.xpath("//a[@href='/question/4']");
	
	//Action Methods
    public void navigate_searchtheArrayPage() {
		
	}
    public void navigate_MaxConsecutiveOnesPage() {
		
	}
    public void navigate_FindNumberswithEvenNumbersofDigitsPage() {
		
	}
   public void navigate_SquresofaSortedArray() {
		
	}
   
}