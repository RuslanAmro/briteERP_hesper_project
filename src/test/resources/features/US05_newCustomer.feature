@B29G20-172
Feature: Create and edit buttons functionality

  Background: User is already in the log in page
    Given the user logged in as "Sales Manager"
    Given user should be able to click on sales module
    When user able to click the customers button
    Then user should be able to click create button

  @B29G20-169
  Scenario: US05-AC01-TC01 Verify that the user can create a new customer
    Given user should be able to click on sales module
    When user able to click the customers button
    Then user should be able to click create button


  @B29G20-170
  Scenario: US05-AC01-TC02 Verify that new customer name displayed
    When user create a new customer by filling name input only
    When user click the save button
    Then the name user entered should be displayed


  @B29G20-171
  Scenario: US05-AC02-TC01 Verify that user should be able edit all the information
    Given user is on the customer page
    When user should be able to click any customer
    Then user able to click edit button


  @B29G20-173
  Scenario: US05-AC01-TC03 Verify the user should see warning message
    Given user create a new customer
    When user not going to input any name and should click the save button and see warning message
