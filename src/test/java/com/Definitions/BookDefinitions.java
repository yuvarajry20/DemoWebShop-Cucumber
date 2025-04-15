package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Actions.BookPageAction;

import com.Actions.LoginAction;
import com.Utilities.HelperClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookDefinitions {
	
	 BookPageAction bookAction = new BookPageAction();
	 LoginAction loginAction = new LoginAction();
	 WebDriver driver = HelperClass.getDriver();
	 
	@Given("I am on the DemoWebShop homepage with {string}")
	public void i_am_on_the_demo_web_shop_homepage_with(String url) {
	    HelperClass.openPage(url); 
	}

	@When("I click on the {string} category")
	public void i_click_on_the_category(String string) {
		bookAction.openBooksCategory();
	    
	}

	@Then("I should see a list of books displayed")
	public void i_should_see_a_list_of_books_displayed() {
		bookAction.ListOfBooks();
	}

	@When("I select the book titled {string}")
	public void i_select_the_book_titled(String string) {
		bookAction.clickFictionBook();
	}

	@Then("I should see the product details page for {string}")
	public void i_should_see_the_product_details_page_for(String string) {
		bookAction.getBookDescription();
	}

	
	@When("I apply the following filters:")
	public void i_apply_the_following_filters(DataTable dataTable) {
	    List<Map<String, String>> filters = dataTable.asMaps(String.class, String.class);

	    for (Map<String, String> filter : filters) {
	        String filterType = filter.get("Filter Type");
	        String value = filter.get("Value");

	        bookAction.applyFilter(filterType, value);
	    }
	}


	@Then("the filtered books should be displayed accordingly")
	public void the_filtered_books_should_be_displayed_accordingly() {
	    bookAction.filterAppliedBooks();
	}

	@When("I apply each of the following Sort By filters:")
	public void i_apply_each_of_the_following_sort_by_filters(DataTable dataTable) {
	    List<Map<String, String>> list = dataTable.asMaps();
	    
	    for (Map<String, String> row : list) {
	        String option = row.get("Sort By"); 
	        bookAction.applySortByOption(option);

	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}

	@Then("each sort result should be applied correctly")
	public void each_sort_result_should_be_applied_correctly() {
	    String selectedOption = bookAction.getSelectedSortByOption();
	    System.out.println("Current selected: " + selectedOption);
	    Assert.assertNotNull(selectedOption);
	}
	
	@When("I click the {string} book link")
	public void i_click_the_book_link(String string) {
		bookAction.clickComputingInternet();
	}

	@When("click the Add to Compare button")
	public void click_the_add_to_compare_button() {
	    bookAction.AddToCompareList();
	}

	@Then("click the books category and click the {string} link")
	public void click_the_books_category_and_click_the_link(String string) {
		bookAction.openBooksCategory();
	    bookAction.clickHealthBook();
	}

	@Then("add it to the compare list")
	public void add_it_to_the_compare_list() {
	    bookAction.AddToCompareList();
	}

	@Then("verify and compare the prices of both the product")
	public void verify_and_compare_the_prices_of_both_the_product() {
	   bookAction.ResultOfCompareProducts();
	}

	@Then("clear the list in compare products")
	public void clear_the_list_in_compare_products() {
	    bookAction.ClearCompareProductsList();
	}

	@Then("assert if the lists are cleared")
	public void assert_if_the_lists_are_cleared() {
	    bookAction.verifyClearedList();
	}



}
