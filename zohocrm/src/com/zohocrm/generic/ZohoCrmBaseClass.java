package com.zohocrm.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.SigninPage;

public class ZohoCrmBaseClass {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static WebDriver driver;
@BeforeClass
public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
@BeforeMethod
public void login() throws InterruptedException, IOException
{
	Reporter.log("login", true);
	FileLib f=new FileLib();
	 String url = f.getPropertyData("url");
	 String un=f.getPropertyData("username");
	 String pw=f.getPropertyData("password");
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	SigninPage s=new SigninPage(driver);
	s.setSignIn(un, pw);
	
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	HomePage hp=new HomePage(driver);
	hp.setLogOut();
}
}
