Feature: Yuvaraj_26MAY2025_DemoWebShop_Validate Next&PreviousBtn Feature

@Nextandprevious
Scenario Outline: Validate the Next and Previous button Feature
  Given I want to be in the demowebshop "url"
  When I click on the Apparel and Shoes
  And I click the next button 
  Then I should be able to see the corresponding product
   |product                       |
   |Men's Wrinkle Free Long Sleeve|
  And if i click the previous button 
  Then I should be able to see the corresponding product
   |product        |
   |50's Rockabilly Polka Dot Top JR Plus Size|

