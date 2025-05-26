Feature: Laksitha_26MAY2025_DemoWebShop_MusicPage_Buttons

@AccessPopularTags
Scenario Outline: Buttons are enabled or not
  Given I want to be in the demowebshop "url"
  When I click the DigitalDownloads
  And I click the Music2 product page 
  Then I should verify whether the Buttons are enabled or not
