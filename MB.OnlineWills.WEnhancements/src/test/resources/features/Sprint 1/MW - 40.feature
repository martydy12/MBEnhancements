Feature: MW - 40 : Review and confirm

  @WIP
  Scenario: Delete Order
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "jerome@yehey.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint1
  Scenario Outline: MW - 40
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page
    Then user is on "Executors" page
    #  And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ID docs Page
   Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    And user selects Foreign Passport as first identification type
    And user adds foreign passport details
    And user selects Driver License as second identification type
    And user adds driver license details
    And user clicks next button on the ID docs page
    And user clicks next button on the ID docs page
    Then user is on "Review and Confirm" page
    #Check personal Info summary
    And user checks the personal info summary details
    #Check AboutYou summary
    And user checks the About you summary details
    #Check Assets summary
    And user checks the Assets summary details
    #Check Beneficiaries summary
    And user checks the Beneficiaries summary details
    #Check Executors summary
    And user checks the Executors summary details
    #Edit Personal info
    And user clicks edit button on personal info summary
    Then user is on "Personal Details" page
    And user edits some personal details
    When user clicks on Next button on personal page
    #Edit About you
    And user edits some about you details
    And user click the next button on the about page
    #Edit Assets
    And user clicks yes to do you control a trust question
    And user clicks yes to do you control a self-managed superannuation fund question
    And user clicks yes to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    #Edit Benefeciaries
    And user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user click the next button on the beneficiaries page
    #Validate acknowledgement
    And user click the next button on the review and confirm page
    And user sees message "You must confirm and acknowledge the information you have provided"
    And user confirms on the acknowledgement inside the review and confirm page
    And user click the next button on the review and confirm page
    Then user is on "Thank You" page
    Then user close browser

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | jerome@yehey.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
