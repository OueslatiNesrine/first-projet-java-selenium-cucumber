package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PractiseSwitchCommandPage {

	@FindBy(how = How.XPATH, using = "html/body/a/img")
	public static WebElement clickSurImage;

	public PractiseSwitchCommandPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void switchFrame() {
		Setup.getDriver().switchTo().frame("a077aa5e");
	}

	public void clickImage() {
		clickSurImage.click();
	}

}
