package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TreeMain {
	public static void main (String []args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		TreePage obj=new TreePage();
		obj.loadElements();
		obj.searched();
		
	}
		
		
	}

}
