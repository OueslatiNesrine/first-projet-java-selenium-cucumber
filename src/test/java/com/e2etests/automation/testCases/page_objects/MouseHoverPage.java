package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class MouseHoverPage {
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Main Item 2')]")
	public static WebElement mouseHover;

	public MouseHoverPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */

	public void deleteCookies() {
		Setup.getDriver().manage().deleteAllCookies();
	}

	public void moveTo() {
		Actions actions = new Actions(Setup.getDriver());
		actions.moveToElement(mouseHover).perform();
	}

}
