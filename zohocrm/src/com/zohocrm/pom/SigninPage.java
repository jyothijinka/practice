package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
@FindBy(id="userName")
private WebElement loginnametbx;
@FindBy(id="passWord")
private WebElement passwordtbx;
@FindBy(name="j_remember")
private WebElement remembercheckbox;
@FindBy(xpath="//input[@title='Sign In']")
private WebElement signinbtn;
@FindBy(linkText="Forgot Password?")
private WebElement forgotpwdlink;
@FindBy(xpath="//img[@title='New User Registration']")
private WebElement newuserregbtn;

public SigninPage(WebDriver driver) {
PageFactory.initElements(driver, this);
}
public void setSignIn(String un,String pwd) {
	loginnametbx.sendKeys(un);
	passwordtbx.sendKeys(pwd);
	signinbtn.click();
}
public void setRememberCheckBox() {
	remembercheckbox.click();
}
public void setPasswordLink() {
forgotpwdlink.click();
}
public void setNewUserRegBtn() {
newuserregbtn.click();	
}
}
