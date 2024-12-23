@linklisttag
Feature: Linked List

Background: The user sign in to dsAlgo Portal
Given The user is in the home page after sign in 

Scenario: Verify that user is able to navigate to Linked List structure page
Given The user is in the home page after sign in 
When The user clicks the Getting Started button in Linked List panel
When The user selects linked list item from the drop down menu
Then The user should be directed to Linked list Data Structure Page

Scenario: Verify that user is able to navigate to Introduction page
Given The user is in the Array page 
When The user clicks Introduction link
Then The user should be redirected to Introduction page

Scenario: Verify that user is able to navigate to try Editor page for Introduction page	
Given The user is on the Introduction page	
When The user clicks Try Here button in Introduction page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Introduction page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Introduction page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Introduction page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Creating Linked List page
Given The user is in the Array page 
When The user clicks Creating Linked List link
Then The user should be redirected to Creating Linked List page

Scenario: Verify that user is able to navigate to try Editor page for Creating Linked List page	
Given The user is on the Creating Linked List page	
When The user clicks Try Here button in Creating Linked List page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Creating Linked List page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Creating Linked List page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Creating Linked List page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Types of Linked List page
Given The user is in the Array page 
When The user clicks Types of Linked List link
Then The user should be redirected to Types of Linked List page

Scenario: Verify that user is able to navigate to try Editor page for Types of Linked List page	
Given The user is on the Types of Linked List page	
When The user clicks Try Here button in Types of Linked List page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Types of Linked List page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Types of Linked List page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Types of Linked List page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Implement Linked list in Python page
Given The user is in the Array page 
When The user clicks Implement Linked list in Python link
Then The user should be redirected to Implement Linked list in Python page

Scenario: Verify that user is able to navigate to try Editor page for Implement Linked list in Python page	
Given The user is on the Implement Linked list in Python page	
When The user clicks Try Here button in Implement Linked list in Python page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Implement Linked list in Python page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Implement Linked list in Python page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Implement Linked list in Python page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Traversal page
Given The user is in the Array page 
When The user clicks Traversal link
Then The user should be redirected to Traversal page

Scenario: Verify that user is able to navigate to try Editor page for Traversal page	
Given The user is on the Traversal page	
When The user clicks Try Here button in Traversal page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Traversal page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Traversal page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Traversal page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Insertion page
Given The user is in the Array page 
When The user clicks Insertion link
Then The user should be redirected to Insertion page

Scenario: Verify that user is able to navigate to try Editor page for Insertion page	
Given The user is on the Insertion page	
When The user clicks Try Here button in Insertion page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Insertion page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Insertion page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Insertion page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Deletion page
Given The user is in the Array page 
When The user clicks Deletion link
Then The user should be redirected to Deletion page

Scenario: Verify that user is able to navigate to try Editor page for Deletion page	
Given The user is on the Deletion page	
When The user clicks Try Here button in Deletion page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Deletion page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Deletion page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Deletion page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Practice Questions page
Given The user is in the Introduction page 
When The user clicks Practice Questions link
Then The user should be redirected to Practice Questions page


