Feature: Home Page Functionality

Background: Given I am on the homepage
  
  @validSubscription 
  Scenario: Subscribe to newsletter using valid email
    When I enter "sakthi@gmail.com" in the newsletter field
    And I click the Subscribe button
    Then I should see a subscription confirmation message
    
  @InvalidSubscription 
  Scenario: Subscribe to newsletter using valid email
    When I enter "sakthi" in the newsletter field
    And I click the Subscribe button
    Then I should see an error message
  
  @VotingPoll
  Scenario: Vote in the community poll
    When I select the poll option "Excellent"
    And I click the Vote button
    Then I should see the poll results
  
  @FeaturedProducts
  Scenario: View featured products as list
    When I navigate to the featured products section
    Then I should see list of featured products displayed 
  
  @RecentlyViewed
  Scenario: Access recently viewed products
    Given I have viewed some products
    When I navigate to the recently viewed products page
    Then I should see the list of recently viewed products

  @DisplayProduct
  Scenario: Click on the Books category
    Given I am on the homepage
    When I click on the "Books" category
    And I am on the "Books" page
    And I click sort as "A-Z" filter
    And apply the price Filter 
    And I apply View as Lists filter to display
    Then the books should be displayed as list
