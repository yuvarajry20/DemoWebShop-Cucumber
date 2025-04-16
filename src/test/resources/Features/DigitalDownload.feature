Feature: category under digital download product is added to cart

Background:
Given the user is on the web application
When the user click the digital download category

@addtocarttheproduct
Scenario: add product to the cart

And click add to cart the product
Then the user should see the number of products added in cart

@filtersindigitaldownload
Scenario: select the filters view product

And select the filter option
Then the user should see the list of products based on the filter

@Digitaldownload
Scenario: verify the user is on the digital download page

Then the user should see the digital download product page