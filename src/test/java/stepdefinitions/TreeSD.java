package stepdefinitions;
import org.testng.Assert;

import Pages.HomePage;
import Pages.TryEditorPage;
import Pages.treePJava;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD:src/test/java/stepdefinitions/TreeSD.java
public abstract class TreeSD {
	HomePage hp;
    treePJava DD=new treePJava();
	TryEditorPage tp=new TryEditorPage();
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_Home_page_after_sign_in() {
		 hp=new HomePage();
	}
	@When("The user clicks the Getting Started button in Tree Panel")
	public void the_user_clicks_the_getting_started_button_in_tree_panel() {
		hp.clickTreeLink();
	}

	@Then("The user should be directed to Tree Data Structure Page")
	public void the_user_should_be_directed_to_tree_data_structure_page() {
		Assert.assertEquals("Tree", hp.validatePageTitle());
	    
	}

	@Given("The user is in the Tree page after Sign in")
	public void the_user_is_in_the_tree_page_after_sign_in11() {
		hp.clickTreeLink();
	    
	}

	@When("The user clicks Overview of Trees link in Python page")
	public void the_user_clicks_overview_of_trees_link_in_python_page12() {
		DD.checkOverviewofTreesLink();
	    
	}

	@Then("The user should be redirected to Overview of Trees in Python page")
	public void the_user_should_be_redirected_to_overview_of_trees_in_python_page() {
		Assert.assertEquals("Operations in Stack", DD.validatePageLink());
	}
	
//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
	@Given("The user is on the Overview of Trees in Python page")
	public void the_user_is_on_the_overview_of_trees_in_python_page() {
		 hp.clickTreeLink();
		    DD.checkOverviewofTreesLink();	  
	   
	}

