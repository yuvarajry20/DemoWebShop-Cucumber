package com.Actions;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.ReviewPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class ReviewAction {
    ReviewPage reviewPage;

    public ReviewAction() {
        this.reviewPage = new ReviewPage();
        PageFactory.initElements(HelperClass.getDriver(), reviewPage);
    }

//    public void ClickGiftCategory() {
//        reviewPage.GiftCategory.click();
//        LogManagers.logInfo("Clicked on 'Gift Category' link.");
//    }
    
    public void ClickGiftCategory() {
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
        WebElement giftCategoryLink = wait.until(ExpectedConditions.elementToBeClickable(reviewPage.GiftCategory));
        giftCategoryLink.click();
        LogManagers.logInfo("Clicked on 'Gift Category' link.");
    }


    public void clickGiftCard() {
        reviewPage.GiftCard.click();
        LogManagers.logInfo("Clicked on 'Gift Card' link.");
    }

    public void clickReviews() {
        reviewPage.Reviews.click();
        LogManagers.logInfo("Clicked on 'Reviews' link.");
    }

    public void ReadReviews() {
        String comments = reviewPage.Comments.getText();
        System.out.println(comments);
        LogManagers.logInfo("Read reviews: " + comments);
    }

    public void clickAddReview() {
        reviewPage.AddReview.click();
        LogManagers.logInfo("Clicked on 'Add Review' button.");
    }

    public void ClickSubmitReview() {
        reviewPage.submitReview.click();
        LogManagers.logInfo("Clicked on 'Submit Review' button.");
    }

    public void notLoggedErrorReview() {
        String errorText = reviewPage.RegisterError.getText();
        System.out.println(errorText);
        LogManagers.logInfo("Not logged in error message: " + errorText);
    }

    public void enterReviewTitle(String title) {
        reviewPage.reviewTitle.sendKeys(title);
        LogManagers.logInfo("Entered review title: " + title);
    }

    public void enterReviewText(String text) {
        reviewPage.reviewText.sendKeys(text);
        LogManagers.logInfo("Entered review text: " + text);
    }

    public void giveRating() {
        reviewPage.ratingButton.click();
        LogManagers.logInfo("Clicked on 'Rating' button.");
    }

    public void blankTitleError() {
        String errorText = reviewPage.blanktitle.getText();
        System.out.println(errorText);
        LogManagers.logInfo("Blank title error message: " + errorText);
    }

    public void blankTextError() {
        String errorText = reviewPage.blanktext.getText();
        System.out.println(errorText);
        LogManagers.logInfo("Blank text error message: " + errorText);
    }

    public void verifyReviewSubmitted() {
        String successText = reviewPage.ReviewSuccess.getText();
        LogManagers.logInfo("Review submitted successfully: " + successText);
    }
}