package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.Pages.ProductPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

public class ProductAction {
    ProductPage ProductPageLocator = null;
    String strusername, strpassword, urlexp;

    public ProductAction() {
        this.ProductPageLocator = new ProductPage();
        PageFactory.initElements(HelperClass.getDriver(), ProductPageLocator);
    }

    public void login() {
        ProductPageLocator.LoginButtonHomePage.click();
        ProductPageLocator.EmailField.sendKeys("abcggggg123@Gmail.com");
        ProductPageLocator.PasswordField.sendKeys("Divraj@1234");
        ProductPageLocator.LoginButtonSubmit.click();
        LogManagers.logInfo("Logged in with credentials: abcggggg123@Gmail.com / Divraj@1234");
    }

    public void searchFieldStore(String product) {
        ProductPageLocator.SearchStoreField.sendKeys(product + Keys.ENTER);
        LogManagers.logInfo("Searched for product: " + product);
    }

    public String getTitleOfProduct() {
        String title = ProductPageLocator.ProductTitle.getText();
        LogManagers.logInfo("Retrieved product title: " + title);
        return title;
    }

    public void clickAddToCart() {
        ProductPageLocator.AddToCart.click();
        LogManagers.logInfo("Clicked on 'Add to Cart' button.");
    }

    public void addToCartMessage() throws InterruptedException {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < 5000) {
        }
        String numberOfProduct = ProductPageLocator.AddTocartnumber.getText();
        LogManagers.logInfo("Number of products in cart: " + numberOfProduct);
    }

    public void shoppingCart() {
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Clicked on shopping cart link.");
        LogManagers.logInfo("Product in cart: " + ProductPageLocator.cartproductavailable.getText());
    }

    public void updateCartByRemove() {
        ProductPageLocator.removefromcart.click();
        ProductPageLocator.updatecart.click();
        LogManagers.logInfo("Updated cart by removing an item.");
    }

    public void emptyCarts() {
        String act = "\r\n" + "    \r\n" + "    \r\n" + "Your Shopping Cart is empty!    ";
        String exp = ProductPageLocator.emptycart.getText();
        LogManagers.logInfo("Empty cart message: " + exp);
    }

    public void addToWishlist() {
        ProductPageLocator.imgalbum3.click();
        ProductPageLocator.addtowishlist.click();
        ProductPageLocator.clickwishlist.click();
        LogManagers.logInfo("Added item to wishlist and clicked on wishlist.");
    }

    public void urlWishlist() {
        String wishlistUrl = ProductPageLocator.urlforwishlist.getText();
        LogManagers.logInfo("Wishlist URL for sharing: " + wishlistUrl);
        this.urlexp = wishlistUrl;
        ProductPageLocator.urlforwishlist.click();
    }

    public void urlAutoList() {
        String exp = HelperClass.getDriver().getCurrentUrl();
        LogManagers.logInfo("Current URL: " + exp);
        urlexp.contains(exp);
    }

    public void increaseQty() {
        ProductPageLocator.imgalbum3.click();
        ProductPageLocator.increaseqty.clear();
        ProductPageLocator.increaseqty.sendKeys("10");
        ProductPageLocator.addtocartinqty.click();
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Increased quantity to 10 and added to cart.");
    }

    public void updatedQtyInWishlist() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//table[@class=\"cart-total\"]//tr//td//span"));
        LogManagers.logInfo("Updated quantity in wishlist:");
        for (WebElement a : obj) {
            LogManagers.logInfo(a.getText());
        }
    }

    public void emailAFriend() {
        ProductPageLocator.giftcardpage.click();
        LogManagers.logInfo("Clicked on 'Email a friend' page.");
    }

    public void emailFriendButton() {
    	JavascriptExecutor obj=(JavascriptExecutor)HelperClass.getDriver();
    	WebElement element = HelperClass.getDriver().findElement(By.xpath("//input[@class='button-2 email-a-friend-button']"));
    	obj.executeScript("arguments[0].click();", element);
        ProductPageLocator.emailfriendbtn.click();
        LogManagers.logInfo("Clicked on 'Email a friend' button.");
    }

    public void emailFriendSend(String frdemail, String myemail) {
        ProductPageLocator.friendemail.sendKeys(frdemail);
        ProductPageLocator.myemail.clear();
        ProductPageLocator.myemail.sendKeys(myemail);
        LogManagers.logInfo("Entered friend's email: " + frdemail + " and your email: " + myemail);
    }

    public void sendMailFriend() {
        ProductPageLocator.sendmail.click();
        LogManagers.logInfo("Clicked on 'Send' button for email.");
    }

    public void successfulMailSend() {
        String act = "Your message has been sent.";
        String exp = ProductPageLocator.successfulsentmail.getText();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Email sent successfully: " + exp);
    }

    public void unsuccessfulMailSend() {
        String act = "Wrong email";
        String exp = ProductPageLocator.invalidemailmsg.getText();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Email send failed with message: " + exp);
    }

    public void addToCartCheckboxes() {
        ProductPageLocator.addtocartcheckbox.click();
        ProductPageLocator.addtocartbtnbelowchkbox.click();
        LogManagers.logInfo("Added item to cart using checkboxes.");
    }

    public void verifyTextInCart() {
        String textInCart = "3rd Album";
        String exp = ProductPageLocator.assertcartwishlist.getText();
        LogManagers.logInfo("Product in cart: " + exp);
    }

    public void addLaptopCart() {
        ProductPageLocator.SearchStoreField.sendKeys("laptop" + Keys.ENTER);
        ProductPageLocator.AddToCart.click();
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Added laptop to cart.");
    }

    public void countryPin(String country, String pincode) {
        Select dropdown = new Select(HelperClass.getDriver().findElement(By.xpath("//*[@id=\"CountryId\"]")));
        dropdown.selectByVisibleText(country);
        ProductPageLocator.zipcode.sendKeys(pincode);
        ProductPageLocator.shippingestimate.click();
        LogManagers.logInfo("Selected country: " + country + " and entered pincode: " + pincode);
    }

    public void estimateShippingDetails() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//ul[@class=\"shipping-results\"]//li//strong"));
        LogManagers.logInfo("Shipping estimate ways:");
        for (WebElement a : obj) {
            LogManagers.logInfo(a.getText());
        }
    }
}