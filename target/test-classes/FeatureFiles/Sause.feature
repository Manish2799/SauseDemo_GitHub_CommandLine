Feature: Testing Sause Demo Application

  Scenario: Login page Functionality
    Given User is on login page
    When User enter valid username password and password
    And click on Loign button

  Scenario: Validate HomePage Functionality
    When User should sort product as "Price (high to low)"
    And User should select 3 product
    Then User should click on shopping container

  Scenario: Validate ChekOut Functionality
    When User should click on checkout button
    And User should enter firstname as "Mahesh" and lastname as "Pande" and zipcode as "123456"
    Then User should click on continue button

  Scenario: Validate logout functionality
    When user cicks on finish button
