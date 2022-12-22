package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.FileUpLoadPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FileUpLoadStepDefinition {
	public FileUpLoadPage fileUpLoadPage;
	public FileUpLoadStepDefinition () {
		fileUpLoadPage = new FileUpLoadPage();
	}

	@When("Je telecharge le fichier text")
	public void jeTelechargeLeFichierText() {
		fileUpLoadPage.sendFile();
		
	}
	@And("Je tape sur le bouton submitFile")
	public void jeTapeSurLeBoutonSubmitFile() {
		fileUpLoadPage.btnsubmitClick();
		
	}
	@Then("Je verifie que le ficher est telecharger")
	public void jeVerifieQueLeFicherEstTelecharger() {
		
	}




}
