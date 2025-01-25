package StepAPI;

import BaseLayer.BaseClass;
import PageLayer.FinishPage;
import io.cucumber.java.en.When;

public class FinishStep extends BaseClass {

	@When("user cicks on finish button")
	public void user_cicks_on_finish_button() {

		FinishPage finishPage = new FinishPage();
		finishPage.finishFunctionality();
	}

}
