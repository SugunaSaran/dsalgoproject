package Pages;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import DriverManager.DriverFactory;
import stepdefinitions.TreePage;

public class treePJava extends DriverFactory{
	private static final By OverviewofTrees = null;


	public treePJava() {
		super();
		HomeTree T=new HomeTree();
		T.clickTreeLink();
}

By OverviewofTrees1=By.xpath("//a[@href='Overview of Trees']");
By Terminologies=By.xpath("//a[@href='Terminologies']");
By TypesofTrees=By.xpath("//a[@href='Types of Trees']");
By TreeTraversals=By.xpath("//a[@href='Tree Traversals");
By TraversalsIllustration=By.xpath("//a[@href='Traversals-Illustration']");
By BinaryTrees=By.xpath("//a[@href='Binary Trees']");
By TypesofBinaryTrees=By.xpath("//a[@href='Types of Binary Trees']");
By ImplementationinPython=By.xpath("//a[@href='Implementation in Python']");
By BinaryTreeTraversals=By.xpath("//a[@href='Binary Tree Traversals']");
By ImplementationofBinaryTrees=By.xpath("//a[@href='Implementation of Binary Trees']");
By BinarySearchtrees=By.xpath("//a[@href=' Binary Search trees']");
By ImplementationOfBST=By.xpath("//a[@href='Implementation Of BST']");


public void checkOverviewofTreesLink() {
	driver.findElement(OverviewofTrees).click();
}	
public void checkTryEditorLink() {
	By tryeditor=By.xpath("//a[@href='/tryEditor']");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(tryeditor)).perform();
	driver.findElement(tryeditor).click();
}
public String validatePageLink() {
	if(driver.getPageSource().trim().isEmpty())
		return " ";
	else
		return driver.getTitle();
}


public void checkTerminologiesLink() {
	driver.findElement(Terminologies).click();
}	
public void checkTryEditorLink1() {
	By tryeditor=By.xpath("//a[@href='/tryEditor']");
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(tryeditor)).perform();
	driver.findElement(tryeditor).click();
}
public String validatePageLink1() {
	if(driver.getPageSource().trim().isEmpty())
		return " ";
	else
		return driver.getTitle();
}










}




}
