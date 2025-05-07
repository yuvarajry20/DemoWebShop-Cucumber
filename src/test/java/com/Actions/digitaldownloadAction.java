package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pages.Digitaldownloadpage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class digitaldownloadAction {
    Digitaldownloadpage objdigital = null;
    BaseActions objmethod;

    public digitaldownloadAction() {
        this.objdigital = new Digitaldownloadpage();
        this.objmethod=new BaseActions();
        PageFactory.initElements(HelperClass.getDriver(), objdigital);
    }

    public void Digitaldownload() {
    	objmethod.clickMethod(objdigital.digitaldown);
//        objdigital.digitaldown.click();
        LogManagers.logInfo("Clicked on 'Digital downloads' link.");
    }

    public void Assertheading() {
        String act = "Digital downloads";
        String exp = objdigital.headingofdigital.getText();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Asserted heading: " + exp);
    }

    public void addtocartmusic() {
    	objmethod.clickMethod(objdigital.music2);
//        objdigital.music2.click();
        LogManagers.logInfo("Added music album to cart.");
    }

    public void qtyproduct() {
        String text = objdigital.qtyproductcount.getText();
        LogManagers.logInfo("Number of products in cart: " + text);
        String act = "Digital downloads";
        String exp = objdigital.headingofdigital.getText();
        Assert.assertEquals(act, exp);
    }

    public void addfilter() {
    	objmethod.clickMethod(objdigital.grid);
    	objmethod.clickMethod(objdigital.gridopt);
//        objdigital.grid.click();
//        objdigital.gridopt.click();
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
        String act = "Digital downloads";
        String exp = objdigital.headingofdigital.getText();
        Assert.assertEquals(act, exp);
        
    }
}