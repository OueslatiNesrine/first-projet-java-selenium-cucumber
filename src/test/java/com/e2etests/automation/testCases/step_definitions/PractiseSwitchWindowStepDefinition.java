package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.PractiseSwitchWindowPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractiseSwitchWindowStepDefinition {

	public PractiseSwitchWindowPage practiseSwitchWindowPage;

	public PractiseSwitchWindowStepDefinition() {
		practiseSwitchWindowPage = new PractiseSwitchWindowPage();
	}

	@When("Je prend l adress de window actuel")
	public void jePrendLAdressDeWindowActuel() {
		practiseSwitchWindowPage.getWindowActuel();

	}

	@And("Je tape sur le bouton new message window")
	public void jeTapeSurLeBoutonNewMessageWindow() {
		PractiseSwitchWindowPage.btnMessageWindow.click();
	}

	@And("Je prend toutes les adresses des windows ouverts")
	public void jePrendToutesLesAdressesDesWindowsOuverts() {
		practiseSwitchWindowPage.getAllWindow();
	}

	@And("Je passe par window a un autre")
	public void jePasseParWindowAUnAutre() {
		practiseSwitchWindowPage.PassOnWindows();
	}

	@Then("Je affiche window actuel")
	public void jeAfficheWindowActuel() {

	}

}
