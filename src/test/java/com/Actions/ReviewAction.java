package com.Actions;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.ReviewPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;
import com.Actions.ElementNotFoundException;

public class ReviewAction {
    ReviewPage reviewPage;
    WebDriver driver;

    public ReviewAction() {
        this.driver = HelperClass.getDriver();
        this.reviewPage = new ReviewPage();
        PageFactory.initElements(driver, reviewPage);
    }

    public void ClickGiftCategory() {
        reviewPage.GiftCategory.click();
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


    WebDriverWait wait = new WebDriverWait( HelperClass.getDriver(), Duration.ofSeconds(10));

    public void blankTitleError() throws ElementNotFoundException {
        try {
            WebElement titleError = wait.until(ExpectedConditions.visibilityOf(reviewPage.blanktitle));
            String errorText = titleError.getText().trim();
            LogManagers.logInfo("Blank title error message: " + errorText);
            Assert.assertEquals(errorText, "Review title is required.", "Title error message mismatch.");
        } catch (TimeoutException e) {
            throw new ElementNotFoundException("Blank Title error message element not found.");
        }
    }
    public void blankTextError() throws ElementNotFoundException {
        try {
            WebElement textError = wait.until(ExpectedConditions.visibilityOf(reviewPage.blanktext));
            String errorText = textError.getText().trim();
            LogManagers.logInfo("Blank text error message: " + errorText);
            Assert.assertEquals(errorText, "Review text is required.", "Text error message mismatch.");
        } catch (TimeoutException e) {
            throw new ElementNotFoundException("Blank Text error message element not found.");
        }
    }
    public void verifyReviewSubmitted() throws ElementNotFoundException {
        try {
            WebElement successMsg = wait.until(ExpectedConditions.visibilityOf(reviewPage.ReviewSuccess));
            String successText = successMsg.getText().trim();
            LogManagers.logInfo("Review submitted successfully: " + successText);
            Assert.assertEquals(successText, "Product review is successfully added.", "Success message mismatch.");
        } catch (TimeoutException e) {
            throw new ElementNotFoundException("Review Success message element not found.");
        }
    }



}