package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookie {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.fb.com");		
		Cookie cooky=new Cookie("selenium","4");
		driver.manage().addCookie(cooky);
		driver.manage().deleteCookie(cooky);
	}
}