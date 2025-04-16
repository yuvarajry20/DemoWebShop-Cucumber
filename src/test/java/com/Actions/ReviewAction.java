package com.Actions;

import org.openqa.selenium.support.PageFactory;

import com.Pages.AddressPage;
import com.Pages.ReviewPage;
import com.Utilities.HelperClass;

public class ReviewAction {
	ReviewPage reviewPage;

    public ReviewAction() {
        this.reviewPage = new ReviewPage();
        PageFactory.initElements(HelperClass.getDriver(), reviewPage);
    }

    public void ClickGiftCategory() {
    	reviewPage.GiftCategory.click();
    }
    
    public void clickGiftCard() {
    	reviewPage.GiftCard.click();
    }
    
    public void clickReviews() {
    	reviewPage.Reviews.click();
    }
    
    public void ReadReviews() {
    	System.out.println(reviewPage.Comments.getText());
    }
    
    public void clickAddReview() { 
    	reviewPage.AddReview.click();
    }
    
    public void ClickSubmitReview() {
    	reviewPage.submitReview.click();
    }
    
    public void notLoggedErrorReview() {
    	System.out.println(reviewPage.RegisterError.getText());
    }
    
    public void enterReviewTitle(String title) {
    	reviewPage.reviewTitle.sendKeys(title);
    }
    
    public void enterReviewText(String text) {
    	reviewPage.reviewText.sendKeys(text);
    }
    public void giveRating() {
    	reviewPage.ratingButton.click();
    }
    
    public void blankTitleError() {
    	System.out.println(reviewPage.blanktitle.getText());
    }
    
    public void blankTextError() {
    	System.out.println(reviewPage.blanktext.getText());
    }
    
    public void verifyReviewSubmitted() {
    	reviewPage.ReviewSuccess.getText();
    }

}
