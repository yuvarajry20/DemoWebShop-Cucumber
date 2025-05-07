package com.Definitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Utilities.HelperClass;

import io.cucumber.java.en.Then;

public class HomePageLinksStepDefinition {
	
	@Then("I can validate the TestLinks")
	public void i_can_validate_the_test_links() {
	    // Write code here that turns the phrase above into concrete actions
	    try {
	    	List<WebElement> links = HelperClass.getDriver().findElements(By.tagName("a"));
//	    	List<WebElement> links = HelperClass.getDriver().findElements(By.xpath("//div[@class=\"column follow-us\"]//a"));
            System.out.println("Number of links: " + links.size());
            for (WebElement link : links) {
                String url = link.getAttribute("href");
                if (url != null && !url.isEmpty()) {
                    verifyUrl(url);
                }
                
            }
	    } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
	
	public static void verifyUrl(String url) {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.connect();

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                System.out.println(url + " - " + connection.getResponseMessage());
            } else {
                System.out.println(url + " - " + connection.getResponseMessage() + " is a broken link.");
            }
//            Assert.assertEquals(200, responseCode);
        } catch (IOException e) {
            System.out.println(url + " - is a broken link.");
        }
    }
}
