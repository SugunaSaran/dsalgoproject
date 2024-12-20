@loginTagFeature
Feature: Signin

  @logintag
  Scenario Outline: Verify valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid <username> and valid <password>
    Then The user should land in Data Structure Home Page with message "You are not logged in"

    Examples: 
      | username          | password    |
      | passionate_coders | pa$$word123 |
