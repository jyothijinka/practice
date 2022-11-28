package com.zohocrm.testscript;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.zohocrm.generic.FileLib;
import com.zohocrm.generic.ZohoCrmBaseClass;
import com.zohocrm.pom.CreateDrivePage;
import com.zohocrm.pom.DriveListPage;
import com.zohocrm.pom.HomePage;
@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class DriveTestClass extends ZohoCrmBaseClass{

@Test
public void testDrive() throws InterruptedException, IOException {
	Thread.sleep(1000);

HomePage hp=new HomePage(driver);
hp.setDrive();
DriveListPage dp=new DriveListPage(driver);
dp.setNewDrive();
FileLib f=new FileLib();
String sheetname="driveListPage";
String drivename = f.getStringExcelData(sheetname, 1, 0);
double expectedrevenue = f.getNumericExcelData(sheetname, 1, 1);
double actualcost = f.getNumericExcelData(sheetname, 1, 2);
int numsent = (int) f.getNumericExcelData(sheetname, 1, 3);
double budgetedcost = f.getNumericExcelData(sheetname, 1, 4);
int expectedresponse = (int) f.getNumericExcelData(sheetname, 1, 5);
String description = f.getStringExcelData(sheetname, 1, 6);
// String startdate = f.getStringExcelData(sheetname, 1, 7);
// String enddate = f.getStringExcelData(sheetname, 1, 8);
CreateDrivePage cdp=new CreateDrivePage(driver);
cdp.setDriveName(drivename);
//cdp.setStartDate(startdate);
cdp.setStartDateIcon(driver);
cdp.setExpectedRevenue(expectedrevenue);
cdp.setActualCost(actualcost);
cdp.setNumSent(numsent);
cdp.setType(driver, 3);
cdp.setStatus(driver, 2);
//cdp.setEndDate(enddate);
cdp.setEndDateIcon(driver);
cdp.setBudgetedCost(budgetedcost);
cdp.setExpectedResponse(expectedresponse);
cdp.setDescription(description);
cdp.setSave();
hp.setDrive();
dp.setFindDrive(drivename);
 String drivelist = dp.getDriveList().getText();
SoftAssert s=new SoftAssert();
s.assertEquals(drivelist, drivename);
s.assertAll();
}
}


