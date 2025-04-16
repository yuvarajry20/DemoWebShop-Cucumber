package com.Pages;

import java.net.http.WebSocket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digitaldownloadpage {
	@FindBy(xpath="//div[@class=\"block block-category-navigation\"]//div[2]//ul//li[5]//a")
	public WebElement digitaldown;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[1]//div[@class=\"prices\"]//span[text()=\"10.00\"]//parent::div//following-sibling::div//input")
	public WebElement music2;
	
	@FindBy(xpath="//select[@id=\"products-viewmode\"]")
	public WebElement grid;
	
	@FindBy(xpath="//select[@id=\"products-viewmode\"]//option[2]")
	public WebElement gridopt;
	
	@FindBy(xpath="//a[@class=\"ico-cart\"]//span[2]")
	public WebElement qtyproductcount;
	
	@FindBy(xpath="//select[@id=\"products-orderby\"]")
	public WebElement sortby;
	
	@FindBy(xpath="//select[@id=\"products-orderby\"]//option[2]")
	public WebElement sortoption;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement headingofdigital;
	
	

}
