Feature: MyLife couple To standard couple

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email           | password     |
      | sol1a@gmail.com | Passw0rd123! |

  Scenario Outline: Solution 1a
    Given user opens browser
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    When user clicks MyLife will product for couples
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    When user clicks Standard will product for couples
    And user sees feedback message when changing from Mylife Couple to Standard Couple
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1a@gmail.com |
      
  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email           | password     |
      | sol1a@gmail.com | Passw0rd123! |

  Scenario Outline: Vice Versa
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<Victorian>" and "<password>" as the login credentials
    Then user is on "Landing" page
     When user selects couples product
    When user clicks Standard will product for couples
    Then user is on "Personal Details" page
    When user clicks on Back button on personal page
    When user clicks MyLife will product for couples
    And user sees feedback message when changing from Standard Couple to Mylife Couple
    And user close browser

    Examples: 
      | password     | Victorian       |
      | Passw0rd123! | sol1a@gmail.com |
      