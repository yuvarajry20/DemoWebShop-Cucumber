package com.Definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

import com.Actions.NextandPreviousAction;

public class NextandPreviousStepDefinition {
    NextandPreviousAction nextandPreviousAction;

    public NextandPreviousStepDefinition() {
        this.nextandPreviousAction = new NextandPreviousAction();
    }

    @When("I click on the Apparel and Shoes")
    public void i_click_on_the_apparel_and_shoes() {
        nextandPreviousAction.clickApparelShoes();
    }

    @When("I click the next button")
    public void i_click_the_next_button() {
        nextandPreviousAction.clickNextButton();
    }

    @Then("I should be able to see the corresponding product")
    public void i_should_be_able_to_see_the_corresponding_product(DataTable dataTable) {
        List<Map<String, String>> products = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> product : products) {
            String productName = product.get("product");
            if (!nextandPreviousAction.isProductDisplayed(productName)) {
                throw new AssertionError("Product " + productName + " is not displayed.");
            }
        }
    }

    @Then("if i click the previous button")
    public void if_i_click_the_previous_button() {
        nextandPreviousAction.clickPreviousButton();
    }
}