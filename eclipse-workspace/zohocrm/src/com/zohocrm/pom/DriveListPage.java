package com.zohocrm.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriveListPage {
@FindBy(xpath="//input[@value='New Campaign']")
private WebElement newdrive;
@FindBy(name="cvid")
private WebElement alldrive;
@FindBy(name="searchString")
private WebElement finddrive;
@FindBy(linkText="Edit")
private WebElement editdrive;
@FindBy(linkText="Del")
private WebElement deldrive;
@FindBy(xpath="//td[@class='tableData']/../../tr[2]/td[3]")
private WebElement drivelist;
public DriveListPage(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
public void setNewDrive() {
	newdrive.click();
}
public void setAllDrive() {
	alldrive.click();
}
public void setFindDrive(String key) {
	finddrive.sendKeys(key);
}
public void setEditdrive() {
	editdrive.click();
}
public void setDelDrive() {
	deldrive.click();
}
public WebElement getDriveList() {
	return drivelist;
}
}
