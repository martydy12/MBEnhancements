Feature: MW - 131 : Executors Page

  @WIP
  Scenario Outline: MW - 106 : Payments Page
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

    Examples: 
      | email               | password     | Address1  | Suburb         |
      | victorian@gmail.com | Password123! | Australia | Executive Lane |

  @Regression
  Scenario Outline: MW - 131 : Executors Page
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard victorian will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Single
    When user selects "Single" as Relationship Status on about page
    And user fill up the all required fields for single status with children
    And user click the next button on the about page
    Then user is on "Assets" page
    And user clicks no to do you have assets question
    #Asset answer "no" to other question
    And user clicks no to do you have debts question
    And user clicks no to do you have any superannuation question
    And user clicks no to do you have life insurance separate from your superannuation
    And user clicks no to do you control a trust question
    And user clicks no to do you control a self-managed superannuation fund question
    And user clicks no to do you own your own business or are you a partner in a partnership question
    And user click the next button on the assets page
    #Skip Beneficiaries Page
    And user clicks yes to Do you want to give the whole estate equally to your children question
    And user clicks no to Do you want to include any children you have in the future question
    And user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question
    And user clicks no to Do you wish to leave any gifts question
    And user click the next button on the beneficiaries page
    #Executors Page
    Then user is on "Executors" page
    And user clicks on add executor
    And user clicks add executor button
    And user checks if mandatory fields for adding executor is implemented
    And user adds back up executor
    # Edit executor
    And user clicks edit button on first executor
    And user updates details of first executor
    #  And user adds first option executor
    And user clicks on add executor
    And user adds back up executor
    And user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question
    And user selects i have no wish on funeral wishes
    And user click the next button on the executors page
    Then user close browser

    Examples: 
      | email               | password     | Address1                                         | Suburb         |
      | victorian@gmail.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
