Feature: LAKSITHA_15APR2025_Popular_tags

@AccessPopularTags
Scenario Outline: Tags should be navigated to product page
  Given I am on the DemoWebShop HomePage with "url"
  When I see the list of popular tags
  And I click the View All button
  And I click on "<TagName>" tag link
  Then I should be redirected to "<TagName>" tagged product page

Examples:
  | TagName   |
  | Digital   |
  | cell      |
