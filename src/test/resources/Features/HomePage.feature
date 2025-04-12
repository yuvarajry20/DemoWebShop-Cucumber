Feature: HomePageFunctionality 

Background: Given I am on Demowebshop Homepage "url"
  And I login using the following credentials
    | email            | password  |
    |abccy@gmail.com   |789456     |
    
@ValidNewsletter
Scenario: Subscribe with valid email address
  When I enter the following email in the newsletter field
    | email              |
    | sakthi@gmail.com   |
  And I click the Subscribe button
  Then I should see the subscription confirmation message

@InvalidNewsletter
Scenario: Subscribe with invalid email address
  When I enter the following email in the newsletter field
    | email     |
    | sakthi    |
  And I click the Subscribe button
  Then I should see the subscription error message
  
   @FeaturedProducts
  Scenario: View featured products as list
    When I see the featured products section
    Then I should see list of featured products displayed 
  
 # @RecentlyViewed
 # Scenario: Verify recently viewed products
  #  When I see the recently viewed products section
  #  Then I should see the list of recently viewed products
    
  #  Then I should see the poll results
  
