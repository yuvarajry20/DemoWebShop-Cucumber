package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPageLocators {

	@FindBy(xpath="(//a[contains(text(),\"Books\")])[3]")
	public WebElement books; 
	
	@FindBy(xpath="//div[@class=\"page category-page\"]//child::div//h1")
	public WebElement bookListsAssert;
	
	@FindBy(xpath="//div[@class=\"short-description\"]//preceding-sibling::div")
	public WebElement fictionAssert;
	
	@FindBy(xpath="//h1[@itemprop=\"name\"]//parent::div")
	public WebElement healthBookAssert;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//child::div[@class=\"item-box\"]")
	public List<WebElement> booksList;
	
	@FindBy(xpath="//select[@id=\"products-orderby\"]")
	public WebElement sortbyDropdown;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[@class=\"item-box\"]")
	public WebElement sortedBookList;
	
	//@FindBy(xpath="(//h2[@class=\"product-title\"]//child::a)[4]")
	@FindBy(xpath="//a[contains(text(),\"Fiction EX\")]")
	public WebElement fiction_book;
	
	//@FindBy(xpath="//h1[@itemprop=\"name\"]")
	@FindBy(xpath="//div[@class=\"overview\"]")
	public WebElement fictionDetail;
	
	@FindBy(xpath="//select[@id=\"products-pagesize\"]")
	public WebElement displayDropdown;
	
	@FindBy(xpath="//select[@id=\"products-viewmode\"]")
	public WebElement viewAsDropdown;
	
	@FindBy(xpath="(//span[@class=\"PriceRange\"])[1]")
	public WebElement priceFilter;
	
	@FindBy(xpath = "//div[@class='side-2']//a[contains(@href, 'price')]")
	public List<WebElement> priceFilterLinks;
	
	@FindBy(xpath="//div[@class=\"product-list\"]")
	public WebElement bookFiltered;
	
	@FindBy(xpath="(//a[contains(text(),\"Computing and Internet\")])[2]")
	public WebElement computing_Internet;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]//a[contains(text(),\"Health Book\")]")
	public WebElement health_book;
	
	@FindBy(xpath="//input[@value=\"Add to compare list\"]")
	public WebElement compareList;
	
	@FindBy(xpath="//table[@class='compare-products-table']//tr[2]/td")
	public List<WebElement> compareName;
	
	@FindBy(xpath="//table[@class='compare-products-table']//tr[3]/td")
	public List<WebElement> comparePrice;
	
	@FindBy(xpath="//table[@class='compare-products-table']//tr[3]//td[i]")
	public List<WebElement> priceDynamixpath;
	
	@FindBy(xpath="//a[contains(text(),\"Clear list\")]")
	public WebElement clearList;
	
	@FindBy(xpath="//div[@class=\"page-body\"]")
	public WebElement emptyCompareList;
	
}
