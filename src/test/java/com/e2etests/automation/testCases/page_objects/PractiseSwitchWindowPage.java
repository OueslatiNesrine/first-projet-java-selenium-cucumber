package com.e2etests.automation.testCases.page_objects;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.Setup;

public class PractiseSwitchWindowPage extends BasePage {
	@FindBy(how = How.ID, using = "messageWindowButton")
	public static WebElement btnMessageWindow;

	public PractiseSwitchWindowPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void getWindowActuel() {
		String handle = Setup.getDriver().getWindowHandle();
		log.error(handle);

	}

	public void getAllWindow() {
		Set<String> handles = Setup.getDriver().getWindowHandles();
		log.info(handles);
	}

	public void PassOnWindows() {
		for (String handle1 : Setup.getDriver().getWindowHandles()) {
			Setup.getDriver().switchTo().window(handle1);
			log.info(handle1);

		}

	}
}
