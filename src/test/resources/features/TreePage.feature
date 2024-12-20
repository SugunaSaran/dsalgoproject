
@tag
Feature: Tree

Background: The user sign in to dsAlgo Portal 
Given  The user is in the Home page after sign-in
@tag1
  Scenario: Verify that user is able to navigate to Tree data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the Getting Started button in Tree Panel 
	  When The user selects Tree items from the drop down menu
    Then The user should be directed to Tree Data Structure Page
   
  Scenario: Verify that user is able to navigate to Overview of Trees in Python page
    Given The user is in the Tree page after Sign in
    When The user clicks Overview of Trees link in Python page
	  Then The user should be redirected to Overview of Trees in Python page
	  
	 Scenario: Verify that user is able to navigate to try Editor page for Overview of Trees in Python page
    Given The user is on the Overview of Trees in Python page
    When The user clicks Try Here button in Overview of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	 
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	   Scenario: Verify that user is able to navigate to Terminologies link in python page
    Given The user is in the Tree page after Sign in
    When The user clicks Terminologies link in Python page
	  Then The user should be redirected to Terminologiese page
	  
	  
	  
	 Scenario: Verify that user is able to navigate to try Editor page for Terminologies page
    Given The user is on the Terminologies in Python page
    When The user clicks Try Here button in Terminologies in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	  

	  Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	    Scenario: Verify that user is able to navigate to Types of Trees link in python page
    Given The user is in the Tree page after Sign in
    When The user clicks Types of Trees link in Python page
	  Then The user should be redirected to Types of Trees page
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Types of Trees page
    Given The user is on the Types of Trees in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
 
	  
	  Scenario: Verify that user is able to navigate to Tree Traversals link in python page
    Given The user is in the Tree Traversals after Sign in
    When The user clicks Tree Traversals link in Python page
	  Then The user should be redirected to Binary Trees page
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Tree Traversals
    Given The user is on the Tree Traversals in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	  Scenario: Verify that user is able to navigate to Traversals-Illustration link in python page
    Given The user is in the Traversals-Illustration after Sign in
    When The user clicks Traversals-Illustration link in Python page
	  Then The user should be redirected to Traversals-Illustration page
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Traversals-Illustration
    Given The user is on the Tree Traversals in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	   Scenario: Verify that user is able to navigate to Types of Binary Trees in python page
    Given The user is in the Tree page after Sign in
    When The user clicks Types of Binary Trees in Python page
	  Then The user should be redirected to Types of Binary Trees
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Types of Binary Trees
    Given The user is on the Binary Trees in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	  Scenario: Verify that user is able to navigate to Implementation in Python in python page
    Given The user is in the Implementation in Python after Sign in
    When The user clicks Implementation in Pythonin Python page
	  Then The user should be redirected to Implementation in Python
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Implementation in Python
    Given The user is on the Implementation in Python in Python page
    When The user clicks Try Here button in Implementation in Python in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	   Scenario: Verify that user is able to navigate to Binary Tree Traversals in python page
    Given The user is in the Binary Tree Traversals after Sign in
    When The user clicks Binary Tree Traversalsin Python page
	  Then The user should be redirected to Binary Tree Traversalsn
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Binary Tree Traversals
    Given The user is on the Binary Tree Traversals in Python page
    When The user clicks Try Here button in Implementation in Python in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	   Scenario: Verify that user is able to navigate to Binary Search Trees in python page
    Given The user is in the Binary Search Treesafter Sign in
    When The user clicks Binary Search Trees in Python page
	  Then The user should be redirected to Binary Search Trees
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Binary Search Trees
    Given The user is on the Binary Search Trees in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console
	  
	  
	  Scenario: Verify that user is able to navigate to Implementation Of BST in python page
    Given The user is in the Implementation Of BST after Sign in
    When The user clicks Implementation Of BST in Python page
	  Then The user should be redirected to Implementation Of BST
	  
	   Scenario: Verify that user is able to navigate to try Editor page for Implementation Of BST
    Given The user is on theImplementation Of BST in Python page
    When The user clicks Try Here button in Types of Trees in Python page
	  Then The user should be redirected to a page having an try Editor with a Run button to test
	  
	 Scenario: Verify that user receives error when click on Run button without entering code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
	  Then The user should not see any error message or output
	  
	 Scenario: Verify that user receives error for invalid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user clicks the Run button entering the invalid code in the Editor
	  Then The user should  see  error message or output
	 
	 Scenario: Verifying the ok button of error alert message in tryEditor Page
    Given The user is in the tryEditor page
    When The user clicks the ok button of error alert window
	  Then The user should remain in the tryEditor page with Run button
	 
	  Scenario: Verify that user is able to see output for valid python code in tryEditor page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
	  Then The user should able to see output in the console in python page
   
	  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is in the Graph page after Sign in
    When The user clicks Practice Questions link in Python page
	  Then The user should be redirected to Practice Questions page
	  
	

