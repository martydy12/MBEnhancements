Feature: MW - 53

  Scenario Outline: Delete Order
    Given the user deletes any existing order on "<email>"

    Examples: 
      | email       | password     |
      | bam@bam.com | Passw0rd123! |

  @Sprint
  Scenario Outline: MW - 53
    # Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    # When user clicks on new order on incomplete order popup
    When user selects singles product
    #Select Standard will Package
    When user clicks Standard will product for singles
    Then user is on "Personal Details" page
    #User filled valid input
    And user fills up mandatory fields inside the personal page for victorian
    When user clicks on Next button on personal page
    #About Page
    Then user is on "About you" page
    When user selects "Single" as Relationship Status on about page
    #Scenario 1: Customer views the 'About You' page of the Online Wills Request
    And user sees message "If you have a will, please upload here."
    #Scenario 2:  Previous Will uploaded not in the correct file format
    And user uploads a will with invalid file format inside the about you page
    And user sees message "File not supported"
    #Remove
    And user removes the attached file on about you page
    #Scenario 3: Previous Will uploaded is too large
    And user uploads a will with invalid file size inside the about you page
    And user sees message "Maximum filesize exceeded, please limit your uploads to 10mb. 10mb. 10485760b."
    #Remove
    And user removes the attached file on about you page
    #Scenario 4:  Previous Will successfully uploaded
    And user uploads a will inside the about you page
    And user click the next button on the about page
    Then user close browser

    Examples: 
      | email       | password     | Address1                                         | Suburb         |
      | bam@bam.com | Password123! | No.22 Diamond Street Bahayang Pagasa Imus Cavite | Executive Lane |
