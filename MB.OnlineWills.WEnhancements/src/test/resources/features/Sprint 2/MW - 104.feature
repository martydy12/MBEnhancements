Feature: MW - 104 As a Legal Assistant, I want to navigate to a Dashboard, So that I can easily view who I need to contact

  @Regression
  Scenario Outline: MW - 104
    # Go to site and log in
    #Scenario1
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    #Scenario2
    And user checks dashboard table displayed
    And user checks newest row in dashboard
    And user checks oldest row in dashboard
    #Scenario3
    When user searches for a user in dashboard
    #Scenario4-5-6
    When user updates action details in dashboard
    #Scenario7
    #Then user enters invalid date in action
    #And user sees feedback message "Invalid Date"
    #Scenario8
    #Then user sorts dashboard column

    Examples: 
      | email    | password     |
      | backuser | Password123! |

  @Regression
  Scenario Outline: MW - 104
    # Go to site and log in
    #Scenario1
    Given user opens admin page
    When user logs into app with the "<email>" and "<password>" to dashboard
    Then user is on "Dashboard" page
    #Scenario2
    And user checks dashboard table displayed
    #And user checks newest row in dashboard
    #And user checks oldest row in dashboard
    #Scenario3
    When user searches for a user in dashboard
    #Scenario 4-5-6
    When user updates action details in dashboard
    #Scenario 7
    #Then user enters invalid date in action
    #And user sees feedback message "Invalid Date"
    Then user sorts dashboard column

    Examples: 
      | email    | password     |
      | backuser | Password123! |
