
  @B29G20-202
  Feature: Default

	#US16 As an Expenses manager, I should be able to access the different modules.
	#From home page as Expenses manager I want to access all 12 modules.
  @B29G20-201
  Scenario: US16 - Verify the sales managers access to 12 modules.
     Given the user logged in as "Expenses Manager"
    Then Verify the sales managers access to twelve modules.