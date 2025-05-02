package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage {
	
	@FindBy(xpath="//a[contains(text(),\"nopCommerce\")]")
	public WebElement nopFooterlink;
	
	@FindBy(xpath="//img[@title=\"nopCommerce\"]")
	public WebElement nopCommerceText;
	
	@FindBy(xpath="//a[contains(text(),\"Sitemap\")]")
	public WebElement siteMaplink;
	
	@FindBy(xpath="//a[contains(text(),\"Contact us\")]")
	public WebElement ContactUsLink;
	
	@FindBy(xpath="//input[@class=\"fullname\"]")
	public WebElement ContactName;
	
	@FindBy(xpath="//input[@class=\"email\"]")
	public WebElement ContactEmail;
	
	@FindBy(xpath="//a[contains(text(),\"Contact us\")]")
	public WebElement ContactEnquiry;
	
	@FindBy(xpath="//a[contains(text(),\"Contact us\")]")
	public WebElement ContactSubmit;
	
	//@FindBy(xpath="//div[@class=\"result\"]")
	@FindBy(xpath="//div[@class=\"page-body\"]")
	public WebElement ConfirmText;
}
