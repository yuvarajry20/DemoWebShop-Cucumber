Feature: Divraj_26MAY2025_Demowebshop_nopCommerce Website

Background:
Given I want to be in the demowebshop "url"

  
@Verify_the_Nopcommerce_website
Scenario: go to the nopcommerce webpage in the footer  

When I click the nopcommerce text in the footer of the tricentis
Then the user should see the nopcommerce website successfully 

@Verify_the_Nopcommerce_website_about
Scenario: view the details about the nopcommerce page

When I click the nopcommerce text in the footer of the tricentis
And click the about us in the footer
Then the user should see the complete details about the nopcommerce page successfully