package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartDatePage {
	//declare currentdate
@FindBy(xpath="//a[@class='calCurrDay']")
private WebElement currentdate;
//declare selected date from 0 to 31 based on month
@FindBy(xpath="//a[@class='calDay']")
private WebElement selectdate;
//declare moving to next month feature
@FindBy(xpath="(//a[@class='calNav'])[3]")
private WebElement nextmonth;
//declare moving to previous month feature
@FindBy(xpath="(//a[@class='calNav'])[2]")
private WebElement prevmonth;
//declare moving to previous year feature
@FindBy(xpath="(//a[@class='calNav'])[1]")
private WebElement prevyear;
//declare mov to next year feature
@FindBy(xpath="(//a[@class='calNav'])[4]")
private WebElement nextyear;
//constructor
public StartDatePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setCurrentDate() {
	currentdate.click();
}
public void setSelectDate(String date) {
	selectdate.click();
}
public void setMoveToNextMonth() {
	nextmonth.click();
}
public void setMoveToPreviousMonth() {
	prevmonth.click();
}
public void setMoveToNextYear() {
	nextyear.click();
}
public void setMoveToPreviousYear() {
	prevyear.click();
}
}
