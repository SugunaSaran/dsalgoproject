package Pages;

import org.openqa.selenium.By;

import DriverManager.DriverFactory;

public class linkedListPage extends DriverFactory {
	public linkedListPage() {
		super();
	}
	//Locators
	By lnk_Introduction=By.xpath("//a[@href='introduction']");
	By lnk_CreatingLinkedLIst=By.xpath("//a[@href='/linked-list/creating-linked-list/']");
	By lnk_TypesofLinkedList=By.xpath("//a[@href='/linked-list/types-of-linked-list/']");
	By lnk_ImplementLinkedListinPython=By.xpath("//a[@href='/linked-list/implement-linked-list-in-python/']");
	By lnk_Traversal=By.xpath("//a[@href='/linked-list/traversal/']");
	By lnk_Insertion=By.xpath("//a[@href='/linked-list/insertion-in-linked-list/']");
	By lnk_Deletion=By.xpath("//a[@href='/linked-list/deletion-in-linked-list/']");
	
	//Action Methods
    public void navigate_IntroductionPage() {
		
	}
    public void navigate_CreatingLinkedListPage() {
		
	}
    public void navigate_TypesofLinkedListPage() {
		
	}
   public void navigate_ImplementLinkedListinPythonPage() {
		
	}
   public void navigate_TraversalPage() {
		
	}
   public void navigate_InsertionPage() {
		
	}
   public void navigate_DeletionPage() {
		
	}

	

}
