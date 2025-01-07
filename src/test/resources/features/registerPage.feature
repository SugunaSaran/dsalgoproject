@register
Feature: Register page

  Background: 
    Given User is in registration page link

  Scenario Outline: Register with valid username,invalid password,invalid passwordconfirmation
    When User enter valid username "<sheetName>" and invalid password <rowNumber> ,invalid password confirmation confirmpassword Enter
    Then The user sees the unsuccessful registration with error message password_mismatch:The two password fields didn’t match

    Examples: 
      | sheetName            | rowNumber |
      | Registration_invalid |         1 |

  Scenario: Check Empty username, password and passwordconfirmation fields
    When User enter empty username or  password or password confirmation - Enter
    Then The user sees a warning message "Please fill out the fields"

  Scenario Outline: Check password can not be entirely numeric
    When User enter numeric password "<sheetName>" <rowNumber>
    Then The user sees a warning message

    Examples: 
      | sheetName       | rowNumber |
      | RegisterInvalid |         2 |

  Scenario Outline: Check  username already exist
    When User enter existing username "<sheetName>" <rowNumber>  Enter
    Then The user sees a error message password_mismatch:The two password fields didn’t match

    Examples: 
      | sheetName       | rowNumber |
      | RegisterInvalid |         1 |

  Scenario Outline: Register with valid username,valid password,invalid passwordconfirmation
    When User enter valid username "<sheetName>" and valid password <rowNumber> ,invalid password confirmation Enter
    Then The registration should be unsuccessfull with error messages with  password_mismatch:The two password fields didn’t match

    Examples: 
      | sheetName       | rowNumber |
      | RegisterInvalid |         2 |

  Scenario Outline: Check mismatched password and passwordconfirmation fields
    When User enter mismatched "<sheetName>" password or password confirmation <rowNumber>  - Enter
    Then The registration should be unsuccessfull with error messages with  password_mismatch:The two password fields didn’t match

    Examples: 
      | sheetName       | rowNumber |
      | RegisterInvalid |         1 |
#
  Scenario Outline: Register with valid username,valid password,valid passwordconfirmation
    When User enter valid "<sheetName>" and valid <rowNumber> ,valid password confirmation
    Then The user sees a successfull message Registration Succesfull

    Examples: 
      | sheetName          | rowNumber |
      | Registration_valid |         0 |
      
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
