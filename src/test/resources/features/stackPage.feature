@tag
Feature: stack

  Background: The user sign in to dsAlgo Portal

  @tag1
  Scenario: Verify that user is able to navigate to stack data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Stack Panel
    When The user select stack item from the drop down menu
    Then The user should be directed to Stack Data StructurePage

  Scenario: Verify that user is able to navigate to Operations in stack page
    Given The user is in the Stack page after Sign in
    When The user clicks Operations in Stack link
    Then The user should be directed to Operations in Stack Page

  Scenario: Verify that user is able to navigate to try Editor page for Operations in Stack page
    Given The user is on the Operations in Stack page
    When The user clicks Try Here button in Operations in Stack page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Operations in Stack page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should not see any error message or output

  Scenario: Verify that user receives error for invalid python code for Operations in Stack page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  Scenario: Verifying the ok button of error alert message
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
    Then The user should remain in the tryEditor page with Run button

  Scenario: Verify that user is able to see output for valid python code for Operations in Stack page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to implementation page
    Given The user is in the Stack page after Sign in
    When The user clicks implementation link
    Then The user be directed to implementation Page

  Scenario: Verify that user is able to navigate to try Editor page for implementation page
    Given The user is on the implementation page
    When The user clicks Try Here button in implementation page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to Applications page
    Given The user is in the Stack page after Sign in
    When The user clicks applications link
    Then The user be directed to application Page

  Scenario: Verify that user is able to navigate to try Editor page for application page
    Given The user is on the application page
    When The user clicks Try Here button in application page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Stack page after Sign in
    When The user clicks Practice Questions link
    Then The user be directed to practice Page
