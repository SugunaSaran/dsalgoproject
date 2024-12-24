Feature: Data Structures-Introduction

Background:
Given The user is in the home page after sign-in.

Scenario: Verify that user is able to navigate to Data Structures-Introduction page

When The user clicks the Getting Started button in Data Structures-Introduction panel
Then The user should be directed to  Data Structure introduction Page

Scenario: Verify that user is able to navigate to Time Complexity page
Given The user is in the Data Structures-Introduction page 
When The user clicks Time Complexity link
Then The user should be redirected to Time Complexity page

Scenario: Verify that user is able to navigate to try Editor page for Time Complexity page	
Given The user is on the Time Complexity page	
When The user clicks Try Here button in Time Complexity page	
Then The user should be redirected to a page having an try Editor with a Run button to test-Data structures
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Time Complexity page
Given The user is in the tryEditor page of data structure introduction
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window for data intro
@data
Scenario Outline: Verify that user receives error for invalid python code for Time Complexity page
Given The user is in the tryEditor page of data structure introduction
When The user write the "<invalid_code>" in Editor and click the Run button
Then The user should able to see an error message in alert window for data intro
Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |

@data
Scenario Outline: Verify that user is able to see output for valid python code for Time Complexity page
Given The user is in the tryEditor page of data structure introduction
When The user write the "<valid_code>" in Editor and click the Run button in data intro
Then The user should able to see output in the console for data intro
Examples:
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |
@data
Scenario: Verify that user is able to navigate to Practice Questions page
Given The user is in the Time Complexity page 
When The user clicks Practice Questions link of time Complexity
Then The user should be redirected to Practice Questions page of Time Complexity

