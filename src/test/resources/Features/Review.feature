Feature: Laksitha_16APR2025_DemoWebShop_Review_a_product

@ReadReviews
Scenario: View submitted reviews of a product
    Given I am on the DemoWebShop Homepage "url"
    And I navigate to the "GiftCards" category
    When I select the product "$50 Physical Gift Card"
    And I click on the "Reviews" link
    Then I should see the reviews that have been submitted previously
    
@InvalidReview
Scenario: Write a review without logging in
    Given I am on the DemoWebShop Homepage "url"
    And I navigate to the "GiftCards" category
    When I select the product "$50 Physical Gift Card"
    And click on "Add your Review" link
    And click on submit review 
    Then I should see "Only registered users can write reviews"

@ReviewAproduct
 Scenario Outline: Submit review with valid and invalid inputs
    Given I am logged in to Demowebshop application with "url"
    And I navigate to the gift cards page and click the product
    When I click on the "Add your review" button
    And I enter review "<title>", "<text>" and click the rating value
    And I click the "Submit review" button
    Then I should see the error message "<expectedMessage>"

    Examples:
      | title   | text                   | expectedMessage                                    |
      | Demo    | The product is awesome | Product review is successfully added.              |
      |         | The product is awesome | Review title is required.                          |
      | Test 1  |                        | Review text is required.                           |
  