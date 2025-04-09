Feature: Verifying the Shopping Cart
Background: Given The user is on the home page
    
@orderPlacement
   Scenario: adding items and purchasing in the web application
   
   When the user search an item in the search box
   |product			 |
   |health book  |
   And I add the product to cart and click on shopping cart link
   And click on checkout and login to checkout
   And enter the billing address and payment methods
   And confirm order
   Then the user should see the order number and able to download the invoice as pdf
 