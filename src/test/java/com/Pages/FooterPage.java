package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage {
	
	@FindBy(xpath="//a[contains(text(),\"nopCommerce\")]")
	//@FindBy(xpath="//div[@class=\"footer-poweredby\"]//descendant::a")
	public WebElement nopFooterlink;
	
    @FindBy(xpath="//img[@title=\"nopCommerce\"]")
	//@FindBy(xpath="//a[@class=\"desktop-logo\"]//child::img")
	public WebElement nopCommerceText;
	
	@FindBy(xpath="//a[contains(text(),\"Sitemap\")]")
	//@FindBy(xpath="//div[@class=\"column information\"]//descendant::li[1]")
	public WebElement siteMaplink;
	
	@FindBy(xpath="//a[contains(text(),\"Contact us\")]")
	//@FindBy(xpath="//div[@class=\"column information\"]//descendant::li[6]")
	public WebElement contactUsLink;
	
	@FindBy(xpath="//input[@id=\"FullName\"]")
	public WebElement contactName;
	
	@FindBy(xpath="//input[@class=\"email\"]")
	public WebElement contactEmail;
	
	@FindBy(xpath="//textarea[@class=\"enquiry\"]")
	public WebElement contactEnquiry;
	
	@FindBy(xpath="//input[@class=\"button-1 contact-us-button\"]")
	public WebElement contactSubmit;
	
	//@FindBy(xpath="//div[@class=\"result\"]")
	@FindBy(xpath="//div[@class=\"page-body\"]")
	public WebElement confirmText;
}
