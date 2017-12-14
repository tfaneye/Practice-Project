@Feature_003
Feature: Test to Search for product functionality
  As a customer
  I want to search for item
  So I can add them to shopping cart

  Scenario Outline: Searching for an item functionality
    Given I am on the home page of the application
    When I search for an "<item>"
    Then I should see the following: "<itemDescription>" & "<itemPrice>"
    Examples: Test data
      | item             | itemDescription                 | itemPrice |
      | Apple MacBook    | Apple MacBook Pro 13-inch       | $1,800.00 |
      | Nokia            | Nokia Lumia 1020                | $349.00   |
      | Wireless Speaker | Beats Pill 2.0 Wireless Speaker | $15.00    |