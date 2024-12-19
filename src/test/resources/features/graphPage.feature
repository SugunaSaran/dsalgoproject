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
    
   Scenario: Verify that user is able to navigate to graph Page in graph data struture
    Given The user is in the Graph data structure after Sign in
    When The user clicks Graph page in graph Data structure
    Then The user should be directed to Graph Page

  Scenario: Verify that user is able to navigate to try Editor page for Graph page
    Given The user is on the Graph page
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Graph page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should not see any error message or output
    
    Scenario: Verify that user receives error for invalid python code for Graph page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

   Scenario: Verifying the ok button of error alert message
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
    Then The user should remain in the tryEditor page with Run button
    
    Scenario: Verify that user is able to see output for valid python code for Graph page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console
    
    
    Scenario: Verify that user is able to navigate to Graph Representations Page in graph data struture
    Given The user is in the Graph data structure after Sign in
    When The user clicksGraph Representations page in graph Data structure
    Then The user should be directed to Graph Representations Page

  Scenario: Verify that user is able to navigate to try Editor page for Graph Representations page
    Given The user is on the Graph Representations page
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Graph Representations page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should not see any error message or output
    
    Scenario: Verify that user receives error for invalid python code for Graph Representations page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

   Scenario: Verifying the ok button of error alert message
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
    Then The user should remain in the tryEditor page with Run button
    
    Scenario: Verify that user is able to see output for valid python code for Graph page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console
    
    
    Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Graph page after Sign in
    When The user clicks Practice Questions link in Python page
	  Then The user should be redirected to Practice Questions page