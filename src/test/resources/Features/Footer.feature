Feature: Laksitha_28APR2025_footerlink_functionality_on_homepage

Background:
    Given User launches the Demo Web Shop application
    When User scrolls to the footer section

@FooterSection
Scenario: User verifies and clicks the "Powered by nopCommerce" link
    And User clicks on the "Powered by nopCommerce" link
    Then User should be navigated to the nopCommerce official website

@ContactUs
Scenario: User clicks the Sitemap link and navigates to Accessories page
    And User clicks on the "Sitemap" link page
    Then User should be navigated to the Sitemap page
    #When User clicks on the "Accessories" link
    #Then User should be redirected to the Accessories page
