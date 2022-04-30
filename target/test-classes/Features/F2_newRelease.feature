
Feature: New Releases page navigation and get products

  Scenario: Navigate to New Releases page and get new product with price
    Given user is on home page
    And user can see new releases quick link
    When user click on new releases link
    And verify user on new release page
    Then print new launch products with price