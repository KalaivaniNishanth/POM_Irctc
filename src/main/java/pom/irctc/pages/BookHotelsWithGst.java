package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookHotelsWithGst extends GenericWrappers{
	
	String roomName;
	String roomCost;
	
	public BookHotelsWithGst switchToLastWindow5() {
		switchToLastWindow();
		return this;
	}

	public BookHotelsWithGst login() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.Login.xpath"));
		return this;
	}
	
	public BookHotelsWithGst guestUser() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.GuestUser.xpath"));
		return this;
	}
	
	public BookHotelsWithGst userName(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.Email.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst mobile(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.Mobile.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst guestLogin() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.GuestLogin.xpath"));
		return this;
	}
	
	public BookHotelsWithGst clickWaitProperty1() {
		waitProperty(3000);
		return this;
	}

	public BookHotelsWithGst where() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.Where.xpath"));
		return this;
	}
	
	public BookHotelsWithGst city() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.City.xpath"));
		return this;
	}
	 
	public BookHotelsWithGst checkInDate() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.CheckInDate.xpath"));
		return this;
	}
	
	public BookHotelsWithGst day() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.Day.xpath"));
		return this;
	}
	
	public BookHotelsWithGst checkOutDate() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.CheckOutDate.xpath"));
		return this;
	}
	
	public BookHotelsWithGst checkOutDay() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.CheckOutDay.xpath"));
		return this;
	}
	
	public BookHotelsWithGst guest() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.Guest.xpath"));
		return this;
	}
	
	public BookHotelsWithGst room(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotelsWithGst.Rooms.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst adult(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotelsWithGst.Adults.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst done() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.Done.xpath"));
		return this;
	}
	
	public BookHotelsWithGst searchHotel() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.SearchHotel.xpath"));
		return this;
	}
	
	
	public BookHotelsWithGst hotelNameSelect() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.HotelNameSelect.xpath"));
		return this;
	}
	
	public BookHotelsWithGst switchToLastWindow6() {
		switchToLastWindow();
		return this;
	}
	
	public BookHotelsWithGst hotelName() {
		roomName = getTextByXpath(prop.getProperty("BookHotelsWithGst.HotelName.xpath"));
		return this;
	}
	
	public BookHotelsWithGst price() {
		roomCost = getTextByXpath(prop.getProperty("BookHotelsWithGst.Price.xpath"));
		return this;
	}
	
	public BookHotelsWithGst continueToBook() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.ContinueToBook.xpath"));
		return this;
	}
	
	public BookHotelsWithGst guestUserLogin() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.GuestUserLogin.xpath"));
		return this;
	}
	
	public BookHotelsWithGst userEmail(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.UserEmail.xpath"), data);
		return this;
	}
	public BookHotelsWithGst mobileNum(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.MobileNum.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst login1() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.LoginOne.xpath"));
		return this;
	}
	
	public BookHotelsWithGst title(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotelsWithGst.Title.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst firstName(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.FirstName.xpath"), data);
		return this;
	}

	public BookHotelsWithGst lastName(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.LastName.xpath"), data);
		waitProperty(5000);
		return this;
	}
	
	public BookHotelsWithGst state(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotelsWithGst.State.xpath"), data);
		waitProperty(5000);
		return this;
	}
	
	public BookHotelsWithGst gst(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotelsWithGst.Gst.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst gstNumber(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.GstNumber.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst companyName(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.CompanyName.xpath"), data);
		return this;
	}
	
	public BookHotelsWithGst companyAddress(String data) {
		enterByXpath(prop.getProperty("BookHotelsWithGst.CompanyAddress.xpath"), data);
		pageDown();
		waitProperty(3000);
		return this;
	}
	
	public BookHotelsWithGst makePayment() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.MakePayment.xpath"));
		return this;
	}
	
	public BookHotelsWithGst gstRequired(String data) {
		verifyTextByXpath(prop.getProperty("BookHotelsWithGst.GstRequired.xpath"),data);
		return this; 
	}
	
	
	
}
