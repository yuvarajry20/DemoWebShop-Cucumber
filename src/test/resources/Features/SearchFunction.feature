Feature: Search Functionality

  @Search
  Scenario: Normal product search
    Given I am on the DemoWebShop HomePage
    When I click search bar and enter "Fiction"
    And I click the search button
    Then the "Fiction" should be displayed in the results

  @validAdvanceSearch
  Scenario: Advanced product search with valid details
    Given I am on the homepage
    When I enter "Laptop" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters:
      | Category               | Min Price | Max Price |
      | Computers >> Notebooks | 1000       | 2000       |
    Then the search results for "Laptop" should be displayed

  @InvalidAdvanceSearch
  Scenario: Advanced product search with invalid details
    Given I am on the homepage
    When I enter "Jewelry" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters:
      | Category | Min Price | Max Price |
      | All      | 1000      | 2000      |
    Then a message should be displayed indicating no products found

  @EmailWithoutLogin
  Scenario: Try to Email a Friend without logging in 
  Given I am on the homepage
  When I click "Books"
  And I click the product from the results
  And I click "Email a friend"
  And I enter the following email details:
    | FriendEmail          | YourEmail             | Message                  |
    | xyz@gmail.com        | abc@gmail.com         | Check out this product!  |
  And I click "send mail"
  Then I should see a message "Only registered customers can use email a friend feature"
  
   
  Scenario Outline: Add to cart and email a friend after product search
    Given I am on the homepage and logged into the website
    When I search for "<Product Name>"
    And I click the product from the results
    And I click "Add to cart"
    And I click "Email a friend"
    And I enter friend's email "<FriendEmail>" and my email "<YourEmail>"
    And I click send email
    Then I should see "<ExpectedMessage>"

    Examples:
      | Product Name | FriendEmail         | YourEmail              | ExpectedMessage                                      |
      | Jewelry      | 2k21dhar@gmail.com  | lakssakthi@gmail.com   | Your message has been sent.                         |
      | Jewelry      |                     | user@example.com       | Enter valid email                                   |
