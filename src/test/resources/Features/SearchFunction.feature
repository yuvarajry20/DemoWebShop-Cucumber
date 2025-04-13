Feature: Search Functionality

Background: Given I am on the DemoWebShop HomePage ang logged in

  @ValidKeywordSearch
  Scenario: Simple product search with valid keyword
    When I click search bar and enter "Fiction"
    And I click the search button
    Then the "Fiction" should be displayed in the results
    
  @InvalidKeywordSearch
  Scenario: Simple product search with invalid keyword
    When I click search bar and enter "Mobile"
    And I click the search button
    Then the "Mobile" should be displayed in the results

  @validAdvanceSearch
  Scenario: Advanced product search with valid details
    When I enter "Laptop" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters:
      | Category               | Min Price  | Max Price  |
      | Computers >> Notebooks | 1000       | 2000       |
    Then the search results for "Laptop" should be displayed

  @InvalidAdvanceSearch
  Scenario: Advanced product search with invalid details
    When I enter "Computers" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters:
      | Category | Min Price | Max Price |
      | All      | 1000      | 2000      |
    Then a message should be displayed indicating no products found