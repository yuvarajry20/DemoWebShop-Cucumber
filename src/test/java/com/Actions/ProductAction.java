package com.Actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pages.ProductPage;
import com.Utilities.HelperClass;
import com.Utilities.LogManagers;

import lombok.experimental.Helper;

public class ProductAction {
    ProductPage ProductPageLocator = null;
    BaseActions objmethod;
    String strusername, strpassword, urlexp;

    public ProductAction() {
        this.ProductPageLocator = new ProductPage();
        this.objmethod=new BaseActions();
        PageFactory.initElements(HelperClass.getDriver(), ProductPageLocator);
    }

    public void login() {
        ProductPageLocator.loginButtonHomePage.click();
        ProductPageLocator.emailField.sendKeys("abcggggg123@Gmail.com");
        ProductPageLocator.PasswordField.sendKeys("Divraj@1234");
        objmethod.clickMethod(ProductPageLocator.loginButtonSubmit);
        LogManagers.logInfo("Logged in with credentials: abcggggg123@Gmail.com / Divraj@1234");
    }

    public void searchFieldStore(String product) {
        ProductPageLocator.searchStoreField.sendKeys(product + Keys.ENTER);
        LogManagers.logInfo("Searched for product: " + product);
    }

    public String getTitleOfProduct() {
        String title = ProductPageLocator.productTitle.getText();
        LogManagers.logInfo("Retrieved product title: " + title);
        return title;
    }

    public void clickAddToCart() {

        objmethod.clickMethod(ProductPageLocator.addToCart);
        LogManagers.logInfo("Clicked on 'Add to Cart' button.");
    }

    public void addToCartMessage() throws InterruptedException {
        String numberOfProduct = ProductPageLocator.addTocartnumber.getText();
        String act="The product has been added to your shopping cart";
        String exp=ProductPageLocator.assertnotification.getText();
        Assert.assertEquals(act, exp);
        LogManagers.logInfo("Number of products in cart: " + numberOfProduct);
    }

    public void shoppingCart() 
    {
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Clicked on shopping cart link.");
//        LogManagers.logInfo("Product in cart: " + ProductPageLocator.cartproductavailable.getText());
    }

    public void updateCartByRemove() {
    	objmethod.clickMethod(ProductPageLocator.removefromcart);
    	objmethod.clickMethod(ProductPageLocator.updatecart);

        LogManagers.logInfo("Updated cart by removing an item.");
    }

    public void emptyCarts() {
        String act ="Your Shopping Cart is empty!";
        String exp = ProductPageLocator.emptycart.getText();
        Assert.assertEquals(act, exp);;
        LogManagers.logInfo("Empty cart message: " + exp);
    }

    public void addToWishlist() {
    	objmethod.clickMethod(ProductPageLocator.imgalbum3);
    	objmethod.clickMethod(ProductPageLocator.addtowishlist);
    	objmethod.clickMethod(ProductPageLocator.clickwishlist);
        LogManagers.logInfo("Added item to wishlist and clicked on wishlist.");
    }

