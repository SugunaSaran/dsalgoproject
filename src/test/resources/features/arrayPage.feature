Feature: Array
Background:
    When User Clicks Get Started button
    And User clicks on the signin link
    And User enters the username as passionate_coders
    And User enters the password as pa$$word123
    When user clicks the login button

@Array
Scenario: Verify that user is able to navigate to Array page
    Given The user is in the home page after signin for Array
    When The user clicks Get Started button in Array panel
    Then The user should be redirected to Array page
    
