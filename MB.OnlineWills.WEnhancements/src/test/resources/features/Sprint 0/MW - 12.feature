Feature: MW - 12 : As a user, I want to log out of the portal so that no one else can access my account once I’ve finished using it

  @Regression.
  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email       |
      | bam@bam.com |

  Scenario Outline: Scenario 1
    # Scenario 1: Registered customer selects Logout function
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on "<user name>" and logs out
    And user sees logout prompt with buttons Yes, log out and Cancel
    # Scenario 2: Registered customer aborts Logout function
    And user clicks on cancel button
    #And user checks if logout prompt is closed
    Then user is on "Landing" page
    # Scenario 3: Registered customer confirms Logout function
    When user clicks on "<user name>" and logs out
    And user clicks on yes button
    Then user is on "Login" page
    Then user close browser

    Examples: 
      | user name | email       | password     |
      | bam bam   | bam@bam.com | Password123! |
