package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage {
	
	@FindBy(xpath="//li//a[@class=\"ico-login\"]")
	public WebElement LoginButtonHomePages;
	
	@FindBy(id = "Email")
	public WebElement Emaillogin;
	
	@FindBy(id = "Password")
	public WebElement Passwordlogin;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement LoginButtonclick;
	
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	public WebElement serachfields;

	@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement addtocartlap;
	
	@FindBy(xpath="//input[@id=\"termsofservice\"]")
	public WebElement checkboxbtn;
	
	@FindBy(xpath="//button[@class=\"button-1 checkout-button\"]")
	public WebElement checkoutbtn;
	
	@FindBy(xpath="//div[@id=\"terms-of-service-warning-box\"]//p")
	public WebElement popupcheckboxmsg;
	
	@FindBy(xpath="//select[@class=\"address-select valid\"]")
	public WebElement addressfield;
	
}
