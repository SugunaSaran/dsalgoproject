package stepdefinitions;
import org.testng.Assert;

import Pages.HomeTree;
import Pages.TryEditorPage;
import Pages.treePJava;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TreePage {
	HomeTree T;
    treePJava DD=new treePJava();
	TryEditorPage tp=new TryEditorPage();
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_Home_page_after_sign_in() {
		 T=new HomeTree();
	}
	@When("The user clicks the Getting Started button in Tree Panel")
	public void the_user_clicks_the_getting_started_button_in_tree_panel() {
		T.clickTreeLink();
	}

	@Then("The user should be directed to Tree Data Structure Page")
	public void the_user_should_be_directed_to_tree_data_structure_page() {
		Assert.assertEquals("Tree", T.validatePageTitle());
	    
	}

	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in() {
		T.clickTreeLink();
	    
	}

	@When("The user clicks Overview of Trees link in Python page")
	public void the_user_clicks_overview_of_trees_link_in_python_page() {
		DD.checkOverviewofTreesLink();
	    
	}

	@Then("The user should be redirected to Overview of Trees in Python page")
	public void the_user_should_be_redirected_to_overview_of_trees_in_python_page() {
		Assert.assertEquals("Operations in Stack", DD.validatePageLink());
	}
	
//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
	@Given("The user is on the Overview of Trees in Python page")
	public void the_user_is_on_the_overview_of_trees_in_python_page() {
		 T.clickTreeLink();
		    DD.checkOverviewofTreesLink();	  
	   
	}

	@When("The user clicks Try Here button in Overview of Trees in Python page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_in_python_page() {
		DD.checkTryEditorLink();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    Assert.assertEquals(DD.validatePageLink(), "Assessment");
	  
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
	    T.clickTreeLink();
	    DD.checkOverviewofTreesLink();
	    DD.checkTryEditorLink();
	  }
	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	  tp.checkCode(" ");
	 
	 }

	@Then("The user should not see any error message or output")
	public void the_user_should_not_see_any_error_message_or_output() {
		 Assert.assertEquals(false,tp.isAlertPresent());
	 }
	
	@When("The user write the invalid code in Editor and click the Run button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
		tp.checkCode("system.out.println");
	  
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    Assert.assertEquals(true, tp.isAlertPresent());
	  
	}
	
	//Scenario: Verify that user receives error for invalid python code for Overview of Trees
	@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
	public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
		 	T.clickTreeLink();
		    DD.checkOverviewofTreesLink();
		    DD.checkTryEditorLink();
		    tp.checkCode("system");
		    }
	
	@When("The user clicks the ok button of error alert window")
	public void the_user_clicks_the_ok_button_of_error_alert_window() {
	   tp.acceptAlert();	  
	}

	@Then("The user should remain in the tryEditor page with Run button")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
		 Assert.assertEquals(DD.validatePageLink(), "Assessment");
	  
	}
	//
	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
		tp.checkCode("print('hi')");
	  
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		Assert.assertEquals(tp.validateOutput(), "hi");
	}
	
