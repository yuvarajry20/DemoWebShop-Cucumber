package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage 


{
	@FindBy(xpath="//a[@class=\"ico-register\"]//parent::li//following-sibling::li[1]//child::a")
	public WebElement loginButtonHomePage;
	
	@FindBy(xpath = "//div[@class=\"form-fields\"]//descendant::div[2]//label//following-sibling::input")
	public WebElement emailField;
	
	@FindBy(xpath = "//div[@class=\"form-fields\"]//descendant::div[3]//label//following-sibling::input")
	public WebElement passwordField;
	
	@FindBy(xpath="//div[@class=\"inputs reversed\"]//following-sibling::div//input")
	public WebElement loginButtonSubmit;
	
	@FindBy(xpath="//div[@class=\"search-box\"]//descendant::input[2]//preceding-sibling::input")
	public WebElement searchStoreField;
	
	@FindBy(xpath="//div[@class=\"product-rating-box\"]//preceding-sibling::h2//a")
	public WebElement productTitle;
	
	@FindBy(xpath="//div[@class=\"master-wrapper-page\"]//preceding-sibling::div[@id=\"bar-notification\"]//p")
	public WebElement assertnotification;
	
	@FindBy(xpath="//input[@class=\"button-2 product-box-add-to-cart-button\"]")
	public WebElement addToCart;
	
	@FindBy(xpath="//span[contains(text(),\"Shopping cart\")]//following-sibling::span")
	public WebElement addTocartnumber;
	
	@FindBy(css="#topcartlink > a")
	public WebElement shoppingcart;
	
	@FindBy(xpath="//td[@class=\"product-picture\"]//preceding-sibling::td//descendant::input")
	public WebElement removefromcart;
	
	@FindBy(xpath="//input[@class=\"button-2 continue-shopping-button\"]//preceding-sibling::input")
	public WebElement updatecart;
	
	@FindBy(xpath="//div[@class=\"page-title\"]//parent::div//div[2]")
	public WebElement emptycart;
	
	@FindBy(xpath="//td[@class=\"product-picture\"]//following-sibling::td//child::a")
	public WebElement cartproductavailable;
	
	@FindBy(css="#add-to-wishlist-button-53")
	public WebElement addtowishlist;
	
	@FindBy(xpath="//li[@id=\"topcartlink\"]//following-sibling::li//child::a")
	public WebElement clickwishlist;
	
	@FindBy(xpath="//div[@class=\"picture\"]//a[@title=\"Show details for 3rd Album\"]")
	public WebElement imgalbum3;
	
	@FindBy(xpath="//td[@class=\"product-picture\"]//following-sibling::td//a")
	public WebElement productnameinwishlist;
	
	@FindBy(xpath="//div[@class=\"share-info\"]//p//a[@class=\"share-link\"]")
	public WebElement urlforwishlist;
	
	@FindBy(xpath = "//div[@class=\"share-info\"]//child::p//span")
	public WebElement urlsharing;
	
	@FindBy(xpath="//input[@class=\"qty-input\"]")
	public WebElement increaseqty;
	
	@FindBy(xpath="//span[@class=\"product-price order-total\"]//child::strong")
	public WebElement qtyten;
	
	@FindBy(xpath = "//input[@class=\"button-1 add-to-cart-button\"]")
	public WebElement addtocartinqty;
	
	@FindBy(xpath="//h2[@class=\"product-title\"]//a[text()=\"$25 Virtual Gift Card\"]")
	public WebElement giftcardpage;
	
	@FindBy(css="input[class$=\"email-a-friend-button\"]")
	public WebElement emailfriendbtn;
	
	@FindBy(css="input[class^=\"friend-email\"]")
	public WebElement friendemail;
	
	@FindBy(css="input[class*=\"your-email\"]")
	public WebElement myemail;
	
	@FindBy(css=".send-email-a-friend-button")
	public WebElement sendmail;
	
	@FindBy(xpath="//div[@class=\"title\"]//following-sibling::div[@class=\"result\"]")
	public WebElement successfulsentmail;
	
	@FindBy(xpath="//span[@class=\"field-validation-error\"]//span")
	public WebElement invalidemailmsg;
	
	@FindBy(xpath="//td[@class=\"add-to-cart\"]//child::input")
	public WebElement addtocartcheckbox;
	
	@FindBy(xpath="//input[@class=\"button-2 wishlist-add-to-cart-button\"]")
	public WebElement addtocartbtnbelowchkbox;


	@FindBy(xpath="//td[@class=\"product-picture\"]//following-sibling::td//a")
	public WebElement assertcartwishlist;
	
	@FindBy(xpath="//ul[@class=\"shipping-results\"]//li[2]//child::span")
	public WebElement shippingineday;
	
	@FindBy(xpath="//label[contains(text(),\"Country:\")]//following-sibling::select")
	public WebElement countryclick;
	
	@FindBy(xpath="//label[contains(text(),\"Zip / postal code:\")]//following-sibling::input")
	public WebElement zipcode;
	
	@FindBy(xpath="//input[@class=\"button-2 estimate-shipping-button\"]")
	public WebElement shippingestimate;
}