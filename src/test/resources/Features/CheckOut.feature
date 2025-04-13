#Feature: Checkout the product in the web Application
#
#Background:
#Given the user is on the Web application 
#When I log in  and search an item and add to cart
#And click checkout the product
#
    #
#@Verifying_Terms&Condition_Checkbox
#Scenario: Navigate to checkout page Without clicking the terms & conditions 
#
#And forgot to click the term & condition button
#Then the user should see the pop up windows as to click the terms&condition

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