//Terminologies	
	
	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in1() {
		T.clickTreeLink();
	    
	}

	@When("The user clicks Terminlogies link in Python page")
	public void the_user_clicks_Terminologies_link_in_python_page1() {
		DD.checkTerminologiesLink();
	    
	}

	@Then("The user should be redirected to Terminlogies in Python page")
	public void the_user_should_be_redirected_to_overview_of_trees_in_python_page1() {
		Assert.assertEquals("Terminologies", DD.validatePageLink());
	}

	//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
		@Given("The user is on the Terminologies  in Python page")
		public void the_user_is_on_the_Terminologies_in_python_page() {
			 T.clickTreeLink();
			    DD.checkTerminologiesLink();	  
		   
		}

		@When("The user clicks Try Here button in Terminlogies in Python page")
		public void the_user_clicks_try_here_button_in_Terminologies_in_python_page() {
			DD.checkTryEditorLink();
		}

		@Then("The user should be redirected to a page having an try Editor with a Run button to test")
		public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test11() {
		    Assert.assertEquals(DD.validatePageLink(), "Assessment");
		  
		}

		@Given("The user is in the tryEditor page")
		public void the_user_is_in_the_try_editor_page1() {
		    T.clickTreeLink();
		    DD.checkTerminologiesLink();
		    DD.checkTryEditorLink();
		  }
		@When("The user clicks the Run button without entering the code in the Editor")
		public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor1() {
		  tp.checkCode(" ");
		 
		 }

		@Then("The user should not see any error message or output")
		public void the_user_should_not_see_any_error_message_or_output1() {
			 Assert.assertEquals(false,tp.isAlertPresent());
		 }
		
		@When("The user write the invalid code in Editor and click the Run button")
		public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button1() {
			tp.checkCode("system.out.println");
		  
		}

		@Then("The user should able to see an error message in alert window")
		public void the_user_should_able_to_see_an_error_message_in_alert_window1() {
		    Assert.assertEquals(true, tp.isAlertPresent());
		  
		}
		//Scenario: Verify that user receives error for invalid python code for Overview of Trees
		@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
		public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button1() {
			 	T.clickTreeLink();
			    DD.checkTerminologiesLink();
			    DD.checkTryEditorLink();
			    tp.checkCode("system");
			    }
		
		@When("The user clicks the ok button of error alert window")
		public void the_user_clicks_the_ok_button_of_error_alert_window1() {
		   tp.acceptAlert();	  
		}

		@Then("The user should remain in the tryEditor page with Run button")
		public void the_user_should_remain_in_the_try_editor_page_with_run_button1() {
			 Assert.assertEquals(DD.validatePageLink(), "Assessment");
		  
		}
		//
		@When("The user write the valid code in Editor and click the Run button")
		public void the_user_write_the_valid_code_in_editor_and_click_the_run_button1() {
			tp.checkCode("print('hi')");
		  
		}

		@Then("The user should able to see output in the console")
		public void the_user_should_able_to_see_output_in_the_console1() {
		 Assert.assertEquals(tp.validateOutput(), "hi");

	
		 
		 
		 
		 @Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Tree Traversals link in Python page")
			public void the_user_clicks_Tree Traversals_link_in_python_page() {
				DD.checkTreeTraversalssLink();
			    
			}

			@Then("The user should be redirected to Tree Traversals in Python page")
			public void  the_user_clicks_Types_of_Trees_link_in_python_page() {
				Assert.assertEquals("Tree Traversals", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Types of Trees in Python page")
			public void  the_user_is_in_the_try_editor_page()  {
				 T.clickTreeLink();
				    DD.checkTreeTraversalsLink();	  
			   
			}

			@When("The user clicks Try Here button in  Tree Traversals in Python page")
			public void  the_user_clicks_try_editorin_python_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void  the_user_clicks_try_editor_link_in_python_page(){
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_clicks_try_editorin_python_page() {
			    T.clickTreeLink();
			    DD.checkTreeTraversalsLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor1() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkTreeTraversalsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button1() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}

		//Traversals-Illustration	
	
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Traversals-Illustrationlink in Python page")
			public void the_user_clicksTraversals_Illustrationlink_in_python_page() {
				DD.checkTraversals-IllustrationLink();
			    
			}

			@Then("The user should be redirected to Traversals-Illustration in Python page")
			public void the_user_should_be_redirected_to_Traversals_Illustrations_in_python_page() {
				Assert.assertEquals("Traversals-Illustration", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Traversals-Illustration in Python page")
			public void the_user_is_on_the_Traversals_Illustration_in_python_page() {
				 T.clickTreeLink();
				    DD.checkTraversals-IllustrationLink();	  
			   
			}

			@When("The user clicks Try Here button in Traversals-Illustration in Python page")
			public void the_user_clicks_try_here_button_in_Traversals_Illustration_in_python_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkTraversals-IllustrationLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkTraversals-IllustrationLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
			
			
			//Binary Trees
			//@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Trees link in Python page")
			public void the_user_clicks_overview_of_trees_link_in_python_page() {
				DD.checkBinaryTreesLink();
			    
			}

			@Then("The user should be redirected to Binary Trees in Python page")
			public void the_user_should_be_redirected_to_Binary Trees_in_python_page() {
				Assert.assertEquals("Binary Trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Binary Trees in Python page")
			public void the_user_is_on_the_Binary_Trees_in_python_page() {
				 T.clickTreeLink();
				    DD.checkBinaryTreesLink();	  
			   
			}

			@When("The user clicks Try Here button in Binary Trees in Python page")
			public void the_user_clicks_try_here_button_in_Binary_Trees_in_python_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkBinaryTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkBinaryTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
			
			//Types of Binary Trees
			
			
			
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Types of Binary Trees link in Python page")
			public void the_user_clicks_Types_of_Binary_Trees_link_in_python_page() {
				DD.checkOverviewofTreesLink();
			    
			}

			@Then("The user should be redirected to Types of Binary Trees in Python page")
			public void the_user_should_be_redirected_to_Types_of_Binary_Trees_in_python_page() {
				Assert.assertEquals("Types of Binary Trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Types of Binary Trees in Python page")
			public void the_user_is_on_the_Types_of_Binary_Trees_in_python_page() {
				 T.clickTreeLink();
				    DD.checkTypesofBinaryTreesLink();	  
			   
			}

			@When("The user clicks Try Here button in Types of Binary Trees in Python page")
			public void the_user_clicks_try_here_button_in_Types_of_Binary_Trees_in_python_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkTypesofBinaryTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkTypesofBinaryTreessLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
			
			
			
			//Implementation in Python
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Implementation in Python link in Python page")
			public void the_user_clicks_Implementation_in_Python_Trees_Impk_in_python_page() {
				DD.checkImplementationinPythonLink();
			    
			}

			@Then("The user should be redirected to Implementation in Python in Python page")
			public void the_user_should_be_redirected_to_Implementation_in_Python_in_python_page() {
				Assert.assertEquals("Implementation of Binary Trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Overview of Trees in Python page")
			public void the_user_is_on_the_Implementation_of_Python_Trees_python_page() {
				 T.clickTreeLink();
				    DD.checkImplementationinPythonLink();	  
			   
			}

			@When("The user clicks Try Here button in Implementation in Python in Python page")
			public void the_user_clicks_try_here_button_in_Implementation_in_Phython_Trees_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkImplementationinPythonsLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkImplementationinPythonsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
	
			//Binary Tree Traversals
			
			

			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Tree Traversals link in Python page")
			public void the_user_clicks_Implementation_in_Python_link_in_python_page() {
				DD.checkBinaryTreeTraversalsLink();
			    
			}

			@Then("The user should be redirected to Binary Tree Traversals in Python page")
			public void the_user_should_be_redirected_to_Binary_Tree_Traversals_page() {
				Assert.assertEquals("Binary Tree Traversals", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Overview of Trees in Python page")
			public void the_user_is_on_the_Binary_Tree_Traversals_in_python_page() {
				 T.clickTreeLink();
				    DD.check BinaryTreeTraversalsLink();	  
			   
			}

			@When("The user clicks Try Here button in Binary Tree Traversals in Python page")
			public void the_user_clicks_try_here_button_in_Binary_Tree_Traversals_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkBinaryTreeTraversalsLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkBinaryTreeTraversalsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
		
			
		//Implementation of Binary Trees
			
			
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Tree Traversals link in Python page")
			public void the_user_clicks_Implementation_in_Python_link_in_python_page() {
				DD.checkBinaryTreeTraversalsLink();
			    
			}

			@Then("The user should be redirected to Binary Tree Traversals in Python page")
			public void the_user_should_be_redirected_to_Binary_Tree_Traversals_page() {
				Assert.assertEquals("Binary Tree Traversals", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Overview of Trees in Python page")
			public void the_user_is_on_the_Binary Tree Traversals_in_python_page() {
				 T.clickTreeLink();
				    DD.check BinaryTreeTraversalsLink();	  
			   
			}

			@When("The user clicks Try Here button in Binary Tree Traversals in Python page")
			public void the_user_clicks_try_here_button_in_Binary_Tree_Traversals_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkBinaryTreeTraversalsLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkBinaryTreeTraversalsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
		
			//Applications of Binary trees	
			
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Applications of Binary trees in Python page")
			public void the_user_clicks_Applications_of_Binary_trees_link_in_python_page() {
				DD.checkApplicationsofBinarytreesLink();
			    
			}

			@Then("The user should be redirected to Applications of Binary trees in Python page")
			public void the_user_should_be_redirected_to_Binary_Tree_Traversals_page() {
				Assert.assertEquals("Applications of Binary trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Applications of Binary treess in Python page")
			public void the_user_is_on_the_Applications_of_Binary_trees_in_python_page() {
				 T.clickTreeLink();
				    DD.checkApplicationsofBinarytreesLink();	  
			   
			}

			@When("The user clicks Try Here button in Applications of Binary trees in Python page")
			public void the_user_clicks_try_here_button_in_Applications_of_Binary_trees_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkApplicationsofBinarytreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkApplicationsofBinarytreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
			//Binary Search Trees
			
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Binary Search Trees in Python page")
			public void the_user_clicks_Applications_of_Binary_trees_link_in_python_page() {
				DD.checkBinarySearchTreesLink();
			    
			}

			@Then("The user should be redirected to Binary Search Trees in Python page")
			public void the_user_should_be_redirected_to_Binary_Search_Trees_page() {
				Assert.assertEquals("Applications of Binary trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Binary Search Trees in Python page")
			public void the_user_is_on_the_Binary_Search_trees_in_python_page() {
				 T.clickTreeLink();
				    DD.checkBinarySearchTreesLink();	  
			   
			}

			@When("The user clicks Try Here button in Binary Search Treesin Python page")
			public void the_user_clicks_try_here_button_in_Binary_Search__trees_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkBinarySearchTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkBinarySearchTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
			//Implementation Of BST
			
			
			@Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in() {
				T.clickTreeLink();
			    
			}

			@When("The user clicks Binary Implementation Of BST in Python page")
			public void the_user_clicks_Implementation_Of_BST_in_python_page() {
				DD.checkImplementationOfBSTLink();
			    
			}

			@Then("The user should be redirected to Implementation Of BST in Python page")
			public void the_user_should_be_redirected_to_Implementation_Of_BST_page() {
				Assert.assertEquals("Implementation Of BST", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Binary Search Trees in Python page")
			public void the_user_is_on_the_Implementation_Of_BST_in_python_page() {
				 T.clickTreeLink();
				    DD.checkImplementationOfBSTLink();	  
			   
			}

			@When("The user clicks Try Here button in Implementation Of BSTin Python page")
			public void the_user_clicks_try_here_button_in_Implementation_Of_BST_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    T.clickTreeLink();
			    DD.checkImplementationOfBSTLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	T.clickTreeLink();
				    DD.checkImplementationOfBSTLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
			
			
	