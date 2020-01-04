package com.facebook.stepDefinations;

import com.facebook.base;
import com.facebook.pages.signup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class signupSteps extends base {
	
	signup suStep = new signup();
	
	@Given("^that I should be able to navigate to Facebook page$")
	public void that_I_should_be_able_to_navigate_to_Facebook_page() throws Throwable {
		
		driver.get("https://www.facebook.com");
	}

	@Then("^I should be able to enter firstname into First Name field$")
	public void i_should_be_able_to_enter_firstname_into_First_Name_field() throws Throwable {
	    suStep.firstName.sendKeys("Nahina");
	}



}
