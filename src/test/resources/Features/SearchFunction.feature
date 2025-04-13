Feature: Search Functionality

#Background: Given I am on the DemoWebShop HomePage with "url"

@ValidKeywordSearch
  Scenario: Simple product search with valid keyword
  Given I am on the DemoWebShop HomePage with "url"
  When I click search bar and enter "Fiction"
  And I click the search button
  Then the "Fiction" should be displayed in the results
    