    public void urlWishlist() {
        // Define the locator
//        By wishlistLocator = By.xpath("//div[@class='share-info']//p//a[@class='share-link']");

        try {
        	WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
        	WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("share-link")));
        	String wishlistUrl = link.getText();
        	LogManagers.logInfo("Wishlist URL for sharing: " + wishlistUrl);
            
//            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
//            WebElement wishlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(wishlistLocator));
//        	WebElement link=HelperClass.getDriver().findElement(By.className("share-link"));
//            String wishlistUrl = link.getText();
//            LogManagers.logInfo("Wishlist URL for sharing: " + wishlistUrl);
        } catch (Exception e) {
            LogManagers.logError("Failed to retrieve Wishlist URL: " + e.getMessage());
            e.printStackTrace();
        }
    }


    public void urlAutoList() {
        try {

//            By urlSharingLocator = By.xpath("//div[@class=\"share-info\"]//child::p//span");
//
//            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
//            WebElement urlSharingElement = wait.until(ExpectedConditions.visibilityOfElementLocated(urlSharingLocator));
            String act = "https://demowebshop.tricentis.com/wishlist";
            
            String exp = HelperClass.getDriver().getCurrentUrl();

            Assert.assertEquals(act, exp, "Wishlist URL text does not match");

            LogManagers.logInfo("Current page: " + exp);

        } catch (Exception e) {
            LogManagers.logError("Failed to retrieve wishlist URL: " + e.getMessage());
            throw e;
        }
    }

    public void increaseQty() {
    	objmethod.clickMethod(ProductPageLocator.imgalbum3);
        ProductPageLocator.increaseqty.clear();
        ProductPageLocator.increaseqty.sendKeys("10");
        objmethod.clickMethod(ProductPageLocator.addtocartinqty);
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Increased quantity to 10 and added to cart.");
    }

    public void updatedQtyInWishlist() {
    	
    	List<WebElement> rows=HelperClass.getDriver().findElements(By.xpath("//table[@class='cart-total']//tr"));
    	int row=rows.size();
    	int col=2;
    	for(int i=1;i<row+1;i++)
    	{
    		for(int j=1;j<col+1;j++) {
    			if(j%2!=0)
    			{
    				WebElement data=HelperClass.getDriver().findElement(By.xpath("//table[@class='cart-total']//tr["+i+"]//td["+j+"]//child::span[1]"));
        			System.out.print(data.getText());
    			}
    			else
    			{
    				WebElement data=HelperClass.getDriver().findElement(By.xpath("//table[@class='cart-total']//tr["+i+"]//td["+j+"]//child::span//span"));
        			System.out.print(data.getText());
    			}
    			
    			
    		}
    		System.out.println();
    	}
        LogManagers.logInfo("Updated quantity in wishlist:");
        String act="10.00";
        String exp=ProductPageLocator.qtyten.getText();
        Assert.assertEquals(act, exp);
        
    }

    public void emailAFriend() {
    	objmethod.clickMethod(ProductPageLocator.giftcardpage);
        LogManagers.logInfo("Clicked on 'Email a friend' page.");
    }

    public void emailFriendButton() {
    	objmethod.clickMethod(ProductPageLocator.emailfriendbtn);
        LogManagers.logInfo("Clicked on 'Email a friend' button.");
    }

    public void emailFriendSend(String frdemail, String myemail) {
        ProductPageLocator.friendemail.sendKeys(frdemail);
        ProductPageLocator.myemail.clear();
        ProductPageLocator.myemail.sendKeys(myemail);
        LogManagers.logInfo("Entered friend's email: " + frdemail + " and your email: " + myemail);
    }

    public void sendMailFriend() {
    	objmethod.clickMethod(ProductPageLocator.sendmail);
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
        try {
        	HelperClass.getDriver().navigate().refresh();
            By checkboxLocator = By.xpath("//form//table//tbody//tr//td[2]//input");
            By addToCartButtonLocator = By.xpath("//input[@class=\"button-2 wishlist-add-to-cart-button\"]");
            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
            WebElement checkboxElement = wait.until(ExpectedConditions.visibilityOfElementLocated(checkboxLocator));
            checkboxElement.click();
            LogManagers.logInfo("Checkbox clicked.");
            WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonLocator));
            addToCartButton.click();
            LogManagers.logInfo("Added item to cart using checkboxes.");

        } catch (Exception e) {
            LogManagers.logError("Failed to add item to cart: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void verifyTextInCart() {
        try {
            By cartProductLocator = By.xpath("//td[@class='product-picture']//following-sibling::td//a");

            WebDriverWait wait = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(30));
            WebElement cartProductElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartProductLocator));

            String exp = cartProductElement.getText();

            String act = "3rd Album";
            Assert.assertEquals(act, exp, "Product in cart does not match");

            LogManagers.logInfo("Product in cart: " + exp);

        } catch (Exception e) {
            
            LogManagers.logError("Failed to verify product in cart: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void addLaptopCart() {
        ProductPageLocator.searchStoreField.sendKeys("laptop" + Keys.ENTER);
        ProductPageLocator.addToCart.click();
        WebElement el = HelperClass.getDriver().findElement(By.cssSelector("#topcartlink > a"));
        Actions builder = new Actions(HelperClass.getDriver());
        builder.moveToElement(el).click(el).perform();
        LogManagers.logInfo("Added laptop to cart.");
    }

    public void countryPin(String country, String pincode) {
        Select dropdown = new Select(HelperClass.getDriver().findElement(By.xpath("//*[@id=\"CountryId\"]")));
        dropdown.selectByVisibleText(country);
        ProductPageLocator.zipcode.sendKeys(pincode);
        objmethod.clickMethod(ProductPageLocator.shippingestimate);
        LogManagers.logInfo("Selected country: " + country + " and entered pincode: " + pincode);
    }

    public void estimateShippingDetails() {
        List<WebElement> obj = HelperClass.getDriver().findElements(By.xpath("//ul[@class=\"shipping-results\"]//li//strong"));
        LogManagers.logInfo("Shipping estimate ways:");
        for (WebElement a : obj) {
            LogManagers.logInfo(a.getText());
        }
        String act="The one day air shipping";
        String exp=ProductPageLocator.shippingineday.getText();
        Assert.assertEquals(act, exp);
    }

	public String getproductname() throws IOException {
		File file = new File("src/test/resources/testdata.properties");
        FileInputStream fileInput = new FileInputStream(file);

        Properties prop = new Properties();
        prop.load(fileInput);

        return prop.getProperty("Product");
	}


}