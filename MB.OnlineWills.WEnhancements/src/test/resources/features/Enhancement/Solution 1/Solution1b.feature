Feature: My life couple to standard single
    
  Scenario Outline: Solution 1b
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    When user clicks MyLife will product for couples
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
     When user selects singles product
    When user clicks Standard will product for singles
    And user sees feedback message when changing from Mylife Couple to Standard Single
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1b@gmail.com |