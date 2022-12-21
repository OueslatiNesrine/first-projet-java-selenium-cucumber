package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.MouseHoverPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MouseHoverStepDefinition {

	public MouseHoverPage mouseHoverPage;

	public MouseHoverStepDefinition() {
		mouseHoverPage = new MouseHoverPage();
	}

	@When("Je supprime les cookies")
	public void jeSupprimeLesCookies() {
		mouseHoverPage.deleteCookies();

	}

	@Then("je deplace sur main item2")
	public void jeDeplaceSurMainItem2() {
		mouseHoverPage.moveTo();

	}

}
