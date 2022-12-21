package com.e2etests.automation.testCases.page_objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class VerifyColorPage {
	@FindBy(how = How.LINK_TEXT, using = "Mot de passe oublié ?")
	public static WebElement passWordColor;
	int hexValue1;
	int hexValue2;
	int hexValue3;

	public VerifyColorPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public void getColor() {
		String color = passWordColor.getCssValue("color");
		System.out.println("The color is:" + color);

		String[] hexValue = color.replace("rgba(", "").replace(")", "").split(",");
		System.out.println("The hexValue is:" + hexValue);

		hexValue1 = Integer.parseInt(hexValue[0]);
		hexValue[1] = hexValue[1].trim();
		System.out.println("The hexValue1 is:" + hexValue1);

		hexValue2 = Integer.parseInt(hexValue[1]);
		hexValue[2] = hexValue[2].trim();
		System.out.println("The hexValue2 is:" + hexValue2);

		hexValue3 = Integer.parseInt(hexValue[2]);
		System.out.println("The hexValue3 is:" + hexValue3);

	}

	public void verify() {
		String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
		System.out.println("The actualColor is:" + actualColor);

		Assert.assertEquals("#1877f2", actualColor);
		System.out.println("The color is:" + actualColor);
	}

}
