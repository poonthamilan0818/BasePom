package org.saturday.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Qwerty extends BaseOne {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\admin\\Desktop\\toda\\SampleTask\\driver\\chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		WebElement userName= driver.findElement(By.id("email"));
		WebDriver cd = CallDriver();
		loadUrl("http://adactin.com/HotelApp/index.php");
		WebElement userName=cd.findElement(By.id("email"));
		EnterValue(userName, "qwertyuiop");
		WebElement password=cd.findElement(By.id("pass"));
		EnterValue(password, "qwertyuiop");
		
		
		
	}

}
