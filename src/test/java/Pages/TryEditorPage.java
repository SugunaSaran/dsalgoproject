package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class TryEditorPage extends DriverFactory{

	public TryEditorPage() {
		super();
	}
	By textArea=By.id("editor");
	By runBtn=By.xpath("//button[text()='Run']");
	By outputText=By.xpath("//*[@id='output']");
}
