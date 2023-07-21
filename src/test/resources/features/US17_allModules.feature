Feature: Access to the main modules.

  Background: User is already in the log in page
    Given the user logged in as "Sales Manager"
	#*US17:*
	#
	#As a sales manager, I should be able to access the different modules.
	#
	#*AC:*
	#
	#Verify the sales managers access to 19 modules.

  @B29G20-187
  Scenario: US17_AC1_TC01_Verify the sales managers can access all modules.
    Given user on the landing page
    Then user should be able to see 23 modules