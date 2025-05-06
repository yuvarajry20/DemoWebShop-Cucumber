package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBarLocators {
	
//	@FindBy(xpath="//input[@value=\"Search store\"]")
//	@FindBy(id = "small-searchterms")
	@FindBy(xpath="//input[@type=\"submit\"]//preceding-sibling::input")
	public WebElement searchbox;

	//@FindBy(xpath="//input[@value=\"Search\"]")
	@FindBy(xpath="//form[@action=\"/search\"]//descendant::input[2]")
	public WebElement search;
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[@class=\"item-box\"]")
	public WebElement getSearchResult;

	@FindBy(xpath="//strong[contains(text(),\"Search term minimum length is 3 characters\")]")
    public WebElement searchWarning;
	
	@FindBy(xpath="//form[@action=\"/search\"]//script[1]")
	public WebElement SearchAlert;

	//@FindBy(xpath = "//strong[@class=\"result\"]")
	@FindBy(xpath ="//div[@class=\"search-results\"]//child::strong[@class=\"result\"]")
	public WebElement noResultMessage;

	@FindBy(xpath = "//div[@class='search-results']//h2")
	public WebElement resultTitle;
	
	@FindBy(xpath="//div[@class='search-results']/h2")
	public WebElement resultHeader;
	
    @FindBy(xpath="//input[@id=\"As\"]")
    public WebElement AdvanceCheckbox;
    
    @FindBy(xpath="//select[@id=\"Cid\"]")
    public WebElement clickCategory;
    
    @FindBy(xpath="//option[@value=\"8\"]")
    public WebElement clickCameraDropdown;
    
    @FindBy(xpath="//option[@value=\"9\"]")
    public WebElement clickCellPhone;
    
    @FindBy(xpath="//input[@id=\"Pf\"]")
    public WebElement MinFilter;
    
    @FindBy(xpath="//input[@id=\"Pt\"]")
    public WebElement MaxFilter;
    
    @FindBy(xpath="//input[@class=\"button-1 search-button\"]")
    public WebElement Advanceseachbtn;
    
    @FindBy(xpath="//h2[@class=\"product-title\"]")
    public WebElement CameraFound;
    
}
