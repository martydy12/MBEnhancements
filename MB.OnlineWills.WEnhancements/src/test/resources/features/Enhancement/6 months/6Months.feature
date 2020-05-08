Feature: 6months

  Scenario Outline: 6months
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    # User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single-------------------------------------------------------------------------
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Skip Beneficiaries Page-------------------------------------------------------------------------
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page-------------------------------------------------------------------------
    Then user is on "Executors" page
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    And user selects Foreign Passport as first identification type
    And user adds foreign passport details
    And user selects Driver License as second identification type
    And user adds driver license details
    And user clicks next button on the ID docs page
    And user clicks next button on the ID docs page
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to add-on page
    Then user is on "Add-Ons" page
    Then user clicks on add POA on addons page
    And user click the next button with POA on the AddOns page
    Then user is on "Enduring Power Of Attorney" page
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user fills up financial decision maker details with Primary Decision Maker
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    And user enter "This a test Limitation" as limitation value
    And user click the next button with POA on the financial decision page
    Then user is on "MedicalPOA" page
    Then user click on I do not want a MDM
    Then user click next
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    When user clicks the next button on the review and confirm page to go to payments page
    Then user is on "Payment" page
    And POA is displayed in the order summary
    And Standard will legal document is displayed in the order summary
    When user clicks on back button on the order summary page
    Then user is on "ReviewAndConfirm" page
    And user clicks the next button on the review and confirm page to go to add-on page
    And user clicks on pay now button
    Then user is on "Checkout" page
    Then user enter payment details
    Then user select month
    Then user select year
    When user clicks the pay button
    Then user is on "Thank You" page

    Examples: 
      | email            | password     | Address1  | Suburb         |
      | 60days@gmail.com | Passw0rd123! | Australia | Executive Lane |

  Scenario Outline: Popup check
    Given user opens browser
    # Go to site and log in-------------------------------------------------------------
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user is prompted about MB 6 months policy rule

    Examples: 
      | email            | password     |
      | 60days@gmail.com | Passw0rd123! |