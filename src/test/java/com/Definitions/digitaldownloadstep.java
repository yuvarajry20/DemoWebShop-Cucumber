package com.Definitions;

import com.Actions.digitaldownloadAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.*;

public class digitaldownloadstep {
	digitaldownloadAction objdigitalact=new digitaldownloadAction();
	
	@Given("the user is on the web application")
	public void the_user_is_on_the_web_application() {
		HelperClass.openPage("https://demowebshop.tricentis.com/");
	}

	@When("the user click the digital download category")
	public void the_user_click_the_digital_download_category() {
	    objdigitalact.Digitaldownload();
	}

	@When("click add to cart the product")
	public void click_add_to_cart_the_product() {
	    objdigitalact.addtocartmusic();
	}

	@Then("the user should see the number of products added in cart")
	public void the_user_should_see_the_number_of_products_added_in_cart() {
	    objdigitalact.qtyproduct();
	}

	@When("select the filter option")
	public void select_the_filter_option() {
		
	    objdigitalact.addfilter();
	}

	@Then("the user should see the list of products based on the filter")
	public void the_user_should_see_the_list_of_products_based_on_the_filter() {
	    objdigitalact.listallproducts();
	}

	@Then("the user should see the digital download product page")
	public void the_user_should_see_the_digital_download_product_page() {
	    objdigitalact.Assertheading();
	}

	
	
	

}
