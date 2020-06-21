Feature: Standard single To Mylife single

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email           | password     |
      | sol1e@gmail.com | Passw0rd123! |

  Scenario Outline: Solution 1e
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    When user selects singles product
    When user clicks MyLife will product for singles
    And user sees feedback message when changing from Standard Single to Mylife Single
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1e@gmail.com |

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email           | password     |
      | sol1e@gmail.com | Passw0rd123! |

  Scenario Outline: Vice versa
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks MyLife will product for singles
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    When user selects singles product
    When user clicks Standard will product for singles
    And user sees feedback message when changing from Mylife Single to Standard Single
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1e@gmail.com |
