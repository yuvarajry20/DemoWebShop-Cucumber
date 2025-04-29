package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage {
	
	@FindBy(xpath="//a[contains(text(),\"nopCommerce\")]")
	public WebElement nopFooterlink;
	
	@FindBy(xpath="//*[@id=\"en-page\"]/body/div[7]/section/div/div/div/div/div/div/div[1]/div/div[1]/h1")
	public WebElement nopCommerceText;
	
	@FindBy(xpath="//a[contains(text(),\"Sitemap\")]")
	public WebElement siteMaplink;
	
	@FindBy(xpath="(/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[5]/a")
	public WebElement AccessoriesLink;
	

}
