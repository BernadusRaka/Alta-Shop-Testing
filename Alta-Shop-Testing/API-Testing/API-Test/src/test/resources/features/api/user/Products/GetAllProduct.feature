@GetAllProduct
Feature: Get All Product
  As a User
  I want to get all product
  So That i can get "200 OK" response

  Scenario: As a user i want to get all product
    Given I set API endpoint to get all product
    When I send request to get all product
    Then I receive status code 200
    And I receive all of product details