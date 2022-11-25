package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//declare drive module
	@FindBy(linkText="Campaigns")
	private WebElement drivemodule;
	//declare leads module
	@FindBy(linkText="Leads")
	private WebElement conductmodule;
	//declare contacts module
	@FindBy(linkText="Contacts")
	private WebElement contactsmodule;
	//declare accounts module
	@FindBy(linkText="Accounts")
	private WebElement accountsmodule;
	//declare prospect module
	@FindBy(linkText="Potentials")
	private WebElement prospectmodule;
	//declare commodity module
	@FindBy(linkText="Products")
	private WebElement commoditymodule;
	//declare catalogue module
	@FindBy(linkText="Price Books")
	private WebElement cataloguemodule;
	//declare quotes module
	@FindBy(linkText="Quotes")
	private WebElement quotesmodule;
	//declare Booking module
	@FindBy(linkText="Purchase Orders")
	private WebElement bookingmodule;
	//declare Acceptingorder module
	@FindBy(linkText="Sales Orders")
	private WebElement acceptingordermodule;
	//declare Bill module
	@FindBy(linkText="Invoices")
	private WebElement billmodule;
	//declare logoutbutton
	@FindBy(linkText="Logout [rashmi@dell.com]")
	private WebElement lgout;
	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver,this);
	}
	public void setDrive() {
		drivemodule.click();
	}
	public void setConduct() {
		conductmodule.click();
	}
	public void setContacts() {
		contactsmodule.click();
	}
	public void setAccounts() {
		accountsmodule.click();
	}
	public void setProspect() {
		prospectmodule.click();
	}
	public void setCommodity() {
		commoditymodule.click();
	}
	public void setCatalogue() {
		cataloguemodule.click();
	}
	public void setQuotes() {
		quotesmodule.click();
	}
	public void setBooking() {
		bookingmodule.click();
	}
	public void setAcceptingOrder() {
		acceptingordermodule.click();
	}
	public void setBill() {
		billmodule.click(); 
	}
	public void setLogOut() {
		lgout.click();
	}
}
