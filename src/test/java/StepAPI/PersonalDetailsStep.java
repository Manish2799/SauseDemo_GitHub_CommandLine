package StepAPI;

import BaseLayer.BaseClass;
import PageLayer.PersonalDetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsStep extends BaseClass {

	static PersonalDetailsPage pdp;
	@When("User should click on checkout button")
	public void user_should_click_on_checkout_button()
	{
		 pdp = new PersonalDetailsPage();
		 pdp.checkOutFunctionality();
	}

	@When("User should enter firstname as {string} and lastname as {string} and zipcode as {string}")
	public void user_should_enter_firstname_as_and_lastname_as_and_zipcode_as(String Fname, String Lname,
			String ZipCode) {

		pdp.personalDetailsFunctioanlity(Fname, Lname, ZipCode);
	}

	@Then("User should click on continue button")
	public void user_should_click_on_continue_button() 
	{
		pdp.continueButtonFunctionality();
		
	}
}
