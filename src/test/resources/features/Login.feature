Feature:  users should be able to login to the application


  Scenario: Only authorized should be able to login
    Given user in login page
    When user login with valid credentials
    Then Account summary page should be displayed


  @parametrized_test
  Scenario: user with invalid credentials should not be login
    Given user in login page
    When user tries to login with invalid information
    And user with blank username or password
    Then error message "Login and/or password are wrong." should be displayed