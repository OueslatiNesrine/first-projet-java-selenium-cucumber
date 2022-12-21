package com.e2etests.automation.testCases.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiSelectStepDefinition {

	@When("Je prends tout la liste")
	public void jePrendsToutLaListe() {
	}

	@And("Je select selon {string}")
	public void jeSelectSelon(String string) {
	}

	@And("Je supprime selon {string}")
	public void jeSupprimeSelon(String string) {
	}

	@Then("Je verifie le choix de selection")
	public void jeVerifieLeChoixDeSelection() {
	}

	@And("Je verifie le choix de suppression")
	public void jeVerifieLeChoixDeSuppression() {
	}

}
