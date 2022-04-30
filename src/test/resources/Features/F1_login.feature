#This is my feature file for login functionality
#Author
#Date
Feature: Feature to test login functionality

  Scenario: Check login is successful with valid credentials
    Given user open the browser
    And user launch the google webpage
    And user write amazon in search box
    When user click on amazon link
    And amazon page verification
    And click signin button
    And user enter email and password
    And user click on submit button
    Then user page verification 

