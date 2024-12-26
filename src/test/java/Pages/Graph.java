package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import DriverManager.DriverFactory;
public class Graph extends DriverFactory {
	WebDriver driver;
	public Graph() {
		this.driver=DriverFactory.getDriver();
		HomePage hp=new HomePage();
		hp.clickGraphLink();
	}
	By Graph=By.xpath("//a[@href='Graph']");
	By GraphRepresentation=By.xpath("//a[@href='Graph Representation']");
	By practice=By.xpath("//a[@href='/Graph/practice']");
	
	public void checkGraphLink() {
		driver.findElement(Graph).click();
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
	public String validateGraphlink() {
		return driver.getTitle();
	}
	
	public void checkGraphRepresentation() {
		By GraphRepresentations = null;
		driver.findElement(GraphRepresentations).click();
		checkTryEditorLink();
	}
	public String validateGraphRepresentationsLink() {
		return driver.getTitle();
	}
	
	public void clickPracticeLink() {
		checkGraphLink();
		driver.findElement(practice).click();
	}
	
	}
	
	

	
	


