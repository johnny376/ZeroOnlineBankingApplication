@account
Feature: user should be able see Account summary page contents

  Scenario: account summary page contents
    Given user in account summary page
    Then account summary page tittle should be "Zero - Account Summary"
    And account summary page should have "Cash accounts, Investment Accounts, Credit Accounts, Loan Accounts"
    Then in Credit Accounts' table should have "Account, Credit and Balance"