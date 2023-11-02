@GetAllProductCategory
Feature: Get All Product Category
  As a User
  I want to get all product category
  So That i can get "200 OK" response

  Scenario: As a user i want to get all product category
    Given I set API endpoint to get all product category
    When I send request to get all product category
    Then I receive status code 200
    And I receive all of product category