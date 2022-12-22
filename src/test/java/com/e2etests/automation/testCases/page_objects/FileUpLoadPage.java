package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class FileUpLoadPage {
	
	public ConfigFileReader configFileReader;
	@FindBy(how = How.ID, using = "uploadfile_0")
	public static WebElement btnUpload;
	@FindBy(how = How.ID, using = "submitbutton")
	public static WebElement submitFile;

	public FileUpLoadPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Methods */
	public void sendFile() {
		btnUpload.sendKeys(configFileReader.getProperties("path.file"));
	}
	
	public void btnsubmitClick() {
		submitFile.click();
	}

}
