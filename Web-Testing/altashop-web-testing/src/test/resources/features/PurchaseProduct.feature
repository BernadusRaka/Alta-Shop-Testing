Feature: Purchase Product
  As a user
  I want to purchase a product from homepage
  So i can purchase product

  @PurchaseValid
  Scenario: As a logged in user i want to buy product
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    And I redirected to home page
    And I click the "Buy" button
    And I click "cart" button
    And I should verify that the product has been successfully added to the cart
    And I click "Purchase" button
    Then I receive payment confirmation

  @PurchaseChangeNumber
  Scenario: User want to buy product and change number of product that want to be purchased
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    And I redirected to home page
    And I click the "Buy" button
    And I click "cart" button
    And I should verify that the product has been successfully added to the cart
    And I click "+" or "-" button
    And I click "Purchase" button
    Then I receive payment confirmation

  @PurchaseNotLogin
  Scenario: As a user that not logged in i want to purchase product
    Given the shopping application is opened
    When I click the "Buy" button
    And I click "cart" button
    And I should verify that the product has been successfully added to the cart
    And I click "Purchase" button
    Then I should be directed to the login page

  @PurchaseMoreThanOneKindOfProduct
  Scenario: As a user i want to purchase more than one product
    Given the shopping application is opened
    When I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    And I redirected to home page
    And I click the "Buy" or "Add to Cart" button for first product
    And I click the "Buy" or "Add to Cart" button for another product
    And I click "cart" button
    And I should verify that the first product has been successfully added to the cart
    And I should verify that the second product has been successfully added to the cart
    And I click "Purchase" button
    Then I receive payment confirmation