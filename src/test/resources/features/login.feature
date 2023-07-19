@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user types
    Given the user logged in as "POS Manager"


  Scenario: Verify login with user name and password
    Given the user logged in with username as "posmanager155@info.com" and password as "posmanager"


