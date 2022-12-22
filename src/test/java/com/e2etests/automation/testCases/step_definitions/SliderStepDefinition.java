package com.e2etests.automation.testCases.step_definitions;

import com.e2etests.automation.testCases.page_objects.SliderPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SliderStepDefinition {
	public SliderPage sliderPage;
	public SliderStepDefinition () {
		sliderPage = new SliderPage();
	}

	@When("Je transfert le slider a un autre endroit")
	public void jeTransfertLeSliderAUnAutreEndroit() {
		sliderPage.Slider();
		
	}
	@Then("Je verifie la position de slider")
	public void jeVerifieLaPositionDeSlider() {
		
	}




}
