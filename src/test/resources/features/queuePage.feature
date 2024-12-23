@queuepage
Feature: Queue
 
Background: The user sign in to dsAlgo Portal 
Given  The user is in the Home page after sign-in for queue
 
  Scenario: Verify that user is able to navigate to queue data structure page
    When The user selects queue item from the drop down menu
    Then The user should be directed to Queue Data Structure Page
   
  Scenario Outline: Verify that user is able to navigate to the sub links of queue page
    Given The user is in the Queue page after Sign in
    When The user clicks the following "<sheetName>" and <rowNumber> in queue page
	  Then The user should be redirected to "<sheetName>" and <rowNumber> page in queue data structure
	  Examples:
	  |sheetName|rowNumber|
	  |Sheet1|0|
	  |Sheet1|1|
	  |Sheet1|2|
	  |Sheet1|3|
	  
	  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of queue page
    Given The user is in the <links> page in queue page
    When The user clicks the tryEditor button in subpages of queue
	  Then The user should be redirected to a page having an try Editor with a Run button to test in queue page
	  Examples:
	  |links|
	  |"implementation-lists"|
	  |"implementation-collections.deque"|
	  |"implementation-array"|
	  |"queue operations"|
	  
	  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of queue data structure
    Given The user is in the tryEditor page of corresponding <links> page in queue data structure
    When The user clicks the Run button without entering the code in the Editor in queue page
    Then The user should not see any error message or output in the Editor of queue page
    Examples:
	  |links|
	  |"implementation-lists"|
	  |"implementation-collections.deque"|
	  |"implementation-array"|
	  |"queue operations"|
	  
	  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of queue subpages
    Given The user is in the tryEditor page of <subpages> of Queue Page
    When The user clicks the Run button the following <invalidcodes> in the Editor of corresponding sub page of queue
    Then The user should see an error message in alert window in corresponding Page
    Examples:
    |subpages|invalidcodes|
	  |"implementation-lists"|"system" |
	  |"implementation-lists"|"hello" |
	  |"implementation-collections.deque"|"david"|
	  |"implementation-collections.deque"|"google"|
	  |"implementation-array"|"yippee"|
	  |"implementation-array"|"facebook"|
	  |"queue operations"|"hello"|
	  |"queue operations"|"system.out.println"|
    
	  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of <subpages> of Queue Page
    Given The user is in the tryEditor page <subpages> and writes an <invalidcodes> in Editor and click the Run button of corresponding Page
    When The user clicks the ok button of error alert window of that Page
	  Then The user should remain in the tryEditor page with Run button in correponding Page
	  Examples:
	  |subpages|invalidcodes|
	  |"implementation-lists"|"system" |
	  |"implementation-collections.deque"|"david"|
	  |"implementation-collections.deque"|"google"|
	  |"implementation-array"|"facebook"|
	  |"queue operations"|"system.out.println"|
	
	  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of queue subpages
    Given The user is in the tryEditor page of <subpages> of Queue Page
    When The user clicks the Run button the following <validcodes> in the Editor of corresponding sub page of queue
    Then The user should able to see an <output> in corresponding tryEditor page
    Examples:
    |subpages|validcodes|output|
	  |"implementation-lists"|"print('hi')"|"hi"|
	  |"implementation-collections.deque"|"print('hello')"|"hello"|
	  |"implementation-array"|"print('welcome to programming')"|"welcome to programming"|
	  |"queue operations"|"print('system.out.println')"|"system.out.println"|
	  
	  
	 
