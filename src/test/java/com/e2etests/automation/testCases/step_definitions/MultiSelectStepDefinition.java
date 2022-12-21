package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.MultiSelectPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiSelectStepDefinition {
	public MultiSelectPage multiSelectPage;

	public MultiSelectStepDefinition() {
		multiSelectPage = new MultiSelectPage();
	}

	@When("Je prends la liste de l application")
	public void jePrendsLaListeDeLApplication() {
		multiSelectPage.getAllOptionsApp();

	}

	@And("Je selectionne l element selon {int}")
	public void jeSelectionneLElementSelon(Integer index) {
		multiSelectPage.selectByIndexApp(index);
	}

	@And("Je selectionne l element selon {string}")
	public void jeSelectionneLElementSelon(String string) {
		multiSelectPage.selectByValueApp(string);
	}

	@And("Je selectionne l elemnet selon {string}")
	public void jeSelectionneLElemnetSelon(String string) {
		multiSelectPage.selectByVisibleTextApp(string);

	}

	@And("Je supprime l element selon {int}")
	public void jeSupprimeLElementSelon(Integer index) {
		multiSelectPage.deselectByIndexApp(index);

	}

	@And("Je supprime l element selon {string}")
	public void jeSupprimeLElementSelon(String string) {
		multiSelectPage.deselectByValueApp(string);

	}

	@And("Je supprime l element  {string}")
	public void jeSupprimeLElement(String string) {
		multiSelectPage.deselectByVisibleApp(string);
	}

	@Then("Je verifie toutes les selections")
	public void jeVerifieToutesLesSelections() {

	}

}
