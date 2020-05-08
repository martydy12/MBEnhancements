Feature: Standard single To Mylife Couple

  Scenario Outline: Solution 1e
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    When user clicks MyLife will product for couples
    And user sees feedback message when changing from Standard Single to Mylife Couple
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1e@gmail.com |
