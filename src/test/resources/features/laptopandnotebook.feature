@regression
Feature: Laptop and Notebooks Features

@smoke
  Scenario: verify that Products Price Display HighToLow Successfully
    Given I am onHomepage
    When I Mouse hover on Laptops & Notebooks Tab.and click
    And I Click on Show All Laptops & Notebooks
    And I Select Sort By Price (High > Low)
    Then I can see the Product price will arrange in High to Low order
@sanity
  Scenario: verify That User Place Order Successfully
    Given I am onHomepage
    When I Mouse hover on Laptops & Notebooks Tab.and click
    And I Click on Show All Laptops & Notebooks
    And I Select Sort By Price (High > Low)
    And Select Product MacBook
    And Verify the text MacBook
    And  I click on ‘Add To Cart’ button
    And I Verify the message “Success: You have added MacBook to your shopping cart!”
    And I Click on link shopping cart display into success message
    And I Verify the text Shopping Cart
    And I Verify the Product name MacBook
    And I Change Quantity to 2
    And I Click on Update Tab
    And I Verify the Total "£737.45"
    And Click on Checkout button
    And I Verify the text Checkout
    And I Click on Guest Checkout radio button
    And I Click on Continue tab
    And I Fill the mandatory fields
    And I Click on Continue Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on ContinueNext button
    Then I Verify the message Warning: Payment method required!



