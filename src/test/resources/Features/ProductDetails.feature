Feature: Product Details Validation and purchasing in the Shopping cart page
Background: Given the user is on the home page

  @ProductDetailsValidation
  Scenario: Validating the Product Details and Adding to Cart
    
    When the user searches for the product and click the product
    |product          |
    |Simple Computer  |
    And the user sees the product title and the product description
    And the user clicks on add to wishlist
    And clicks on add to cart
    Then the user should see the product is added to cart
    
    @shoppingCart_Functionality
    Scenario: Adding and Removing a Product in the Shopping Cart
    
    When I search for an item and add the product to cart
    |Book  |
    And go to the shopping cart
    And remove the product from cart
    Then the shopping cart is empty
    
    @Shipping_Product_Feature
    Scenario: Navigate to the shipping estimate methods
    
    When I search for an item and add the product to cart
    |Book  |
    And go to the shopping cart
    And click the Estimate Shipping button
    Then the user should see the multiple shipping methods
    
    @Verifying_Terms&Condition_Checkbox
    Scenario: Navigate to checkout page Without clicking the terms & conditions 
    
    When I add a product to the cart and go to shopping cart
    And click the check out button
    Then the user should see the pop up windows as to click the terms&condition
    
 
 
 
 
 