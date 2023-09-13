package org.page;

public class AdactinPageManager {

	private LoginPage loginpage;

	private SearchPage searchPage;
	
	private SelectPage selectPage;
	
	private BookingPage bookingPage;

	public LoginPage getloginpage() {
		if (loginpage == null) {
			loginpage = new LoginPage();
		}
		return loginpage;
	}

	public SearchPage getsearchPage() {
		if (searchPage == null) {
			searchPage = new SearchPage();
		}
		return searchPage;
	}
	
	public SelectPage getselectPage() {
		if(selectPage==null) {
			selectPage=new SelectPage();
		}
		return selectPage;
	}
	
	public BookingPage getbookingPage() {
		if(bookingPage==null) {
			bookingPage=new BookingPage();
		}
		return bookingPage;
	}
}
