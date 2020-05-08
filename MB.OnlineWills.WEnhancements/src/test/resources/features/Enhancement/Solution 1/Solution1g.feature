Feature: Standard single To Standard Couple With about you page details

  Scenario Outline: Solution 1d
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user click change button on personal page from assets page
    When user clicks on Back button on personal page
    And user clicks Standard will product for couples
    And user sees feedback message when changing from Standard Single to Standard Couple
    And user clicks confirm button on feedback message to change to standard couple
    Then user is on "Personal Details" page
    When user clicks on Next button on personal page
    Then user is on "About you" page
    And user sees relationship status is unselected
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1g@gmail.com |
