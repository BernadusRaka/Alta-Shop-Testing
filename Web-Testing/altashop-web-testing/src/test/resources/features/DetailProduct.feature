Feature: Detail Product
  As a user
  I want to know more about the product
  So that I can see product detail

  @ProductDetail
  Scenario: As a user i can see product detail
    Given the shopping application is opened
    When I search for the product I want to view the details of
    And I click on the product's detail page to open it
    Then I should be directed to the product's detail page

  @ProductInvalidID
  Scenario: As a user i want to see product detail using invalid product id on URL
    Given the shopping application is opened
    When I change product URL to invalid product id
    Then I should be directed to the blank product's detail page