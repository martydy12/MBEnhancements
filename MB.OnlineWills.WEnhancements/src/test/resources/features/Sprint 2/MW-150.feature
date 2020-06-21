Feature: MW - 150

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email                   |
      | david.peralta@yahoo.com |

  @Sprint
  Scenario Outline: MW - 150
    #Scenario2
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    When user selects "Dr" as title on personal page
    When user inputs "05/09/1990" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    When user selects no on first question
    When user selects no on second question
    When user clicks on Next button on personal page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    And user clicks yes to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    Then user is on "Executors" page
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
    And user click the next button on the review and confirm page
    Then user is on "Add-Ons" page
    Then user click on add POA on addons page
    And user click the next button with POA on the AddOns page
    Then user is on "Enduring Power Of Attorney" page
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user fills up financial decision maker details with Primary Decision Maker
    And user clicks on add financial decision maker
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    And user enter "This a test Limitation" as limitation value
    And user click the next button with POA on the financial decision page
    Then user is on "MedicalPOA" page
    And user clicks next button on the medical decision page
    And user sees validation on mandatory field inside the medical decision page
    And user clicks on I do not want to appoint a Medical Decision Maker checkbox
    And user clicks next button on the medical decision page
    Then user is on "Review and Confirm" page
    And user checks the information inside the review and confirm after medical POA page
    And user clicks the next button on the review and confirm page to go to payments page
    And user sees message "You must confirm and acknowledge the information you have provided"
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to payments page

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
