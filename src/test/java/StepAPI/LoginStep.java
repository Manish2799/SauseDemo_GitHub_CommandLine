package StepAPI;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	LoginPage login;

	@Given("User is on login page")
	public void user_is_on_login_page() throws IOException {
		
		BaseClass.initialization();
	}

	@When("User enter valid username password and password")
	public void user_enter_valid_username_password_and_password() {

		login=new LoginPage();
		login.loginUser("standard_user","secret_sauce");
	}

	@When("click on Loign button")
	public void click_on_loign_button() {
		
		login.clickOnLoginButton();
	}

}