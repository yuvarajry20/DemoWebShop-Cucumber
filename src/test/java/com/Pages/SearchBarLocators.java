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
	
	@FindBy(xpath="//div[@class=\"product-grid\"]//div[@class=\"item-box\"]")
	public WebElement getSearchResult;
	
	//@FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/strong/text()")
	@FindBy(xpath="//strong[contains(text(),\"Search term minimum length is 3 characters\")]")
    public WebElement searchWarning;

	@FindBy(xpath = "//strong[@class=\"result\"]")
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
