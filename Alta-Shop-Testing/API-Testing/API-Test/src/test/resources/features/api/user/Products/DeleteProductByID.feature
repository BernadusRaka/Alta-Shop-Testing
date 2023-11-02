@DeleteProductByID
Feature: Delete product by ID
    As a user
    I want to delete product by valid id
    So that the product can be removed

    Scenario: As a user I can delete product with valid ID
        Given I set API endpoint for delete product with valid id
        When I send request to delete product with valid ID
        Then I receive status code 200
