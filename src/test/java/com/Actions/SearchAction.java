package com.Actions;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Pages.SearchBarLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class SearchAction {
    SearchBarLocators searchPage;

    public SearchAction() {
        this.searchPage = new SearchBarLocators();
        PageFactory.initElements(HelperClass.getDriver(), searchPage);
    }

    public void enterSearchText(String keyword) {
        searchPage.searchbox.clear();
        searchPage.searchbox.sendKeys(keyword);
        LogManagers.logInfo("Entered search text: " + keyword);
    }

    public void clickSearchButton() {
        searchPage.search.click();
        LogManagers.logInfo("Clicked on 'Search' button.");
    }

    public void displayResult() {
        String resultText = searchPage.getSearchResult.getText();
        System.out.println(resultText);
        LogManagers.logInfo("Search result: " + resultText);
    }

    public String noSearchDisplayed() {
        String noResultText = searchPage.noResultMessage.getText();
        LogManagers.logInfo("No search result message: " + noResultText);
        return noResultText;
    }

    public String advanceSearchResultDisplayed() {
        try {
            if (searchPage.CameraFound.isDisplayed()) {
                String resultText = searchPage.CameraFound.getText();
                LogManagers.logInfo("Advanced search result: " + resultText);
                return resultText;
            } else  {
                String noResultText = searchPage.noResultMessage.getText();
                LogManagers.logInfo("No search result message: " + noResultText);
                return noResultText;
            }
        } catch (NoSuchElementException e) {
            LogManagers.logError("Search result elements not found: " + e.getMessage());
            return "Element not found";
        }
    }


    public void shortKeywordWarning() {
        String warningText = searchPage.searchWarning.getText();
        System.out.println(warningText);
        LogManagers.logInfo("Search warning message: " + warningText);
    }

    public String verifyRelevantSearchMessage(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));

        if (expectedMessage.equals("No products were found that matched your criteria.")) {
            String actualMessage = wait.until(ExpectedConditions.visibilityOf(searchPage.noResultMessage)).getText();
            LogManagers.logInfo("No result message: " + actualMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Mismatch in no result message");
        }
        else if (expectedMessage.equals("Search term minimum length is 3 characters")) {
            String actualMessage = wait.until(ExpectedConditions.visibilityOf(searchPage.searchWarning)).getText();
            LogManagers.logInfo("Search warning message: " + actualMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Mismatch in search warning");
        }
        else if (expectedMessage.equals("Please enter some search keyword")) {
            try {
                Alert alert = HelperClass.getDriver().switchTo().alert();
                String actualMessage = alert.getText();
                alert.accept();
                LogManagers.logInfo("Alert message: " + actualMessage);
                Assert.assertEquals(actualMessage, expectedMessage, "Mismatch in alert message");
            } catch (NoAlertPresentException e) {
                LogManagers.logError("No alert present", e);
                Assert.fail("Expected alert not present");
            }
        }
		return expectedMessage;
    }

    

    public void enableAdvanceSearch() {
        searchPage.AdvanceCheckbox.click();
        LogManagers.logInfo("Enabled advanced search.");
    }

    public void applyCategory() {
        searchPage.clickCategory.click();
        LogManagers.logInfo("Applied category filter.");
    }

    public void applyCameraCategory() {
        searchPage.clickCameraDropdown.click();
        LogManagers.logInfo("Applied camera category filter.");
    }

    public void applyCellCategory() {
        searchPage.clickCellPhone.click();
        LogManagers.logInfo("Applied cell phone category filter.");
    }

    public void enterPriceRange(String min, String max) {
        searchPage.MinFilter.sendKeys(min);
        searchPage.MaxFilter.sendKeys(max);
        searchPage.Advanceseachbtn.click();
        LogManagers.logInfo("Entered price range: Min=" + min + ", Max=" + max);
    }
}