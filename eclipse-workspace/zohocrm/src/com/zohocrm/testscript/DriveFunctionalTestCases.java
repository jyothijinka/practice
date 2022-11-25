package com.zohocrm.testscript;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohocrm.generic.FileLib;
import com.zohocrm.generic.ZohoCrmBaseClass;
import com.zohocrm.pom.CreateDrivePage;
import com.zohocrm.pom.DriveDetailsPage;
import com.zohocrm.pom.DriveListPage;
import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.SigninPage;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class DriveFunctionalTestCases extends ZohoCrmBaseClass {
@Test(invocationCount=1)
public void testDriveNameTextField() throws IOException, InterruptedException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String drivename = f.getStringExcelData(SheetName, i, 0);
	cdp.getDrivename().sendKeys(drivename);
	cdp.getSave().click();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getDrivename().clear();
	
	}
}
}
@Test(invocationCount=1)
public void testStartDateTextField() throws IOException, InterruptedException, AWTException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String startdate = f.getStringExcelData(SheetName, i, 1);
	cdp.getStartdate().sendKeys(startdate);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getStartdate().clear();
		
	}
	else {
		cdp.getStartdate().clear();
	}
}
}
@Test(invocationCount=1)
public void testExpectedRevenueTextField() throws IOException, InterruptedException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String ExpectedRevenue = f.getStringExcelData(SheetName, i, 2);
	cdp.getExpectedrevenue().sendKeys(ExpectedRevenue);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getExpectedrevenue().clear();
	
	}
	else
	{
		cdp.getExpectedrevenue().clear();
	}
}
}
@Test(invocationCount=1)
public void testActualCostTextField() throws IOException, InterruptedException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String ActualCost = f.getStringExcelData(SheetName, i, 3);
	cdp.getActualcost().sendKeys(ActualCost);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getActualcost().clear();
	
	}
	else
	{
		cdp.getActualcost().clear();
	}
}
}
@Test(invocationCount=1)
public void testEndDateTextField() throws IOException, InterruptedException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String enddate = f.getStringExcelData(SheetName, i, 4);
	cdp.getEnddate().sendKeys(enddate);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getEnddate().clear();
	
	}
	else
	{
		cdp.getEnddate().clear();	
	}
}
}
@Test(invocationCount=1)
public void testBudgetedCostTextField() throws IOException, InterruptedException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String BudgetedCost = f.getStringExcelData(SheetName, i, 5);
	cdp.getBudgetedcost().sendKeys(BudgetedCost);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getBudgetedcost().clear();
	
	}
	else
	{
		cdp.getBudgetedcost().clear();	
	}
}
}
@Test(invocationCount=1)
public void testExpectedResponseTextField() throws IOException, InterruptedException, AWTException
{
	
HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dlp=new DriveListPage(driver);
dlp.setNewDrive();
CreateDrivePage cdp=new CreateDrivePage(driver);
String SheetName = "DriveFunctionalTestCase";
String Expectedtitle="Zoho CRM - Campaign Details";
FileLib f=new FileLib();
cdp.getDrivename().sendKeys("abc");
int count = f.getLastRowNum(SheetName);
for(int i=1;i<=count;i++) {
	String ExpectedResponse = f.getStringExcelData(SheetName, i, 6);
	cdp.getExpectedresponse().sendKeys(ExpectedResponse);
	try {
		cdp.getSave().click();
	driver.switchTo().alert().accept();
	}
	catch(Exception e) {
	}

String title = driver.getTitle();
	System.out.println(title);
	if(title.equals(Expectedtitle)) {
		DriveDetailsPage ddp=new DriveDetailsPage(driver);
		ddp.getEdit().click();
		cdp.getExpectedresponse().clear();
	}
	else
	{
		cdp.getExpectedresponse().clear();
	
	
}
}
}
}
