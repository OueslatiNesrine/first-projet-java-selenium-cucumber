package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class MultiSelectPage {
	@FindBy(how = How.ID, using = "cars")
	public static WebElement passWordColor;
	

	public MultiSelectPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void getColor() {
	}

}
