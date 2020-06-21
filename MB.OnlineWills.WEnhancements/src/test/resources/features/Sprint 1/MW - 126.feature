Feature: MW - 126 : Update Product Landing with new UI

  @WIP
  Scenario: Delete Order
    #Go to site and log in
    Given user opens browser and proceeds to orders page
    Then user selects "victorian@gmail.com" on user dropdown
    Then user clicks on delete all button
    Then user close browser

  @Sprint1
  Scenario Outline: Scenario 1: Customer views the Products Landing page
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    And user sees products displayed on landing page
    And user checks if Couples product is selected by default
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Standard Will Product Overview
    # And user sees message "Couples can make a Will at the same time to ensure your estate is in order if anything should happen to you or your spouse/partner."
    And user sees message "Couples Standard Wills (one for you and one for your partner)"
    #Standard Will A ‘Get started’ call to action button
    And user sees Standard will Get Started button for couples product
    Then user close browser

    Examples: 
      | email               | password     |
      | victorian@gmail.com | Password123! |

  @Sprint1
  Scenario Outline: Scenario 2: Customer views the products for singles
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects singles product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$399"
    Then user close browser

    Examples: 
      | email               | password     |
      | victorian@gmail.com | Password123! |

  @Sprint1
  Scenario Outline: Scenario 3: Customer views the products for couples
    Given user opens browser
    When user logs into app with the "<email>" and "<password>" as the login credentials
    Then user is on "Landing" page
    When user selects couples product
    #Standard Will Product Name
    And user sees message "Standard Will"
    #Products price
    And user sees message "$599"
    Then user close browser

    Examples: 
      | email               | password     |
      | victorian@gmail.com | Password123! |
