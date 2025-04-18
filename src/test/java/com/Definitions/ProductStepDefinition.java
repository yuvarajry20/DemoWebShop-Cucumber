package com.Definitions;

import java.util.List;

import com.Actions.ProductAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ProductStepDefinition { 
	ProductAction objProductAction=new ProductAction();

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() 
	{
		HelperClass.openPage("https://demowebshop.tricentis.com/");
		
		
		
	}

@When("the user search for a product")
public void the_user_search_for_a_product(io.cucumber.datatable.DataTable dataTable) {
	List<String> objList=dataTable.asList(String.class);
	String productName=objList.get(0);
	objProductAction.searchFieldStore(productName);
}



	@When("see the product title and the product description")
	public void see_the_product_title_and_the_product_description() {
		String titleText=objProductAction.getTitleOfProduct();
		System.out.println("The title of the product is "+titleText);
	}

	@When("clicks on add to cart")
	public void clicks_on_add_to_cart() {
		objProductAction.clickAddToCart();
	}

	@Then("the user should see the successful message")
	public void the_user_should_see_the_successful_message() throws InterruptedException {
		objProductAction.addToCartMessage();
	}

	@When("go to the shopping cart")
	public void go_to_the_shopping_cart() {
		HelperClass.getDriver().navigate().refresh();
		objProductAction.clickAddToCart();
		objProductAction.shoppingCart();
	}

	@When("remove the product from cart")
	public void remove_the_product_from_cart() {
		objProductAction.updateCartByRemove();
	}

	@Then("the shopping cart is empty")
	public void the_shopping_cart_is_empty() {
		objProductAction.emptyCarts();
	}

	@When("click the add to wishlist")
	public void click_the_add_to_wishlist() {
		objProductAction.addToWishlist();
	}

	@When("click the auto-generated url for the specific product")
	public void click_the_auto_generated_url_for_the_specific_product() {
		
		objProductAction.urlWishlist();
	}

	@Then("the user should see the product which is same as in the wishlist")
	public void the_user_should_see_the_product_which_is_same_as_in_the_wishlist() {
		objProductAction.urlAutoList();
	}

	@When("Increase the count of the product and click add to cart")
	public void increase_the_count_of_the_product_and_click_add_to_cart() {
		objProductAction.increaseQty();
	}

	@Then("the user should see the updated quantity and price in the shopping cart page")
	public void the_user_should_see_the_updated_quantity_and_price_in_the_shopping_cart_page() {
		objProductAction.updatedQtyInWishlist();
	}


	@When("logged in and click Email a friend")
	public void logged_in_and_click_email_a_friend() {
		objProductAction.login();
		objProductAction.emailAFriend();
		objProductAction.emailFriendButton();
		
		
		
	}

	@When("enter my email and friend email")
	public void enter_my_email_and_friend_email(io.cucumber.datatable.DataTable dataTable) {
		List<String> objList=dataTable.asList(String.class);
		String friendmail=objList.get(0);
		String myemail=objList.get(1);
		objProductAction.emailFriendSend(friendmail, myemail);
		
	}

	@When("click send")
	public void click_send() {
		objProductAction.sendMailFriend();
	}

	@Then("the user should see the email sent successful message")
	public void the_user_should_see_the_email_sent_successful_message() 
	{
		objProductAction.successfulMailSend();
		
	}

	@Then("the user should see the Invalid email message")
	public void the_user_should_see_the_invalid_email_message() {
		objProductAction.unsuccessfulMailSend();
	}
	

@When("click add to wishlist")
public void click_add_to_wishlist() {
	objProductAction.addToWishlist();
    
}



@When("add to cart the product in the wishlist")
public void add_to_cart_the_product_in_the_wishlist() {
	objProductAction.addToCartCheckboxes();
    
}

@Then("the user should see the product is added in the shopping cart")
public void the_user_should_see_the_product_is_added_in_the_shopping_cart() {
    objProductAction.verifyTextInCart();
}

@When("I add to cart the laptop")
public void i_add_to_cart_the_laptop() {
	HelperClass.getDriver().navigate().refresh();
    objProductAction.addLaptopCart();
}

@When("enter the country and pincode and click Estimate Shipping")
public void enter_the_country_and_pincode_and_click_estimate_shipping(io.cucumber.datatable.DataTable dataTable) {
	List<String> objList=dataTable.asList(String.class);
	String country=objList.get(0);
	String pincode=objList.get(1);
	objProductAction.countryPin(country, pincode);
}

@Then("the user should see the shipping details")
public void the_user_should_see_the_shipping_details() {
	objProductAction.estimateShippingDetails();
   
}








}