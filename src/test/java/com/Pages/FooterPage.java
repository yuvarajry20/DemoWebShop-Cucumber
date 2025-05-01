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
	
	@FindBy(xpath="(/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[5]/a")
	public WebElement AccessoriesLink;
	
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
