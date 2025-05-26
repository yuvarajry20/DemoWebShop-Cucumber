package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MusicPage {
	
	@FindBy(xpath="//ul[@class=\"list\"]//li[5]")
	public WebElement DigiDownloads;
	
	@FindBy(xpath="(//h2[@class=\"product-title\"])[3]")
	public WebElement MusicPage;

	@FindBy(xpath="//span[@class=\"download-sample-button\"]//child::a")
	public WebElement downloadButton;
	
	@FindBy(id= "add-to-wishlist-button-52")
	public WebElement WishListbtn;
	
	@FindBy(id="add-to-cart-button-52")
	public WebElement AddtoCartbtn;
	
	@FindBy(xpath= "//input[@class='button-2 email-a-friend-button']")
	public WebElement EmailFriendbtn;
	
	@FindBy(xpath= "//input[@class='button-2 add-to-compare-list-button']")
	public WebElement CompareListBtn;

}
