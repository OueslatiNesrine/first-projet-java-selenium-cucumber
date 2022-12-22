package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class SliderPage {
	@FindBy(how = How.ID, using = "sliderContainer")
	public static WebElement slider;

	public SliderPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void Slider() {
		Actions actions = new Actions(Setup.getDriver());
		actions.moveToElement(slider, 50, 0).clickAndHold().build().perform();
	}

}
