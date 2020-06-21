Feature: MW - 50 : As a customer, I want to view all the products available to me so that I can choose the right product to meet my needs

  @Sprint
  Scenario Outline: Scenario 1: Customer views the Products Landing page
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user sees products displayed on landing page
    And user checks if Couples product is selected by default
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Standard Will Product Overview
    And user sees message "Couples Standard Wills (one for you and one for your partner)"
    And user sees message "Takes as little as 30 minutes each"
    And user sees message "A joint consultation with a member of our team to discuss your needs"
    And user sees message "An expert lawyer writes your Wills"
    #Standard Will A ‘Get started’ call to action button
    And user sees Standard will Get Started button for couples product
    #MyLife Documents Product Name
    And user sees message "MyLife Documents"
    #MyLife Documents Product Overview
    And user sees message "Select our full service package and let us do the work. You will receive:"
    And user sees message "Two Standard Wills (one for you and one for your partner)"
    And user sees message "Two joint consultations with an expert Wills and Estates lawyer"
    And user sees message "one to discuss your needs and the other to review and sign the documents"
    And user sees message "Two Enduring Powers of Attorney"
    And user sees message "Two Appointment of Medical Treatment Decision Maker"
    And user sees message "Two Advance Care Directives"
    And user sees message "Two Statement of Wishes"
  
    #MyLife Documents A ‘Get started’ call to action button
    And user sees MyLife will Get Started button for couples product

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

  @Sprint
  Scenario Outline: Scenario 2: Customer views the products for singles
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    #And user sees message "$399"
    #MyLife Documents Product Name
    And user sees message "MyLife Documents®"
    #Products price
    #And user sees message "$1290"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |

  @Sprint
  Scenario Outline: Scenario 3: Customer views the products for couples
    #Go to site and log in
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    #Standard Will Product Name
    And user sees message "Couples Standard Wills (one for you and one for your partner)"
    #Products price
    #And user sees message "$599"
    #MyLife Documents Product Name
    And user sees message "MyLife Documents"
    #Products price
   # And user sees message "$1,290"

    Examples: 
      | email               | password     |
      | Victorian@gmail.com | Password123! |
