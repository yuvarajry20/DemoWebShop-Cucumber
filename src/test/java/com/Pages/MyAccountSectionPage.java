package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountSectionPage {
	@FindBy(xpath="//a[text()=\"Customer info\"]")
	public WebElement clickCustomerInfo;
	
	@FindBy(id="FirstName")
	public WebElement Firstnametext;
	
	@FindBy(id="LastName")
	public WebElement Lastnametext;
	
	@FindBy(id="Email")
	public WebElement Emailtext;
	
	@FindBy(xpath="//a[text()=\"Orders\"]")
	public WebElement clickorders;

	@FindBy(xpath="//div[@class=\"order-list\"]")
	public WebElement orderList;
	
	@FindBy(xpath="//a[text()=\"Back in stock subscriptions\"]")
	public WebElement clickbackInStock;
	
	@FindBy(xpath="//div[@class=\"no-data\"]")
	public WebElement BackInStocktext;
	
	
	
}
