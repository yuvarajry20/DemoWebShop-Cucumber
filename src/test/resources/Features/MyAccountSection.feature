Feature: Validating My Account Section
Background:
    Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I provide email and password
     |email          |password  |
     |abccdee@gmail.com|123456    |
    And click log in
    When I click my email
    
    @ValidChangePassword
  Scenario Outline: ChangePassword
    Then I want to click change Password
    When i provide oldPassword as "<oldPassword>"
    And i provide newPassword as "<newPassword>" and confirmPassword as "<confirmPassword>"
    Then i click change Password

    Examples: 
      |oldPassword  |newPassword |confirmPassword  |
      |123456       |789456      |789456 |
      
  @InValidChangePassword
  Scenario Outline: ChangePassword
    Then I want to click change Password
    When i provide invalid oldPassword as "<oldPassword>"
    And i provide newPassword as "<newPassword>" and confirmPassword as "<confirmPassword>"
    Then i click change Password

    Examples: 
      |oldPassword  |newPassword |confirmPassword  |
      |123478       |789456      |789456 |
      
   @VerfiyOrders
   Scenario: verify the orders with products details
   When i click orders
   Then i want to see Order number
   And i want to see Order Date
   When i click Details
   Then i want to see Products name
   
   @VerifyBackInStock
   Scenario: verify the back in stock subscriptions
   When i click Back in stock subscriptions
   Then i should see the currently subscribed lists
   
   @verifyRewardPoints
   Scenario: verify the current balance of reward points
   When i click Reward points
   Then i should see the current balance of Reward points
   And i should see the History
   
   @VerifyCustomerInfo
   Scenario: verify the customer info 
   When i click the Customer Info
   Then i should see the FirstName, LastName and Email
   