package com.e2etests.automation.testCases.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class RightClickPage {
	@FindBy(how = How.ID, using = "rightClickBtn")
	public static WebElement btRightClick;
	@FindBy(how = How.ID, using = "rightClickMessage")
	public static WebElement rightClickMessage;

	public RightClickPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void rightClick() {
		Actions actions = new Actions(Setup.getDriver());
		actions.contextClick(btRightClick).perform();

	}

	public void verif() {
		String msg = rightClickMessage.getText();
		Assert.assertEquals("You have done a right click", msg);
	}
}
