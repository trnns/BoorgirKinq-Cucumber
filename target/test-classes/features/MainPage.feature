Feature: Main Page
  As I customer, I should be able to click items

  Scenario: Click to menu button
    Given I am on the home page
    When I click the menu button
    Then menu page should be displayed