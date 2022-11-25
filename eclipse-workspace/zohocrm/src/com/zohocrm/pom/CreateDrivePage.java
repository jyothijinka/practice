package com.zohocrm.pom;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateDrivePage {
@FindBy(name="property(Campaign Name)")
private WebElement drivename;
@FindBy(name="property(Start Date)")
private WebElement startdate;
@FindBy(xpath="(//img[@title='Calendar'])[1]")
private WebElement startdatecalendericon;
@FindBy(name="property(Expected Revenue)")
private WebElement expectedrevenue;
@FindBy(name="property(Actual Cost)")
private WebElement actualcost;
@FindBy(name="property(Num sent)")
private WebElement numsent;
@FindBy(name="property(Type)")
private WebElement type;
@FindBy(name="property(Status)")
private WebElement status;
@FindBy(name="property(End Date)")
private WebElement enddate;
@FindBy(xpath="(//img[@title='Calendar'])[2]")
private WebElement enddatecalendaricon;
@FindBy(name="property(Budgeted Cost)")
private WebElement budgetedcost;
@FindBy(name="property(Expected Response)")
private WebElement expectedresponse;
@FindBy(name="property(Description)")
private WebElement description;
@FindBy(xpath="(//input[@value='Save'])[2]")
private WebElement save;
@FindBy(xpath="(//input[@value='Save & New'])[2]")
private WebElement save_new;
@FindBy(xpath="(//input[@name='Cancel'])[2]")
private WebElement cancel;
@FindBy(xpath="//a[@class='calCurrDay']")
private WebElement currentdate;
@FindBy(name="property(Type)")
private WebElement dropdownlist;
@FindBy(name="property(Status)")
private WebElement statuslistbox;
public CreateDrivePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setDriveName(String key) {
	drivename.sendKeys(key);
}
public void setStartDate(String start) {
	startdate.sendKeys(start);
}
public void setStartDateIcon(WebDriver driver) throws InterruptedException {
	startdatecalendericon.click();
	String pwh = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String i:allwh) {
		driver.switchTo().window(i);
		String title=driver.getTitle();
		if(title.equals("Start Date"))
			{
			StartDatePage sdp=new StartDatePage(driver);

		sdp.setCurrentDate();
			}
		}
	driver.switchTo().window(pwh);
	}
public void setExpectedRevenue(double key) {
	expectedrevenue.sendKeys(String.valueOf(key));
}
public void setActualCost(double cost) {
	actualcost.sendKeys(String.valueOf(cost));
}
public void setNumSent(int num) {
	numsent.sendKeys(String.valueOf(num));
}
public void setType(WebDriver driver,int index) {
	
type.click();
	Select s=new Select(dropdownlist);
s.selectByIndex(index);

}
public void setStatus(WebDriver driver,int index) {
	status.click();
	Select s=new Select(statuslistbox);
	s.selectByIndex(index);
}
public void setEndDate(String end) {
	enddate.sendKeys();
}
public void setEndDateIcon(WebDriver driver) {
	enddatecalendaricon.click();
	String pwh = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String i:allwh) {
		driver.switchTo().window(i);
		String title=driver.getTitle();
		if(title.equals("End Date")) {
			EndDatePage edp=new EndDatePage(driver);
			edp.setMoveToNextMonth();
			
			edp.setMoveToNextYear();
			JavascriptExecutor j=(JavascriptExecutor) driver;
			//generating random number for selecting the date from 1 to 31
			  int random = (int) Math.floor(Math.random()*(31-1+1)+1);
			j.executeScript("window.opener.pickDate("+random+")");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		}
	driver.switchTo().window(pwh);
	}
public void setBudgetedCost(double key) {
	budgetedcost.sendKeys(String.valueOf(key));;
}
public void setExpectedResponse(int key) {
	expectedresponse.sendKeys(String.valueOf(key));
}
public void setDescription(String key) {
	description.sendKeys(key);
}
public void setSave() {
	save.click();
}
public void setSaveAndNew() {
	save_new.click();
}
public void setCancel() {
	cancel.click();
}
public WebElement getDrivename() {
	return drivename;
}
public WebElement getStartdate() {
	return startdate;
}
public WebElement getStartdatecalendericon() {
	return startdatecalendericon;
}
public WebElement getExpectedrevenue() {
	return expectedrevenue;
}
public WebElement getActualcost() {
	return actualcost;
}
public WebElement getNumsent() {
	return numsent;
}
public WebElement getType() {
	return type;
}
public WebElement getStatus() {
	return status;
}
public WebElement getEnddate() {
	return enddate;
}
public WebElement getEnddatecalendaricon() {
	return enddatecalendaricon;
}
public WebElement getBudgetedcost() {
	return budgetedcost;
}
public WebElement getExpectedresponse() {
	return expectedresponse;
}
public WebElement getDescription() {
	return description;
}
public WebElement getSave() {
	return save;
}
public WebElement getSave_new() {
	return save_new;
}
public WebElement getCancel() {
	return cancel;
}
public WebElement getCurrentdate() {
	return currentdate;
}
public WebElement getDropdownlist() {
	return dropdownlist;
}
public WebElement getStatuslistbox() {
	return statuslistbox;
}

}

