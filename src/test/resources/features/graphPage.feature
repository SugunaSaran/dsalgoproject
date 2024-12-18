@tag
Feature: Graph

Background: The user sign in to dsAlgo Portal
Given  The user is in the Home page after sign-in

  @tag1
  Scenario: Verify that user is able to navigate to Graph data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Graph Panel
    When The user select Graph item from the drop down menu
    Then The user should be directed to Graph Data StructurePage
    
    