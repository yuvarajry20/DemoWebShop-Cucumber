Feature: Search Functionality

#Background: Given I am on the DemoWebShop HomePage with "url"

@ValidKeywordSearch
  Scenario: Simple product search with valid keyword
  Given I am on the DemoWebShop HomePage with "url"
  When I click search bar and enter "Fiction"
  And I click the search button
  Then the "Fiction" should be displayed in the results
  
@InvalidKeywordSearch
  Scenario Outline: Search with invalid or short keywords
    Given I am on the DemoWebShop HomePage with "url"
    When I click search bar and enter invalid "<keyword>"
    And I enter the search 
    Then a message that "<expectedMessage>" should be displayed

    Examples:
      | keyword | expectedMessage                                           |
      | Mobile  | No products were found that matched your criteria.        |
      | mo      | Search term minimum length is 3 characters                |
      |         | Please enter some search keyword                          |

  @AdvanceSearch
  Scenario Outline: Perform advanced product search with various filter combinations
    Given I am on the DemoWebShop HomePage with "url"
    When I enter "<SearchTerm>" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters "<Category>","<Min>","<Max>"
    Then the system should display "<ExpectedResult>" message for "<SearchTerm>"

    Examples:
      | SearchTerm | Category                     | Min  | Max  | ExpectedResult                                    |
      | Camera     | Electronics >> Camera, photo | 100  | 500  | 1MP 60GB Hard Drive Handycam Camcorder                     |
      | Camera     | Electronics >> Cell phones   | 100  | 500  | No products were found that matched your criteria.|
