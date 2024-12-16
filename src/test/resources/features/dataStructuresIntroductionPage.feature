Feature: Data Structures-Introduction

Background: The user sign in to dsAlgo Portal

Scenario: Verify that user is able to navigate to Data Structures-Introduction page
Given The user is in the home page after sign in 
When The user clicks the Getting Started button in Data Structures-Introduction panel
Then The user should be directed to Linked list Data Structure Page

Scenario: Verify that user is able to navigate to Time Complexity page
Given The user is in the Data Structures-Introduction page 
When The user clicks Time Complexity link
Then The user should be redirected to Time Complexity page

Scenario: Verify that user is able to navigate to try Editor page for Time Complexity page	
Given The user is on the Time Complexity page	
When The user clicks Try Here button in Time Complexity page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Time Complexity page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Time Complexity page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Time Complexity page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Practice Questions page
Given The user is in the Time Complexity page 
When The user clicks Practice Questions link
Then The user should be redirected to Practice Questions page

