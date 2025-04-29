package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage {
	
	@FindBy(xpath="//div[@class=\"footer-poweredby\"]")
	public WebElement Footerlink;
	
	@FindBy(xpath="//div[@class=\"home-banner-text-section\"]//h1")
	public WebElement nopCommerceText;
	

}
