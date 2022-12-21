package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.AlertPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertStepDefinition {

	public AlertPage alertPage;

	public AlertStepDefinition() {
		alertPage = new AlertPage();
	}

	@Given("Je me connecte sur l application")
	public void jeMeConnecteSurLApplication() {
		alertPage.openURL();
	}

	@When("Je agrandis le page navigateur")
	public void jeAgrandisLePageNavigateur() {
		alertPage.maximizeBrowser();
	}

	@And("Je clique sur le bouton alert bouton")
	public void jeCliqueSurLeBoutonAlertBouton() {
		alertPage.clickOnAlertButton();
	}

	@And("Je accepte l alert")
	public void jeAccepteLAlert() {
		alertPage.switchAlertButton();
	}

	@Then("Je verifie le titre de la page")
	public void jeVerifieLeTitreDeLaPage() {
		alertPage.checkTitle();

	}

	@And("Je ferme le navigateur")
	public void jeFermeLeNavigateur() {
		alertPage.assertAlert();

	}

}
