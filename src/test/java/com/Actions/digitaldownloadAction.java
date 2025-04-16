package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Digitaldownloadpage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class digitaldownloadAction {
    Digitaldownloadpage objdigital = null;

    public digitaldownloadAction() {
        this.objdigital = new Digitaldownloadpage();
        PageFactory.initElements(HelperClass.getDriver(), objdigital);
    }

    public void Digitaldownload() {
        objdigital.digitaldown.click();
        LogManagers.logInfo("Clicked on 'Digital downloads' link.");
    }

    public void Assertheading() {
        String act = "Digital downloads";
        String exp = objdigital.headingofdigital.getText();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Asserted heading: " + exp);
    }

    public void addtocartmusic() {
        objdigital.music2.click();
        LogManagers.logInfo("Added music album to cart.");
    }

    public void qtyproduct() {
        String text = objdigital.qtyproductcount.getText();
        System.out.println("the number of product in cart :" + text);
        LogManagers.logInfo("Number of products in cart: " + text);
    }

    public void addfilter() {
        objdigital.grid.click();
        objdigital.gridopt.click();
        LogManagers.logInfo("Applied grid filter.");
    }

    public void listallproducts() {
        List<WebElement> product = HelperClass.getDriver().findElements(By.xpath("//h2[@class=\"product-title\"]//a"));
        System.out.println("the products in the digital download");
        LogManagers.logInfo("Listing all products in the digital download:");
        for (WebElement a : product) {
            System.out.println(a.getText());
            LogManagers.logInfo("- " + a.getText());
        }
    }
}