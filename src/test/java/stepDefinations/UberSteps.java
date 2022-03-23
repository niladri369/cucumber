package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberSteps {
	
		@Given("user is trying to book a {string} cab with uber")
		public void user_is_trying_to_book_a_cab_with_uber(String cab) {
		  System.out.println("user is trying to book a "+cab);
		}

		@When("user select cartype as {string} pick up location as {string} and drop location is {string}")
		public void user_select_cartype_as_pick_up_location_as_and_drop_location_is(String cab, String pickup, String drop) {
		    System.out.println("user picked by  "+ cab+ " from "+pickup+" to "+ drop);
		}

		@Then("Driver starts the journey")
		public void driver_starts_the_journey() {
		   System.out.println("joureny starts");
		}

		@Then("Driver ends the journey")
		public void driver_ends_the_journey() {
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("joureny ends");
		}

		@Then("user pays {int} rs")
		public void user_pays_rs(Integer fair) {
			System.out.println("the fair is "+fair+"and paid");
		}
	}


