package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.Pages.NextandPreviousPage;
import com.Utilities.HelperClass;

public class NextandPreviousAction {
    NextandPreviousPage nextandPreviousPage;
    private WebDriver driver;

    public NextandPreviousAction() {
        this.driver = HelperClass.getDriver();
        this.nextandPreviousPage = new NextandPreviousPage();
        PageFactory.initElements(driver, nextandPreviousPage);
    }

    public void clickApparelShoes() {
        nextandPreviousPage.clickapparelShoes.click();
    }

    public void clickNextButton() {
        nextandPreviousPage.clickNext.click();
    }

    public void clickPreviousButton() {
        nextandPreviousPage.clickPrevious.click();
    }

    public boolean isProductDisplayed(String productName) {
        try {
            WebElement product = driver.findElement(By.xpath("//a[contains(text(), \"" + productName + "\")]"));
            return product.isDisplayed();
        } catch (Exception e) {
            System.err.println("Product not found: " + productName);
            e.printStackTrace();
            return false;
        }
    }
}