package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage {
	
	@FindBy(css="a[class*=\"ico-login\"]")
	public WebElement loginButtonHomePages;
	
	@FindBy(id = "Email")
	public WebElement emaillogin;
	
	@FindBy(id = "Password")
	public WebElement passwordlogin;
	
	@FindBy(xpath="//div[@class=\"inputs reversed\"]//following-sibling::div//input[@class=\"button-1 login-button\"]")
	public WebElement loginButtonclick;
	
	@FindBy(xpath="//input[@class=\"button-1 search-box-button\"]//preceding-sibling::input")
	public WebElement serachfields;

	@FindBy(xpath="//div//child::input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement addtocartlap;
	
	@FindBy(xpath="//div[@class=\"terms-of-service\"]//child::input")
	public WebElement checkboxbtn;
	
	@FindBy(xpath="//button[@class=\"button-1 checkout-button\" and @id=\"checkout\"]")
	public WebElement checkoutbtn;
	
	@FindBy(xpath="//div[@id=\"terms-of-service-warning-box\"]//p[contains(text(),\"Please accept the terms of service before the next step.\")]")
	public WebElement popupcheckboxmsg;
	
	@FindBy(xpath="//label[@for=\"billing-address-select\"]//parent::div//select")
	public WebElement addressfield;
	
	@FindBy(xpath="//*[@id=\"billing-address-select\"]/option[1]")
	public WebElement option1;
	
	@FindBy(xpath="//div//child::input[@class=\"button-1 new-address-next-step-button\"]")
	public WebElement billcontinuebtn;
	
	@FindBy(xpath="//input[@id=\"PickUpInStore\"]")
	public WebElement storepick;
	
	@FindBy(xpath="//div[@id=\"shipping-buttons-container\"]//p//following-sibling::input")
	public WebElement shipcontinuebtn;
	
	@FindBy(xpath="//div[@id=\"shipping-method-buttons-container\"]//input")
	public WebElement shippingcntinue;
	
	@FindBy(xpath="//div[@class=\"buttons\"]//child::input[@class=\"button-1 payment-method-next-step-button\"]")
	public WebElement paymentcontinue;
	
	@FindBy(xpath="//p//following-sibling::input[@class=\"button-1 payment-info-next-step-button\"]")
	public WebElement paymentinfobtncontinue;
	
	@FindBy(xpath="//div[@id=\"confirm-order-buttons-container\"]//input[@class=\"button-1 confirm-order-next-step-button\"]")
	public WebElement confirmbtnincheckout;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//div[@class=\"title\"]//strong")
	public WebElement confirmplacedoreder;
	
	@FindBy(xpath="//div[@class=\"buttons\"]//preceding-sibling::ul//li[1]")
	public WebElement ordernumber;
	
	@FindBy(xpath="//div[@class=\"buttons\"]//preceding-sibling::ul//li[2]//a")
	public WebElement invoiceclickhere;
	
	@FindBy(xpath="//a[@class=\"button-2 pdf-order-button\"]")
	public WebElement pdfinvoice;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//child::h1")
	public WebElement orderinfo;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//a[contains(text(),\"Print\")]//preceding-sibling::h1")
	public WebElement orderinfo2;
	
	
	@FindBy(xpath="//div[@class=\"section payment-method\"]//ul//li[3]//div//div[2]//input")
	public WebElement creditcheckbox;
	
	
	@FindBy(xpath="//select[@id=\"CreditCardType\" and @class=\"dropdownlists valid\"]")
	public WebElement selectpaymentopt;
	
	@FindBy(xpath="//select[@id=\"CreditCardType\" and @class=\"dropdownlists valid\"]//option[1]")
	public WebElement visaopt;
	
	@FindBy(xpath="//td//child::input[@id=\"CardholderName\"]")
	public WebElement cardholdername;
	
	@FindBy(xpath="//table//td[2]//child::input[@id=\"CardNumber\"]")
	public WebElement cardnumber;
	
	@FindBy(xpath="//td[2]//child::select[@id=\"ExpireMonth\"]")
	public WebElement expirymonth;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[4]//td[2]//select[2]")
	public WebElement year;
	
	@FindBy(xpath="//tr[5]//td[2]//span//preceding-sibling::input")
	public WebElement cardcode;
	
	@FindBy(xpath="//ul[@class=\"method-list\"]//li[2]//div//input[@id=\"shippingoption_1\"]")
	public WebElement onedaypick;
	
	@FindBy(xpath="//ul[@class=\"method-list\"]//li[3]//div//input[@id=\"shippingoption_2\"]")
	public WebElement twodayshipping;
	
	@FindBy(xpath="//div[@id=\"shipping-method-buttons-container\"]//p//a")
	public WebElement backtoshipping;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement thankyou;
	
}