	@When("The user clicks Try Here button in Overview of Trees in Python page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_in_python_page() {
		DD.checkTryEditorLink();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test13() {
	    Assert.assertEquals(DD.validatePageLink(), "Assessment");
	  
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page14() {
	    hp.clickTreeLink();
	    DD.checkOverviewofTreesLink();
	    DD.checkTryEditorLink();
	  }
	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor15() {
	  tp.checkCode(" ");
	 
	 }

	@Then("The user should not see any error message or output")
	public void the_user_should_not_see_any_error_message_or_output16() {
		 Assert.assertEquals(false,tp.isAlertPresent());
	 }
	
	@When("The user write the invalid code in Editor and click the Run button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button17() {
		tp.checkCode("system.out.println");
	  
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window18() {
	    Assert.assertEquals(true, tp.isAlertPresent());
	  
	}
	
	//Scenario: Verify that user receives error for invalid python code for Overview of Trees
	@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
	public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button19() {
		 	hp.clickTreeLink();
		    DD.checkOverviewofTreesLink();
		    DD.checkTryEditorLink();
		    tp.checkCode("system");
		    }
	
	@When("The user clicks the ok button of error alert window")
	public void the_user_clicks_the_ok_button_of_error_alert_window20() {
	   tp.acceptAlert();	  
	}

	@Then("The user should remain in the tryEditor page with Run button")
	public void the_user_should_remain_in_the_try_editor_page_with_run_button21() {
		 Assert.assertEquals(DD.validatePageLink(), "Assessment");
	  
	}
	//
	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button22() {
		tp.checkCode("print('hi')");
	  
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console23() {
		Assert.assertEquals(tp.validateOutput(), "hi");
	}
	
//Terminologies	
	
	

	@When("The user clicks Terminlogies link in Python page")
	public void the_user_clicks_Terminologies_link_in_python_page1() {
		DD.checkTerminologiesLink();
	    
	}

	@Then("The user should be redirected to Terminlogies in Python page")
	public void the_user_should_be_redirected_to_overview_of_trees_in_python_page1() {
		Assert.assertEquals("Terminologies", DD.validatePageLink());
	}

	
		@Given("The user is on the Terminologies  in Python page")
		public void the_user_is_on_the_Terminologies_in_python_page() {
			 hp.clickTreeLink();
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
		    hp.clickTreeLink();
		    DD.checkTerminologiesLink();
		    DD.checkTryEditorLink();
		  }
		@When("The user clicks the Run button without entering the code in the Editor")
		public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor24() {
		  tp.checkCode(" ");
		 
		 }

		@Then("The user should not see any error message or output")
		public void the_user_should_not_see_any_error_message_or_output1() {
			 Assert.assertEquals(false,tp.isAlertPresent());
		 }
		
		//Scenario: Verify that user receives error for invalid python code for Overview of Trees
		@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
		public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button1() {
			 	hp.clickTreeLink();
			    DD.checkTerminologiesLink();
			    DD.checkTryEditorLink();
			    tp.checkCode("system");
			    }
		
		@When("The user clicks the ok button of error alert window")
		public void the_user_clicks_the_ok_button_of_error_alert_window_Terminologies() {
		   tp.acceptAlert();	  
		}

		@Then("The user should remain in the tryEditor page with Run button")
		public void the_user_should_remain_in_the_try_editor_page_with_run_button11() {
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
 
		}
	
		@When("The user clicks Types of Trees link in Python page")
		public void the_user_clicks_Types_of_Trees_link_in_python_page1() {
			DD.checkTypesofTreesLink();
		    
		}

		@Then("The user should be redirected to Types of Trees in Python page")
		public void the_user_should_be_redirected_to_Types_of_Treess_in_python_page1() {
			Assert.assertEquals("Terminologies", DD.validatePageLink());
		}


		@Given("The user is in the tryEditor page of Types of Trees page")
		public void the_user_is_in_the_try_editor_Types_of_Trees_page() {
		    hp.clickTreeLink();
		    DD.checkTypesofTreesLink();
		    DD.checkTryEditorLink();
		}

		@When("The user clicks the Run button without entering the code in the Editor in Types of Trees page")
		public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_Types_of_Trees_page() {
		    tp.checkCode(" ");
		}

		@Then("The user should not see any error message or output in try Editor of Types of Treespage")
		public void the_user_should_not_see_any_error_message_or_output_in_try_editor_of_Types_of_Trees_page() {
			Assert.assertEquals(false, tp.isAlertPresent());
		}

		@When("The user write the invalid code in Editor and click the Run button in Types of Trees page")
		public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_in_Types_of_Trees_page() {
			tp.checkCode("system.out");
		}

		@Then("The user should able to see an error message in alert window of Types of Trees page")
		public void the_user_should_able_to_see_an_error_message_in_alert_window_of_Types_of_Trees_page() {
			Assert.assertEquals(true, tp.isAlertPresent());
		}

		@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run button ofTypes of Trees page")
		public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_of_Types_of_Trees_page() {
			    hp.clickTreeLink();
			    DD.checkTypesofTreesLink();
			    DD.checkTryEditorLink();
			    tp.checkCode("system.out");
		}

		@Then("The user should remain in the tryEditor page with Run button ofTree types of Tree page")
		public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_Types_of_Trees_page() {
			Assert.assertEquals(DD.validatePageLink(), "Assessment");
		}

		@When("The user write the valid code in Editor and click the Run button of Types of Trees page")
		public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_Tree_Traversals_page() {
			tp.checkCode("print('Types of Trees')");
		}

		@Then("The user should able to see output in the console of Types of Treespage")
		public void the_user_should_able_to_see_output_in_the_console_of_Types_of_Trees_page() {
		    Assert.assertEquals(tp.validateOutput(), "Types of Trees");
		}

		//
		 
		 @Given("The user is in the Tree page after Sign in")
			public void the_user_is_in_the_tree_page_after_sign_in3() {
				hp.clickTreeLink();
			    
			}

			@When("The user clicks Tree Traversals link in Python page")
			public void the_user_clicks_Tree_Traversals_link_in_python_page() {
				DD.checkTreeTraversalsLink();
			    
			}

			@Then("The user should be redirected to Tree Traversals in Python page")
			public void  the_user_clicks_Types_of_Trees_link_in_python_page() {
				Assert.assertEquals("Tree Traversals", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			@Given("The user is on the Tree Traversals in Python page")
			public void  the_user_is_in_the_try_editor_page5()  {
				 hp.clickTreeLink();
				    DD.checkTreeTraversalsLink();	  
			   
			}

			@When("The user clicks Try Here button in  Tree Traversals in Python page")
			public void  the_user_clicks_try_editorin_python_page6() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test")
			public void  the_user_clicks_try_editor_link_in_python_page(){
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}

			@Given("The user is in the tryEditor page")
			public void the_user_clicks_try_editorin_python_page() {
			    hp.clickTreeLink();
			    DD.checkTreeTraversalsLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor1() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output7() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button8() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window9() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button10() {
				 	hp.clickTreeLink();
				    DD.checkTreeTraversalsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window16() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button1() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button3() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console33() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}

			//
			

				@When("The user clicks TraversalsIllustration link in Python page")
				public void the_user_clicks_TraversalsIllustration_link_in_python_page1() {
					DD.checkTraversalsIllustrationLink();
				    
				}

				@Then("The user should be redirected to TraversalsIllustration in Python page")
				public void  the_user_clicks_TraversalsIllustration_link_in_python_page() {
					Assert.assertEquals("Tree Traversals", DD.validatePageLink());
				}
			
			@Given("The user is in the tryEditor page of Traversals-Illustration page")
			public void the_user_is_in_the_try_editor_TraversalsIllustrationpage() {
			    hp.clickTreeLink();
			    DD.checkTraversalsIllustrationLink();
			    DD.checkTryEditorLink();
			}

			@When("The user clicks the Run button without entering the code in the Editor in Traversals-Illustration page")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_in_TraversalsIllustration_page() {
			    tp.checkCode(" ");
			}

			@Then("The user should not see any error message or output in try Editor of Traversals-Illustration page")
			public void the_user_should_not_see_any_error_message_or_output_in_try_editor_of_Traversals_Illustration_page() {
				Assert.assertEquals(false, tp.isAlertPresent());
			}

			@When("The user write the invalid code in Editor and click the Run button in Traversals-Illustration page")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_in_Traversals_Illustration_page() {
				tp.checkCode("system.out");
			}

			@Then("The user should able to see an error message in alert window of Traversals-Illustration page")
			public void the_user_should_able_to_see_an_error_message_in_alert_window_of_Traversals_Illustration_page() {
				Assert.assertEquals(true, tp.isAlertPresent());
			}

			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run button of Traversals-Illustration page")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_of_Traversals_Illustration_page() {
				    hp.clickTreeLink();
				    DD.checkTraversalsIllustrationLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system.out");
			}

			@Then("The user should remain in the tryEditor page with Run button ofTree Traversals-Illustration page")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_Traversals_Illustration_page() {
				Assert.assertEquals(DD.validatePageLink(), "Assessment");
			}

			@When("The user write the valid code in Editor and click the Run button of Traversals-Illustration page")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_Traversals_Illustration_page() {
				tp.checkCode("print('Traversals-Illustration')");
			}

			    @Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console19() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
		//Binary Trees
			    @When("The user clicks Binary Trees link in Python page")
				public void the_user_clicks_Binary_Trees_link_in_python_page1() {
					DD.checkBinaryTreesLink();
				    
				}

				@Then("The user should be redirected to Binary Trees in Python page")
				public void  the_user_clicks_Binary_Trees_link_in_python_page() {
					Assert.assertEquals("Tree Traversals", DD.validatePageLink());
				}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			
			

			@Given("The user is in the tryEditor page of Binary Trees")
			public void the_user_is_in_the_try_editor_page46() {
			    hp.clickTreeLink();
			    DD.checkBinaryTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor3() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output2() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button33() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window88() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button11() {
				 	hp.clickTreeLink();
				    DD.checkBinaryTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window66() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button77() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button12() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console13() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
			
			//Types of Binary Trees
			

			@When("The user clicks Types of Binary Trees link in Python page")
			public void the_user_clicks_Types_of_Binary_Trees_link_in_python_page1() {
				DD.checkTypesofBinaryTreesLink();
			    
			}

			@Then("The user should be redirected to Types of Binary Treesin Python page")
			public void  the_user_clicks_Types_of_Binary_Trees_link_in_python_page() {
				Assert.assertEquals("Types of Binary Trees", DD.validatePageLink());
			}
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			
			

			@Given("The user is in the tryEditor page of Types of Binery Trees")
			public void the_user_is_in_the_try_editor_page3() {
			    hp.clickTreeLink();
			    DD.checkTypesofBinaryTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor28() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output52() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button42() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window8() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button9() {
				 	hp.clickTreeLink();
				    DD.checkTypesofBinaryTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window9() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button9() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button9() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console9() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
			
			
			
			
			
			
			//Implementation in Python
			
			  @When("The user clicks Implementation in Pythonlink in Python page")
				public void the_user_clicksImplementation_in_Python_link_in_python_page1() {
					DD.checkImplementationinPythonLink();
				    
				}

				@Then("The user should be redirected to Binary Trees in Python page")
				public void  the_user_clicks_Implementation_in_Python_link_in_python_page() {
					Assert.assertEquals("Implementation in Python", DD.validatePageLink());
				}
			
			
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			

			@Given("The user is in the tryEditor page of Implimentation in Phython")
			public abstract void the_user_is_in_the_try_editor_page11(); {
			    hp.clickTreeLink();
			     DD.checkImplementationinPythonLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor00() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output0() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button88() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window11() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_in_Implimenatation() {
				 	hp.clickTreeLink();
				    DD.checkImplementationinPythonLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window1() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_implimenattion() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_implimentation() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console_implimentation() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
	
			//Binary Tree Traversals
			  @When("The user clicks Binary Tree Traversals link in Python page")
			public void the_user_clicksBinary_Tree_Traversals_link_in_python_page1() {
				DD.checkBinaryTreeTraversalsLink();
			    
			}

			@Then("The user should be redirected to Binary Tree Traversalsin Python page")
			public void  the_user_clicks_Binary_Tree_Traversals_link_in_python_page() {
				Assert.assertEquals("Binary Tree Traversals", DD.validatePageLink());
			}
		
			
			
			@Given("The user is in the tryEditor page of Binary Tree Traversals")
			public  abstract void the_user_is_in_the_try_editor_page_of_Binary_Tree_Traversals(); {
			    hp.clickTreeLink();
			     DD.checkBinaryTreeTraversalsLink();
			    DD.checkTryEditorLink();
			  }

			@When("The user clicks Try Here button in Binary Tree Traversals in Python page")
			public void the_user_clicks_try_here_button_in_Binary_Tree_Traversals_in_phython_page() {
				DD.checkTryEditorLink();
			}

			@Then("The user should be redirected to a page having an try Editor with a Run button to test Binary Tree Traversals")
			public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_Binary_Tree_Traversals1() {
			    Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window_BinaryTreeTraversals() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_in_BinaryTreeTraversals() {
				 	hp.clickTreeLink();
				    DD.checkBinaryTreeTraversalsLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window_BinaryTreeTraversals() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button_of_BinaryTreeTraversals() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_of_BinaryTreeTraversals() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console_BinaryTreeTraversals() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
		
		//Implementation of Binary Trees
			
			  @When("The user clicks Implementation of Binary Treeslink in Python page")
				public void the_user_clicksImplementation_of_Binary_Trees_link_in_python_page1() {
					DD.checkImplementationofBinaryTreesLink();
				    
				}

				@Then("The user should be redirected toImplementation of Binary Trees in Python page")
				public void  the_user_clicks_Implementation_of_Binary_Trees_link_in_python_page_Implementation_of_Binary_Trees() {
					Assert.assertEquals("Implementation in Python", DD.validatePageLink());
				}
			
			
		//USER IS TRY TO NAVIGATE THE TRY EDITER PAGE
			
			@Given("The user is in the tryEditor page for Implementation of Binary Trees")
			public void the_user_is_in_the_try_editor_page_for_Implementation_of_Binary_Trees_1 () {
			    hp.clickTreeLink();
			    DD.checkImplementationofBinaryTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor ")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for_implimentation_of_Binary_1() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output_implimentation_Binary_1() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_implimenattion_Binary_1() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window_implimentation_Binary_1() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			
		
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_implimentation_Binary() {
				 	hp.clickTreeLink();
				    DD.checkImplementationofBinaryTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window implimentation Binary")
			public void the_user_clicks_the_ok_button_of_error_alert_window_implimentation_Binary() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button_Implimentaition_Binary() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_implimentationof_Binary() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console_implimentation_Binary() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
		
			//Applications of Binary trees	
			
			 @When("The user clicks Applications of Binary trees link in Python page")
				public void the_user_clicksApplications_of_Binary_trees_link_in_python_page1() {
					DD.checkApplicationsofBinarytreesLink();
				    
				}

				@Then("The user should be redirected to Binary Applications of Binary trees	in Python page")
				public void  the_user_clicks_Applications_of_Binary_trees_link_in_python_page() {
					Assert.assertEquals("Binary Tree Traversals", DD.validatePageLink());
				}
			
			
			
			
		
			@Given("The user is in the tryEditor page for ApplicationsofBinarytrees")
			public void the_user_is_in_the_try_editor_page_for__Applications_of_Binary_trees () {
			    hp.clickTreeLink();
			    DD.checkApplicationsofBinarytreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor ")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_for___Applications_of_Binary_tree() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output___Applications_of_Binary_tree() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button___Applications_of_Binary_tree() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window___Applications_of_Binary_tree() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button___Applications_of_Binary_tree() {
				 	hp.clickTreeLink();
				    DD.checkApplicationsofBinarytreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window implimentation Binary")
			public void the_user_clicks_the_ok_button_of_error_alert_window___Applications_of_Binary_tree() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button___Applications_of_Binary_tree() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button___Applications_of_Binary_tree() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console___Applications_of_Binary_tree() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
			//Binary Search Trees
			
			 @When("The user clicks Binary Search Trees link in Python page")
				public void the_user_clicksBinary_Search_Trees_link_in_python_page1() {
					DD.checkIBinarySearchTreesLink();
				    
				}

				@Then("The user should be redirected to BinaryBinary Search Trees	in Python page")
				public void  the_user_clicks_Binary_Search_Trees_link_in_python_page() {
					Assert.assertEquals("Binary Search Trees", DD.validatePageLink());
				}
			
			
			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page_bIn_Binary_Search_Trees() {
			    hp.clickTreeLink();
			    DD.checkIBinarySearchTreesLink();
			    DD.checkTryEditorLink();
			  }
			@When("The user clicks the Run button without entering the code in the Editor")
			public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor_Binary_Search_Trees() {
			  tp.checkCode(" ");
			 
			 }

			@Then("The user should not see any error message or output")
			public void the_user_should_not_see_any_error_message_or_output_Binary_Search_Trees() {
				 Assert.assertEquals(false,tp.isAlertPresent());
			 }
			
			@When("The user write the invalid code in Editor and click the Run button")
			public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button_Binary_Search_Trees() {
				tp.checkCode("system.out.println");
			  
			}

			@Then("The user should able to see an error message in alert window")
			public void the_user_should_able_to_see_an_error_message_in_alert_window() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button_Binary_Search_Trees() {
				 	hp.clickTreeLink();
				    DD.checkIBinarySearchTreesLink();
				    DD.checkTryEditorLink();
				    tp.checkCode("system");
				    }
			
			@When("The user clicks the ok button of error alert window")
			public void the_user_clicks_the_ok_button_of_error_alert_window_Binary_Search_Trees() {
			   tp.acceptAlert();	  
			}

			@Then("The user should remain in the tryEditor page with Run button")
			public void the_user_should_remain_in_the_try_editor_page_with_run_button_Binary_Search_Trees() {
				 Assert.assertEquals(DD.validatePageLink(), "Assessment");
			  
			}
			//
			@When("The user write the valid code in Editor and click the Run button")
			public void the_user_write_the_valid_code_in_editor_and_click_the_run_button_Binary_Search_Trees() {
				tp.checkCode("print('hi')");
			  
			}

			@Then("The user should able to see output in the console")
			public void the_user_should_able_to_see_output_in_the_console_Binary_Search_Trees() {
				Assert.assertEquals(tp.validateOutput(), "hi");
			}
				
			
			
			//Implementation Of BST
			
			 @When("The user clicks Implementation Of BST link in Python page")
				public void the_user_clicksImplementation_Of_BST_link_in_python_page1() {
					DD.checkImplementationOfBSTLink();
				    
				}

				@Then("The user should be redirected to BinaryBinary Search Trees	in Python page")
				public void  the_user_clicks_Implementation_Of_BST_link_in_python_page() {
					Assert.assertEquals("Binary Search Trees", DD.validatePageLink());
				}
			
			

			@Given("The user is in the tryEditor page")
			public void the_user_is_in_the_try_editor_page() {
			    hp.clickTreeLink();
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
			public void the_user_should_able_to_see_an_error_message_in_alert_window_Implementation_Of_BST() {
			    Assert.assertEquals(true, tp.isAlertPresent());
			  
			}
			
			//Scenario: Verify that user receives error for invalid python code for Overview of Trees
			@Given("The user is in the tryEditor page and writes an invalid code in Editor and click the Run Button")
			public void the_user_is_in_the_try_editor_page_and_writes_an_invalid_code_in_editor_and_click_the_run_button() {
				 	hp.clickTreeLink();
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
				
			
=======
public class TreePage {
}
>>>>>>> bd497cdddf17c7812a5b93f06d6397980d595703:src/test/java/stepdefinitions/TreePage.java
			
			
			
	
}
