@B29G20-196
Feature: Default

	Background: User is already in the log in page
		Given the user logged in as "POS Manager"
	@B29G20-193
	Scenario:   US03-AC01-TC01 Verify users see the calendar as a daily
		Given user should see the dashboard
		    When user should be able to click on Calendar
		    Then the user is on the calendar page
		    And user should be able to select the daily view option
		    Then the calender should display events for the current day	

	
	@B29G20-194
	Scenario:  US03-AC02-TC01 Verify users see the calendar as a weekly.
		Given user should see the dashboard
		    When user should be able to click on Calendar
		    Then the user is on the calendar page
		    And user should be able to see the Weekly view option as a default
		    And user should be able to select the Weekly view option
		    Then the calender should display events for the current week	

	
	@B29G20-195
	Scenario:  US01-AC03-TC02 Verify users see the calendar as a monthly
		Given user should see the dashboard
		    When user should be able to click on Calendar
		    Then the user is on the calendar page
		    And user should be able to select the Monthly view option
		    Then the calender should display events for the current Month