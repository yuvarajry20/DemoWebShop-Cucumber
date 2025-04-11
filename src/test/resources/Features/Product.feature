Feature: Product Details Validation and purchasing in the Shopping cart page

Background:
Given the user is on the home page
When the user search for a product
|3rd Album |

@ProductDetailsValidation
Scenario: Validating the Product Details and Adding to Cart

And see the product title and the product description
And clicks on add to cart
Then the user should see the successful message
    
    
@shoppingCart_Functionality
Scenario: Adding and Removing a Product in the Shopping Cart

And go to the shopping cart
And remove the product from cart
Then the shopping cart is empty
    
#@Shipping_Product_Feature
#Scenario: Navigate to the shipping estimate methods
#
#And go to the shopping cart and enter pincode
#|637505  |
#And click the Estimate Shipping button
#Then the user should able to see the multiple shipping methods

#@Verify_Wishlist_Product_URL
#Scenario: Verify the product is same as in the auto-generated url in wishlist page
#
#And click the add to wishlist
#And click the auto-generated url for the specific product
#Then the user should see the product which is same as in the wishlist
    #
#@IncreaseTheQTYoftheproduct
#Scenario: verify the quantity of the product is increased
#
#And Increase the count of the product and click add to cart
#Then the user should see the updated quantity and price in the shopping cart page
#
#@AddtheItemintothewishlist
#Scenario: add the product to the wishlist 
#
#And enter the recipients name,email and our details 
#And click the add to wishlist
#Then the user should see the product is added to wishlist
#
#@ValidEmailafriend
#Scenario: send a product details through valid email a friend
 #
#And logged in and click Email a friend
#|abcggggg123@Gmail.com |Divraj@1234|
#And enter my email and friend email
#|Friendemail       |Myemail                |
#|abcd@gmail.com    |abcggggg123@Gmail.com  |
#And click send 
#Then the user should see the email sent successful message
#
#@InvalidEmailfriend
#Scenario: send a product details through Invalid email a friend
#
#And logged in and click Email a friend
#|abcggggg123@Gmail.com |Divraj@1234 |
#And enter my email and friend email
#|Friendemail       |Myemail                |
#|abcd              |abcggggg123@Gmail.com  |
#And click send 
#Then the user should see the Invalid email message
#
#
#
#
#
#
#
    #
    #
 #
 #
 #
 
 