package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage {
	@FindBy(xpath="//a[text()=\"News\"]")
	public WebElement clickNewslink;
	
	@FindBy(xpath="//a[@class=\"news-title\"]")
	public WebElement getnewsText;
	
}
