package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prajwal/Desktop/Prajwal/Selenium%20Class/sample%20web%20pages/example%20for%20textboxes.html");
		WebElement textbox = driver.findElement(By.xpath("//input[@value='A']"));
		textbox.clear();
		textbox.sendKeys("hello");
	}
}