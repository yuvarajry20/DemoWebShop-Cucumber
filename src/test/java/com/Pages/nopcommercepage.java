package com.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nopcommercepage {
	@FindBy	(xpath="//div[@class=\"footer-poweredby\"]//child::a")
	public WebElement nopcommerce;
	
	@FindBy (xpath="//div[@class=\"home-banner-text-section\"]//child::h1")
	public WebElement textinnopcommerce;
	
	@FindBy(xpath = "//li//a[contains(text(),\"About us\")]")
	public WebElement about;
	
	

}
