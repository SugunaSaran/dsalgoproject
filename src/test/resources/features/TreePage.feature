@tag
Feature: Tree

Background: The user sign in to dsAlgo Portal
Given  The user is in the Home page after sign-in

  @tag1
  Scenario: Verify that user is able to navigate to Tree data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Tree Panel
    When The user select Tree item from the drop down menu
    Then The user should be directed to Tree Data StructurePage
    
      Scenario: Verify that user is able to navigate to overview of Tree in Python page
    Given The user is in the Tree page after Sign in
    When The user clicks  overview of Tree  in Python page
	  Then The user should be redirected to  overview of Tree in Python page
	  
	 Scenario: Verify that user is able to navigate to try Editor page for  overview of Tree in Python page
    Given The user is on the overview of Tree in Python page
    When The user clicks Try Here button in  overview of Tree in Python page
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
	  
	 Scenario: Verify that user is able to navigate to Terminologies page
    Given The user is in the Tree page after Sign in
    When The user clicks Terminologies link in Python page
	  Then The user should be redirected to Terminologies page
	  
	 Scenario:Verify that user is able to navigate to try Editor page for Terminologies page
    Given The user is on the Terminologies in Python page
    When The user clicks Try Here button in Terminologies in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user is able to navigate to Terminologies using Tree page
    Given The user is in the Tree page after Sign in
    When The user clicks Terminologies link in Python page
	  Then The user should be redirected to Terminology page
	  
	 Scenario:Verify that user is able to navigate to try Editor page for Terminologies page
    Given The user is on the Terminologies using Tree in python page 
    When The user clicks Try Here button in Terminologies using Tree  in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	