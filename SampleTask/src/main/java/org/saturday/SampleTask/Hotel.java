package org.saturday.SampleTask;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hotel extends Base {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = getDriver();
		loadUrl("http://adactin.com/HotelApp/index.php");
		maximize();
		WebElement uname = driver.findElement(By.id("username"));
		textInsert(uname, getData(1, 0));
		WebElement pass = driver.findElement(By.id("password"));
		textInsert(pass, getData(1, 1));
		WebElement ln = driver.findElement(By.id("login"));
		btnClick(ln);
		WebElement loc = driver.findElement(By.id("location"));
		selectIndex(loc, 1);
		WebElement hot = driver.findElement(By.id("hotels"));
		selectIndex(hot, 1);
		WebElement roomT = driver.findElement(By.id("room_type"));
		selectIndex(roomT, 1);
		WebElement roomNo = driver.findElement(By.id("room_nos"));
		selectIndex(roomNo, 1);
		WebElement chkIn = driver.findElement(By.id("datepick_in"));
		textInsert(chkIn, getData(1, 2));
		WebElement chkOut = driver.findElement(By.id("datepick_out"));
		textInsert(chkOut, getData(1, 3));
		WebElement srch = driver.findElement(By.id("Submit"));
		btnClick(srch);
		WebElement rdBtn = driver.findElement(By.id("radiobutton_0"));
		btnClick(rdBtn);
		WebElement cnt = driver.findElement(By.id("continue"));
		btnClick(cnt);
		WebElement frName = driver.findElement(By.id("first_name"));
		textInsert(frName, getData(1, 4));
		WebElement lasName = driver.findElement(By.id("last_name"));
		textInsert(lasName, getData(1, 5));
		WebElement add = driver.findElement(By.id("address"));
		textInsert(add, getData(1, 6));
		WebElement ccCard = driver.findElement(By.id("cc_num"));
		textInsert(ccCard, getData(1, 7));
		WebElement ccType = driver.findElement(By.id("cc_type"));
		selectIndex(ccType, 1);
		WebElement expMon = driver.findElement(By.id("cc_exp_month"));
		selectIndex(expMon, 1);
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		selectIndex(expYear, 11);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		textInsert(cvv, getData(1, 8));
		WebElement bkNow = driver.findElement(By.id("book_now"));
		btnClick(bkNow);
		sleep();
		WebElement ordId = driver.findElement(By.id("order_no"));
		String text = ordId.getAttribute("value");
		System.out.println(text);
		insertValue(0, 9, "order id");
		insertValue(1, 9, text);
	}

}
