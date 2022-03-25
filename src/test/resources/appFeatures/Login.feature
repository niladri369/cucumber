Feature:

  Scenario Outline: Login fail possible scenarios
    Given User is on application landing page.
    When User clicked on sign in button
    Then User lands on login page
    When User enters "<Username>" in Username field
    And User enters "<Password>" in password field
    And User clicks on Sign in button
    Then User gets login failed error message.

    Examples: 
      | Username  						| Password 		              |
      | Incorrect username 		|     12345 	              |
      | niladri               |Incorrect password         |
