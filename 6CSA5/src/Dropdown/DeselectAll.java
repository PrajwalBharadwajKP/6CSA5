package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectAll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select select=new Select(city);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(3);
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.deselectAll();
	}
}