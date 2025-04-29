package com.Definitions;

import com.Actions.CustomerServiceAction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerServiceStepDefinition {
    CustomerServiceAction customerServiceAction = new CustomerServiceAction();

    @When("I click the news link in customer service")
    public void i_click_the_news_link_in_customer_service() {
        customerServiceAction.clickNewsLink();
    }

    @Then("I can see the latest news for the website")
    public void i_can_see_the_latest_news_for_the_website() {
        String text = customerServiceAction.getLatestNewsText();
        System.out.println(text);
    }

    @When("i click the blog link in customer service")
    public void i_click_the_blog_link_in_customer_service() {
        customerServiceAction.clickBlogLink();
    }

    @Then("i can see the blog title")
    public void i_can_see_the_blog_title() {
        String blogTitle = customerServiceAction.getBlogTitleText();
        System.out.println(blogTitle);
    }

    @Then("i click the first blog")
    public void i_click_the_first_blog() {
        customerServiceAction.clickFirstBlog();
    }

    @Then("i can add an comment and click new comment")
    public void i_can_add_an_comment_and_click_new_comment() {
        customerServiceAction.addComment("This is a test comment.");
        customerServiceAction.clickNewComment();
    }

    @Then("i can see the outcome")
    public void i_can_see_the_outcome() {
        String resultText = customerServiceAction.getResultText();
        org.testng.Assert.assertEquals("Blog comment is successfully added.", resultText);
        System.out.println(resultText);
    }
}