@Feature_002
Feature: Testing login functionality
  As a customer
  I want to login to application
  So I can check my account

  Scenario Outline: Testing login functionality using valid credentials
    Given I am on the home page of the application
    When I logon with valid username "<username>" and valid password "<password>"
    Then I should see my email address "<message>" displayed
  Examples: Login test data
      | username                  | password | message                   |
      | automation.test@yahoo.com | test123  | My account |