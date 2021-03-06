Feature: MW - 25 SeparatedA: As a customer, I want to enter the required details about my Relationship Status, so I can process my Will
@WIP
  	Scenario: Scenario 1
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "bam@bam.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint1
  Scenario Outline: SeparatedCouples Scenario 2: Customer fills in additional details based on Relationship Status selected
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
    When user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    Then user is on "About you" page
    #Separated is selected
    When user selects "Separated" as Relationship Status on about page
    #Check if additional questions is displayed
    And user checks if additional questions displayed for separated is correct when couple product is selected
    Then user close browser

    Examples: 
      | email            | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |

  