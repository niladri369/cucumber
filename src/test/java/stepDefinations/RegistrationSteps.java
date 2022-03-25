package stepDefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegistrationSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page() {

	}

	@When("User trying to login with below credentials")
	public void user_trying_to_login_with_below_credentials(DataTable dataTable) {
		List<List<String>> datatable = dataTable.asLists(String.class);
		for (List<String> list : datatable) {
			System.out.println(list);

		}
	}
	
	@When("User trying to login with below credentials with columns")
	public void user_trying_to_login_with_below_credentials_with_columns(DataTable dataTable) {
	  
		List<Map<String,String>> data=dataTable.asMaps(String.class,String.class);
		System.out.println(data );
	}

}
