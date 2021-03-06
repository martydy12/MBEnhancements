Feature: MW - 16 : As a customer, I want to activate my account so that I can login to the portal

  @Regression
  Scenario Outline: Scenario 1: Activation link used before expiry and account not activated
    Given user opens browser
    Then user is on "Login" page
    When the user click on register link
    Then user is on "Registration" page
    #Create User Account
    When user inputs "<First Name>" in the First Name field on registration page
    When user inputs "<Family Name>" in the Family Name field on registration page
    When user inputs "<Email>" in the Email field on registration page
    When user inputs "<Phone>" in the Phone field on registration page
    When user selects "<State>" on state dropdown
    When user inputs "<Password>" in the Password field on registration page
    When user inputs "<Confirm Password>" in the Confirm Password field on registration page
    When user selects "<Source>" on source dropdown
    When user agress on I have read and agree to the MyLife Wills
    When user agrees on Maurice Blackburn's Privacy Policy by ticking the checkbox
    When the user clicks on create account button
    And user sees message "Well done, your account is nearly created."
    And user sees message "We have sent you an activation email. Please go to your email and click the activation link to confirm your account."
    And user sees message "Once activated you can begin providing your instructions in our easy online system."
    Given user opens browser and decides to proceed to the activation links page
    Then user is on "Codes" page
    When the user clicks on activation link
    And user sees message "Your account has now been successfully activated.  You can now log in."
    #Scenario 2: Activation link used before expiry and account not activated
    Given user opens browser and decides to proceed to the activation links page
    Then user is on "Codes" page
    When the user clicks on activation link
    Then user is on "Activate" page
    And user sees message "Looks like you have already activated your account"
    #Scenario 3: Activation link has expired (Hard to replicate link)
    #Scenario 4: User Re-sends Activation link email (Hard to replicate link)
    Then user close browser

    Examples: 
      | First Name | Family Name | Email  | State | Password     | Confirm Password | Source        | Phone   |
      | Demeth     | Camuin      | Demeth | VIC   | Password123! | Password123!     | Word Of Mouth | 4772834 |
