package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.WebDriverCommandsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebDriverCommandsStepDefinition {
	public WebDriverCommandsPage webDriverCommandsPage;
	public WebDriverCommandsStepDefinition () {
		webDriverCommandsPage = new WebDriverCommandsPage();
	}

	@When("Je prends le titre de page")
	public void jePrendsLeTitreDePage() {
		webDriverCommandsPage.getTitle();
		
		
	}
	@And("Je prends la longueur de la titre")
	public void jePrendsLaLongueurDeLaTitre() {
		webDriverCommandsPage.titleLength();
	}
	@And("Je prends la page source")
	public void jePrendsLaPageSource() {
		webDriverCommandsPage.getSourcePage();
	}
	@And("Je prends la longueur de la page source")
	public void jePrendsLaLongueurDeLaPageSource() {
		webDriverCommandsPage.lengthPageSource();
		
	}
	@Then("Je verifie l url actuel")
	public void jeVerifieLUrlActuel() {
		webDriverCommandsPage.verify();
		
	}




}
