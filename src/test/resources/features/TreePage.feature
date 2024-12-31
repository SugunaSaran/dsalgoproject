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
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  |Sheet1|3|
	  |Sheet1|4|
	  |Sheet1|5|
	  |Sheet1|6|
	  |Sheet1|7|
	  |Sheet1|8|
	  |Sheet1|9|
	  |Sheet1|10|
	  |Sheet1|11|
	  |Sheet1|12|
	  |Sheet1|13|
	  
	  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of tree page
    Given The user is in the "<sheetName>" and <rowNumber> page in tree page
    When The user clicks the tryEditor button in subpages of tree
	  Then The user should be redirected to a page having an try Editor with a Run button to test in tree page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  |Sheet1|3|
	  |Sheet1|4|
	  |Sheet1|5|
	  |Sheet1|6|
	  |Sheet1|7|
	  |Sheet1|8|
	  |Sheet1|9|
	  |Sheet1|10|
	  |Sheet1|11|
	  |Sheet1|12|
	  @Test3
	  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of tree data structure
    Given The user is in the tryEditor page of corresponding "<sheetName>" and <rowNumber> page in tree data structure
    When The user clicks the Run button without entering the code in the Editor in tree page
    Then The user should not see any error message or output in the Editor of tree page
    Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  |Sheet1|3|
	  |Sheet1|4|
	  |Sheet1|5|
	  |Sheet1|6|
	  |Sheet1|7|
	  |Sheet1|8|
	  |Sheet1|9|
	  |Sheet1|10|
	  |Sheet1|11|
	  |Sheet1|12|
	  @Test3
	  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of tree subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Tree Page
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> invalidcodes in the Editor of corresponding sub page of tree
    Then The user should see an error message in alert window in corresponding tree Page
    Examples:
    |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  |Sheet2|4|
	  |Sheet2|5|
	  |Sheet2|6|
	  |Sheet2|7|
	  |Sheet2|8|
	  |Sheet2|9|
	  |Sheet2|10|
	  |Sheet2|11|
	  |Sheet2|12| 
    
	  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of subpages of Tree Page
    Given The user is in the tryEditor page "<sheetName>" and <rowNumber> and writes an invalidcodes in Editor and click the Run button of corresponding Tree Page
    When The user clicks the ok button of error alert window of that tree page
	  Then The user should remain in the tryEditor page with Run button in correponding tree Page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  |Sheet2|4|
	  |Sheet2|5|
	  |Sheet2|6|
	  |Sheet2|7|
	  |Sheet2|8|
	  |Sheet2|9|
	  |Sheet2|10|
	  |Sheet2|11|
	  |Sheet2|12| 
	
	  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of tree subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of tree Page for valid code
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> in the Editor of corresponding sub page of tree
    Then The user should able to see an "<sheetName>" and <rowNumber> in corresponding tryEditor page of tree
    Examples:
    |sheetName|rowNumber|
	  |Sheet3|0|
	  |Sheet3|1|
	  |Sheet3|2|
	  |Sheet3|3|
	  |Sheet3|4|
	  |Sheet3|5|
	  |Sheet3|6|
	  |Sheet3|7|
	  |Sheet3|8|
	  |Sheet3|9|
	  |Sheet3|10|
	  |Sheet3|11|
	  |Sheet3|12| 
	 
	  