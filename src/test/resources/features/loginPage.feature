@login
Feature: home Login

  Background: 
    Given The user is on the DSAlgo Signin Page

  Scenario: Check home Getstarted without signin -DS
    When The user clicks the getStarted of "DS"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -array
    When The user clicks the getStarted of "array"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -list
    When The user clicks the getStarted of "list"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -stack
    When The user clicks the getStarted of "stack"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -queue
    When The user clicks the getStarted of "queue"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -tree
    When The user clicks the getStarted of "tree"
    Then the user stays in homepage with message "You are not logged in"

  Scenario: Check home Getstarted without signin -graph
    When The user clicks the getStarted of "graph"
    Then the user stays in homepage with message "You are not logged in"

  Scenario Outline: Verify invalid UserName and PassWord fields
    When The user clicks login button after entering invalid "<username>" and invalid "<password>"
    Then The user see the warning messsage "Invalid Username and Password"

    Examples: 
      | username          | password  |
      | passionate_coders | paword123 |

  Scenario: Verify valid username and password fields
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message "you are logged in"

  Scenario: Check home list with out signin -array
    When The user clicks the list of "array"
    Then the user stays in homepage without signin

  Scenario: Check home list with out signin -list
    When The user clicks the list of "list"
    Then the user stays in homepage without signin

  Scenario: Check home list with out signin -stack
    When The user clicks the list of "stack"
    Then the user stays in homepage without signin

  Scenario: Check home list with out signin -queue
    When The user clicks the list of "queue"
    Then the user stays in homepage without signin

  Scenario: Check home  list with out signin -tree
    When The user clicks the list of "tree"
    Then the user stays in homepage without signin

  Scenario: Check home  list  with out signin -graph
    When The user clicks the list of "graph"
    Then the user stays in homepage without signin
