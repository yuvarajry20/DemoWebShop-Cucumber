package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Pages.BookPageLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class BookPageAction {
    BookPageLocators bookPage;
    BaseActions baseActions;

    public BookPageAction() {
        this.bookPage = new BookPageLocators();
        this.baseActions=new BaseActions();
        PageFactory.initElements(HelperClass.getDriver(), bookPage);
    }

    public void openBooksCategory() {
    	baseActions.clickMethod(bookPage.books);
        LogManagers.logInfo("Clicked on 'Books' category.");
    }

    public void ListOfBooks() {
        LogManagers.logInfo("List of available books:");
        for (WebElement book : bookPage.booksList) {
            String bookName = book.getText().trim();
            LogManagers.logInfo("- " + bookName);
        }
        String actualTitle = bookPage.bookListsAssert.getText();
        Assert.assertEquals(actualTitle.trim(), "Books", "Title does not match.");
        LogManagers.logInfo("Verified that 'Fiction' book page is displayed.");
    }

    public void VerifySortedBooks() {
        String sortedBooksText = bookPage.sortedBookList.getText();
        LogManagers.logInfo("Sorted books list: " + sortedBooksText);
    }

    public void clickFictionBook() {
    	baseActions.clickMethod(bookPage.fictionBook);
        LogManagers.logInfo("Clicked on 'Fiction' book.");
    }

    public void getBookDescription() {
        String description = bookPage.fictionDetail.getText();
        LogManagers.logInfo("Book description: " + description);
        String actualTitle = bookPage.fictionAssert.getText();
        Assert.assertEquals(actualTitle.trim(), "Fiction EX", "Title does not match.");
        LogManagers.logInfo("Verified that 'Fiction' book page is displayed.");
        
    }
    public void AssertHealthBook() {
    	 String actualTitle = bookPage.fictionAssert.getText();
         Assert.assertEquals(actualTitle.trim(), "Health Book", "Title does not match.");
         LogManagers.logInfo("Verified that 'Health book' book page is displayed.");      
    }

    public void clickPriceFilter(String value) {
        List<WebElement> priceFilters = bookPage.priceFilterLinks;
        boolean filterFound = false;

        for (WebElement filter : priceFilters) {
            if (filter.getText().trim().equalsIgnoreCase(value)) {
                filter.click();
                LogManagers.logInfo("Clicked on price filter: " + value);
                filterFound = true;
                break;
            }
        }

        if (!filterFound) {
            LogManagers.logError("Price filter not found: " + value);
        }
    }

    public void applyFilter(String filterType, String value) {
        try {
            switch (filterType) {
                case "Sort By":
                    new Select(bookPage.sortbyDropdown).selectByVisibleText(value);
                    LogManagers.logInfo("Applied 'Sort By' filter: " + value);
                    break;
                case "Display By":
                    new Select(bookPage.displayDropdown).selectByVisibleText(value);
                    LogManagers.logInfo("Applied 'Display By' filter: " + value);
                    break;
                case "View As":
                    new Select(bookPage.viewAsDropdown).selectByVisibleText(value);
                    LogManagers.logInfo("Applied 'View As' filter: " + value);
                    break;
                case "Price":
                    clickPriceFilter(value);
                    break;
                default:
                    LogManagers.logError("Unknown filter type: " + filterType);
                    throw new IllegalArgumentException("Unknown filter: " + filterType);
            }
        } catch (Exception e) {
            LogManagers.logError("Error applying filter: " + e.getMessage(), e);
        }
    }

    public void filterAppliedBooks() {
        String filteredBooksText = bookPage.bookFiltered.getText();
        LogManagers.logInfo("Filtered books list: " + filteredBooksText);
    }

    public String getSelectedSortByOption() {
        Select select = new Select(bookPage.sortbyDropdown);
        String selectedOption = select.getFirstSelectedOption().getText();
        LogManagers.logInfo("Selected 'Sort By' option: " + selectedOption);
        return selectedOption;
    }

    public void applySortByOption(String option) {
        LogManagers.logInfo("Applying sort filters: " + option);
        Select select = new Select(bookPage.sortbyDropdown);
        select.selectByVisibleText(option);
    }

    public void clickComputingInternet() {
    	baseActions.clickMethod(bookPage.computingInternet);
        LogManagers.logInfo("Clicked on 'Computing & Internet' book.");
    }

    public void clickHealthBook() {
    	baseActions.clickMethod(bookPage.healthBook);
        LogManagers.logInfo("Clicked on 'Health' book.");
    }

    public void AddToCompareList() {
    	baseActions.clickMethod(bookPage.compareList);
        LogManagers.logInfo("Added book to compare list.");
    }

    public void assertCompareProductPriceExists() {
    	 WebDriver driver = HelperClass.getDriver();
    	 String expected="Health Book";
    	 int i=1;
    	 while(true) {
    		 WebElement items=driver.findElement(By.xpath("//table[@class='compare-products-table']//tr[2]//td["+i+"]"));
    	     String actual=items.getText();
    	     if(expected.equals(actual)) {
    	    	 Assert.assertEquals(expected,actual);
    	    	 break;
    	     }
    	     i++;
    	 }     
    }    	

    public void ClearCompareProductsList() {
    	baseActions.clickMethod(bookPage.clearList);
        LogManagers.logInfo("Cleared compare list.");
    }

    public void verifyClearedList() {
    	String actualList= "You have no items to compare.";
        String emptyListText = bookPage.emptyCompareList.getText();
        Assert.assertEquals(actualList, emptyListText);
        LogManagers.logInfo("Verify cleared list: " + emptyListText);
    }
}