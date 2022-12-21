package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.DoubleClickPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DoubleClickStepDefinition {

	public DoubleClickPage doubleClickPage;

	public DoubleClickStepDefinition() {
		doubleClickPage = new DoubleClickPage();
	}

	@Given("Je me connecte sur l application {string}")
	public void jeMeConnecteSurLApplication(String string) {
		doubleClickPage.openURL(string);

	}

	@When("Je clique sur le bouton doubleClick")
	public void jeCliqueSurLeBoutonDoubleClick() {
		doubleClickPage.doubleClick();

	}

	@Then("Je verifie le message de action doubleClick")
	public void jeVerifieLeMessageDeActionDoubleClick() {
		doubleClickPage.asserDoubleClick();

	}

}
