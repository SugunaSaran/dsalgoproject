Feature: Array

Background: The user sign in to dsAlgo Portal
Given The user is in the home page after sign in 

Scenario: Verify that user is able to navigate to Array data structure page
Given The user is in the home page after sign in 
When The user clicks the Getting Started button in Array panel
When The user selects array item from the drop down menu
Then The user should be directed to Array Data Structure Page

Scenario: Verify that user is able to navigate to Arrays in Python page
Given The user is in the Array page 
When The user clicks Arrays in Python link
Then The user should be redirected to Arrays in Python page
  
Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page	
Given The user is on the Arrays in Python page	
When The user clicks Try Here button in Arrays in Python page	
Then The user should be redirected to a page having an try Editor with a Run button to test	
   

Scenario: Verify that user does not receive error when click on Run button without entering code for Arrays in Python page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message in alert window

Scenario: Verify that user receives error for invalid python code for Arrays in Python page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Arrays in Python page
Given The user is in the tryEditor page 
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Arrays using List page
Given The user is in the Array page after Sign in
When The user clicks Arrays using List link
Then The user should be redirected to Arrays in Python page

Scenario: Verify that user is able to navigate to try Editor page for Arrays using List page 
Given The user is on the Arrays using List page
When The user clicks Try Here button in Arrays using List page
Then The user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Arrays using List page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should able to see an error message in alert window

Scenario: Verify that user receives error for invalid python code for Arrays using List page
Given The user is in the tryEditor page 
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Arrays using List page 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Basic Operations in Lists page
Given The user is in the Array page after Sign in
When The user clicks Basic Operations in Lists link
Then The user should be redirected to Basic Operations in Lists page

Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page 
Given The user is on the Basic Operations in Lists page
When The user clicks Try Here button in Basic Operations in Lists page
Then The user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Basic Operations in Lists page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message 

Scenario: Verify that user receives error for invalid python code for Basic Operations in Lists page
Given The user is in the tryEditor page 
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Basic Operations in Lists page 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Applications of Array page
Given The user is in the Array page after Sign in
When The user clicks Applications of Array link
Then The user should be redirected to Applications of Array page

Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page 
Given The user is on the Applications of Array page
When The user clicks Try Here button in Appliactions of Array page
Then The user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Applications of Array page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should not get any error message 

Scenario: Verify that user receives error for invalid python code for Applications of Array page
Given The user is in the tryEditor page 
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for Applications of Array page 
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run button
Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to Practice Questions page
Given The user is in the Array page after Sign in
When The user clicks Applications of Array link
Then The user should be redirected to Practice Questions page

Scenario: Verify that user is able to navigate to Search the array Page from Practice question page 
Given The user is on the practice question page
When The user clicks Search the Array link
Then The user should be redirected to search the array page
 
Scenario: Verify that user receives error for invalid python code on running Search the array question
Given The user is on the practice question editor 
When The user write the invalid code in Editor and Click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for Search the array question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Run button
Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for Search the array question
Given The user is on the practice question editor
When The user write the invalid code in Editor and Click the Submit button
Then The user see an error message Error occurred during submission

Scenario: Verify that user receives success message on submitting valid python code for Search the array question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Submit button
Then The user see success message Submission successful

Scenario: Verify that user is able to navigate to Max Consecutive Ones from Practice question page 
Given The user is on the practice question page
When The user clicks Max Consecutive Ones link
Then The user should be redirected to Max Consecutive Ones page

Scenario: Verify that user receives error for invalid python code on running Max Consecutive Ones question
Given The user is on the practice question editor 
When The user write the invalid code in Editor and Click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for Max Consecutive Ones question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Run button
Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for Max Consecutive Ones question
Given The user is on the practice question editor
When The user write the invalid code in Editor and Click the Submit button
Then The user see an error message Error occurred during submission

Scenario: Verify that user receives success message on submitting valid python code for Max Consecutive Ones question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Submit button
Then The user see success message Submission successful

Scenario: Verify that user is able to navigate to Find Numbers with Even Numbers of Digits from Practice question page 
Given The user is on the practice question page
When The user clicks Find Numbers with Even Numbers of Digits link
Then The user should be redirected to Find Numbers with Even Numbers of Digits page

Scenario: Verify that user receives error for invalid python code on running Find Numbers with Even Numbers of Digits question
Given The user is on the practice question editor 
When The user write the invalid code in Editor and Click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for Find Numbers with Even Numbers of Digits question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Run button
Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for Find Numbers with Even Numbers of Digits question
Given The user is on the practice question editor
When The user write the invalid code in Editor and Click the Submit button
Then The user see an error message Error occurred during submission

Scenario: Verify that user receives success message on submitting valid python code for Find Numbers with Even Numbers of Digits question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Submit button
Then The user see success message Submission successful

Scenario: Verify that user is able to navigate to Squares of a Sorted Array from Practice question page 
Given The user is on the practice question page
When The user clicks Squares of a Sorted Array link
Then The user should be redirected to Squares of a Sorted Array page

Scenario: Verify that user receives error for invalid python code on running Squares of a Sorted Array question
Given The user is on the practice question editor 
When The user write the invalid code in Editor and Click the Run button
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Run button
Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for Squares of a Sorted Array question
Given The user is on the practice question editor
When The user write the invalid code in Editor and Click the Submit button
Then The user see an error message Error occurred during submission

Scenario: Verify that user receives success message on submitting valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor
When The user write the valid code in Editor and Click the Submit button
Then The user see success message Submission successful













 








