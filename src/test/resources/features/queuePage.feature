@queuepage
Feature: Queue

  Background: The user sign in to dsAlgo Portal
    Given The user is in the home page after sign-in

  Scenario: Verify that user is able to navigate to queue data structure page
    When The user selects queue item from the drop down menu
    Then The user should be directed to Queue Data Structure Page

  Scenario Outline: Verify that user is able to navigate to the sub links of queue page
    Given The user is in the Queue page after Sign in
    When The user clicks the following "<sheetName>" and <rowNumber> in queue page
    Then The user should be redirected to "<sheetName>" and <rowNumber> page in queue data structure

    Examples: 
      | sheetName | rowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  Scenario Outline: Verify that user is able to navigate to the tryEditor of sub links of queue page
    Given The user is in the "<sheetName>" and <rowNumber> page in queue page
    When The user clicks the tryEditor button in subpages of queue
    Then The user should be redirected to a page having an try Editor with a Run button to test in queue page

    Examples: 
      | sheetName | rowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  Scenario Outline: Verify that user does not receives any error when click on Run button without entering code for different page of queue data structure
    Given The user is in the tryEditor page of corresponding "<sheetName>" and <rowNumber> page in queue data structure
    When The user clicks the Run button without entering the code in the Editor in queue page
    Then The user should not see any error message or output in the Editor of queue page

    Examples: 
      | sheetName | rowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  Scenario Outline: Verify that user receives error for invalid python code in tryEditor page of queue subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Queue Page
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> invalidcodes in the Editor of corresponding sub page of queue
    Then The user should see an error message in alert window in corresponding Page

    Examples: 
      | sheetName | rowNumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
      | Sheet2    |         2 |
      | Sheet2    |         3 |
      | Sheet2    |         4 |
      | Sheet2    |         5 |
      | Sheet2    |         6 |
      | Sheet2    |         7 |

  Scenario Outline: Verifying the ok button of error alert message in tryEditor Page of <subpages> of Queue Page
    Given The user is in the tryEditor page "<sheetName>" and <rowNumber> and writes an invalidcodes in Editor and click the Run button of corresponding Page
    When The user clicks the ok button of error alert window of that Page
    Then The user should remain in the tryEditor page with Run button in correponding Page

    Examples: 
      | sheetName | rowNumber |
      | Sheet2    |         0 |
      | Sheet2    |         1 |
      | Sheet2    |         2 |
      | Sheet2    |         3 |
      | Sheet2    |         4 |
      | Sheet2    |         5 |
      | Sheet2    |         6 |
      | Sheet2    |         7 |

  Scenario Outline: Verify that user receives the output for valid python code in tryEditor page of queue subpages
    Given The user is in the tryEditor page of "<sheetName>" and <rowNumber> of Queue Page for valid code
    When The user clicks the Run button the following "<sheetName>" and <rowNumber> in the Editor of corresponding sub page of queue
    Then The user should able to see an "<sheetName>" and <rowNumber> in corresponding tryEditor page

    Examples: 
      | sheetName | rowNumber |
      | Sheet3    |         0 |
      | Sheet3    |         1 |
      | Sheet3    |         2 |
      | Sheet3    |         3 |
