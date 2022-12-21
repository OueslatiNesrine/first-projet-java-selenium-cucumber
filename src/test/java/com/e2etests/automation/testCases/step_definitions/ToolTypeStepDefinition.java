package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.ToolTypePage;

import io.cucumber.java.en.Then;

public class ToolTypeStepDefinition {
	public ToolTypePage toolTypePage;
	public ToolTypeStepDefinition() {
		toolTypePage = new ToolTypePage();
	}

	@Then("Je verifie affichage toolTip")
	public void jeVerifieAffichageToolTip() {
		toolTypePage.verify();
		
	}

}
