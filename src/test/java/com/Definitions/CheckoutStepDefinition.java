package com.Definitions;

import java.util.List;

import org.openqa.selenium.Keys;

import com.Actions.CheckoutAction;
import com.Utilities.HelperClass;

import io.cucumber.java.en.*;

public class CheckoutStepDefinition {
	CheckoutAction objcheckout=new CheckoutAction();

@Given("the user is on the Web application")
public void the_user_is_on_the_web_application() {
	HelperClass.openPage("https://demowebshop.tricentis.com/");
    
}

@When("I log in and add an item and add to cart")
public void i_log_in_and_add_an_item_and_add_to_cart(io.cucumber.datatable.DataTable dataTable) {
	objcheckout.login();
	List<String> objList=dataTable.asList(String.class);
	String productName=objList.get(0);
	objcheckout.serachanitem(productName);
	objcheckout.addtocartanitem();
	
}

@When("click checkout the product")
public void click_checkout_the_product() {
	objcheckout.isselectedcheckbox();
    
}

@When("forgot to click the term & condition button")
public void forgot_to_click_the_term_condition_button() {
	
    objcheckout.selectcheckout();
}

@Then("the user should see the pop up windows as to click the terms&condition")
public void the_user_should_see_the_pop_up_windows_as_to_click_the_terms_condition() {
   objcheckout.assertmsgalert();
}


@When("checkout the product")
public void checkout_the_product() {
	objcheckout.clickcheckbox();
	objcheckout.selectcheckout();
   
}

@When("select  address and payment methods")
public void select_address_and_payment_methods() {
    objcheckout.selectaddresss();
    objcheckout.billcontinuebtn();
    objcheckout.storepickupbox();
    objcheckout.shippingcontinue();
    objcheckout.paymentcontinuestep();
    objcheckout.paymentinfocontinue();
}

@When("confirm order")
public void confirm_order() {
	objcheckout.confirmcheckout();
    
}

@Then("the user should see the order number and able to download the invoice as pdf")
public void the_user_should_see_the_order_number_and_able_to_download_the_invoice_as_pdf() {
    objcheckout.getplacedorder();
    objcheckout.invoicepdfdownload();
    objcheckout.pdfinvoiceclik();
}
@When("click the terms & conditions")
public void click_the_terms_conditions() {
	objcheckout.clickcheckbox();
}

@When("click the checkout button")
public void click_the_checkout_button() {
	objcheckout.selectcheckout();
}

@Then("the user should see the checkout page and billing details")
public void the_user_should_see_the_checkout_page_and_billing_details() {
    objcheckout.checkoutsteps();
}


@When("click the orders")
public void click_the_orders() {
	objcheckout.clickcheckbox();
	objcheckout.selectcheckout();
	objcheckout.selectaddresss();
    objcheckout.billcontinuebtn();
    objcheckout.storepickupbox();
    objcheckout.shippingcontinue();
    objcheckout.paymentcontinuestep();
    objcheckout.paymentinfocontinue();
    objcheckout.confirmcheckout();
	
    
}

@When("click the invoice pdf")
public void click_the_invoice_pdf() {
	
	 objcheckout.getplacedorder();
	 objcheckout.invoicepdfdownload();

}

@Then("the user should see the entire order details")
public void the_user_should_see_the_entire_order_details() {
    objcheckout.detailsinvoice();
}
@When("enter the billing address and click store pick")
public void enter_the_billing_address_and_click_store_pick() {
	objcheckout.clickcheckbox();
	objcheckout.selectcheckout();
	objcheckout.selectaddresss();
    objcheckout.billcontinuebtn();
    objcheckout.storepickupbox();
    objcheckout.shippingcontinue();
    objcheckout.paymentcontinuestep();
    objcheckout.paymentinfocontinue();
    
	
    
}

@When("Proceed and confirm order")
public void proceed_and_confirm_order() {
	objcheckout.confirmcheckout();
    
}

@Then("the user should see the order code successfully")
public void the_user_should_see_the_order_code_successfully() {
	objcheckout.getplacedorder();
    objcheckout.invoicepdfdownload();
}

@When("click the checkout button and proceed")
public void click_the_checkout_button_and_proceed() {
	objcheckout.clickcheckbox();
	objcheckout.selectcheckout();
	objcheckout.selectaddresss();
    objcheckout.billcontinuebtn();
    objcheckout.storepickupbox();
    objcheckout.shippingcontinue();
    
   
}

@When("select the credit card method and enter the required fields")
public void select_the_credit_card_method_and_enter_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
    objcheckout.creditcardcheckbox();
    objcheckout.paymentcontinuestep();
    List<String> objList=dataTable.asList(String.class);
	String name=objList.get(0);
	String number=objList.get(1);
	String expdate=objList.get(2);
	String code=objList.get(3);
	String year=objList.get(4);
	objcheckout.creditvisacard( name, number, expdate, code,year);
	
	
}

@When("proceed the details and confirm")
public void proceed_the_details_and_confirm() {
	objcheckout.paymentinfocontinue();
	objcheckout.confirmcheckout();
	objcheckout.getplacedorder();
   
}





}
