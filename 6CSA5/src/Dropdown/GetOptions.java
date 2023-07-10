package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) {
		boolean flag=true;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select=new Select(city);
		List<WebElement> allOptions = select.getOptions();
		for(WebElement singleOption:allOptions) {
			if(singleOption.getText().equals("DHAKA")) {
				flag=true;
				singleOption.click();
				break;
			}
			else
				flag=false;
			
		}
		if(flag==false)
			System.out.println("no option");
	}
}