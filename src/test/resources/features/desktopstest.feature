@regression
Feature: Desktops Features

@smoke
  Scenario: Verify Product is Arranged In AlphaBatical Order
    Given I am on the Homepage
    When I Mouse hover on Desktops Tab.and click
    And I Click on Show All Desktops
    And Select Sort By position Name: Z to A
    Then The Product will be arranged in Descending order.

@sanity
  Scenario Outline: verify Product Added To ShoppingCart SuccessFully
    Given I am on the Homepage
    When I Mouse hover on Currency Dropdown and click
    And I Mouse hover on £Pound Sterling and click
    And  I Mouse hover on Desktops Tab.
    And I Click on Show All Desktops
    And I Select Sort By position Name: A to Z
    And I select the product "<product>"
    And I enter Qty one using Select class.
    And I Click on “Add to Cart” button
   # And I see the Message Success: You have added “<product>" to your shopping cart!
    And I Click on link shopping cart displayed into success message
    Then I Verify the shopping CartText
    And I Verify the Product name "<product>"
    And I Verify the Model "<model>"
    And I Verify the Todal "<price>"

    Examples:
    |   product          |   model        |     price     |
    |   HTC Touch HD     |  product 1     |    £74.73     |
    |   iPhone           |  product 11    |    £75.46     |
    |   iPod Classic     |  product 20    |    £74.73     |
    |   MacBook          |  product 16    |    £368.73    |
    |   MacBook Air      |  product 17    |    £736.23    |
    |   Sony VAIO        |  product 19    |    £736.23    |