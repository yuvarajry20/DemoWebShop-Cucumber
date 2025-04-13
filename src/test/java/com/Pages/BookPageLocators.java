package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPageLocators {

	@FindBy(xpath="(//a[contains(text(),\"Books\")])[3]")
	public WebElement Books;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[@class=\"item-box\"]")
	public List<WebElement> BooksList;
	
	@FindBy(xpath="//select[@id=\"products-orderby\"]")
	public WebElement sortbyDropdown;
	
	@FindBy(xpath="")
	public WebElement Sort_A_Z;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[@class=\"item-box\"]")
	public WebElement SortedBookList;
	
	@FindBy(xpath="//a[contains(text(),\"Fiction EX\")]")
	public WebElement Fiction_book;
	
	//@FindBy(xpath="//h1[@itemprop=\"name\"]")
	@FindBy(xpath="//div[@class=\"overview\"]")
	public WebElement FictionDetail;
	
	@FindBy(xpath="//select[@id=\"products-pagesize\"]")
	public WebElement DisplayDropdown;
	
	@FindBy(xpath="//select[@id=\"products-viewmode\"]")
	public WebElement ViewAsDropdown;
	
	@FindBy(xpath="(//span[@class=\"PriceRange\"])[1]")
	public WebElement priceFilter;
	
	@FindBy(xpath = "//div[@class='side-2']//a[contains(@href, 'price')]")
	public List<WebElement> priceFilterLinks;
	
	@FindBy(xpath="//div[@class=\"product-list\"]")
	public WebElement bookFiltered;


}
