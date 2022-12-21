package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.Setup;

public class PlaceHolderPage extends BasePage {
	@FindBy(how = How.ID, using = "toolTipTextField")
	public static WebElement placeHolder;

	public PlaceHolderPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */

	public void placeHolder() {
		String textPlaceHolder = placeHolder.getAttribute("placeholder");
		log.info("The placHolder of the fild =" + textPlaceHolder);

	}

}
