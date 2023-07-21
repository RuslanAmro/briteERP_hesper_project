@B29G20-178
Feature: sales manager and expenses manager should be able to login


  @B29G20-174
  Scenario Outline: Sales and expense manager logs in with valid credentials and gets account name
    Given the user is on the login page
    When the user enters valid sales and expense manager credentials "<EmailAddress>" and "<password>"
    And the user clicks on the Login button
    Then the user's accountName should be displayed on the dashboard

    Examples:
      | EmailAddress                | password        |
      | salesmanager55@info.com     | salesmanager    |
      | expensesmanager110@info.com | expensesmanager |
      | expensesmanager19@info.com  | expensesmanager |


  @B29G20-175
  Scenario Outline: Sales and expense manager logs in with valid credentials and gets account name
    Given the user is on the login page
    When the user enters valid sales and expense manager credentials "<EmailAddress>" and "<password>"
    And the user hitting the Enter key on the keyboard to login
	  Then the user's accountName should be displayed on the dashboard

	  Examples:
		  | EmailAddress                | password        |
		  | salesmanager55@info.com     | salesmanager    |
		  | expensesmanager110@info.com | expensesmanager |
		  | expensesmanager19@info.com  | expensesmanager |


	@B29G20-176
  Scenario: Display error message for invalid credentials
    Given the user is on the login page
    When the user enters invalid credentials "invalidUserName" and "<invalidPassword>"
    And the user clicks on the Login button
    Then the user should see an error message saying "Wrong login/password"


  @B29G20-177
  Scenario: Display "Please fill in this field." message for at least one blank field
    Given the user is on the login page
    When the user clicks on the Login button without entering the required credentials
    Then the user should see a message saying "Please fill in this field."