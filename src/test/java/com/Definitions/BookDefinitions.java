package com.Definitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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



}
