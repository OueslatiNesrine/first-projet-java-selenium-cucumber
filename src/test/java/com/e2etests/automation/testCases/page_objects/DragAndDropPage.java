package com.e2etests.automation.testCases.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class DragAndDropPage {

	@FindBy(how = How.ID, using = "draggable")
	public static WebElement source;
	@FindBy(how = How.ID, using = "droppable")
	public static WebElement target;

	public DragAndDropPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void openURL() {
		Setup.getDriver().get("https://demoqa.com/droppable/");
	}

	public void dragAndDrop() {
		Actions actions = new Actions(Setup.getDriver());
		actions.dragAndDrop(source, target).perform();

	}

	public void verif() {
		String textTareget = target.getText();
		if (textTareget.equals("Dropped!")) {
			System.out.println("pass : source is dropped to target as expacted");
		} else {
			System.out.println("fail : source is not dropped to target as expacted");
		}

	}

}
