package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
/**
 * 
 * @author Aruna
 *
 */
public class MultipleBrowserLaunch {
	public static void main(String[] args) {
		String browserName="EDGE";
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome"))
			driver=new ChromeDriver();
		else if(browserName.equalsIgnoreCase("edge"))
			driver= new EdgeDriver();
		else
			System.out.println("no such browser");
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
	}
}