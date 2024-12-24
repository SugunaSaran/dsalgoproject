Feature: Linked List

  Background: 
Given The user is in the home page after sign-in.
  Scenario: Verify that user is able to navigate to Linked List structure page
    When The user clicks the Getting Started button in Linked List panel
    When The user selects linked list item from the drop down menu
    Then The user should be directed to Linked list Data Structure Page

  Scenario: Verify that user is able to navigate to Introduction page
    Given The user is in the Linked list page
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page

  Scenario: Verify that user is able to navigate to try Editor page for Introduction page
    Given The user is on the Introduction page
    When The user clicks Try Here button in Introduction page
    Then The user should be redirected to a page having an try Editor with a Run button to test for list

  Scenario: Verify that user does not receive error when click on Run button without entering code for Introduction page
    Given The user is in the tryEditor page for list
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Introduction page
    Given The user is in the tryEditor page for list
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |

  Scenario Outline: Verify that user is able to see output for valid python code for Introduction page
    Given The user is in the tryEditor page for list
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |

  Scenario: Verify that user is able to navigate to Creating Linked List page
    Given The user is in the Linked list page
    When The user clicks Creating Linked List link
    Then The user should be redirected to Creating Linked List page

  Scenario: Verify that user is able to navigate to try Editor page for Creating Linked List page
    Given The user is on the Creating Linked List page
    When The user clicks Try Here button in Creating Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user does not receive error when click on Run button without entering code for Creating Linked List page
    Given The user is in the tryEditor page for list
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Creating Linked List page
    Given The user is in the tryEditor page for list
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |

  Scenario Outline: Verify that user is able to see output for valid python code for creating linked list page
    Given The user is in the tryEditor page for list
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |

  Scenario: Verify that user is able to navigate to Types of Linked List page
    Given The user is in the Linked list page
    When The user clicks Types of Linked List link
    Then The user should be redirected to Types of Linked List page

  Scenario: Verify that user is able to navigate to try Editor page for Types of Linked List page
    Given The user is on the Types of Linked List page
    When The user clicks Try Here button in Types of Linked List page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user does not receive error when click on Run button without entering code for Types of Linked List page
    Given The user is in the tryEditor page for Types of linked list page
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Types of Linked List page
    Given The user is in the tryEditor page for Types of linked list page
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |

  Scenario Outline: Verify that user is able to see output for valid python code for Types of linked list page
    Given The user is in the tryEditor page for Types of linked list page
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |

  
  Scenario: Verify that user is able to navigate to Implement linked List in Python page
    Given The user is in the Linked list page
    When The user clicks Implement Linked list in Python link
    Then The user should be redirected to Implement Linked list in Python page

  Scenario: Verify that user is able to navigate to try Editor page for Implement Linked List in Python page
    Given The user is on the Implement Linked list in Python page
    When The user clicks Try Here button in Implement Linked list in Python page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user does not receive error when click on Run button without entering code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked list in Python page
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked list in Python page
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |

  Scenario Outline: Verify that user is able to see output for valid python code for Implement Linked List in Python page
    Given The user is in the tryEditor page for Implement Linked list in Python page
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |
     
   Scenario: Verify that user is able to navigate to Traversal page
    Given The user is in the Linked list page
    When The user clicks Traversal link
    Then The user should be redirected to Traversal page
 
  Scenario: Verify that user is able to navigate to try Editor page for Traversal page
    Given The user is on the Traversal page
    When The user clicks Try Here button in Traversal page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user does not receive error when click on Run button without entering code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |
 
  Scenario Outline: Verify that user is able to see output for valid python code for Traversal page
    Given The user is in the tryEditor page for Traversal page
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |
      
      Scenario: Verify that user is able to navigate to Insertion page
    Given The user is in the Linked list page
    When The user clicks Insertion link
    Then The user should be redirected to Insertion page
 
  Scenario: Verify that user is able to navigate to try Editor page for Insertion page
    Given The user is on the Insertion page
    When The user clicks Try Here button in Insertion page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  Scenario: Verify that user does not receive error when click on Run button without entering code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list

  Scenario Outline: Verify that user receives error for invalid python code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |
 
  Scenario Outline: Verify that user is able to see output for valid python code for Insertion page
    Given The user is in the tryEditor page for Insertion page
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |
    @list
   Scenario: Verify that user is able to navigate to Deletion page
    Given The user is in the Linked list page
    When The user clicks Deletion link
    Then The user should be redirected to Deletion page
 @list
  Scenario: Verify that user is able to navigate to try Editor page for Deletion page
    Given The user is on the Deletion page
    When The user clicks Try Here button in Deletion page
    Then The user should be redirected to a page having an try Editor with a Run button to test
@list
  Scenario: Verify that user does not receive error when click on Run button without entering code for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user clicks the Run button without entering the code in the Editor for list
    Then The user should not get any error message in alert window in list
@list
  Scenario Outline: Verify that user receives error for invalid python code for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user clicks the Run button after entering "<invalid code>" in the Editor for list
    Then The user should able to see an error message in alert window for list

    Examples: 
      | invalid_code |
      | hello        |
      | hello world  |
      | hai          |
      | printf hello |
      | pint hai     |
 @list
  Scenario Outline: Verify that user is able to see output for valid python code for Deletion page
    Given The user is in the tryEditor page for Deletion page
    When The user write the "<valid_code>" in Editor and click the Run button for list
    Then The user should able to see output in the console for list

    Examples: 
      | valid_code           |
      | print \\"hello\\"    |
      | print \\"java\\"     |
      | print \\"selenium\\" |
      | print \\"cucumber\\" |
      | print \\"python \\"  |
      
         
