package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class ArrayEditorPage extends DriverFactory{
	public ArrayEditorPage() {
		super();
	}
	//locators
	By btn_run =By.xpath("//*[contains(text(),'Run')]");
	By btn_Submit =By.xpath("//input[@type='submit']");
	By txt_editor =By.xpath("//div[@class='CodeMirror-scroll']");
	
	//Action methods
   public void Enter_inputCode() {
		
	}
    public void click_run() {
		
	}
    public void click_submit() {
		
	}
	

}
	


