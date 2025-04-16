package com.Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.Checkoutpage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class CheckoutAction {
    Checkoutpage CheckoutLocator = null;

    public CheckoutAction() {
        this.CheckoutLocator = new Checkoutpage();
        PageFactory.initElements(HelperClass.getDriver(), CheckoutLocator);
    }

    public void login() {
        CheckoutLocator.LoginButtonHomePages.click();
        CheckoutLocator.Emaillogin.sendKeys("abcggggg123@Gmail.com");
        CheckoutLocator.Passwordlogin.sendKeys("Divraj@1234");
        CheckoutLocator.LoginButtonclick.click();
        LogManagers.logInfo("Logged in with credentials: abcggggg123@Gmail.com / Divraj@1234");
    }

    public void serachanitem(String product) {
        CheckoutLocator.serachfields.sendKeys(product + Keys.ENTER);
        LogManagers.logInfo("Searched for product: " + product);
    }

    public void addtocartanitem() {
        CheckoutLocator.addtocartlap.click();
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Added item to cart and clicked cart link.");
    }

    public void clickcheckbox() {
    	HelperClass.getDriver().navigate().refresh();
        WebElement el = HelperClass.getDriver().findElement(By.xpath("//div[@class=\"terms-of-service\"]//input"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Clicked the terms of service checkbox.");
    }

    public void isselectedcheckbox() {
        boolean isSelected = CheckoutLocator.checkboxbtn.isSelected();
        System.out.println("The checkbox is selected :" + isSelected);
        LogManagers.logInfo("The checkbox is selected: " + isSelected);
    }

    public void selectcheckout() {
        CheckoutLocator.checkoutbtn.click();
        LogManagers.logInfo("Clicked on checkout button.");
    }

    public void assertmsgalert() {
        String act = "Please accept the terms of service before the next step.";
        String exp = CheckoutLocator.popupcheckboxmsg.getText();
        Assert.assertEquals(act, exp);
        System.out.println(CheckoutLocator.popupcheckboxmsg.getText());
        LogManagers.logInfo("Asserted message: " + exp);
    }

    public void selectaddresss() {
    	JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
        js.executeScript("document.querySelector('select#billing-address-select').click();");
        //CheckoutLocator.addressfield.click();
        CheckoutLocator.option1.click();
        LogManagers.logInfo("Selected address option.");
    }

    public void billcontinuebtn() {
        CheckoutLocator.billcontinuebtn.click();
        LogManagers.logInfo("Clicked on billing continue button.");
    }

    public void storepickupbox() {
        CheckoutLocator.storepick.click();
        LogManagers.logInfo("Clicked on store pickup box.");
    }

    public void shippingcontinue() {
        CheckoutLocator.shipcontinuebtn.click();
        LogManagers.logInfo("Clicked on shipping continue button.");
    }

    public void paymentcontinuestep() {
        CheckoutLocator.paymentcontinue.click();
        LogManagers.logInfo("Clicked on payment continue button.");
    }

    public void paymentinfocontinue() {
        CheckoutLocator.paymentinfobtncontinue.click();
        LogManagers.logInfo("Clicked on payment info continue button.");
    }

    public void confirmcheckout() {
        CheckoutLocator.confirmbtnincheckout.click();
        LogManagers.logInfo("Clicked on confirm checkout button.");
    }

    public void getplacedorder() {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='section order-completed']//div[@class='title']//strong")));
        System.out.println(elements.getText());
        String act = "Your order has been successfully processed!";
        String exp = elements.getText();
        Assert.assertEquals(act, exp);
        System.out.println(elements.getText());
        LogManagers.logInfo("Order placed successfully: " + exp);
    }

    public void invoicepdfdownload() {
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(25));
        WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"section order-completed\"]//ul//li[2]//a")));
        elements.click();

        LogManagers.logInfo("Clicked on invoice PDF download link.");
    }

    public void pdfinvoiceclik() {
        CheckoutLocator.pdfinvoice.click();
        LogManagers.logInfo("Clicked on PDF invoice link.");
    }

    public void checkoutsteps() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//div[@class=\"page-body checkout-data\"]//ol//li//div//h2"));
        System.out.println("Follow this steps to checkout");
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo(a.getText());
        }
    }

    public void detailsinvoice() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tbody//tr//td//span"));
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo(a.getText());
        }
    }

    public void creditcardcheckbox() {
    	JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
        js.executeScript("document.querySelector('div.section.payment-method > ul > li:nth-child(3) > div > div:nth-child(2) > input').click();");
        LogManagers.logInfo("Clicked on credit card checkbox.");
    }

    public void creditvisacard(String name, String number, String expdate, String year, String code) {
        CheckoutLocator.cardholdername.sendKeys(name);
        CheckoutLocator.cardnumber.sendKeys(number);
        CheckoutLocator.expirymonth.sendKeys(expdate);
        CheckoutLocator.year.sendKeys(year);
        CheckoutLocator.cardcode.sendKeys(code);
        LogManagers.logInfo("Entered credit card details: " + name + ", " + number + ", " + expdate + ", " + year + ", " + code);
    }

    public void onedaypickup() {
        CheckoutLocator.onedaypick.click();
        LogManagers.logInfo("Selected one-day pickup option.");
    }

    public void paymentcontinuestepinoneday() {
        CheckoutLocator.shippingcntinue.click();
        LogManagers.logInfo("Clicked on payment continue button in one-day pickup.");
    }

    public void paymentcontinuestepintwoday() {
        CheckoutLocator.twodayshipping.click();
        LogManagers.logInfo("Clicked on payment continue button in two-day shipping.");
    }

    public void clickbacktoship() {
        CheckoutLocator.backtoshipping.click();
        LogManagers.logInfo("Clicked on back to shipping button.");
    }
}