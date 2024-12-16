package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StackMain {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver(); 
			driver.get("https://dsportalapp.herokuapp.com/home/");
			stackPage obj=new stackPage();
			obj.loadElements();
			obj.checkOperationsLink();
		

	}

}
