package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends ReUsable {
	public static void main(String[] args) {
		/*WebDriver driver2 = */getDriver();
		gettingUrl("http://www.greenstechnologies.in/selenium-training.php");
		WebElement course= driver.findElement(By.xpath("//a[text()='COURSES']"));
		mouseOver(course);
		
		
	}
	
	

}
