package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String actualTitle = driver.getTitle();
		String expectedTitle="actiTIME - Login";
		if(actualTitle.equals(expectedTitle))
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}