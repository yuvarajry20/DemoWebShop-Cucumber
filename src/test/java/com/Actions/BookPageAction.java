package com.Actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Pages.BookPageLocators;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class BookPageAction {
    BookPageLocators bookPage;

    public BookPageAction() {
        this.bookPage = new BookPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), bookPage);
    }

    public void openBooksCategory() {
        bookPage.Books.click();
        LogManagers.logInfo("Clicked on 'Books' category.");
    }

    public void ListOfBooks() {
        LogManagers.logInfo("List of available books:");
        for (WebElement book : bookPage.BooksList) {
            String bookName = book.getText().trim();
            LogManagers.logInfo("- " + bookName);
        }
    }

    public void VerifySortedBooks() {
        String sortedBooksText = bookPage.SortedBookList.getText();
        LogManagers.logInfo("Sorted books list: " + sortedBooksText);
    }

    public void clickFictionBook() {
        bookPage.Fiction_book.click();
        LogManagers.logInfo("Clicked on 'Fiction' book.");
    }

    public void getBookDescription() {
        String description = bookPage.FictionDetail.getText();
        LogManagers.logInfo("Book description: " + description);
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
                    new Select(bookPage.DisplayDropdown).selectByVisibleText(value);
                    LogManagers.logInfo("Applied 'Display By' filter: " + value);
                    break;
                case "View As":
                    new Select(bookPage.ViewAsDropdown).selectByVisibleText(value);
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
        bookPage.Computing_Internet.click();
        LogManagers.logInfo("Clicked on 'Computing & Internet' book.");
    }

    public void clickHealthBook() {
        bookPage.Health_book.click();
        LogManagers.logInfo("Clicked on 'Health' book.");
    }

    public void AddToCompareList() {
        bookPage.CompareList.click();
        LogManagers.logInfo("Added book to compare list.");
    }

    public void ResultOfCompareProducts() {
        LogManagers.logInfo("Book Names:");
        for (WebElement name : bookPage.compareName) {
            LogManagers.logInfo(name.getText());
        }

        LogManagers.logInfo("Prices:");
        for (WebElement price : bookPage.comparePrice) {
            LogManagers.logInfo(price.getText());
        }
    }

    public void ClearCompareProductsList() {
        bookPage.ClearList.click();
        LogManagers.logInfo("Cleared compare list.");
    }

    public void verifyClearedList() {
    	String actualList= "You have no items to compare.";
        String emptyListText = bookPage.EmptyCompareList.getText();
        Assert.assertEquals(actualList, emptyListText);
        LogManagers.logInfo("Verify cleared list: " + emptyListText);
    }
}