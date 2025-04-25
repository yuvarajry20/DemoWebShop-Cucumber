package com.Definitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Actions.AddressAction;
import com.Actions.LoginAction;
import com.Actions.MyAccountSectionAction;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountStepDefinition {
    LoginAction loginAction = new LoginAction();
    AddressAction addressAction = new AddressAction();
    MyAccountSectionAction accountSectionAction = new MyAccountSectionAction();
    WebDriver driver = HelperClass.getDriver();

    @When("I provide email and password")
    public void i_provide_email_and_password(io.cucumber.datatable.DataTable dataTable) {
        try {
            List<Map<String, String>> rows = dataTable.asMaps();
            String email = rows.get(0).get("email");
            String password = rows.get(0).get("password");
            loginAction.enterEmail(email);
            loginAction.enterPassword(password);
        } catch (Exception e) {
            LogManagers.logError("Failed to provide email and password. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("click log in")
    public void click_log_in() {
        try {
            loginAction.clickLoginLink();
        } catch (Exception e) {
            LogManagers.logError("Failed to click log in. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("I click my email")
    public void i_click_my_email() {
        try {
            addressAction.clickMyEmail();
        } catch (Exception e) {
            LogManagers.logError("Failed to click my email. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("I want to click change Password")
    public void i_want_to_click_change_password() {
        try {
            accountSectionAction.clickChangePassword();
        } catch (Exception e) {
            LogManagers.logError("Failed to click change Password. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i provide oldPassword as {string}")
    public void i_provide_old_password_as(String string) {
        try {
            accountSectionAction.enterOldPassword(string);
        } catch (Exception e) {
            LogManagers.logError("Failed to provide oldPassword. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i provide newPassword as {string} and confirmPassword as {string}")
    public void i_provide_new_password_as_and_confirm_password_as(String string, String string2) {
        try {
            accountSectionAction.enterNewConfirmPassword(string, string2);
        } catch (Exception e) {
            LogManagers.logError("Failed to provide newPassword and confirmPassword. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i click change Password {string}")
    public void i_click_change_password(String string) {
        try {
            accountSectionAction.changePassword();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            if (string.contains("Password was changed")) {
                By passlocator = By.xpath("//div[@class=\"result\"]");
                WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(passlocator));
                String text = result.getText();
                String actual = "Password was changed";
                Assert.assertEquals(actual, text);
            } else {
                By passloca1 = By.xpath("//li[text()=\"Old password doesn't match\"]");
                WebElement result1 = wait.until(ExpectedConditions.visibilityOfElementLocated(passloca1));
                String actual = result1.getText();
                Assert.assertEquals(actual, string);
            }
        } catch (Exception e) {
            LogManagers.logError("Failed to click change Password. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i provide invalid oldPassword as {string}")
    public void i_provide_invalid_old_password_as(String string) {
        try {
            accountSectionAction.enterOldPassword(string);
        } catch (Exception e) {
            LogManagers.logError("Failed to provide invalid oldPassword. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click orders")
    public void i_click_orders() {
        try {
            accountSectionAction.clickOrders();
        } catch (Exception e) {
            LogManagers.logError("Failed to click orders. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i want to see Order number")
    public void i_want_to_see_order_number() {
        try {
            System.out.println(accountSectionAction.getOrder());
        } catch (Exception e) {
            LogManagers.logError("Failed to see Order number. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i want to see Order Date")
    public void i_want_to_see_order_date() {
        try {
            System.out.println(accountSectionAction.getOrderDate());
        } catch (Exception e) {
            LogManagers.logError("Failed to see Order Date. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click Details")
    public void i_click_details() {
        try {
            accountSectionAction.clickOrderDetails();
        } catch (Exception e) {
            LogManagers.logError("Failed to click Details. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i want to see Products name")
    public void i_want_to_see_products_name() {
        try {
            System.out.println(accountSectionAction.getProductName());
        } catch (Exception e) {
            LogManagers.logError("Failed to see Products name. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click Back in stock subscriptions")
    public void i_click_back_in_stock_subscriptions() {
        try {
            accountSectionAction.clickBackInStock();
        } catch (Exception e) {
            LogManagers.logError("Failed to click Back in stock subscriptions. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i should see the currently subscribed lists")
    public void i_should_see_the_currently_subscribed_lists() {
        try {
            System.out.println(accountSectionAction.getBackInStockText());
        } catch (Exception e) {
            LogManagers.logError("Failed to see the currently subscribed lists. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click Reward points")
    public void i_click_reward_points() {
        try {
            accountSectionAction.clickRewardPoints();
        } catch (Exception e) {
            LogManagers.logError("Failed to click Reward points. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i should see the current balance of Reward points")
    public void i_should_see_the_current_balance_of_reward_points() {
        try {
            System.out.println(accountSectionAction.getCurrentRewardPoints());
        } catch (Exception e) {
            LogManagers.logError("Failed to see the current balance of Reward points. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i should see the History")
    public void i_should_see_the_history() {
        try {
            System.out.println(accountSectionAction.getHistoryRewardPoints());
        } catch (Exception e) {
            LogManagers.logError("Failed to see the History. Error: " + e.getMessage());
            throw e;
        }
    }

    @When("i click the Customer Info")
    public void i_click_the_customer_info() {
        try {
            accountSectionAction.clickCustomerInfo();
        } catch (Exception e) {
            LogManagers.logError("Failed to click the Customer Info. Error: " + e.getMessage());
            throw e;
        }
    }

    @Then("i should see the FirstName, LastName and Email")
    public void i_should_see_the_first_name_last_name_and_email() {
        try {
            System.out.println(accountSectionAction.getFirstName());
            System.out.println(accountSectionAction.getLastName());
            System.out.println(accountSectionAction.getEmail());
        } catch (Exception e) {
            LogManagers.logError("Failed to see the FirstName, LastName and Email. Error: " + e.getMessage());
            throw e;
        }
    }
}