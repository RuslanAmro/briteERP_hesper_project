@login
Feature: Daily Calendar View

 # US03 : As a user, I want to see the calendar page as daily, weekly (as a default) and monthly.
 # 1. Verify users see the calendar as a daily
 # 2. Verify users see the calendar as a weekly
 # 3. Verify users see the calendar as a monthly

  Background: User is already in the log in page
    Given the user logged in as "POS Manager"


  @Calender
  Scenario:View Daily Calendar

    Given user should see the dashboard
    When user should be able to click on Calendar
    Then the user is on the calendar page
    And user should be able to select the daily view option
    Then the calender should display events for the current day


  @Monthly


  Scenario:View Monthly Calendar

    Given user should see the dashboard
    When user should be able to click on Calendar
    Then the user is on the calendar page
    And user should be able to select the Monthly view option
    Then the calender should display events for the current Month

  @Weekly
  Scenario:View Weekly Calendar

    Given user should see the dashboard
    When user should be able to click on Calendar
    Then the user is on the calendar page
    And user should be able to select the Weekly view option
    Then the calender should display events for the current week