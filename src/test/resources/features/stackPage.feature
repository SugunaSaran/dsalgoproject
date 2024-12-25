@stackpage
Feature: Stack
 
Background: The user sign in to dsAlgo Portal 
Given  The user is in the Home page after sign-in for stack
 
  Scenario: Verify that user is able to navigate to stack data structure page
    When The user selects stack item by clicking the Getting Started Link
    Then The user should be directed to stack Data Structure Page
   
  Scenario Outline: Verify that user is able to navigate to the sub links of stack page
    Given The user is in the Stack page after Sign in
    When The user clicks the following "<sheetName>" and <rowNumber> in stack page
	  Then The user should be redirected to "<sheetName>" and <rowNumber> page in stack data structure
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  |Sheet1|3|
	  
	  
	  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of stack page
    Given The user is in the "<sheetName>" and <rowNumber> page in stack page
    When The user clicks the tryEditor button in subpages of stack
	  Then The user should be redirected to a page having an try Editor with a Run button to test in stack page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  
	  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of stack data structure
    Given The user is in the tryEditor page of corresponding "<sheetName>" and <rowNumber> page in stack data structure
    When The user clicks the Run button without entering the code in the Editor in stack page
    Then The user should not see any error message or output in the Editor of stack page
    Examples:
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  
	  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of stack subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Stack Page
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> in the Editor of corresponding sub page of stack
    Then The user should see an error message in alert window in corresponding stack Page
    Examples:
    |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  |Sheet2|4|
	  
	  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of "<sheetName>" and <rowNumber> of Stack page
    Given The user is in the tryEditor page "<sheetName>" and <rowNumber> and writes an invalidcodes in Editor and click the Run button of corresponding Stack Page
    When The user clicks the ok button of error alert window of that Stack Page
	  Then The user should remain in the tryEditor page with Run button in corresponding stack Page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  |Sheet2|4|
	  
	  
	  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of stack subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Stack Page for valid code
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> with valid code in the Editor of corresponding sub page of stack
    Then The user should able to see an "<sheetName>" and <rowNumber> in corresponding stack tryeditor page
    Examples:
    |sheetName|rowNumber|
	  |Sheet3|0|
	  |Sheet3|1|
	  |Sheet3|2|
	  |Sheet3|3|
	  
	  
    
	 