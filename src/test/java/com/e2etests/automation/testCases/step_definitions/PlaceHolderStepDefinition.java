package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.PlaceHolderPage;

import io.cucumber.java.en.Then;


public class PlaceHolderStepDefinition {

	public PlaceHolderPage placeHolderPage;

	public PlaceHolderStepDefinition() {
		placeHolderPage = new PlaceHolderPage();
	}
	

	@Then("je verifie le text place holder")
	public void jeVerifieLeTextPlaceHolder() {
		placeHolderPage.placeHolder();
	}

}
