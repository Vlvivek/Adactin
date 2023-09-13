package org.page;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClass{
	public SearchPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement noOfRoom;
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkIn;
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOut;
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adults;
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childrens;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement searchButton;
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdults() {
		return adults;
	}
	public WebElement getChildrens() {
		return childrens;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
}
