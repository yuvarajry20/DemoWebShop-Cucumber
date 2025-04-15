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
	
	@FindBy(xpath="//select[@id=\"billing-address-select\"]")
	public WebElement addressfield;
	
	@FindBy(xpath="//*[@id=\"billing-address-select\"]/option[1]")
	public WebElement option1;
	
	@FindBy(xpath="//div[@id=\"billing-buttons-container\"]//input")
	public WebElement billcontinuebtn;
	
	@FindBy(xpath="//input[@id=\"PickUpInStore\"]")
	public WebElement storepick;
	
	@FindBy(xpath="//div[@id=\"shipping-buttons-container\"]//input")
	public WebElement shipcontinuebtn;
	
	@FindBy(xpath="//div[@id=\"payment-method-buttons-container\"]//input")
	public WebElement paymentcontinue;
	
	@FindBy(xpath="//div[@id=\"payment-info-buttons-container\"]//input")
	public WebElement paymentinfobtncontinue;
	
	@FindBy(xpath="//div[@id=\"confirm-order-buttons-container\"]//input")
	public WebElement confirmbtnincheckout;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//div[@class=\"title\"]//strong")
	public WebElement confirmplacedoreder;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//ul//li[1]")
	public WebElement ordernumber;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//ul//li[2]//a")
	public WebElement invoiceclickhere;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//a[2]")
	public WebElement pdfinvoice;
	
	
	
}
