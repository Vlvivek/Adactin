package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends BaseClass{
	
	public SelectPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioButton;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	
	
}
