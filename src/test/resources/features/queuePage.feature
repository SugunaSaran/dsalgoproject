@queuepage
Feature: Queue
 
Background: The user sign in to dsAlgo Portal 
Given  The user is in the Home page after sign-in
 
  Scenario: Verify that user is able to navigate to queue data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Queue Panel 
	  When The user selects queue item from the drop down menu
    Then The user should be directed to Queue Data Structure Page
   
  Scenario: Verify that user is able to navigate to Implementation of Queue in Python page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementation of Queue link in Python page
	  Then The user should be redirected to Implementation of Queue in Python page
	  
	 Scenario: Verify that user is able to navigate to try Editor page for Implementation of Queue in Python page
    Given The user is on the Implementation of Queue in Python page
    When The user clicks Try Here button in Implementation of Queue in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	 
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	 Scenario: Verify that user is able to navigate to Implementations using collections.deque page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementations using collections.deque link in Python page
	  Then The user should be redirected to Implementations using collections.deque page
	  
	 Scenario:Verify that user is able to navigate to try Editor page for Implementations using collections.deque page
    Given The user is on the Implementations using collections.deque in Python page
    When The user clicks Try Here button in IImplementations using collections.deque in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user is able to navigate to Implementations using array page
    Given The user is in the Queue page after Sign in
    When The user clicks Implementations using array link in Python page
	  Then The user should be redirected to Implementations using collections.deque page
	  
	 Scenario:Verify that user is able to navigate to try Editor page for Implementations using array page
    Given The user is on the Implementations using array in Python page
    When The user clicks Try Here button in Implementations using array in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user is able to navigate to Queue Operations page
    Given The user is in the Queue page after Sign in
    When The user clicks Queue Operations link in Python page
	  Then The user should be redirected to Queue Operations page
	  
	 Scenario:Verify that user is able to navigate to try Editor page for Queue Operations page
    Given The user is on the Queue Operations in Python page
    When The user clicks Try Here button in Queue Operations in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Queue page after Sign in
    When The user clicks Practice Questions link in Python page
	  Then The user should be redirected to Practice Questions page