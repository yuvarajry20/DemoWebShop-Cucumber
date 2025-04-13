package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarLocators {
	
//	@FindBy(xpath="//input[@value=\"Search store\"]")
//	public WebElement searchbox;
	@FindBy(id = "small-searchterms")
	public WebElement searchbox;

	
	@FindBy(xpath="//input[@value=\"Search\"]")
	public WebElement search;
	
	@FindBy(xpath="//div[@class=\"item-box\"]")
	public WebElement searchResult;
	
	@FindBy(xpath="")
	public WebElement SearcherrorText;
	
	@FindBy(xpath = "//div[@class='warning']")
	public WebElement searchWarning;

	@FindBy(xpath = "//div[@class='no-result']")
	public WebElement noResultMessage;

	@FindBy(xpath = "//div[@class='search-results']//h2")
	public WebElement resultTitle;
	
	@FindBy(xpath="//div[@class='search-results']/h2")
	public WebElement resultHeader;
	



}
