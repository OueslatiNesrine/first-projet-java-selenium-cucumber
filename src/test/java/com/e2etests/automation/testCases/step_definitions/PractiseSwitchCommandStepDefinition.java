package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.PractiseSwitchCommandPage;
import com.e2etests.automation.utils.BasePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractiseSwitchCommandStepDefinition extends BasePage {
	
	public PractiseSwitchCommandPage practiseSwitchCommandPage;
	public PractiseSwitchCommandStepDefinition () {
		practiseSwitchCommandPage = new PractiseSwitchCommandPage();
	}
	@When("Je saute I frame")
	public void jeSauteIFrame() {
		practiseSwitchCommandPage.switchFrame();
		log.info("***we are swith to the Iframe***");
		
	}
	@Then("je click sur image")
	public void jeClickSurImage() {
		practiseSwitchCommandPage.clickImage();
		log.info("***we are done***");
	}




}
