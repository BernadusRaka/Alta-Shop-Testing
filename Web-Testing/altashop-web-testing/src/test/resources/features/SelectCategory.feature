Feature: Select Category
  As a user
  I want to know about product category
  So that i know product category

  @SeeProductCategory
  Scenario: As a logged in user i can see product category
    Given the shopping application is opened
    And I click "door out" button
    And I am on login page
    And I enters a valid "email"
    And I enters a valid "password" that i used
    And I clicks the "Login" button
    And the user searches for and clicks on the "Product Categories" menu or icon
    And selects the "Gaming" category
    Then I should be directed to the "Gaming" product page


  @SeeProductCategoryBeforeLogin
  Scenario: As a user that not logged in yet i can see product category
    Given the shopping application is opened
    When the user searches for and clicks on the "Product Categories" menu or icon
    And selects the "Gaming" category
    Then I should be directed to the "Gaming" product page
