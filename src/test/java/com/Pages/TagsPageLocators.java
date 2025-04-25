package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagsPageLocators {
	
	@FindBy(xpath="//div[@class=\"tags\"]//li")
	public WebElement getTags;
	
	@FindBy(xpath="//a[contains(text(),\"View all\")]")
	public WebElement ViewAll;
	
	@FindBy(xpath="(//a[@class=\"producttag\"])[10]")
	public WebElement digitalTagLink;
	
	@FindBy(xpath="(//a[@class=\"producttag\"])[5]")
	public WebElement cellTagLink;
	
	//@FindBy(xpath="//div[@class=\"item-box\"]//h2")
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement DigitalTagged;
	
	@FindBy(xpath="//div[@class=\"item-box\"]//h2")
	public WebElement cellTagged;

}
