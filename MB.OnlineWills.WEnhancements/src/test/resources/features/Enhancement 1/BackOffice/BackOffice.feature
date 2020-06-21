Feature: Back Office enhancements

  Scenario Outline: Solution 1a
    Given user opens admin page
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Username>" and "<Password>" as the admin login credentials
    And user sees ellipsis for updating or resending spouse email
    When user clicks ellipsis for updating or resending spouse email
    And user sees Resend Spouse Email Invitation popup displayed with corresponding details
    #When user updates existing spouse email before resending
     When user clicks update button on resend spouse email invitation popup
    #Email
    Then user sees email log tab link
    When user clicks email log tab link
    And user clicks more option on email log tab
    Then user sees complete filters for emails

    Examples: 
      | Username | Password     |
      | backuser | Password123! |
