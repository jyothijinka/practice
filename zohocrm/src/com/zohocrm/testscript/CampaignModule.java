package com.zohocrm.testscript;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.testng.Reporter;
import org.testng.annotations.Test;


import com.zohocrm.generic.ZohoCrmBaseClass;

public class CampaignModule extends ZohoCrmBaseClass{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
@Test()
public void NewCampaign() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.findElement(By.linkText("Campaign"));
Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@value='New Campaign']")).click();
	driver.findElement(By.name("property(Campaign Name)")).sendKeys("123456");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
}
}
