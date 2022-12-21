package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class WebDriverCommandsPage extends BasePage {
	public ConfigFileReader configFileReader;
	String titlePage;
	String sourcePage;
	int titleLength;
	int lengthPageSource;

	public WebDriverCommandsPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Methods */

	public void getTitle() {
		titlePage = Setup.getDriver().getTitle();
	}

	public void titleLength() {
		titleLength = titlePage.length();
	}

	public void getSourcePage() {
		sourcePage = Setup.getDriver().getPageSource();
	}

	public void lengthPageSource() {
		lengthPageSource = sourcePage.length();
	}

	public void verify() {
		String url = configFileReader.getProperties("home.url.orangehrmlive");
		String actuallUrl = Setup.getDriver().getCurrentUrl();
		log.error("Actual URL is: " + actuallUrl);
		log.error("Expected URL is: " + url);
		if (actuallUrl.equals(url)) {
			log.error("Verification successfully - The correct url is opned ");
		} else {
			log.error("Verification failed - an incorrect url is opned ");
		}
		log.error("The title of the page is:" + titlePage);
		log.error("The length of the title is:" + titleLength);
		log.error("Length of the page source :" + lengthPageSource);
		

	}

}
