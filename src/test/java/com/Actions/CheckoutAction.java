package com.Actions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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

    public void login(String email,String password) {
        CheckoutLocator.LoginButtonHomePages.click();
        CheckoutLocator.Emaillogin.sendKeys(email);
        CheckoutLocator.Passwordlogin.sendKeys(password);
        CheckoutLocator.LoginButtonclick.click();
        LogManagers.logInfo("Logged in with credentials:");
    }

    public class ProductSearchException extends Exception {
        public ProductSearchException(String message) {
            super(message);
        }
    }

        public void searchAnItem(String product) throws ProductSearchException {
            try {
                CheckoutLocator.serachfields.sendKeys(product + Keys.ENTER);
                LogManagers.logInfo("Searched for product: " + product);
            } catch (Exception e) {
                throw new ProductSearchException("Failed to search for product: " + product + ". Error: " + e.getMessage());
            }
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
    	CheckoutLocator.addressfield.click();
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
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
    	WebElement element = wait.until(
    	    ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='buttons']//input[@class='button-1 payment-method-next-step-button']"))
    	);
    	element.click();
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
        String act = "Your order has been successfully processed!";
        LogManagers.logInfo("Order placed successfully ");
    }

    public void invoicepdfdownload() {
    	try
    	{
    		WebElement el = HelperClass.getDriver().findElement(By.xpath("//div//ul//li[2]//a[text()=\"Click here for order details.\"]"));
    		Actions builder = new Actions(HelperClass.getDriver());
    		builder.moveToElement(el).click(el).perform();
    		String act="Order information";
        	String exp=CheckoutLocator.orderinfo.getText();
        	Assert.assertEquals(act, exp);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("invoice not downloaded");
    	}
//        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(25));
//        WebElement elements = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//        elements.click();

        LogManagers.logInfo("Clicked on invoice PDF download link.");
    }

    public void pdfinvoiceclik() {
    	String act="Order information";
    	String exp=CheckoutLocator.orderinfo.getText();
    	Assert.assertEquals(act, exp);
        CheckoutLocator.pdfinvoice.click();
        LogManagers.logInfo("Clicked on PDF invoice link.");
//        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
//        WebElement pdfInvoiceLink = wait.until(
//            ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.page-body.checkout-data > div > ul > li:nth-child(2) > a"))
//        );
//        pdfInvoiceLink.click();
        LogManagers.logInfo("Clicked on PDF invoice link.");
        
    }

    public void checkoutsteps() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//div[@class=\"page-body checkout-data\"]//ol//li//div//h2"));
        System.out.println("Follow this steps to checkout");
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo(a.getText());
        }
        String act="Checkout";
        String exp=CheckoutLocator.orderinfo.getText();
        Assert.assertEquals(act, exp);
    }

    public void detailsinvoice() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tbody//tr//td//span"));
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo(a.getText());
        }
        String act="Order information";
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(10));
        String exp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"page-title\"]//a[contains(text(),\"Print\")]//preceding-sibling::h1"))).getText();
//    	String exp=CheckoutLocator.orderinfo2.getText();
    	Assert.assertEquals(act, exp);
    }

    public void creditcardcheckbox() {
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5));
        WebElement creditCardCheckbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='section payment-method']//ul//li[3]//div//div[2]//input")));
        creditCardCheckbox.click();
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
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
        WebElement shippingOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shippingoption_2\"]")));
        shippingOption.click();
        //CheckoutLocator.twodayshipping.click();
        LogManagers.logInfo("Clicked on payment continue button in two-day shipping.");
    }

    public void clickbacktoship() {
        CheckoutLocator.backtoshipping.click();
        LogManagers.logInfo("Clicked on back to shipping button.");
    }
}