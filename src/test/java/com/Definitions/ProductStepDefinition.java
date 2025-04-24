package com.Definitions;

import java.util.List;
import java.util.Map;

import com.Actions.ProductAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition { 
    ProductAction objProductAction = new ProductAction();

    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        try {
            HelperClass.openPage("https://demowebshop.tricentis.com/");
        } catch (Exception e) {
            LogManagers.logError("Failed to open the home page. Error: " + e.getMessage());
        }
    }

    @When("the user search for a product")
    public void the_user_search_for_a_product(io.cucumber.datatable.DataTable dataTable) {
        try {
            List<Map<String, String>> objList = dataTable.asMaps(String.class,String.class);
            for(int i=0;i<3;i++)
            {
            	String productName1 = objList.get(i).get("products");
            	objProductAction.searchFieldStore(productName1);
            	
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to search for a product. Error: " + e.getMessage());
        }
    }
    

    @When("see the product title and the product description")
    public void see_the_product_title_and_the_product_description() {
        try {
            String titleText = objProductAction.getTitleOfProduct();
            System.out.println("The title of the product is " + titleText);
        } catch (Exception e) {
            LogManagers.logError("Failed to see the product title and description. Error: " + e.getMessage());
        }
    }

    @When("clicks on add to cart")
    public void clicks_on_add_to_cart() {
        try {
            objProductAction.clickAddToCart();
        } catch (Exception e) {
            LogManagers.logError("Failed to click on add to cart. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the successful message")
    public void the_user_should_see_the_successful_message() throws InterruptedException {
        try {
            objProductAction.addToCartMessage();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the successful message. Error: " + e.getMessage());
        }
    }

    @When("go to the shopping cart")
    public void go_to_the_shopping_cart() {
        try {
            HelperClass.getDriver().navigate().refresh();
            objProductAction.clickAddToCart();
            objProductAction.shoppingCart();
        } catch (Exception e) {
            LogManagers.logError("Failed to go to the shopping cart. Error: " + e.getMessage());
        }
    }

    @When("remove the product from cart")
    public void remove_the_product_from_cart() {
        try {
            objProductAction.updateCartByRemove();
        } catch (Exception e) {
            LogManagers.logError("Failed to remove the product from cart. Error: " + e.getMessage());
        }
    }

    @Then("the shopping cart is empty")
    public void the_shopping_cart_is_empty() {
        try {
            objProductAction.emptyCarts();
        } catch (Exception e) {
            LogManagers.logError("Failed to verify if the shopping cart is empty. Error: " + e.getMessage());
        }
    }

    @When("click the add to wishlist")
    public void click_the_add_to_wishlist() {
        try {
            objProductAction.addToWishlist();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the add to wishlist. Error: " + e.getMessage());
        }
    }

    @When("click the auto-generated url for the specific product")
    public void click_the_auto_generated_url_for_the_specific_product() {
        try {
            objProductAction.urlWishlist();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the auto-generated URL for the specific product. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the product which is same as in the wishlist")
    public void the_user_should_see_the_product_which_is_same_as_in_the_wishlist() {
        try {
            objProductAction.urlAutoList();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the product which is same as in the wishlist. Error: " + e.getMessage());
        }
    }

    @When("Increase the count of the product and click add to cart")
    public void increase_the_count_of_the_product_and_click_add_to_cart() {
        try {
            objProductAction.increaseQty();
        } catch (Exception e) {
            LogManagers.logError("Failed to increase the count of the product and click add to cart. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the updated quantity and price in the shopping cart page")
    public void the_user_should_see_the_updated_quantity_and_price_in_the_shopping_cart_page() {
        try {
            objProductAction.updatedQtyInWishlist();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the updated quantity and price in the shopping cart page. Error: " + e.getMessage());
        }
    }

    @When("logged in and click Email a friend")
    public void logged_in_and_click_email_a_friend() {
        try {
            objProductAction.login();
            objProductAction.emailAFriend();
            objProductAction.emailFriendButton();
        } catch (Exception e) {
            LogManagers.logError("Failed to log in and click Email a friend. Error: " + e.getMessage());
        }
    }

    @When("enter my email and friend email")
    public void enter_my_email_and_friend_email(io.cucumber.datatable.DataTable dataTable) {
        try {
            List<String> objList = dataTable.asList(String.class);
            String friendmail = objList.get(0);
            String myemail = objList.get(1);
            objProductAction.emailFriendSend(friendmail, myemail);
        } catch (Exception e) {
            LogManagers.logError("Failed to enter my email and friend email. Error: " + e.getMessage());
        }
    }

    @When("click send")
    public void click_send() {
        try {
            objProductAction.sendMailFriend();
        } catch (Exception e) {
            LogManagers.logError("Failed to click send. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the email sent successful message")
    public void the_user_should_see_the_email_sent_successful_message() {
        try {
            objProductAction.successfulMailSend();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the email sent successful message. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the Invalid email message")
    public void the_user_should_see_the_invalid_email_message() {
        try {
            objProductAction.unsuccessfulMailSend();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the Invalid email message. Error: " + e.getMessage());
        }
    }

    @When("click add to wishlist")
    public void click_add_to_wishlist() {
        try {
            objProductAction.addToWishlist();
        } catch (Exception e) {
            LogManagers.logError("Failed to click add to wishlist. Error: " + e.getMessage());
        }
    }

    @When("add to cart the product in the wishlist")
    public void add_to_cart_the_product_in_the_wishlist() {
        try {
            objProductAction.addToCartCheckboxes();
        } catch (Exception e) {
            LogManagers.logError("Failed to add to cart the product in the wishlist. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the product is added in the shopping cart")
    public void the_user_should_see_the_product_is_added_in_the_shopping_cart() {
        try {
            objProductAction.verifyTextInCart();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the product is added in the shopping cart. Error: " + e.getMessage());
        }
    }

    @When("I add to cart the laptop")
    public void i_add_to_cart_the_laptop() {
        try {
            HelperClass.getDriver().navigate().refresh();
            objProductAction.addLaptopCart();
        } catch (Exception e) {
            LogManagers.logError("Failed to add to cart the laptop. Error: " + e.getMessage());
        }
    }

    @When("enter the country and pincode and click Estimate Shipping")
    public void enter_the_country_and_pincode_and_click_estimate_shipping(io.cucumber.datatable.DataTable dataTable) {
        try {
            List<String> objList = dataTable.asList(String.class);
            String country = objList.get(0);
            String pincode = objList.get(1);
            objProductAction.countryPin(country, pincode);
        } catch (Exception e) {
            LogManagers.logError("Failed to enter the country and pincode and click Estimate Shipping. Error: " + e.getMessage());
        }
    }

    @Then("the user should see the shipping details")
    public void the_user_should_see_the_shipping_details() {
        try {
            objProductAction.estimateShippingDetails();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the shipping details. Error: " + e.getMessage());
        }
    }
}