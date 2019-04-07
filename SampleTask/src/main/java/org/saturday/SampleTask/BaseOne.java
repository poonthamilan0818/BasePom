package org.saturday.SampleTask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOne {
	static WebDriver driver;

	public static WebDriver CallDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Desktop\\toda\\SampleTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void EnterValue(WebElement userName, String name) {
		userName.sendKeys(name);

	}

}
