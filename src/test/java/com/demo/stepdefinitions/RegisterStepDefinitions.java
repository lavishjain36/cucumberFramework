package com.demo.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions {
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		System.out.println("User Landed on the Homepage");
	   
	}
	@When("User click on Signup")
	public void user_click_on_signup() {
		System.out.println("User Click on the signup button");
	    
	}
	@When("User enters username and password in registration")
	public void user_enters_username_and_password_in_registration() {
		System.out.println("User enter username and password");
	  
	}
	@Then("User click the Signup button")
	public void user_click_the_signup_button() {
		System.out.println("User Clicks on the Signup button");
	   
	}


}
