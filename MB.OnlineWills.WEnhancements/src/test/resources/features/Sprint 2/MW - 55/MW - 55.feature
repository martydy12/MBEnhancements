Feature: MW - 55

  @Sprint1
  Scenario Outline: 
    #Delete Order for a fresh start
    Given user opens browser and proceeds to orders page
    Then user selects "<email>" on user dropdown
    Then user clicks on delete all button

    Examples: 
      | email            |
      | demeth@gmail.com |

  @Regression2
  Scenario Outline: 
    #Scenario1
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    #Scenario: 1 - Customer’s Will responses identified as Complex
    And user fills up for single status for step children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
   And user clicks no to all assets question
    And user click the next button on the assets page
    #Beneficiaires - select Gift
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user clicks no to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user sees disaster question displayed
    #Scenario 2: Customer reviews information entered
    When user click the next button to the idDocs page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
 
    Then user is on "Review and Confirm" page
    And user reviews and confirms will details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     | 
      | demeth.camuin@gmail.com | Password123! | 

  @Regression2
  Scenario Outline: 
    #Scenario2
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
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
    #And user adds first option executor
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
   Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
  
    #Review and confirm
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user click the next button on the review and confirm page
    #Add ons page
    Then user is on "Add-Ons" page
    Then user clicks on add POA on addons page

    Examples: 
      | email                   | password     | 
      | demeth.camuin@gmail.com | Password123! |

  @Regression2
  Scenario Outline: 
    #Scenario3
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
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
    #And user adds first option executor
    And user clicks on add executor
    And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    #ID docs Page
    Then user is on "ID Check" page
    #Progress Bar Navigation
    When user redirects to Personal Details page
    Then user is on "Personal Details" page
    When user redirects to About You page
    Then user is on "About you" page
    When user redirects to Assets page
    Then user is on "Assets" page
    When user redirects to Beneficiaries page
    Then user is on "Beneficiaries" page
    When user redirects to Executors page
    Then user is on "Executors" page

    #When user redirects to "About You" page
    #When user redirects to "Assets" page
    #When user redirects to "Beneficiaries" page
    #When user redirects to "Executors" page
    #When user redirects to "ID Check" page
    Examples: 
      | email                   | password     | 
      | demeth.camuin@gmail.com | Password123! | 

  @Regression2
  Scenario Outline: 
    #Scenario4
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
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
    #And user adds first option executor
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
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    #Review and confirm
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user click the next button on the review and confirm page
    #Add ons page
    Then user is on "Add-Ons" page
    When user verifies if will is complete
    Then user clicks on add POA on addons page

    Examples: 
      | email                   | password     |
      | demeth.camuin@gmail.com | Password123! | 

  @Regression2
  Scenario Outline: 
    #Scenario5
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    #Scenario: 1 - Customer’s Will responses identified as Complex
    And user fills up for single status for step children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Beneficiaires - select Gift
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user clicks no to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user sees disaster question displayed
    #Scenario 2: Customer reviews information entered
    When user click the next button to the idDocs page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    Then user is on "Review and Confirm" page
    And user reviews and confirms will details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     |
      | demeth.camuin@gmail.com | Password123! | 

  @Regression2
  Scenario Outline: 
    #Scenario6
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
  And user fills up mandatory fields inside the personal page for victorian
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
    #And user adds first option executor
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
   Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    #Review and confirm
    Then user is on "Review and Confirm" page
    And user confirms on the acknowledgement inside the review and confirm page
    And user click the next button on the review and confirm page
    #Add ons page
    Then user is on "Add-Ons" page
    Then user clicks on add POA on addons page
    And user click the next button with POA on the AddOns page
    #Financial Decisions
    Then user is on "Enduring Power Of Attorney" page
    #Add Financial Decision Maker
    #1
    And user selects Only financial matters on enduring power of attorney options
    And user clicks on add financial decision maker on financial decision page
    And user fills up financial decision maker details with Primary Decision Maker
    And user clicks on add financial decision maker
    #Select immediately on start to act dropdown
    And user selects "Immediately" on When do you want your Financial/Personal Decision Makers to start to act dropdown
    #Input limitation
    And user enter "This a test Limitation" as limitation value
    #next button
    And user click the next button with POA on the financial decision page
    #Medical POA page
    Then user is on "MedicalPOA" page
    And user clicks next button on the medical decision page
    And user sees validation on mandatory field inside the medical decision page
    And user clicks on I do not want to appoint a Medical Decision Maker checkbox
    And user clicks next button on the medical decision page
    Then user is on "Review and Confirm" page
    #Review and Confirm
    And user clicks the next button on the review and confirm page to go to payments page
    And user sees message "You must confirm and acknowledge the information you have provided"
    And user confirms on the acknowledgement inside the review and confirm page
    And user clicks the next button on the review and confirm page to go to payments page

    Examples: 
      | email                   | password     |
      | demeth.camuin@gmail.com | Password123! |

  @Regression
  Scenario Outline: 
    #Scenario7
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    #Scenario: 1 - Customer’s Will responses identified as Complex
    And user fills up for single status for step children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to all assets question
    And user click the next button on the assets page
    #Beneficiaires - select Gift
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user clicks no to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user sees disaster question displayed
    #Scenario 2: Customer reviews information entered
    When user click the next button to the idDocs page
    Then user is on "ID Check" page
    And user agrees to terms and agreement inside the ID docs Page
    #ADD ID
    Then user clicks on first identification document
    And user selects Driver License as first identification type
    And user adds driver license details
    And user adds first identification
    Then user clicks on second identification document
    And user selects Medicare as second identification type
    And user adds medicare details
    And user adds second identification
    And user clicks next button on the ID docs page
    Then user is on "Review and Confirm" page
    And user reviews and confirms will details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email            | password     |
      | demeth@gmail.com | Password123! |

  @Regression
  Scenario Outline: 
    #Scenario8
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Single - MyLife will Package
    #Scenario 1: Customer selects the MyLife Documents product
    When user clicks MyLife will product for singles
    Then user is on "Personal" page
    #User filled valid input
   And user fills up mandatory fields inside the personal page for victorian
    #Scenario 2: Customer completes the ‘Personal Details’ page
    When user clicks next page to review and confirm details
    Then user is on "Review and Confirm" page
    #Scenario 3: Customer reviews information entered and confirm acknowledgment
    And user reviews personal details
    And user confirms will details
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email               | password     | 
      | Victorian@gmail.com | Password123! |
