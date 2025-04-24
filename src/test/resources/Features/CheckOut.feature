Feature: Divraj_12APR2025_Demowebshop_Checkout the product

Background:
Given the user is on the Web application 
When I log in and add an item and add to cart
|laptop|

  
@Verifying_Terms&Condition_Checkbox
Scenario: Navigate to checkout page Without clicking the terms & conditions 

And click checkout the product
And forgot to click the term & condition button
Then the user should see the pop up windows as to click the terms&condition

@orderPlacement
Scenario:  checkout and download the invoice pdf

And checkout the product
And select  address and payment methods
And confirm order
Then the user should see the order number and able to download the invoice as pdf

@CheckoutanItem
Scenario: checkout an item in the application

And click the terms & conditions
And click the checkout button
Then the user should see the checkout page and billing details


@invoiceDetails
Scenario: To read the invoice pdf in the application

When click the orders
And click the invoice pdf 
Then the user should see the entire order details
 

    
@orderPlacementthroughstorepickup
Scenario: purchase an item and choose store pickup
   
And enter the billing address and click store pick
And Proceed and confirm order
Then the user should see the order code successfully

@orderPlacementThroughcreditcard
Scenario: purchase an item and choose the credit card 

And click the checkout button and proceed
And select the credit card method and enter the required fields

|Divraj             |
|4242 4242 4242 4242|
|12                 |
|2034               |
|567                |
And proceed the details and confirm
Then the user should see the order code successfully

@orderPlacementinTwodayshipping
Scenario: purchase an item and choose the two day shipping

And click the checkout buttons and proceed
And select the two day shipping as two Day Air 
And proceed the further details
Then the user should see the order code successfully

@Checkoutredirectshippingtoshippingaddress
Scenario: user should click the store pick up after the shipping methods

And click the checkout buttons and proceed
And select back and click the store pickup
And proceed the remaining steps and confirm
Then the user should see the order code successfully

