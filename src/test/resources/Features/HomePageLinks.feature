Feature: Yuvaraj_06MAY2025_DemoWebShop_HomePageLinks
  
  @TestLinksValidation
  Scenario: Validate the testLinks
    Given I want to be in the demowebshop "https://demowebshop.tricentis.com/login"
    When I click on login
    When I provide email and password
     |email          |password  |
     |abccy@gmail.com|789456    |
    And I click on the login button
    Then I can validate the TestLinks

