@regression
Feature: Top Menu Functions

  @smoke
  Scenario: User Should Navigate To DesktopsPage Successfully
    Given I am on Homepage
    When I Mouse hover on “Desktops” Tab and click
    And  I select Show all Desktops
    Then I can see the text Desktops

  @sanity
  Scenario: User Should Navigate To LaptopsAndNotebooks Page Successfully
    Given I am on Homepage
    When I mouse hover on LaptopsAndNotebooks Tab and Click
    And I select Show all Laptops and Notebooks
    Then I should see the Text Laptops And Notebooks

  Scenario: User Should Navigate To ComponentsPage Successfully
    Given I am on Homepage
    When I mouse hover on Components Tab and click
    And I select Show all Components
    Then I should see the Page Tilte Components


