@DeleteProductByInvalidID
Feature: Delete product by Invalid ID
    As a user
    I want to delete product by invalid id
    So that the product can be removed

    Scenario: As a user I can delete user with invalid ID
        Given I set API endpoint for delete product with invalid id
        When I send request to delete product with invalid ID
        Then I receive error message and "404 Not Found" response
