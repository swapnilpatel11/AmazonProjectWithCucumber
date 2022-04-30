#This is my feature file for login functionality
#Author
#Date
Feature: feature to test an Item search functionality

  Scenario: check whether we are getting results according to the Search data
    Given user should launch the application
    When User enters an item to search and clicks Enter
    Then user Should get Items according to the Search Data

  Scenario: check whether we are getting results sorted acoording to the color,size,Brandname
    Given user should launch the application
    And User enters an item to search and clicks Enter
    And user Should get Items according to the Search Data
    When user selects the BrandName and Size and Color
    Then user Should get Items Sorted according to the selection
