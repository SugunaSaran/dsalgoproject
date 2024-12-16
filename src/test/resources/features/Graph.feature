@tag
Feature: Graph
  
Background: The user sign in dsAlgo Portal
  @tag1
  Scenario: Verify that user is able to navigate to Graph Data Struture page
    Given The user is in the Home Page after Sign in
    When   the_user_clicks_the_getting_started_button_in_tree_ds
      When The user select Graph Item from Drop down menu
      
    Then The user be directed to Graph data structure page
    

  Scenario: Verify that user is able to Graph link to Graph page
   Given The user is in Tree Page after sign in
   When The user click Graph Graph link
   Then The user be directed to Graph Page
   
   
   Scenario: Verify that user is able to navigate to try Editor Page for Graph in Graph Page
    Given The user in on the Graph in graph Page
    When The user clicks Try Here button in graph link in Graph page
    Then The user Should be redirected to page having an try Editor with a Run button to test
    
    Scenario: Verify that  user receive error when click on run button without entering code  for Graph link in graph Page
    Given The user is in tryEditor page.
    When The user clicks the run button without entering the code in the editor
    Then The user should not see any error message or output.
    
    Scenario: Verify that  user receive error for invalid phython code  for graph link in graph Page
    Given The user is in tryEditor page.
    When The user write the invalid code and  clicks the run button  in the editor
    Then The user should able to  see  error message in alert window.
    
    Scenario: Verify the ok button of error alert message
    Given The user is in Try editor page.
    When The user click the ok button of error alert window.
    Then The user remain in the try editor page with run button.
    
    Scenario: Verify that user is able to graph link in graph page
   Given The user is in graph Page after sign in
   When The user click  graph link in graph link
   Then The user be directed to operation in Graph Page
   
   
   Scenario: Verify that user is able to navigate to try Editor Page for Graph Representation in Graph Tree Page
    Given The user in on the Graph Representation in Tree Page
    When The user clicks Try here button in Graph Representation in Graph page
    Then The user Should be redirected to page having an try Editor with a Run button to test
    
    Scenario: Verify that  user receive error when click on run button without entering code  for Graph link in graph Page
    Given The user is in tryEditor page.
    When The user clicks the run button without entering the code in the editor
    Then The user should not see any error message or output.
    
    Scenario: Verify that  user receive error for invalid phython code  for Representation in graph Page
    Given The user is in tryEditor page.
    When The user write the invalid code and  clicks the run button  in the editor
    Then The user should able to  see  error message in alert window.
    
   
    
    
    
   