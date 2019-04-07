package org.base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReUsable {
	static WebDriver driver;
	static Actions acc;
	static Alert al;

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Desktop\\toda\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	

	public static void gettingUrl(String url) {
		driver.get(url);

	}
	public static void textInsert(WebElement ele, String name) {
		ele.sendKeys(name);

	}
	public static void btnClick(WebElement ele) {
		ele.click();
	}
	public static void quitBrowser() {
		driver.quit();
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static Actions dragDrop(WebElement src, WebElement des) {
		acc = new Actions(driver);
		acc.dragAndDrop(src, des).perform();
		return acc;
	}

	public static Alert simpleAlert() {
		al = driver.switchTo().alert();
		al.accept();
		return al;
	}
	public static void mouseOver(WebElement ele) {
		acc.moveToElement(ele).perform();

	}
	public static void gettingText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
		
	}
	public static void rightClick(WebElement ele) {
		acc.contextClick(ele);
		
	}
	
	

}