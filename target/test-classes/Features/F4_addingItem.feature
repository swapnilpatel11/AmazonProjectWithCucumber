#This is my feature file for login functionality
#Author
#Date
Feature: Feature to test itemAddedToCart Functionality

  Scenario: Check item is added to cart and proceed to checkout
    Given select item to add
    And select quatity to add
    And click add to cart button
    When item added to cart
    Then user can proceed to checkout
