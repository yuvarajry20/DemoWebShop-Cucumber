Feature: Book Product Functionality

  Background:
    Given I am on the DemoWebShop homepage with "url"
    #And I am logged in with valid credentials

  @BooksList
  Scenario: View all books available
    When I click on the "Books" category
    Then I should see a list of books displayed

  @BookDetails
  Scenario: View details of a specific book
    When I click on the "Books" category
    And I select the book titled "Fiction"
    Then I should see the product details page for "Fiction"

  @BooksFilters
  Scenario: Apply filter options for books
  When I click on the "Books" category
  And I apply the following filters:
      | Filter Type | Value              |
      | Sort By     | Price: High to Low |
      | Display By  | 4                  |
      | View As     | List               |
      | Price       | Under 25.00        |
    Then the filtered books should be displayed accordingly
    
@BooksSortBy
Scenario: Apply all Sort By options for books
  When I click on the "Books" category
  And I apply each of the following Sort By filters:
    | Sort By             |
    | Position            |
    | Name: A to Z        |
    | Name: Z to A        |
    | Price: Low to High  |
    | Price: High to Low  |
  Then each sort result should be applied correctly
    