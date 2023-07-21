@B29G20-184
Feature: Default

	#Scenario: User can create event by clicking on time box.
	#
	#Given the user logged in as Posmanager
	#
	#Then user should click on time box and create an event
	@B29G20-182
	Scenario: US04-AC1-TC1-Verify that user can create event by clicking on time box
			Given the user logged in as "POS Manager"
			When user can click on Calendar
			Then user can click on time box
			Then user fills out the summary box
			Then user clicks on create

	
	@B29G20-183
	Scenario: US04-AC2-TC01-Verify that user can see event details when clicking the event on the calendar
			Given the user logged in as "POS Manager"
			When user can click on Calendar
			Then user can click on the time box
			Then user fills out the summary box
			Then user clicks on create
			And user clicks on the event
			Then user can see event details