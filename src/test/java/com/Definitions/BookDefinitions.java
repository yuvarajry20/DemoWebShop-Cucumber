package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Actions.BookPageAction;
import com.Actions.LoginAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookDefinitions {
    BookPageAction bookAction = new BookPageAction();
    LoginAction loginAction = new LoginAction();
    WebDriver driver = HelperClass.getDriver();

    @When("I click on the {string} category")
    public void i_click_on_the_category(String string) {
        try {
            bookAction.openBooksCategory();
        } catch (Exception e) {
            LogManagers.logError("Failed to click on the category. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("I should see a list of books displayed")
    public void i_should_see_a_list_of_books_displayed() {
        try {
            bookAction.ListOfBooks();
        } catch (Exception e) {
            LogManagers.logError("Failed to see a list of books displayed. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I select the book titled")
    public void i_select_the_book_titled(DataTable dataTable) {
    	 List<String> bookTitles = dataTable.asList(); 
    	    for (String title : bookTitles) {
    	        if (title.equalsIgnoreCase("Fiction EX")) {
    	            bookAction.clickFictionBook();
    	        } else {
    	            throw new IllegalArgumentException("Book not supported: " + title);
    	        }
    	    }
    	}

    @Then("I should see the product details page")
    public void i_should_see_the_product_details_page() {
    	bookAction.getBookDescription();
          }

    @When("I apply the following filters:")
    public void i_apply_the_following_filters(DataTable dataTable) {
        try {
            List<Map<String, String>> filters = dataTable.asMaps(String.class, String.class);

            for (Map<String, String> filter : filters) {
                String filterType = filter.get("Filter Type");
                String value = filter.get("Value");

                bookAction.applyFilter(filterType, value);
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to apply the following filters. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the filtered books should be displayed accordingly")
    public void the_filtered_books_should_be_displayed_accordingly() {
        try {
            bookAction.filterAppliedBooks();
        } catch (Exception e) {
            LogManagers.logError("Failed to display the filtered books accordingly. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I apply each of the following Sort By filters:")
    public void i_apply_each_of_the_following_sort_by_filters(DataTable dataTable) {
        try {
            List<Map<String, String>> list = dataTable.asMaps();

            for (Map<String, String> row : list) {
                String option = row.get("Sort By");
                bookAction.applySortByOption(option);
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to apply each of the following Sort By filters. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("each sort result should be applied correctly")
    public void each_sort_result_should_be_applied_correctly() {
        try {
            String selectedOption = bookAction.getSelectedSortByOption();
            System.out.println("Book is sorted by: " + selectedOption);
            Assert.assertNotNull(selectedOption);
        } catch (Exception e) {
            LogManagers.logError("Failed to apply each sort result correctly. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click the {string} book link")
    public void i_click_the_book_link(String string) {
        try {
            bookAction.clickComputingInternet();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the book link. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the Add to Compare button")
    public void click_the_add_to_compare_button() {
        try {
            bookAction.AddToCompareList();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the Add to Compare button. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("click the books category and click the {string} link")
    public void click_the_books_category_and_click_the_link(String string) {
        try {
            bookAction.openBooksCategory();
            bookAction.clickHealthBook();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the books category and click the link. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("add it to the compare list")
    public void add_it_to_the_compare_list() {
        try {
            bookAction.AddToCompareList();
        } catch (Exception e) {
            LogManagers.logError("Failed to add it to the compare list. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("verify and compare the prices of both the product")
    public void verify_and_compare_the_prices_of_both_the_product() {
        try {
            //bookAction.ResultOfCompareProducts();
//        	List<String> expectedPrices = Arrays.asList("24.00", "10.00");
//        	bookAction.assertCompareProductPrices(expectedPrices);
        	bookAction.assertCompareProductPriceExists();
        } catch (Exception e) {
            LogManagers.logError("Failed to verify and compare the prices of both the product. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("clear the list in compare products")
    public void clear_the_list_in_compare_products() {
        try {
            bookAction.ClearCompareProductsList();
        } catch (Exception e) {
            LogManagers.logError("Failed to clear the list in compare products. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("assert if the lists are cleared")
    public void assert_if_the_lists_are_cleared() {
        try {
            bookAction.verifyClearedList();
        } catch (Exception e) {
            LogManagers.logError("Failed to assert if the lists are cleared. Error: " + e.getMessage());
            throw e;
        }
    }
}