Feature: Standard single To Standard Couple
    
  Scenario Outline: Solution 1d
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    And user clicks Standard will product for couples
    And user sees feedback message when changing from Standard Single to Standard Couple
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1d@gmail.com |