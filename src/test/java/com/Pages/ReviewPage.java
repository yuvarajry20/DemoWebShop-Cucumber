package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReviewPage {
	
	@FindBy(xpath="(//a[contains(text(),\"Gift Cards\")])[3]")
	public WebElement GiftCategory;
	
	@FindBy(xpath="//a[contains(text(),\"$50 Physical Gift Card\")]")
	public WebElement GiftCard;
	
	@FindBy(xpath="//div[@class=\"product-review-links\"]//a[1]")
	public WebElement Reviews;
	
	@FindBy(xpath="//div[@class=\"product-review-item\"][1]")
	public WebElement Comments;
	
	@FindBy(xpath="//div[@class=\"product-review-links\"]//a[2]")
	public WebElement AddReview;
	
	@FindBy(xpath="//div[@class=\"validation-summary-errors\"]")
	public WebElement RegisterError;
	
	@FindBy(xpath="//input[@name=\"add-review\"]")
	public WebElement submitReview;
	
	@FindBy(xpath="//input[@name=\"AddProductReview.Title\"]")
	public WebElement reviewTitle;
	
	@FindBy(xpath="//textarea[@class=\"review-text\"]")
	public WebElement reviewText;
	
	@FindBy(xpath="//span[@data-valmsg-for=\"AddProductReview.Title\"]")
	public WebElement blanktitle;
	
	@FindBy(xpath="//span[@data-valmsg-for=\"AddProductReview.ReviewText\"]")
	public WebElement blanktext;
	
	@FindBy(xpath="//div[@class=\"result\"]")
	public WebElement ReviewSuccess;
	
	@FindBy(xpath="//input[@id=\"addproductrating_3\"]")
	public WebElement ratingButton;
	
	

}
