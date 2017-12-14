@Feature_001
Feature: Test for account register functionality
  As a customer
  I want to register
  So that I can create an account

  Scenario Outline: Testing account registration functionality with user details
    Given I am on the home page of the application
    When I register with the following personal details: "<firstName>", "<lastName>", "<dayOfBirth>", "<monthOfBirth>", "<yearOfBirth>","<email>", "<companyName>", "<password>", & "<confirmPassword>"
    Then I should see the "<message>" displayed in the register page
    Examples: Registration test data:
      | firstName | lastName | dayOfBirth | monthOfBirth | yearOfBirth | email                     | companyName    | password | confirmPassword | message                     |
      | John      | Smith    | 10         | April        | 1990        | automation.test@yahoo.com | Automation Ltd | test123  | test123         | Your Registration Completed |