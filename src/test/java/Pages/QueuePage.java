package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class QueuePage extends DriverFactory{

	public QueuePage() {
		super();
	}
	By implementationList=By.xpath("//a[@href='implementation-lists']");
	By implementationCollections=By.xpath("//a[@href='implementation-collections']");
	By implementationarray=By.xpath("//a[@href='implementation-array']");
	By queueOperation=By.xpath("//a[@href='QueueOp']");
	By practiceQuestion=By.xpath("//a[@href='/queue/practice']");
	public void setUp() {
		initialization();
	}

}
