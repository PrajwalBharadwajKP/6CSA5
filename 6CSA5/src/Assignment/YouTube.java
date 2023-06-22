package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("ram siya ram");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//img[contains(@src,'XQ')]")).click();
	}
}