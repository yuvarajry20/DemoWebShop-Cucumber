package com.Definitions;

import com.Actions.digitaldownloadAction;
import com.Utilities.LogManagers;

import io.cucumber.java.en.*;

public class digitaldownloadstep {
    digitaldownloadAction objdigitalact = new digitaldownloadAction();

    @When("the user click the digital download category")
    public void the_user_click_the_digital_download_category() {
        try {
            objdigitalact.Digitaldownload();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the digital download category. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click add to cart the product")
    public void click_add_to_cart_the_product() {
        try {
            objdigitalact.addtocartmusic();
        } catch (Exception e) {
            LogManagers.logError("Failed to add the product to cart. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the number of products added in cart")
    public void the_user_should_see_the_number_of_products_added_in_cart() {
        try {
            objdigitalact.qtyproduct();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the number of products added in cart. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("select the filter option")
    public void select_the_filter_option() {
        try {
            objdigitalact.addfilter();
        } catch (Exception e) {
            LogManagers.logError("Failed to select the filter option. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the list of products based on the filter")
    public void the_user_should_see_the_list_of_products_based_on_the_filter() {
        try {
            objdigitalact.listallproducts();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the list of products based on the filter. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the digital download product page")
    public void the_user_should_see_the_digital_download_product_page() {
        try {
            objdigitalact.Assertheading();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the digital download product page. Error: " + e.getMessage());
            throw e;
        }
    }
}