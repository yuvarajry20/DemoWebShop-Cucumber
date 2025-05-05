package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountSectionPage {
//	@FindBy(xpath="//div[@class=\"block block-account-navigation\"]//div[2]//ul//li[1]//a")
//	public WebElement clickCustomerInfo;
//	
//	@FindBy(id="FirstName")
//	public WebElement Firstnametext;
//	
//	@FindBy(id="LastName")
//	public WebElement Lastnametext;
//	
//	@FindBy(id="Email")
//	public WebElement Emailtext;
//	
//	@FindBy(xpath="//a[text()=\"Orders\"]")
//	public WebElement clickorders;
//
//	@FindBy(xpath="//div[@class=\"section order-item\"]//div")
//	public WebElement orderno;
//	
//	@FindBy(xpath="//ul[@class=\"info\"]//li[2]")
//	public WebElement orderdate;
//	
//	@FindBy(xpath="//input[@class=\"button-2 order-details-button\"]")
//	public WebElement clickorderDetails;
//	
//	@FindBy(xpath="//td[@class=\"a-left name\"]")
//	public WebElement productname;
//	
//	@FindBy(xpath="//a[text()=\"Back in stock subscriptions\"]")
//	public WebElement clickbackInStock;
//	
//	@FindBy(xpath="//div[@class=\"no-data\"]")
//	public WebElement BackInStocktext;
//	
//	@FindBy(xpath="//a[text()=\"Reward points\"]")
//	public WebElement clickRewardpoints;
//	
//	@FindBy(xpath="//div[@class=\"current-balance\"]")
//	public WebElement rewardpointstext;
//	
//	@FindBy(xpath="//div[@class=\"reward-points-history\"]")
//	public WebElement historyreward;
//	
//	@FindBy(xpath="//a[text()=\"Change password\"]")
//	public WebElement clickChangePassword;
//	
//	@FindBy(id="OldPassword")
//	public WebElement oldpassword;
//	
//	@FindBy(id="NewPassword")
//	public WebElement newpassword;
//	
//	@FindBy(id="ConfirmNewPassword")
//	public WebElement confirmnewpassword;
//	
//	@FindBy(xpath="//input[@class=\"button-1 change-password-button\"]")
//	public WebElement clickchangepasswordbutton;
	
	@FindBy(xpath="//div[@class='block block-account-navigation']//div[2]//ul//li[1]//a")
	public WebElement clickCustomerInfo;

	@FindBy(id="FirstName")
	public WebElement Firstnametext;

	@FindBy(id="LastName")
	public WebElement Lastnametext;

	@FindBy(id="Email")
	public WebElement Emailtext;

	@FindBy(xpath="//a[text()='Orders']")
	public WebElement clickorders;

	@FindBy(xpath="//a[text()='Orders']/following::div[@class='section order-item']//div")
	public WebElement orderno;

	@FindBy(xpath="//a[text()='Orders']/following::ul[@class='info']//li[2]")
	public WebElement orderdate;

	@FindBy(xpath="//a[text()='Orders']/following::input[@class='button-2 order-details-button']")
	public WebElement clickorderDetails;

	@FindBy(xpath="//td[@class='a-left name']")
	public WebElement productname;

	@FindBy(xpath="//a[text()='Back in stock subscriptions']")
	public WebElement clickbackInStock;

	@FindBy(xpath="//div[@class='no-data']")
	public WebElement BackInStocktext;

	@FindBy(xpath="//a[text()='Reward points']")
	public WebElement clickRewardpoints;

	@FindBy(xpath="//a[text()='Reward points']/following::div[@class='current-balance']")
	public WebElement rewardpointstext;

	@FindBy(xpath="//a[text()='Reward points']/following::div[@class='reward-points-history']")
	public WebElement historyreward;

	@FindBy(xpath="//a[text()='Change password']")
	public WebElement clickChangePassword;

	@FindBy(id="OldPassword")
	public WebElement oldpassword;

	@FindBy(id="NewPassword")
	public WebElement newpassword;

	@FindBy(id="ConfirmNewPassword")
	public WebElement confirmnewpassword;

	@FindBy(xpath="//input[@class='button-1 change-password-button']")
	public WebElement clickchangepasswordbutton;
	
}
