package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	@FindBy(xpath="//input[@name='login']")
	private WebElement loginButton;
	
	
	public WebElement getuserName() {
		return userName;
	}
	public WebElement getpass() {
		return pass;
	}
	public WebElement getloginButton() {
		return loginButton;
	}
}
