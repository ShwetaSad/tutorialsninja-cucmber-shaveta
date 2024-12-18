@regression
Feature: My Account Features

  @smoke
  Scenario: User Should Navigate To RegisterPage Successfully
    Given I am on Tutorial HomePage
    When I Click on My Account Link.
    And I Call the method “selectMyAccountOptions” method and pass the parameter Register
    Then I can see the Register account text

  @sanity
  Scenario: User Should Navigate To LoginPage Successfully
    Given I am on Tutorial HomePage
    When I Click on My Account Link.
    And I click on Login
    Then I can see the Returning Customer text

  @sanity
  Scenario: User Register Account Successfully
    Given I am on Tutorial HomePage
    When I Click on My Account Link.
    And I Call the method “selectMyAccountOptions” method and pass the parameter Register
    And I enter First Name
    And I enter Last Name
    And I enter Email
    And I enter Telephpne number
    And I enter Password
    And I enter Confirm Password
    And I Select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on Continue button
    And I Verify the message Your Account Has Been Created!
    And I Click on Continue button
    And I Click on My Account Link.
    And I click on Logout
    And I Verify the text Account Logout
    Then I Click on next button

  Scenario: User Should Login And Logout Successfully
    Given I am on Tutorial HomePage
    When  I Click on My Account Link.
    And I click on Login
    And I enter Email address
    And I enter Password
    And I click on Login Button
    And I verify the text My Account
    And I click on Logout


