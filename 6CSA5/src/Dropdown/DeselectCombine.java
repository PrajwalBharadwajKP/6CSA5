package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectCombine {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Prajwal/Desktop/dropdown.html");
		WebElement beverage = driver.findElement(By.id("beverage"));
		Select select=new Select(beverage);
		Thread.sleep(1000);
		select.selectByIndex(0);
		Thread.sleep(1000);
		select.selectByValue("2");
		Thread.sleep(1000);
		select.selectByVisibleText("MILK");
		Thread.sleep(1000);
		select.deselectByVisibleText("TEA");
		Thread.sleep(1000);
		select.deselectByIndex(1);
		Thread.sleep(1000);
		select.deselectByValue("3");
	}
}