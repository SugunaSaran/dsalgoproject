
Feature: Graph
 
Background: The user sign in to dsAlgo Portal 
Given  The user is in the home page after sign-in
 
  Scenario: Verify that user is able to navigate to graph data structure page
    When The user selects graph item by clicking the Getting Started Link
    Then The user should be directed to graph Data Structure Page
   
  Scenario Outline: Verify that user is able to navigate to the sub links of graph page
    Given The user is in the graph page after Sign in
    When The user clicks the following "<sheetName>" and <rowNumber> in graph page
	  Then The user should be redirected to "<sheetName>" and <rowNumber> page in graph data structure
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  
	  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of graph page
    Given The user is in the "<sheetName>" and <rowNumber> page in graph page
    When The user clicks the tryEditor button in subpages of graph
	  Then The user should be redirected to a page having an try Editor with a Run button to test in graph page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  
	  
	  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of graph data structure
    Given The user is in the tryEditor page of corresponding "<sheetName>" and <rowNumber> page in graph data structure
    When The user clicks the Run button without entering the code in the Editor in graph page
    Then The user should not see any error message or output in the Editor of graph page
    Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  
	  @Test2
	  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of graph subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of graph Page
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> in the Editor of corresponding sub page of graph
    Then The user should see an error message in alert window in corresponding graph Page
    Examples:
    |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  

	  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of "<sheetName>" and <rowNumber> of graph page
    Given The user is in the tryEditor page "<sheetName>" and <rowNumber> and writes an invalidcodes in Editor and click the Run button of corresponding graph Page
    When The user clicks the ok button of error alert window of that graph Page
	  Then The user should remain in the tryEditor page with Run button in corresponding graph Page
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet2|0|
	  |Sheet2|1|
	  |Sheet2|2|
	  |Sheet2|3|
	  
	  
	  
	  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of graph subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of graph Page for valid code
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> with valid code in the Editor of corresponding sub page of graph
    Then The user should able to see an "<sheetName>" and <rowNumber> in corresponding graph tryeditor page
    Examples:
    |sheetName|rowNumber|
	  |Sheet3|0|
	  |Sheet3|1|
	  
	  