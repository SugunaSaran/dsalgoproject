@treepage
Feature:Tree
Background: The user sign in to dsAlgo Portal 
Given  The user is in the home page after sign-in
 
  Scenario: Verify that user is able to navigate to tree data structure page
    When The user selects tree item from the drop down menu
    Then The user should be directed to tree Data Structure Page
   
  Scenario Outline: Verify that user is able to navigate to the sub links of tree page
    Given The user is in the Tree page after Sign in
    When The user clicks the following "<sheetName>" and <rowNumber> in tree page
	  Then The user should be redirected to "<sheetName>" and <rowNumber> page in tree data structure
	  Examples:
	  |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12|
	  |TreePage|13|

	  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of tree page
    Given The user is in the "<sheetName>" and <rowNumber> page in tree page
    When The user clicks the tryEditor button in subpages of tree
	  Then The user should be redirected to a page having an try Editor with a Run button to test in tree page
	  Examples:
	  |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12|
	 
	  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of tree data structure
    Given The user is in the tryEditor page of corresponding "<sheetName>" and <rowNumber> page in tree data structure
    When The user clicks the Run button without entering the code in the Editor in tree page
    Then The user should not see any error message or output in the Editor of tree page
    Examples:
	  |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12|
	 
	  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of tree subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Tree Page
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> invalidcodes in the Editor of corresponding sub page of tree
    Then The user should see an error message in alert window in corresponding tree Page
    Examples:
    |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12| 
    
	  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of subpages of Tree Page
    Given The user is in the tryEditor page "<sheetName>" and <rowNumber> and writes an invalidcodes in Editor and click the Run button of corresponding Tree Page
    When The user clicks the ok button of error alert window of that tree page
	  Then The user should remain in the tryEditor page with Run button in correponding tree Page
	  Examples:
	  |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12| 
	
	  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of tree subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of tree Page for valid code
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> in the Editor of corresponding sub page of tree
    Then The user should able to see an "<sheetName>" and <rowNumber> in corresponding tryEditor page of tree
    Examples:
    |sheetName|rowNumber|
	  |TreePage|0|
	  |TreePage|1|
	  |TreePage|2|
	  |TreePage|3|
	  |TreePage|4|
	  |TreePage|5|
	  |TreePage|6|
	  |TreePage|7|
	  |TreePage|8|
	  |TreePage|9|
	  |TreePage|10|
	  |TreePage|11|
	  |TreePage|12| 
	 
	  