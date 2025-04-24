package com.Definitions;

import java.util.List;

import com.Actions.CheckoutAction;
import com.Actions.CheckoutAction.ProductSearchException;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.*;

public class CheckoutStepDefinition {
    CheckoutAction objcheckout = new CheckoutAction();

    @Given("the user is on the Web application")
    public void the_user_is_on_the_web_application() {
        try {
            HelperClass.openPage("https://demowebshop.tricentis.com/");
        } catch (Exception e) {
            LogManagers.logError("Failed to open the web application. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I log in and add an item and add to cart")
    public void i_log_in_and_add_an_item_and_add_to_cart(io.cucumber.datatable.DataTable dataTable) throws ProductSearchException {
        try {
            objcheckout.login();
            List<String> objList = dataTable.asList(String.class);
            String productName = objList.get(0);
            objcheckout.searchAnItem(productName);
            objcheckout.addtocartanitem();
        } catch (Exception e) {
            LogManagers.logError("Failed to log in, search for product, or add to cart. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click checkout the product")
    public void click_checkout_the_product() {
        try {
            objcheckout.isselectedcheckbox();
        } catch (Exception e) {
            LogManagers.logError("Failed to check if the terms of service checkbox is selected. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("forgot to click the term & condition button")
    public void forgot_to_click_the_term_condition_button() {
        try {
            objcheckout.selectcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to click on checkout button. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the pop up windows as to click the terms&condition")
    public void the_user_should_see_the_pop_up_windows_as_to_click_the_terms_condition() {
        try {
            objcheckout.assertmsgalert();
        } catch (Exception e) {
            LogManagers.logError("Failed to assert message alert. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("checkout the product")
    public void checkout_the_product() {
        try {
            objcheckout.clickcheckbox();
            objcheckout.selectcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the terms of service checkbox or checkout button. Error: " + e.getMessage());
            throw e;
            
        }
    }

    @When("select  address and payment methods")
    public void select_address_and_payment_methods() {
        try {
            objcheckout.selectaddresss();
            objcheckout.billcontinuebtn();
            objcheckout.storepickupbox();
            objcheckout.shippingcontinue();
            objcheckout.paymentcontinuestep();
            objcheckout.paymentinfocontinue();
        } catch (Exception e) {
            LogManagers.logError("Failed to select address and payment methods. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("confirm order")
    public void confirm_order() {
        try {
            objcheckout.confirmcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to confirm order. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the order number and able to download the invoice as pdf")
    public void the_user_should_see_the_order_number_and_able_to_download_the_invoice_as_pdf() {
        try {
            objcheckout.getplacedorder();
            objcheckout.invoicepdfdownload();
            objcheckout.pdfinvoiceclik();
        } catch (Exception e) {
            LogManagers.logError("Failed to get placed order or download invoice as PDF. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the terms & conditions")
    public void click_the_terms_conditions() {
        try {
            objcheckout.clickcheckbox();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the terms & conditions. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the checkout button")
    public void click_the_checkout_button() {
        try {
            objcheckout.selectcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the checkout button. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the checkout page and billing details")
    public void the_user_should_see_the_checkout_page_and_billing_details() {
        try {
            objcheckout.checkoutsteps();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the checkout page and billing details. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the orders")
    public void click_the_orders() {
        try {
            objcheckout.clickcheckbox();
            objcheckout.selectcheckout();
            objcheckout.selectaddresss();
            objcheckout.billcontinuebtn();
            //objcheckout.storepickupbox();
            objcheckout.shippingcontinue();
            objcheckout.paymentcontinuestep();
            objcheckout.paymentinfocontinue();
            objcheckout.confirmcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the orders. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the invoice pdf")
    public void click_the_invoice_pdf() {
        try {
            HelperClass.getDriver().navigate().refresh();
            objcheckout.getplacedorder();
            objcheckout.invoicepdfdownload();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the invoice pdf. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the entire order details")
    public void the_user_should_see_the_entire_order_details() {
        try {
            objcheckout.detailsinvoice();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the entire order details. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("enter the billing address and click store pick")
    public void enter_the_billing_address_and_click_store_pick() {
        try {
            objcheckout.clickcheckbox();
            objcheckout.selectcheckout();
            objcheckout.selectaddresss();
            objcheckout.billcontinuebtn();
            objcheckout.storepickupbox();
            objcheckout.shippingcontinue();
            objcheckout.paymentcontinuestep();
            objcheckout.paymentinfocontinue();
        } catch (Exception e) {
            LogManagers.logError("Failed to enter the billing address and click store pick. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("Proceed and confirm order")
    public void proceed_and_confirm_order() {
        try {
            objcheckout.confirmcheckout();
        } catch (Exception e) {
            LogManagers.logError("Failed to proceed and confirm order. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("the user should see the order code successfully")
    public void the_user_should_see_the_order_code_successfully() {
        try {
            objcheckout.getplacedorder();
            objcheckout.invoicepdfdownload();
        } catch (Exception e) {
            LogManagers.logError("Failed to see the order code successfully. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the checkout button and proceed")
    public void click_the_checkout_button_and_proceed() {
        try {
            objcheckout.clickcheckbox();
            objcheckout.selectcheckout();
            objcheckout.selectaddresss();
            objcheckout.billcontinuebtn();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the checkout button and proceed. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("select the credit card method and enter the required fields")
    public void select_the_credit_card_method_and_enter_the_required_fields(io.cucumber.datatable.DataTable dataTable) {
        try {
            objcheckout.creditcardcheckbox();
            objcheckout.paymentcontinuestep();
            List<String> objList = dataTable.asList(String.class);
            String name = objList.get(0);
            String number = objList.get(1);
            String expdate = objList.get(2);
            String code = objList.get(3);
            String year = objList.get(4);
            objcheckout.creditvisacard(name, number, expdate, code, year);
        } catch (Exception e) {
            LogManagers.logError("Failed to select the credit card method and enter the required fields. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("proceed the details and confirm")
    public void proceed_the_details_and_confirm() {
        try {
            objcheckout.paymentinfocontinue();
            objcheckout.confirmcheckout();
            objcheckout.getplacedorder();
        } catch (Exception e) {
            LogManagers.logError("Failed to proceed the details and confirm. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click the checkout buttons and proceed")
    public void click_the_checkout_buttons_and_proceed() {
        try {
            objcheckout.clickcheckbox();
            objcheckout.selectcheckout();
           // objcheckout.selectaddresss();
            objcheckout.billcontinuebtn();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the checkout buttons and proceed. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("select the one day shipping as Next Day Air")
    public void select_the_one_day_shipping_as_next_day_air() {
        try {
            objcheckout.shippingcontinue();
            objcheckout.onedaypickup();
        } catch (Exception e) {
            LogManagers.logError("Failed to select the one day shipping as Next Day Air. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("proceed the further details")
    public void proceed_the_further_details() {
        try {
            objcheckout.paymentcontinuestepinoneday();
            objcheckout.paymentcontinuestep();
            objcheckout.paymentinfocontinue();
            objcheckout.confirmcheckout();
            objcheckout.getplacedorder();
        } catch (Exception e) {
            LogManagers.logError("Failed to proceed the further details. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("select the two day shipping as two Day Air")
    public void select_the_two_day_shipping_as_two_day_air() {
        try {
            objcheckout.shippingcontinue();
           // objcheckout.paymentcontinuestepintwoday();
        } catch (Exception e) {
            LogManagers.logError("Failed to select the two day shipping as two Day Air. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("select back and click the store pickup")
    public void select_back_and_click_the_store_pickup() {
        try {
            objcheckout.shippingcontinue();
            objcheckout.clickbacktoship();
            objcheckout.storepickupbox();
            objcheckout.shippingcontinue();
        } catch (Exception e) {
            LogManagers.logError("Failed to select back and click the store pickup. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("proceed the remaining steps and confirm")
    public void proceed_the_remaining_steps_and_confirm() {
        try {
            objcheckout.paymentcontinuestep();
            objcheckout.paymentinfocontinue();
            objcheckout.confirmcheckout();
            objcheckout.getplacedorder();
        } catch (Exception e) {
            LogManagers.logError("Failed to proceed the remaining steps and confirm. Error: " + e.getMessage());
            throw e;
        }
    }
}