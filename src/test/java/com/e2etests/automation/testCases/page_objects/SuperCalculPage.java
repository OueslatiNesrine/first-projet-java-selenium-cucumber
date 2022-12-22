package com.e2etests.automation.testCases.page_objects;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.utils.BasePage;
import com.e2etests.automation.utils.Setup;

public class SuperCalculPage extends BasePage {
	@FindBy(how = How.XPATH, using = "//input[@ng-model='first']")
	public static WebElement firstValue;
	@FindBy(how = How.XPATH, using = "//input[@ng-model='second']")
	public static WebElement secondValue;
	@FindBy(how = How.ID, using = "gobutton")
	public static WebElement btnGo;
	@FindBy(how = How.TAG_NAME, using = "h2")
	public static WebElement result;

	public SuperCalculPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void sendFirstValue(String string) {
		firstValue.sendKeys(string);
	}
	
	public void sendSecondValue(String string) {
		secondValue.sendKeys(string);
	}
	
	public void result() {
		WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		log.error("The result is : " +result.getText());
		
	}

}
