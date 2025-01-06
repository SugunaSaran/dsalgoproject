@register
Feature: Register page

  Background: 
    Given User is in registration page link

  Scenario Outline: Register with valid username,invalid password,invalid passwordconfirmation
    When User enter valid "<username>" and invalid "<password>" ,invalid password confirmation "<confirmpassword>" Enter
    Then The user sees the unsuccessful registration with error message "password_mismatch:The two password fields didn’t match"

    Examples: 
      | username   | password  | confirmpassword |
      | vidhyademo | Reset@113 | pass13          |

  Scenario: Check Empty username, password and passwordconfirmation fields
    When User enter empty username or  password or password confirmation - Enter
    Then The user sees a warning message "Please fill out the fields"

  Scenario Outline: Check  username already exist
    When User enter existing "<username>" Enter
    Then The user sees a error message "password_mismatch:The two password fields didn’t match"

    Examples: 
      | username   | password  | confirmpassword |
      | vidhyademo | Reset@113 | pass13          |

  Scenario Outline: Register with valid username,valid password,invalid passwordconfirmation
    When User enter valid "<username>" and valid "<password>" ,invalid password confirmation "<confirmpassword>" Enter
    Then The registration should be unsuccessfull with error messages with  "password_mismatch:The two password fields didn’t match"

    Examples: 
      | username1  | password1 | confirmpassword1  |
      | vidhyademo | Reset@123 | pass4             |

  Scenario Outline: Check mismatched password and passwordconfirmation fields
    When User enter mismatched password or password confirmation - Enter
    Then The registration should be unsuccessfull with error messages with  "password_mismatch:The two password fields didn’t match"
  Examples: 
      | username1  | password1 | confirmpassword1  |
      | vidhyademo | Reset@123 | pass4             |
      
  #Scenario Outline: Register with valid username,valid password,valid passwordconfirmation
    #When User enter valid "<username>" and valid "<password>" ,valid password confirmation "<confirmpassword>" Enter
    #Then The user sees a successfull message "Registration Succesfull"
#
    #Examples: 
      #| username1  | password1 | confirmpassword1      |
      #| vidhyademo | Reset@123 | Reset@123             |
