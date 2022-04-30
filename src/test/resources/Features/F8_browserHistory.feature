
Feature: Browser History feature functionality

  Scenario: Click on first product of best seller page and find in browser history
    Given user is on home page
    And click on best seller link
    And click on first product 
    And click on amazon logo
    When check for browser history link or tab
    And click on browser history tab
    Then verify recently viewed product is present or not
    And quit browser