@B29G20-181
Feature: Default

	#*US06* As a PosManager, I should be able to add new products to inventory.
	#
	# 
	#
	#*AC1.* The user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.
  @B29G20-179
  Scenario: US06 -01TC-MZ User can create a new product
    Given the user logged in as "POS_manager"
    When user click on inventory tab
    And user click on products
    And user click on create button
    When user input product name as "test_data"
    And click on save button
    Then verify the information of the customer which the "POSManager100" entered should be displayed

	# 
	#*US06* As a PosManager, I should be able to add new products to inventory.
	#
	#*AC2.* When clicking any product and then clicking the edit button all the boxes entered information can be editable again.
  @B29G20-180
  Scenario: US06-02TC-MZ  Clicking the edit button all the boxes entered information can be editable again.
    Given the user logged in as "POS_manager"
    When user click on inventory tab
    Then user click on products
    And click on any product
    Then clicking the edit button
    Then verify all the boxes entered information can be editable again.