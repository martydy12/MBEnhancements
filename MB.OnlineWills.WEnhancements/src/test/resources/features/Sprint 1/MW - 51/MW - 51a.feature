Feature: MW - 51a - As a customer, I want to skip parts of the form I don’t need to fill in if I’ve indicated I’m in hospital or have a condition that impacts my ability to draft a Will so I can discuss these directly with the lawyer

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email                   | password     |
      | david.peralta@yahoo.com | Passw0rd123! |

  @Regression
  Scenario Outline: Answer Yes on Are you currently in hospital? question
    #Scenario1-A (1st Question Yes)
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for couples
    Then user is on "Personal Details" page
    #User filled valid input
    When user selects "Dr" as title on personal page
    When user inputs "01/01/1993" as date of birth on personal page
    When user inputs "4772834" as Phone Number on personal page
    When user inputs "Consultant" as Occupation on personal page
    When user inputs "<Address1>" as Residential address line one on personal page
    When user inputs "<Suburb>" as Residential suburb on personal page
    When user selects "VIC" as Residential state on personal page
    When user selects "4103" as Residential Postcode on personal page
    When user selects Postal Address same as Residential checkbox
    #Answer Yes on Are you currently in hospital? question
    When user selects yes on first question
    #Answer NO on Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will? question
    When user selects no on second question
    #Click Next button
    When user clicks next page to review and confirm details
    #User checks if About you page is displayed
    Then user is on "Review and Confirm" page
    And user sees Are you currently in hospital question with yes answer in personal info summary
    And user confirms will details
    #Scenario2
    When user clicks the next button to confirm will
    Then user is on "Thank You" page
    And user sees message "Thank you"

    Examples: 
      | email                   | password     | Address1                                         | Suburb         |
      | david.peralta@yahoo.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
