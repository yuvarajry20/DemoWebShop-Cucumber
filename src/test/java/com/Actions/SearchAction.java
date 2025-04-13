package com.Actions;

import org.testng.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Pages.BookPageLocators;
import com.Pages.SearchBarLocators;
import com.Utilities.HelperClass;

public class SearchAction {
	
	SearchBarLocators searchPage;
	
	public SearchAction() {
        this.searchPage = new SearchBarLocators();
        PageFactory.initElements(HelperClass.getDriver(), searchPage);
    }
	
	public void enterSearchText(String keyword) {
	    searchPage.searchbox.clear();
	    searchPage.searchbox.sendKeys(keyword); 
	}
//	public void enterSearchText(String keyword) {
//	    try {
//	    	HelperClass.getDriver().switchTo().alert().dismiss();
//	    } catch (NoAlertPresentException ignored) {
//	    }
//	    searchPage.searchbox.clear();
//	    searchPage.searchbox.sendKeys(keyword);
//	}


    public void clickSearchButton() {
        searchPage.search.click();
    }
    public void DisplayResult() {
    	searchPage.searchResult.getText();
    }

//    public void verifySearchResult(String expectedMessage) {
//        if (expectedMessage.equalsIgnoreCase("Please enter some search keyword")) {
//        	Alert alert = HelperClass.getDriver().switchTo().alert();
//            String alertText = alert.getText();
//            Assert.assertEquals(alertText, expectedMessage);
//            alert.accept();
//        } else if (expectedMessage.equalsIgnoreCase("Search term minimum length is 3 characters")) {
//            Assert.assertEquals(searchPage.searchWarning.getText(), expectedMessage);
//        } else if (expectedMessage.equalsIgnoreCase("No products were found that matched your criteria.")) {
//            Assert.assertTrue(searchPage.noResultMessage.getText().contains(expectedMessage));
//        } else {
//            Assert.assertTrue(searchPage.resultTitle.getText().contains(expectedMessage));
//        }
//    }
//    public void verifySearchResult(String expected) {
//        try {
//            Alert alert = HelperClass.getDriver().switchTo().alert();
//            String alertText = alert.getText();
//            alert.accept(); // dismiss the alert
//            Assert.assertEquals(alertText, expected);
//        } catch (NoAlertPresentException e) {
//            // no alert, continue to validate the search result
//            String actual = searchPage.resultHeader.getText(); // adjust locator if needed
//            Assert.assertTrue(actual.contains(expected));
//        }
//    }
    


}
