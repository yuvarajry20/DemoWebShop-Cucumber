package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TagsPageLocators {
	
	//@FindBy(xpath="//div[@class=\"tags\"]//li")
	@FindBy(xpath="//div[@class=\"tags\"]//descendant::li")
	public WebElement getTags;
	
	@FindBy(xpath="//a[contains(text(),\"View all\")]")
	//@FindBy(xpath="//div[@class=\"tags\"]//following-sibling::div")
	public WebElement ViewAll;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//child::h1")
	public WebElement AssertcellTagged;
	
	@FindBy(xpath="//ul[@class=\"product-tags-list\"]/descendant::li[10]")
	public WebElement digitalTagLink;
	
	@FindBy(xpath="//ul[@class=\"product-tags-list\"]/descendant::li[5]")
	public WebElement cellTagLink;
	
	//@FindBy(xpath="//div[@class=\"item-box\"]//h2")
	@FindBy(xpath="//div[@class=\"page-title\"]//h1")
	public WebElement DigitalTagged;
	
	@FindBy(xpath="//div[@class=\"item-box\"]//h2")
	public WebElement cellTagged;
	
}
