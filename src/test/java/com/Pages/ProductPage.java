package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage 
{
	@FindBy(xpath="//li//a[@class=\"ico-login\"]")
	public WebElement LoginButtonHomePage;
	
	@FindBy(xpath="//input[@class=\"email valid\"]")
	public WebElement EmailField;
	
	@FindBy(xpath="//input[@class=\"password valid\"]")
	public WebElement PasswordField;
	
	@FindBy(xpath="//input[@class=\"button-1 login-button\"]")
	public WebElement LoginButtonSubmit;
	
	@FindBy(xpath="//input[@id=\"small-searchterms\"]")
	public WebElement SearchStoreField;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]")
	public WebElement ProductTitle;
	
	@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement AddToCart;
	
	@FindBy(xpath="//span[@class=\"cart-qty\"]")
	public WebElement AddTocartnumber;
	
	
}
