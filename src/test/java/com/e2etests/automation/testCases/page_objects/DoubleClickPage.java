package com.e2etests.automation.testCases.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import com.e2etests.automation.utils.Setup;

public class DoubleClickPage {
	/* @FindBy */
	@FindBy(how = How.ID, using = "doubleClickBtn")
	public static WebElement doubleClickBtn;
	
	@FindBy(how = How.ID, using = "doubleClickMessage")
	public static WebElement doubleClickMessage;
	
	public DoubleClickPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openURL(String url) {
		Setup.getDriver().get(url);
	}
	public void doubleClick() {
		Actions actions = new Actions(Setup.getDriver());
		actions.doubleClick(doubleClickBtn).perform();
	}
	
	public void asserDoubleClick() {
		String msg = doubleClickMessage.getText();
		Assert.assertEquals("You have done a double click", msg);
	}

}
