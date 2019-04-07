package org.saturday.SampleTask;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValueInsert extends Base {
	public ValueInsert() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstname")
	private List<WebElement> firNam;
	@FindBy(name = "lastname")
	private List<WebElement> lasNam;
	@FindBy(name = "reg_email__")
	private List<WebElement> mobOrEmail;
	@FindBy(name = "reg_passwd__")
	private List<WebElement> newPas;
	@FindBy(id = "day")
	private WebElement day;
	@FindBy(id = "month")
	private WebElement month;
	@FindBy(id = "year")
	private WebElement year;
	@FindBy(name = "sex")
	private List<WebElement> gender;

	public List<WebElement> getFirNam() {
		return firNam;
	}

	public List<WebElement> getLasNam() {
		return lasNam;
	}

	public List<WebElement> getMobOrEmail() {
		return mobOrEmail;
	}

	public List<WebElement> getNewPas() {
		return newPas;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public List<WebElement> getGender() {
		return gender;
	}

}