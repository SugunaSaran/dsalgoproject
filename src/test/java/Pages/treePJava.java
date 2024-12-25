package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import DriverManager.DriverFactory;

public class treePJava extends DriverFactory{
	private static final By OverviewofTrees = null;
	private static final By ApplicationsofBinaryTrees = null;


	public treePJava() {
		super();
		HomePage hp=new HomePage();
		hp.clickTreeLink();
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
By practice=By.xpath("//a[@href='/tree/practice']");

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
public String validatePageLink1() {
	return driver.getTitle();

}
public void checkTypesofTreesLink() {
	driver.findElement(TypesofTrees).click();
}

public void checkTreeTraversalsLink() {
	driver.findElement(TreeTraversals).click();
}

public void checkTraversalsIllustrationLink() {
	driver.findElement(TraversalsIllustration).click();
}

public void checkBinaryTreesLink() {
	driver.findElement(BinaryTrees).click();
}
public void checkTypesofBinaryTreesLink() {
	driver.findElement(BinaryTrees).click();

}

public void checkImplementationinPythonLink() {
	driver.findElement(ImplementationinPython).click();
}
public void checkBinaryTreeTraversalsLink() {
	driver.findElement(BinaryTreeTraversals).click();
}

public void checkImplementationofBinaryTreesLink() {
	driver.findElement(ImplementationofBinaryTrees).click();
}
public void checkApplicationsofBinarytreesLink() {
	driver.findElement(ApplicationsofBinaryTrees).click();
}
public void checkIBinarySearchTreesLink() {
	driver.findElement(BinarySearchtrees).click();
}
public void checkImplementationOfBSTLink() {
	driver.findElement(ImplementationOfBST).click();
}
public void clickPracticeLink() {
	checkImplementationOfBSTLink();
	driver.findElement(practice).click();

	
}
}

	
	

















