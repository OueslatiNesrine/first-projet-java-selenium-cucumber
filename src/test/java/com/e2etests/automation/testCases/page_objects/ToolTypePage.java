package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.Setup;

public class ToolTypePage extends BasePage {
	@FindBy(how = How.ID, using = "toolTipButton")
	public static WebElement btnToolTip;
	String toolTipText = btnToolTip.getText();

	public ToolTypePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void verify () {
		if (toolTipText.equalsIgnoreCase("Hover me to see")) {
			log.info("Pass: ToolTip matching expected value");
		}else {
			log.error("fail: ToolTip not matching expected value");
		}

	}

}
