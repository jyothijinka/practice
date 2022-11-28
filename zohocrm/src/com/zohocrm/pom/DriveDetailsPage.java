package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriveDetailsPage {
@FindBy(xpath="(//input[@value='Edit'])[2]")
private WebElement edit;
public DriveDetailsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getEdit() {
	return edit;
}

}
