package org.saturday.SampleTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	public static String getData(int rowNo, int cellNo) throws IOException {
		File loc = new File("C:\\Users\\admin\\Desktop\\toda\\SampleTask\\ExcelSheet\\tasx.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = null;
		if (type == 1) {
			name = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				name = new SimpleDateFormat("dd-mm-yyyy").format(c.getDateCellValue());
			} else {
				name = String.valueOf((long) c.getNumericCellValue());
			}
		}

		return name;

	}

	public static void insertValue(int row, int cell, String name) throws IOException {
		File loc = new File("C:\\Users\\admin\\Desktop\\toda\\SampleTask\\ExcelSheet\\tasx.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row createRow = s.createRow(row);
		Cell createCell = createRow.createCell(cell);
		createCell.setCellValue(name);
		FileOutputStream out = new FileOutputStream(loc);
		w.write(out);

	}

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\Desktop\\toda\\BaseClassCreation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void sleep() throws InterruptedException {
		Thread.sleep(9000);
	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	// public static void byID(String id) {
	// driver.findElement(By.id(id));
	// }
	// public static void byXpath(String xpath) {
	// driver.findElement(By.xpath(xpath));
	// }
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

	static Actions acc;

	public static void dragDrop(WebElement src, WebElement des) {
		acc = new Actions(driver);
		acc.dragAndDrop(src, des).perform();

	}

	static Select sc;

	public static void dropDown(WebElement element, int no) {
		sc = new Select(element);
		sc.selectByIndex(no);

	}

	static Alert al;

	public static void Alert(WebDriver e) {
		al = driver.switchTo().alert();
		al.accept();
	}

	public static void mouseOver(WebElement ele) {
		acc = new Actions(driver);
		acc.moveToElement(ele).perform();

	}

	public static void printText(WebElement ele) {
		String printText = ele.getText();
		System.out.println(printText);

	}

	public static void printAttValue(WebElement ele) {
		String attribute = ele.getAttribute("value");
		System.out.println(attribute);
	}

	public static void rightClick(WebElement ele) {
		acc = new Actions(driver);
		acc.contextClick(ele);

	}

	public static void selectIndex(WebElement element, int i) {
		Select s = new Select(element);
		s.selectByIndex(i);

	}

	public static void selectValue(WebElement element, String i) {
		Select s = new Select(element);
		s.selectByValue(i);

	}

}
