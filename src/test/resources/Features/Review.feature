Feature: Review a product Functionality

@ReadReviews
Scenario: View submitted reviews of a product
    Given I am on the DemoWebShop Homepage "url"
    And I navigate to the "GiftCards" category
    When I select the product "$50 Physical Gift Card"
    And I click on the "Reviews" link
    Then I should see the reviews that have been submitted previously

@InvalidReview
 Scenario Outline: Submit review with invalid inputs
    Given I am logged in to Demowebshop application
    And I navigate to the gift cards page and click the product
    When I click on the "Add your review" button
    And I enter review "<title>", "<text>" and click the rating value
    And I click the "Submit review" button
    Then I should see the error message "<errorMessage>"

    Examples:
      | title   | text                   | errorMessage                                       |
      |         | The product is awesome | Review title is required.                          |
      | Test 1  |                        | Review text is required.                           |
      |         |                        | Review title is required. Review text is required. |
  