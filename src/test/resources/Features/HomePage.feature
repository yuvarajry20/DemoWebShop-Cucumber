Feature: Home Page Functionality

  Scenario: Subscribe to newsletter
    Given I am on the homepage
    When I enter "lakssakthi@gmail.com" in the newsletter field
    And I click the Subscribe button
    Then I should see a subscription confirmation message

  Scenario: Vote in the community poll
    Given I am on the homepage
    When I select the poll option "Excellent"
    And I click the Vote button
    Then I should see the poll results

  Scenario: View featured products as list
    Given I am on the homepage
    When I click the "List" view icon for featured products
    Then featured products should be displayed in list format

  Scenario: Access recently viewed products
    Given I have viewed some products
    When I navigate to the recently viewed products page
    Then I should see the list of recently viewed products


  Scenario: Click on the Books category
    Given I am on the homepage
    When I click on the "Books" category
    And I am on the "Books" page
    And I click sort as "A-Z" filter
    And apply the price Filter
    And I apply View as Lists filter to display
    Then the books should be displayed as list
