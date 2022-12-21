package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.DragAndDropPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DragAndDropStepDefinition {
	public DragAndDropPage dragAndDropPage;
	public DragAndDropStepDefinition() {
		dragAndDropPage = new DragAndDropPage();
		
	}
	@When("Je mets Drag dans drop")
	public void jeMetsDragDansDrop() {
		dragAndDropPage.dragAndDrop();
	   
	}
	@Then("Je verifie le test changer a dropped")
	public void jeVerifieLeTestChangerADropped() {
		dragAndDropPage.verif();
	   
	}





}
