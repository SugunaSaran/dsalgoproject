package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Tree {
	@Given("User wants to select a care type {string} from uber app")
	public void user_wants_to_select_a_care_type_from_uber_app(String sedan ) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step 1 : "+ sedan);
	}

	@When("User select car {string} pick up point\"usa\"and Drop location {string}")
	public void user_select_car_pick_up_point_usa_and_drop_location(String  pickup_location, String  drop_location) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 2 : "+ pickup_location+drop_location );
	}

	@Then("Driver start the journey")
	public void driver_start_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 4");
	}

	@Then("user pays {int} USD")
	public void user_pays_usd(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("step 5");
	}




}
