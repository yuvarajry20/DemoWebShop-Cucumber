Feature: Yuvaraj_28APR2025_DemoWebShop_Validate News
  I want to use this template for my feature file

  @News
  Scenario: Validating customer service news feature
    Given I want to be in the demowebshop "url"
    When I click the news link in customer service
    Then I can see the latest news for the website
