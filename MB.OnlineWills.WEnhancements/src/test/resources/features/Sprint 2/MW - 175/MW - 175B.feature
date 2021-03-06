Feature: MW - 175 : Union Member Payments
Scenario Outline: Delete Order
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | jerome@yehey.com |
  Scenario Outline: MW - 175 B
    # Single Package - Staff, Standard Will - no POA
    # Go to site and log in-------------------------------------------------------------------------
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #When user clicks on new order on incomplete order popup
    #When user clicks on continue on incomplete order popup
    And user click free standard will
    #Union details
    Then pop-up header is displayed
    Then affiliated unions dropdown is displayed
    And your member number field is displayed
    And member number footnote is displayed
    And cancel button is displayed
    #Alpha
    When user selects "StaffUnion" as affliated unions
    And user enter "staffunion" on your member number
    And user click on confirm button
    And user is on "Landing" page
    And user check the cost
    #Select Standard will Package-------------------------------------------------------------------------
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
     And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    #And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    And user selects Foreign Passport as first identification type
    And user adds foreign passport details
    And user selects Driver License as second identification type
    And user adds driver license details
    And user clicks next button on the ID docs page
    And user clicks next button on the ID docs page
    #Review and confirm-----------------------------------
    #Review and confirm-------------------------------------------------------------------------
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to add-on page
    #Add ons page
    Then user is on "Add-Ons" page
    Then user click the next button without adding POA on the AddOns page
    #Payments
    Then user is on "Payment" page
    And user check on the total
    Then user clicks on proceed payment button
    #Payment Complete
    Then user is on "Thank You" page

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | jerome@yehey.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
