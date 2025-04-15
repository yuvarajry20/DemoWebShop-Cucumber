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
	

}
