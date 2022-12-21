package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.RightClickPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RightClickStepDefinition {
	public RightClickPage rightClickPage;

	public RightClickStepDefinition() {
		rightClickPage = new RightClickPage();
	}

	@When("Je clique droite")
	public void jeCliqueDroite() {
		rightClickPage.rightClick();

	}

	@Then("Je verifie le message de action rightClick")
	public void jeVerifieLeMessageDeActionRightClick() {
		rightClickPage.verif();
	}

}
