@Feature_004
Feature: Adding Items to shopping basket functionality
  As an online customer
  I want to add Items that I have searched to the shopping basket
  So I can pay for them


  Scenario: Test for adding searched items to the shopping basket
    Given I have searched for an item:
      | searchedItem          | itemPrice    |
      | Apple MacBook Pro 13-inch | $1,800.00 |
    When I add an "Apple MacBook Pro 13-inch" item to the shopping basket
    Then I should see "Apple MacBook Pro 13-inch" message displays