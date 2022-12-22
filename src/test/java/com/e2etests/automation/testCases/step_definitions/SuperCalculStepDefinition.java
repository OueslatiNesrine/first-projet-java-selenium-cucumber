package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.SuperCalculPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuperCalculStepDefinition {

	public SuperCalculPage superCalculPage;

	public SuperCalculStepDefinition() {
		superCalculPage = new SuperCalculPage();
	}

	@When("Je mets la premiere valeur {string}")
	public void jeMetsLaPremiereValeur(String string) {
		superCalculPage.sendFirstValue(string);
	}

	@When("Je mets la deuxieme valeur {string}")
	public void jeMetsLaDeuxiemeValeur(String string) {
		superCalculPage.sendSecondValue(string);
	}

	@And("Je tape sur bouton go")
	public void jeTapeSurBoutonGo() {
		SuperCalculPage.btnGo.click();
	}

	@Then("Je verifie la resultat")
	public void jeVerifieLaResultat() {
		superCalculPage.result();

	}

}
