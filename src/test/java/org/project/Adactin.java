package org.project;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.page.AdactinPageManager;
import org.page.BookingPage;
import org.page.LoginPage;
import org.page.SearchPage;
import org.page.SelectPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adactin extends BaseClass {
	AdactinPageManager manager;

	@Given("adactin login page launched")
	public void adactin_login_page_launched() {
		manager = new AdactinPageManager();
		setupInitiative("edge", "https://adactinhotelapp.com/");
	}

	@Then("user fill the {string} and {string}")
	public void user_fill_the_and(String string, String string2) {
		// LoginPage log = new LoginPage();
		LoginPage log = manager.getloginpage();
		passValue(string, log.getuserName());
		passValue(string2, log.getpass());
	}

	@Then("click loginButton")
	public void click_login_button() {
		LoginPage log = manager.getloginpage();
		clickIt(log.getloginButton());
	}

	@When("user entering the {string},{string} and {string}")
	public void user_entering_the_and(String string, String string2, String string3) {
		manager = new AdactinPageManager();
		SearchPage search = manager.getsearchPage();
		passValue(string, search.getLocation());
		passValue(string2, search.getHotels());
		passValue(string3, search.getRoomType());
	}

	@Then("user will enter the {string},{string} and {string}")
	public void user_will_enter_the_and(String string, String string2, String string3) {
		SearchPage search = manager.getsearchPage();
		passValue(string, search.getNoOfRoom());
		setAttribute(search.getCheckIn(), string2);
		setAttribute(search.getCheckOut(), string3);
	}

	@Then("user put the {string} and {string}")
	public void user_put_the_and(String string, String string2) {
		SearchPage search = manager.getsearchPage();
		passValue(string, search.getAdults());
		passValue(string2, search.getChildrens());
		clickIt(search.getSearchButton());
	}
	

	@Then("click radioButton then continueButton")
	public void click_radio_button_then_continue_button() {
		manager = new AdactinPageManager();
	    SelectPage select = manager.getselectPage();
		clickIt(select.getRadioButton());
		clickIt(select.getContinueButton());
	}
	

	@When("user enter the {string},{string} and {string}")
	public void user_enter_the_and(String string, String string2, String string3) {
		manager = new AdactinPageManager();
		BookingPage book = manager.getbookingPage();
		passValue(string, book.getFirstName());
		passValue(string2, book.getLastName());
		passValue(string3, book.getAddress());
	}
	@Then("user entering the {string},{string}")
	public void user_entering_the(String string, String string2) {
		BookingPage book = manager.getbookingPage();
	    passValue(string, book.getCardNo());
	    passValue(string2, book.getCardType());
	}
	@Then("user enter the card value {string},{string} and {string}")
	public void user_enter_the_card_value_and(String string, String string2, String string3) {
		BookingPage book = manager.getbookingPage();
		passValue(string, book.getExpiryMonth());
		passValue(string2, book.getExpiryYear());
		passValue(string3, book.getCvv());
	}
	@Then("click bookButton")
	public void click_book_button() {
		BookingPage book = manager.getbookingPage();
		clickIt(book.getBooking());
	}
	@Then("take ScreenShot")
	public void take_screen_shot() throws IOException {
		
	   screenShot(new File("C:\\Users\\vlviv\\eclipse pro\\"
	   		+ "Adactin\\target\\adactin.png"));
	}







}
