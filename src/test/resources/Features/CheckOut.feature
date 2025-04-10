#Feature: Verifying the Shopping Cart
#Background: 
#Given The user is on the home page and logged in
#|abcggggg123@Gmail.com|Divraj@1234|
#When the user search an item in the search box
#|health book  |
#And I add the product to cart and click on shopping cart 
#
#@orderPlacement
#Scenario:  checkout and download the invoice pdf
   #
#And enter the billing address and payment methods
#And confirm order
#Then the user should see the order number and able to download the invoice as pdf
 #
#@invoiceDetails
#Scenario: To read the invoice pdf in the application
#
#When click the orders
#And click the invoice pdf 
#Then the user should see the entire order details
 #
    #
#@Verifying_Terms&Condition_Checkbox
#Scenario: Navigate to checkout page Without clicking the terms & conditions 
    #
#And click the checkout button
#Then the user should see the pop up windows as to click the terms&condition
    #
#@orderPlacementthroughstorepickup
#Scenario: purchase an item and choose store pickup
   #
#And enter the billing address and click store pick
#And Proceed and confirm order
#Then the user should see the order code successfully
#
#@orderPlacementThroughcreditcard
#Scenario: purchase an item and choose the credit card 
#
#And click the checkout button and proceed
#And select the credit card method and enter the required fields
#|Visa  |Divraj  |4242 4242 4242 4242|12   |2034    |567   |
#And proceed the details and confirm
#Then the user should see the order code successfully
#
#@orderPlacementinOnedayshipping
#Scenario: purchase an item and choose the one day shipping
#
#And click the checkout button and proceed
#And select the one day shipping as Next Day Air
#And proceed the further details
#Then the user should see the order code successfully
#
#@orderPlacementinOnedayshipping
#Scenario: purchase an item and choose the two day shipping
#
#And click the checkout button and proceed
#And select the two day shipping as 2nd Day Air 
#And proceed the further details
#Then the user should see the order code successfully
#
#
#
