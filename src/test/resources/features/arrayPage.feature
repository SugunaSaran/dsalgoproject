@mytest
Feature: Array

  Background: 
    Given The user is in the home page after sign-in

  Scenario: Verify that user is able to navigate to Array page
    When The user clicks Get Started button in Array panel
    Then The user should be redirected to Array page

  Scenario: Verify that user is able to navigate to Arrays in Python page
    Given The user is in the Array page
    When The user clicks Arrays in Python link
    Then The user should be redirected to Arrays in Python page

  Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
    Given The user is on the Arrays in Python page
    When The user clicks Try Here button in Arrays in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test-Array

  Scenario: Verify that user does not receive error when click on Run button without entering code for Arrays in Python page
    Given The user is in the tryEditor page-Array
    When The user clicks the Run button without entering the code in the Editor-Array
    Then The user should not get any error message in alert window-Array

  Scenario Outline: Verify that user receives error for invalid python code for Arrays in Python page
    Given The user is in the tryEditor page-Array
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in Editor and click the Run button-Array
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to see output for valid python code for Arrays in Python page
    Given The user is in the tryEditor page-Array
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the console-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Arrays Using List page
    Given The user is in the Array page
    When The user clicks Arrays Using List link
    Then The user should be redirected to Arrays Using List page

  Scenario: Verify that user is able to navigate to try Editor page for Arrays Using List page
    Given The user is on the Arrays Using List page
    When The user clicks Try Here button in Arrays Using List page
    Then The user should be redirected to a page having an try Editor with a Run button to test-Array

  Scenario: Verify that user does not receive error when click on Run button without entering code for Arrays Using List page
    Given The user is in the tryEditor page-Array
    When The user clicks the Run button without entering the code in the Editor-Array
    Then The user should not get any error message in alert window-Array

  Scenario Outline: Verify that user receives error for invalid python code for Arrays Using List page
    Given The user is in the Arrays Using List tryEditor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in Editor and click the Run button-Array
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to see output for valid python code for Arrays Using List page
    Given The user is in the Arrays Using List tryEditor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the console-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Basic Operations in Lists page
    Given The user is in the Array page
    When The user clicks Basic Operations in Lists link
    Then The user should be redirected to Basic Operations in Lists page

  Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists page
    When The user clicks Try Here button in Basic Operations in Lists page
    Then The user should be redirected to a page having an try Editor with a Run button to test-Array

  Scenario: Verify that user does not receive error when click on Run button without entering code for Basic Operations in Lists page
    Given The user is in the Basic Operations in Lists tryEditor page
    When The user clicks the Run button without entering the code in the Editor-Array
    Then The user should not get any error message in alert window-Array

  Scenario Outline: Verify that user receives error for invalid python code for Basic Operations in Lists page
    Given The user is in the Basic Operations in Lists tryEditor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in Editor and click the Run button-Array
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to see output for valid python code for Basic Operations in Lists page
    Given The user is in the Basic Operations in Lists tryEditor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the console-Array

Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Applications of Array page
    Given The user is in the Array page
    When The user clicks Applications of Array link
    Then The user should be redirected to Applications of Array page

  Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page
    Given The user is on the Applications of Array page
    When The user clicks Try Here button in Applications of Array page
    Then The user should be redirected to a page having an try Editor with a Run button to test-Array

  Scenario: Verify that user does not receive error when click on Run button without entering code for Applications of Array page
    Given The user is in the Applications of Array tryEditor page
    When The user clicks the Run button without entering the code in the Editor-Array
    Then The user should not get any error message in alert window-Array

  Scenario Outline: Verify that user receives error for invalid python code for Applications of Array page
    Given The user is in the Applications of Array tryEditor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in Editor and click the Run button-Array
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to see output for valid python code for Applications of Array  page
    Given The user is in the Applications of Array tryEditor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the console-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Practice Questions page
    Given The user is on the Arrays in Python page
    When The user clicks Practice Questions link-Array
    Then The user should be redirected to Practice Questions page-Array

  Scenario: Verify that user is able to navigate to Search the array Page from Practice question page
    Given The user is on the practice question page-Array
    When The user clicks Search the Array link
    Then The user should be redirected to search the array editor page

  Scenario Outline: Verify that user receives error for invalid python code on running Search the array question
    Given The user is on the Search the array editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Run button
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  
  Scenario Outline: Verify that user is able to run valid python code for Search the array question
    Given The user is on the Search the array editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in practice page Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the practice page console

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario Outline: Verify that user receives error on submitting invalid python code for Search the array question
    Given The user is on the Search the array editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Submit button
    Then The user see an error message Error occurred during submission in console

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user receives success message on submitting valid python code for Search the array question
    Given The user is on the Search the array editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the submit button
    Then The user should able to see submission success message

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Max consecutive ones Page from Practice question page
    Given The user is on the practice question page-Array
    When The user clicks Max consecutive ones link
    Then The user should be redirected to Max consecutive ones editor page

  Scenario Outline: Verify that user receives error for invalid python code on running Max consecutive ones question
    Given The user is on the Max consecutive ones editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Run button
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to run valid python code for Max consecutive ones question
    Given The user is on the Max consecutive ones editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in practice page Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the practice page console

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario Outline: Verify that user receives error on submitting invalid python code for Max consecutive ones question
    Given The user is on the Max consecutive ones editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Submit button
    Then The user see an error message Error occurred during submission in console

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user receives success message on submitting valid python code for Max consecutive ones question
    Given The user is on the Max consecutive ones editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the submit button
    Then The user should able to see submission success message

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page from Practice question page
    Given The user is on the practice question page-Array
    When The user clicks Find Numbers with Even Number of Digits link
    Then The user should be redirected to Find Numbers with Even Number of Digits editor page

  Scenario Outline: Verify that user receives error for invalid python code on running Find Numbers with Even Number of Digits question
    Given The user is on the Find Numbers with Even Number of Digits editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Run button
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits question
    Given The user is on the Find Numbers with Even Number of Digits editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in practice page Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the practice page console

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario Outline: Verify that user receives error on submitting invalid python code for Find Numbers with Even Number of Digits question
    Given The user is on the Find Numbers with Even Number of Digits editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Submit button
    Then The user see an error message Error occurred during submission in console

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user receives success message on submitting valid python code for Find Numbers with Even Number of Digits question
    Given The user is on the Find Numbers with Even Number of Digits editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the submit button
    Then The user should able to see submission success message

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page from Practice question page
    Given The user is on the practice question page-Array
    When The user clicks Squares of a Sorted Array link
    Then The user should be redirected to Squares of a Sorted Array editor page

  Scenario Outline: Verify that user receives error for invalid python code on running Squares of a Sorted Array question
    Given The user is on the Squares of a Sorted Array editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Run button
    Then The user should able to see an error message in alert window-Array

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user is able to run valid python code for Squares of a Sorted Array question
    Given The user is on the Squares of a Sorted Array editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in practice page Editor and click the Run button-Array
    Then The user should able to see output <rownumber> in the practice page console

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |

  Scenario Outline: Verify that user receives error on submitting invalid python code for Squares of a Sorted Array
    Given The user is on the Squares of a Sorted Array editor page
    When The user enters the invalid_code <rownumber> from sheetname "<Sheet1>" in practice page Editor and click the Submit button
    Then The user see an error message Error occurred during submission in console

    Examples: 
      | Sheetname |  | rownumber |
      | Invalid   |  |         0 |
      | Invalid   |  |         1 |
      | Invalid   |  |         2 |
      | Invalid   |  |         3 |
      | Invalid   |  |         4 |

  Scenario Outline: Verify that user receives success message on submitting valid python code for Squares of a Sorted Array
    Given The user is on the Squares of a Sorted Array editor page
    When The user enters the valid_code <rownumber> from sheetname "<Sheet2>" in Editor and click the submit button
    Then The user should able to see submission success message

    Examples: 
      | Sheetname |  | rownumber |
      | Valid     |  |         0 |
      | Valid    |   |         1 |
      | Valid    |   |         2 |
      | Valid    |   |         3 |
      | Valid    |   |         4 |
