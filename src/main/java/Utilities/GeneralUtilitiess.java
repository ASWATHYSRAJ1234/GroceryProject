package Utilities;

import org.openqa.selenium.WebElement;

public class GeneralUtilitiess {
	public void enterVlauesBySendKeys(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public void clickElement(WebElement element) {
		element.click();

	}

}
