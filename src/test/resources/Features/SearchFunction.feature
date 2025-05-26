Feature: Laksitha_13APR2025_DemoWebShop_Search_Function

Background: Given I am on the DemoWebShop HomePage with "url"

@ValidKeywordSearch
  Scenario: Simple product search with valid keyword
  Given I want to be in the demowebshop "url"
  When I click search bar and enter "Fiction"
  And I click the search button
  Then the "Fiction" should be displayed in the results
  
@InvalidKeywordSearch
  Scenario Outline: Search with invalid or short keywords
    Given I want to be in the demowebshop "url"
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
    Given I want to be in the demowebshop "url"
    When I enter "<searchTerm>" in the search box
    And I click the search button
    And I enable advanced search
    And I apply the following search filters "<category>","<Min>","<Max>"
    Then the system should display "<expectedResult>" message for "<searchTerm>"

    Examples:
      | searchTerm | Category                     | Min  | Max  | expectedResult                                    |
      | Camera     | Electronics >> Camera, photo | 100  | 500  | 1MP 60GB Hard Drive Handycam Camcorder                     |
      | Camera     | Electronics >> Cell phones   | 100  | 500  | No products were found that matched your criteria.|
