package com.Pages;

import java.net.http.WebSocket;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Digitaldownloadpage {
	@FindBy(xpath="//div[@class=\"block block-manufacturer-navigation\"]//preceding-sibling::div//descendant::ul//li[5]//a")
	public WebElement digitaldown;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[1]//div[@class=\"prices\"]//span[text()=\"10.00\"]//parent::div//following-sibling::div//input")
	public WebElement music2;
	
	@FindBy(xpath="//span[contains(text(),\"View as\")]//following-sibling::select")
	public WebElement grid;
	
	@FindBy(xpath="//select[@id=\"products-viewmode\"]//option[2]")
	public WebElement gridopt;
	
	@FindBy(xpath="//a[@class=\"ico-cart\"]//span[2]")
	public WebElement qtyproductcount;
	
	@FindBy(xpath="//div[@class=\"product-page-size\"]//preceding-sibling::div[2]//following-sibling::div//select")
	public WebElement sortby;
	
	@FindBy(xpath="//select[@id=\"products-orderby\"]//option[2]")
	public WebElement sortoption;
	
	@FindBy(xpath="//div[@class=\"page category-page\"]//descendant::h1")
	public WebElement headingofdigital;
	
	

}
