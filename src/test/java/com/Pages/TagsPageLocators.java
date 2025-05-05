package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagsPageLocators {
	
	@FindBy(xpath="//div[@class=\"tags\"]//li")
	public WebElement getTags;
	
	//@FindBy(xpath="//div[@class=\"tags\"]//following-sibling::div")
	//@FindBy(xpath="//div[@class=\"listbox\"]//child::div[@class=\"view-all\"]")
	@FindBy(xpath="//div[@class=\"view-all\"]")
	public WebElement ViewAll;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement AssertcellTagged;
	
	//@FindBy(xpath="//ul[@class=\"product-tags-list\"]//child::li[10]")
	//@FindBy(xpath="//ul[@class=\"product-tags-list\"]//li[10]")
	@FindBy(xpath="(//a[@class=\"producttag\"])[10]")
	public WebElement digitalTagLink;
	
	@FindBy(xpath="//ul[@class=\"product-tags-list\"]//child::li[5]")
	public WebElement cellTagLink;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//descendant::h1")
	public WebElement DigitalTagged;
	
	@FindBy(xpath="//div[@class=\"item-box\"]//h2")
	public WebElement cellTagged;
	
}
