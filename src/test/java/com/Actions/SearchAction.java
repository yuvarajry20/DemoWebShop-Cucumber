package com.Actions;

import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
    public void clickSearchButton() {
        searchPage.search.click();
    }
    
    public void DisplayResult() {
    	System.out.println(searchPage.getSearchResult.getText());
    }
    
    public void NoSearchDisplayed() {
    	System.out.println(searchPage.noResultMessage.getText());
    }
    
    public void shortKeywordWarning() {
    	System.out.println(searchPage.searchWarning.getText());
    }
    
    public String getRelevantSearchMessage(String expectedMessage) {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));

        if (expectedMessage.equals("No products were found that matched your criteria.")) {
            return wait.until(ExpectedConditions.visibilityOf(searchPage.noResultMessage)).getText();
        } else if (expectedMessage.equals("Search term minimum length is 3 characters")) {
            return wait.until(ExpectedConditions.visibilityOf(searchPage.searchWarning)).getText();
        } else if (expectedMessage.equals("Please enter some search keyword")) {
            try {
                Alert alert = HelperClass.getDriver().switchTo().alert();
                String actualMessage = alert.getText();
                alert.accept(); 
                return actualMessage;
            } catch (NoAlertPresentException e) {
                return "No alert present";
            }
        }
        return "";
    }
    public void enableAdvanceSearch() {
    	searchPage.AdvanceCheckbox.click();
    }
    
    public void applyCategory() {
    	searchPage.clickCategory.click();
    }
    public void applycameraCategory() {
    	searchPage.clickCameraDropdown.click();
    }
   public void applyCellCategory() {
	   searchPage.clickCellPhone.click();
   }
   public void enterPriceRange(String min,String max) {
	    searchPage.MinFilter.sendKeys(min);
    	searchPage.MaxFilter.sendKeys(max);
    	searchPage.Advanceseachbtn.click();
    	    	
    }
   public void AdvanceSearchResultDisplayed() {
	   System.out.println(searchPage.CameraFound.getText());
   }

}
