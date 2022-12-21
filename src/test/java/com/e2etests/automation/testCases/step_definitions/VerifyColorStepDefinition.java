package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.VerifyColorPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyColorStepDefinition {
	public VerifyColorPage verifyColorPage;

	public VerifyColorStepDefinition() {
		verifyColorPage = new VerifyColorPage();

	}

	@When("je traite la couleur du mot de passe")
	public void jeTraiteLaCouleurDuMotDePasse() {
		verifyColorPage.getColor();

	}

	@Then("Je verifie la couleur")
	public void jeVerifieLaCouleur() {
		verifyColorPage.verify();

	}

}
