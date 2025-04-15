package com.Actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Pages.BookPageLocators;
import com.Utilities.HelperClass;

public class BookPageAction {
	
BookPageLocators bookPage;
private WebElement sortbyDropdown;
	
    public BookPageAction() {
	        this.bookPage = new BookPageLocators();
	        PageFactory.initElements(HelperClass.getDriver(), bookPage);
	    }
    public void openBooksCategory() {
    	     bookPage.Books.click();
    }
    
    public void ListOfBooks() {
    	System.out.println("List of available books:");

	    for (WebElement book : bookPage.BooksList) {
	        String bookName = book.getText().trim();
	        System.out.println("- " + bookName);
	    }
    }

//     public void selectSortByAToZ() {
//    	  Select select = new Select(sortbyDropdown);
//          select.selectByVisibleText("Name: A to Z");
//
//     }
     public void VerifySortedBooks() {
    	 bookPage.SortedBookList.getText();
     }
    	
    public void clickFictionBook() {
    	 bookPage.Fiction_book.click();
    }
    
    public void getBookDescription() {
    	System.out.println(bookPage.FictionDetail.getText());
    }
    

    public void clickPriceFilter(String value) {
        List<WebElement> priceFilters = bookPage.priceFilterLinks;

        for (WebElement filter : priceFilters) {
            if (filter.getText().trim().equalsIgnoreCase(value)) {
                filter.click();
                break;
            }
        }
    }

    public void applyFilter(String filterType, String value) {
        switch (filterType) {
            case "Sort By":
                new Select(bookPage.sortbyDropdown).selectByVisibleText(value);
                break;
            case "Display By":
                new Select(bookPage.DisplayDropdown).selectByVisibleText(value);
                break;
            case "View As":
                new Select(bookPage.ViewAsDropdown).selectByVisibleText(value);
                break;
            case "Price":
                clickPriceFilter(value);
                break;
            default:
                throw new IllegalArgumentException("Unknown filter: " + filterType);
        }
    }
    
    public void filterAppliedBooks() {
    	System.out.println(bookPage.bookFiltered.getText());
    }

    public String getSelectedSortByOption() {
        Select select = new Select(bookPage.sortbyDropdown);
        return select.getFirstSelectedOption().getText();
    }
    public void applySortByOption(String option) {
        System.out.println("Applying sort filters: " + option);
        Select select = new Select(bookPage.sortbyDropdown);
        select.selectByVisibleText(option);
    }
    
    public void clickComputingInternet() {
    	bookPage.Computing_Internet.click();
    }
    
    public void clickHealthBook() {
    	bookPage.Health_book.click();
    }
    
    public void AddToCompareList() {
    	bookPage.CompareList.click();
    }
    
    public void ResultOfCompareProducts() {
    	System.out.println("Book Names:");
    	for (WebElement name : bookPage.compareName) {
    	    System.out.println(name.getText());
    	}

    	System.out.println("Prices:");
    	for (WebElement price : bookPage.comparePrice) {
    	    System.out.println(price.getText());
    	}
    }
    
    public void ClearCompareProductsList() {
    	bookPage.ClearList.click();
    }
    
    public void verifyClearedList() {
    	System.out.println(bookPage.EmptyCompareList.getText());
    }

}