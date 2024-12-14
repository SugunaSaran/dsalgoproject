package Pages;


	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	//class declaration
	public class TreePage {
		WebDriver driver ;
		driver=new ChromeDriver();
		
		
 
		//Locators
		driver.FindElement(By.linkText("Overviews of Trees")).click();
		driver.FindElement(By.linkText("TryHereButton")).click();
		driver.FindElemeent(By.linktext("Terminologies")).click();
		//Constructor
		public TreePage(WebDriver driver) {
		this.driver=driver;
		
		}
		//ACtion method
		// Action Methods 
		public void clickOverviewOfTreesLink() { 
			driver.findElement(OverviewOfTreesLink).click();
			} 
		public void clickTryHereButton()
		{
			driver.findElement(try Here Button).click(); 
		} 
		public void clickTreeTraversalLink() 
		{ 
			driver.findElement(treeTraversalLink).click();
		} 
		
		
	
	
	
	
	

}
