package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass{
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement cardNo;
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cardType;
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement expiryMonth;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement expiryYear;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement booking;
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooking() {
		return booking;
	}
	
	
	
	
}
