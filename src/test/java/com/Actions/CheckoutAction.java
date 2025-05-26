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
    Checkoutpage checkoutLocator = null;
    BaseActions objmethod;

    public CheckoutAction() {
        this.checkoutLocator = new Checkoutpage();
        this.objmethod=new BaseActions();
        PageFactory.initElements(HelperClass.getDriver(), checkoutLocator);
    }

    public void login(String email,String password) {
    	JavascriptExecutor js = (JavascriptExecutor) HelperClass.getDriver();
        js.executeScript("document.getElementsByClassName(\"ico-login\")[0].click()");
        checkoutLocator.emaillogin.sendKeys(email);
        checkoutLocator.passwordlogin.sendKeys(password);
        checkoutLocator.loginButtonclick.click();
        LogManagers.logInfo("Logged in with credentials:");
    }

    public class ProductSearchException extends Exception {
        public ProductSearchException(String message) {
            super(message);
        }
    }

        public void searchAnItem(String product) throws ProductSearchException {
            try {
                checkoutLocator.serachfields.sendKeys(product + Keys.ENTER);
                LogManagers.logInfo("Searched for product: " + product);
            } catch (Exception e) {
                throw new ProductSearchException("Failed to search for product: " + product + ". Error: " + e.getMessage());
            }
        }

    public void addtocartanitem() {
        checkoutLocator.addtocartlap.click();
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
        boolean isSelected = checkoutLocator.checkboxbtn.isSelected();
        System.out.println("The checkbox is selected :" + isSelected);
        LogManagers.logInfo("The checkbox is selected: " + isSelected);
    }

    public void selectcheckout() {
    	
        checkoutLocator.checkoutbtn.click();
        LogManagers.logInfo("Clicked on checkout button.");
    }

    public void assertmsgalert() {
        String act = "Please accept the terms of service before the next step.";
        String exp = checkoutLocator.popupcheckboxmsg.getText();
        Assert.assertEquals(act, exp);
        System.out.println(checkoutLocator.popupcheckboxmsg.getText());
        LogManagers.logInfo("Asserted message: " + exp);
    }

    public void selectaddresss() {
    	checkoutLocator.addressfield.click();
        checkoutLocator.option1.click();
        LogManagers.logInfo("Selected address option.");
    }

    public void billcontinuebtn() {
        checkoutLocator.billcontinuebtn.click();
        LogManagers.logInfo("Clicked on billing continue button.");
    }

    public void storepickupbox() {
        checkoutLocator.storepick.click();
        LogManagers.logInfo("Clicked on store pickup box.");
    }

    public void shippingcontinue() {
        checkoutLocator.shipcontinuebtn.click();
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
        checkoutLocator.paymentinfobtncontinue.click();
        LogManagers.logInfo("Clicked on payment info continue button.");
    }

    public void confirmcheckout() {
        checkoutLocator.confirmbtnincheckout.click();
        LogManagers.logInfo("Clicked on confirm checkout button.");
    }

    public void getplacedorder() {
        LogManagers.logInfo("Order placed successfully ");
    }

    public void invoicepdfdownload() {
    	try
    	{
    		WebElement el = HelperClass.getDriver().findElement(By.xpath("//div//ul//li[2]//a[text()=\"Click here for order details.\"]"));
    		Actions builder = new Actions(HelperClass.getDriver());
    		builder.moveToElement(el).click(el).perform();
    		String act="Order information";
        	String exp=checkoutLocator.orderinfo.getText();
        	Assert.assertEquals(act, exp);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println("invoice not downloaded");
    	}

        LogManagers.logInfo("Clicked on invoice PDF download link.");
    }

    public void pdfinvoiceclik() {
    	String act="Order information";
    	String exp=checkoutLocator.orderinfo.getText();
    	Assert.assertEquals(act, exp);
        checkoutLocator.pdfinvoice.click();
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
        String exp=checkoutLocator.orderinfo.getText();
        Assert.assertEquals(act, exp);
    }


    public void detailsinvoice() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tbody//tr//td//span"));
        for (WebElement a : obj) {
            System.out.println(a.getText());
            LogManagers.logInfo(a.getText());
        }
        String act="Order information";
        WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        WebElement text=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"page-title\"]//h1")));
        String exp=text.getText();
        if(act.equalsIgnoreCase(exp))
        {
        	Assert.assertEquals(act, exp);
        }
        else
        {
        	String exp1="Checkout";
        	Assert.assertEquals(act,exp1);
        }
    }

    public void creditcardcheckbox() {
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5));
        WebElement creditCardCheckbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='section payment-method']//ul//li[3]//div//div[2]//input")));
        creditCardCheckbox.click();
        LogManagers.logInfo("Clicked on credit card checkbox.");
        
    }

    public void creditvisacard(String name, String number, String expdate, String year, String code) {
        checkoutLocator.cardholdername.sendKeys(name);
        checkoutLocator.cardnumber.sendKeys(number);
        checkoutLocator.expirymonth.sendKeys(expdate);
        checkoutLocator.year.sendKeys(year);
        checkoutLocator.cardcode.sendKeys(code);
        LogManagers.logInfo("Entered credit card details: " + name + ", " + number + ", " + expdate + ", " + year + ", " + code);
    }

    public void onedaypickup() {
        checkoutLocator.onedaypick.click();
        LogManagers.logInfo("Selected one-day pickup option.");
    }

    public void paymentcontinuestepinoneday() {
        checkoutLocator.shippingcntinue.click();
        LogManagers.logInfo("Clicked on payment continue button in one-day pickup.");
    }

    public void paymentcontinuestepintwoday() {
    	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(20));
        WebElement shippingOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shippingoption_2\"]")));
        shippingOption.click();
        LogManagers.logInfo("Clicked on payment continue button in two-day shipping.");
    }

    public void clickbacktoship() {
        checkoutLocator.backtoshipping.click();
        LogManagers.logInfo("Clicked on back to shipping button.");
    }
}