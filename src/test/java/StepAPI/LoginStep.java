package StepAPI;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	LoginPage login;
	static HomePage hp;

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
	

@When("User should sort product as {string}")
public void user_should_sort_product_as(String Psort) {
    
	 hp =new HomePage();
	 hp.sortFunctionality(Psort);
}
@When("User should select {int} product")
public void user_should_select_product(Integer number) {
	 
	 hp.selectProduct(number);
    
}
@Then("User should click on shopping container")
public void user_should_click_on_shopping_container() {
	
	hp.shoppingContainerFunctionality();
    
}



}