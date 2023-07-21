@B29G20-200
Feature: US07 As a POS & sales manager, I should be able to get correct information on the Sales page


  @B29G20-188
  Scenario: US07-TC01-Verify there are 6 columns to see the quotations on the Sales page when login as POS Manager
		#Scenario Outline: Verify there are 6 columns to see the quotations on the Sales page when login as POS Manager
    Given the user logged in as "POS Manager"
    Given Given user should be able to click on Sales Module
    Then  Verify User should be able to see "expectedColumnsHeaders"

#    Examples:
#      |expectedColumnsHeaders|
#      | Quotation Number |
#      | Quotation        |
#      | DateCustomer     |
#      | Salesperson      |
#      | Total            |
#      | Status           |


#  @B29G20-197
#  Scenario: US07-TC02-Verify there are 6 columns to see the quotations on the Sales page when login as Sales Manager
#		#Scenario Outline: Verify there are 6 columns to see the quotations on the Sales page when login as Sales Manager
#    Given the user logged in as "Sales Manager"
#    Given Given user should be able to click on Sales Module
#    Then  Verify User should be able to see "expectedColumnsHeaders"
#
#
#
##    Examples:
##      | expectedColumnsHeaders |
##      | Quotation Number       |
##      | Quotation              |
##      | DateCustomer           |
##      | Salesperson            |
##      | Total                  |
##      | Status                 |
#
#
  @B29G20-198
  Scenario: US07-TC03-Verify user as POS Manager can see the result on the list when searching with Quotation Number data
		#Scenario Outline: Verify user as POS Manager can see the result on the list when searching with Quotation Number data
    Given the user logged in as "POS Manager"
    Given user should be able to click on sales module
    And : user enter "SO812" in search box and hit enter
    Then : user should see expectedOrderNumber result

#
#  @B29G20-199
#  Scenario: US07-TC04-Verify user as Sales Manager can see the result on the list when searching with Quotation Number data
#		#Scenario Outline: Verify user as Sales Manager can see the result on the list when searching with Quotation Number data
#    Given the user logged in as "Sales Manager"
#    Given user should be able to click on sales module
#    And : user enter "<orderNumber>" in search box and hit enter
#    Then : user should see expectedOrderNumber result