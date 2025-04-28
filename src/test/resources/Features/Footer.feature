Feature: Verify footer link functionality on the homepage

@FoooterSection
Scenario: User verifies and clicks the "Powered by nopCommerce" link
    Given User launches the Demo Web Shop application
    When User scrolls to the footer section
    And clicks on the "Powered by nopCommerce" link
    Then User should be navigated to the nopCommerce official website
