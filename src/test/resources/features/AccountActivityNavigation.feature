@activity
Feature: Navigating to specific accounts in Accounts Activity


  Background: user in account summary page
    Given user in account summary page
    Then the Account Activity page should be displayed



  Scenario: Savings account redirect
    When the user clicks on Saving link on the Account Summary page

    And Account drop down should have Savings selected

  Scenario:	Brokerage account redirect
    When the user clicks on	Brokerage link on the Account Summary page

    And Account	drop down should have Brokerage selected

  Scenario:	Checking account redirect
    When the user clicks on	Checking link on the Account Summary	page

    And Account drop down should have Checking selected

  Scenario:	Credit Card	account	redirect
    When the user clicks on	Credit	card link on the Account Summary page

    And Account drop down should have Credit Card selected


  Scenario:	Loan account redirect
    When the user clicks on Loan link on the Account Summary page

    And Account drop down should have Loan selected