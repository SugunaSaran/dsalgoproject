
Feature: Data Structures-Introduction

  Background: The user sign in to dsAlgo Portal
    Given The user is in the home page after sign-in

  Scenario: Verify that user is able to navigate to Data Structures-Introduction page
    When The user clicks the Getting Started button in Data Structures-Introduction panel
    Then The user should be directed to  Data Structure introduction Page

  Scenario: Verify that user is able to navigate to Time Complexity page
    Given The user is in the Data Structures-Introduction page
    When The user clicks Time Complexity link
    Then The user should be redirected to Time Complexity page

  Scenario: Verify that user is able to navigate to try Editor page for Time Complexity page
    Given The user is on the Time Complexity page
    When The user clicks Try Here button in Time Complexity page
    Then The user should be redirected to a page having an try Editor with a Run button to test-Data structures

  Scenario: Verify that user does not receive error when click on Run button without entering code for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity page
    When The user clicks the Run button without entering the code in the Editor-data intro
    Then The user should not get any error message in alert window-data intro

  Scenario Outline: Verify that user receives error for invalid python code for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in Editor and click the Run button-data
    Then The user should able to see an error message in alert window-data

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |
      
  Scenario Outline: Verify that user is able to see output for valid python code for Time Complexity page
    Given The user is in the tryEditor page of Time Complexity page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the Run button-data
    Then The user should able to see output <rownumber> in the console-data

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Time Complexity page
    When The user clicks Practice Questions link-data
    Then The user should be redirected to a page having an try Editor with a Run button to test in Array page
