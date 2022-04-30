#This is my feature file for login functionality
#Author
#Date
Feature: Check to all footer links

  Scenario: Checking all links are present in footer section or not
    Given user is on home page
    When footer links are present
    Then print all links present in footer
