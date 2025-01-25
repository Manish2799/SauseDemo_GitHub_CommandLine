Feature: Testing Sause Demo Application

  Scenario: Login page Functionality
    Given User is on login page
    When User enter valid username password and password
    And click on Loign button

  Scenario: Validate HomePage Functionality
    When User should sort product as "Price (high to low)"
    And User should select 3 product
    Then User should click on shopping container
