
Feature: Best Seller page navigation and get products

  Scenario: Navigate to best seller page and get top product with price
    Given user is on home page
    And user can see best sellers quick link
    When user click on best seller link
    And verify user on right page
    Then print top products with price