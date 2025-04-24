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
	
	@FindBy(xpath="//div[@class=\"terms-of-service\"]//input")
	public WebElement checkboxbtn;
	
	@FindBy(xpath="//button[@class=\"button-1 checkout-button\"]")
	public WebElement checkoutbtn;
	
	@FindBy(xpath="//div[@id=\"terms-of-service-warning-box\"]//p")
	public WebElement popupcheckboxmsg;
	
	@FindBy(xpath="//select[@id=\"billing-address-select\"]")
	public WebElement addressfield;
	
	@FindBy(xpath="//*[@id=\"billing-address-select\"]/option[1]")
	public WebElement option1;
	
	@FindBy(xpath="//input[@class=\"button-1 new-address-next-step-button\"]")
	public WebElement billcontinuebtn;
	
	@FindBy(xpath="//input[@id=\"PickUpInStore\"]")
	public WebElement storepick;
	
	@FindBy(xpath="//div[@id=\"shipping-buttons-container\"]//input")
	public WebElement shipcontinuebtn;
	
	@FindBy(xpath="//div[@id=\"shipping-method-buttons-container\"]//input")
	public WebElement shippingcntinue;
	
	@FindBy(xpath="//div[@class=\"buttons\"]//input[@class=\"button-1 payment-method-next-step-button\"]")
	public WebElement paymentcontinue;
	
	//@FindBy(xpath="//div[@id=\"payment-info-buttons-container\"]//input")
	@FindBy(xpath="//input[@class=\"button-1 payment-info-next-step-button\"]")
	public WebElement paymentinfobtncontinue;
	
	@FindBy(xpath="//div[@id=\"confirm-order-buttons-container\"]//input[@class=\"button-1 confirm-order-next-step-button\"]")
	public WebElement confirmbtnincheckout;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//div[@class=\"title\"]//strong")
	public WebElement confirmplacedoreder;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//ul//li[1]")
	public WebElement ordernumber;
	
	@FindBy(xpath="//div[@class=\"section order-completed\"]//ul//li[2]//a")
	public WebElement invoiceclickhere;
	
	@FindBy(css="div.page-body.checkout-data > div > ul > li:nth-child(2) > a")
	public WebElement pdfinvoice;
	
	@FindBy(xpath="//div[@class=\"section payment-method\"]//ul//li[3]//div//div[2]//input")
	public WebElement creditcheckbox;
	
	
	@FindBy(xpath="//select[@id=\"CreditCardType\" and @class=\"dropdownlists valid\"]")
	public WebElement selectpaymentopt;
	
	@FindBy(xpath="//select[@id=\"CreditCardType\" and @class=\"dropdownlists valid\"]//option[1]")
	public WebElement visaopt;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[2]//td[2]//input")
	public WebElement cardholdername;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[3]//td[2]//input")
	public WebElement cardnumber;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[4]//td[2]//select[1]")
	public WebElement expirymonth;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[4]//td[2]//select[2]")
	public WebElement year;
	
	@FindBy(xpath="//div[@class=\"section payment-info\"]//div//table//tbody//tr[5]//td[2]//input")
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
