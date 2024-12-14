
@tag
Feature: Tree 
  I want to use this template for my feature file
Background: The user sign in dsAlgo Portal
  @tag1
  Scenario: Verify that user is able to navigate to Tree Data Struture page
    Given The user is in the Home Page after Sign in
    When   the_user_clicks_the_getting_started_button_in_tree_ds
      When The user select Tree Item from Drop down menu
      
    Then The user be directed to Tree data structure page
    

  Scenario: Verify that user is able to overview of Tree in Tree page
   Given The user is in Tree Page after sign in
   When The user click overview of tree in tree link
   Then The user be directed to operation in Tree Page
   
   
   Scenario: Verify that user is able to navigate to try Editor Page for overview of Tree in Tree Page
    Given The user in on the overview of Tree in Tree Page
    When The user clicks Try Here button in overview of Tree in Tree page
    Then The user Should be redirected to page having an try Editor with a Run button to test
    
    Scenario: Verify that  user receive error when click on run button without entering code  for overview of Tree in Tree Page
    Given The user is in tryEditor page.
    When The user clicks the run button without entering the code in the editor
    Then The user should not see any error message or output.
    
    Scenario: Verify that  user receive error for invalid phython code  for Overview of Tree in Tree Page
    Given The user is in tryEditor page.
    When The user write the invalid code and  clicks the run button  in the editor
    Then The user should able to  see  error message in alert window.
    
    Scenario: Verify the ok button of error alert message
    Given The user is in Try editor page.
    When The user click the ok button of error alert window.
    Then The user remain in the tryeditor page with run button.
    
    Scenario: Verify that user is able to overview of Tree in Tree page
   Given The user is in Tree Page after sign in
   When The user click overview of tree in tree link
   Then The user be directed to operation in Tree Page
   
   
   Scenario: Verify that user is able to navigate to try Editor Page for Terminologies in Tree Page
    Given The user in on the Terminologies in Tree Page
    When The user clicks Try Here button in Terminologies in Tree page
    Then The user Should be redirected to page having an try Editor with a Run button to test
    
    Scenario: Verify that  user receive error when click on run button without entering code  for Terminologies in Tree Page
    Given The user is in tryEditor page.
    When The user clicks the run button without entering the code in the editor
    Then The user should not see any error message or output.
    
    Scenario: Verify that  user receive error for invalid phython code  for Terminologies in Tree Page
    Given The user is in tryEditor page.
    When The user write the invalid code and  clicks the run button  in the editor
    Then The user should able to  see  error message in alert window.
    
    Scenario: Verify the ok button of error alert message
    Given The user is in Try editor page.
    When The user click the ok button of error alert window.
    Then The user remain in the tryeditor page with run button.
    
    
    
   