@CreateNewProduct
Feature: Create an product
  As a user
  I want to create a new product
  So that the product data is saved

  Scenario: As a user I can create an product with valid inputs
    Given I set API endpoint for create new product
    When I send request to fill product data with valid credentials
    Then I receive status code 200
    And I receive valid data for create new product

