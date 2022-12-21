package com.e2etests.automation.testCases.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.Setup;

public class MultiSelectPage {
	@FindBy(how = How.ID, using = "cars")
	public static WebElement multiSelect;
	Select select = new Select(multiSelect);

	public MultiSelectPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void getAllOptionsApp() {
		System.out.println("The dropdown options are -");

		List<WebElement> options = select.getOptions();

		for (WebElement option : options)
			System.out.println(option.getText());

	}

	public void selectByIndexApp(int index) {
		if (select.isMultiple()) {
			System.out.println("Select option Opel by Index");
			select.selectByIndex(index);

		}
	}

	public void selectByValueApp(String value) {
		if (select.isMultiple()) {
			System.out.println("Select option saab by Value");
			select.selectByValue("value");

		}
	}

	public void selectByVisibleTextApp(String visibleText) {
		if (select.isMultiple()) {
			System.out.println("Select option Audi by Text");
			select.selectByVisibleText("visibleText");

		}
	}

	public void deselectByIndexApp(int index) {
		if (select.isMultiple()) {
			System.out.println("DeSelect option Audi by Index");
			select.deselectByIndex(index);

		}
	}

	public void deselectByValueApp(String value) {
		if (select.isMultiple()) {
			System.out.println("DeSelect option Audi by Index");
			select.selectByValue("value");

		}
	}

	public void deselectByVisibleApp(String visibleText) {
		if (select.isMultiple()) {
			System.out.println("Select option Opel by Text");
			select.deselectByVisibleText("visibleText");
		}
	}

}
