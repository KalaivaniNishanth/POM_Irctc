package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookHotels extends GenericWrappers {
	
	String roomName;
	String roomCost;
	
	public BookHotels switchToLastWindow3() {
		switchToLastWindow();
		return this;
	}
	
	public BookHotels login() {
		clickByXpath(prop.getProperty("BookHotels.Login.xpath"));
		return this;
	}
	
	public BookHotels guestUser() {
		clickByXpath(prop.getProperty("BookHotels.GuestUser.xpath"));
		return this;
	}
	
	public BookHotels email(String data) {
		enterByXpath(prop.getProperty("BookHotels.Email.xpath"), data);
		return this;
	}
	
	public BookHotels mobile(String data) {
		enterByXpath(prop.getProperty("BookHotels.Mobile.xpath"), data);
		return this;
	}
	
	public BookHotels guestLogin() {
		clickByXpath(prop.getProperty("BookHotels.GuestLogin.xpath"));
		//waitProperty(3000);
		return this;
	}
	
	public BookHotels clickWaitProperty1() {
		waitProperty(5000);
		return this;
	}

	public BookHotels where() {
		clickByXpath(prop.getProperty("BookHotels.Where.xpath"));
		return this;
	}
	
	public BookHotels city() {
		clickByXpath(prop.getProperty("BookHotels.City.xpath"));
		return this;
	}
	
	public BookHotels checkInDate() {
		clickByXpath(prop.getProperty("BookHotels.CheckInDate.xpath"));
		return this;
	}
	
	public BookHotels day() {
		clickByXpath(prop.getProperty("BookHotels.Day.xpath"));
		return this;
	}
	
	public BookHotels checkOutDate() {
		clickByXpath(prop.getProperty("BookHotels.CheckOutDate.xpath"));
		return this;
	}
	
	public BookHotels checkOutDay() {
		clickByXpath(prop.getProperty("BookHotels.CheckOutDay.xpath"));
		return this;
	}
	
	public BookHotels guest() {
		clickByXpath(prop.getProperty("BookHotels.Guest.xpath"));
		return this;
	}
	
	public BookHotels rooms(String data) {
		selectValueByXpath(prop.getProperty("BookHotels.Rooms.xpath"), data);
		return this;
	}
	
	public BookHotels adults(String data) {
		selectValueByXpath(prop.getProperty("BookHotels.Adults.xpath"), data);
		return this;
	}
	
	public BookHotels done() {
		clickByXpath(prop.getProperty("BookHotels.Done.xpath"));
		return this;
	}
	
	public BookHotels searchHotel() {
		clickByXpath(prop.getProperty("BookHotels.SearchHotel.xpath"));
		return this;
	}
	
	public BookHotels hotelNameSelect() {
		clickByXpath(prop.getProperty("BookHotels.HotelNameSelect.xpath"));
		return this;
	}
	
	public BookHotels switchToLastWindow4() {
		switchToLastWindow();
		return this;
	}
	
	public BookHotels hotelName() {
		roomName = getTextByXpath(prop.getProperty("BookHotels.HotelName.xpath"));
		return this;
	}
	
	public BookHotels price() {
		roomCost = getTextByXpath(prop.getProperty("BookHotels.Price.xpath"));
		return this;
	}
	
	public BookHotels continueToBook() {
		clickByXpath(prop.getProperty("BookHotels.ContinueToBook.xpath"));
		return this;
	}
	
	public BookHotels guestUserLogin() {
		clickByXpath(prop.getProperty("BookHotels.GuestUserLogin.xpath"));
		return this;
	}
	
	public BookHotels userEmail(String data) {
		enterByXpath(prop.getProperty("BookHotels.UserEmail.xpath"), data);
		return this;
	}
	
	public BookHotels mobileNum(String data) {
		enterByXpath(prop.getProperty("BookHotels.MobileNum.xpath"), data);
		return this;
	}
	
	public BookHotels login1() {
		clickByXpath(prop.getProperty("BookHotels.LoginOne.xpath"));
		return this;
	}
	
	public BookHotels title(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotels.Title.xpath"), data);
		return this;
	}
	
	public BookHotels firstName(String data) {
		enterByXpath(prop.getProperty("BookHotels.FirstName.xpath"), data);
		return this;
	}

	public BookHotels lastName(String data) {
		enterByXpath(prop.getProperty("BookHotels.LastName.xpath"), data);
		return this;
	}
	
	public BookHotels state(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotels.State.xpath"), data);
		//tab();
		return this;
	}
	
	public BookHotels gst(String data) {
		selectVisibileTextByXpath(prop.getProperty("BookHotels.Gst.xpath"), data);
		return this;
	}
	
	public BookHotels hotlName() {
		verifyTextByXpath(prop.getProperty("BookHotels.HotlName.xpath"), roomName);
		return this;
	}
	
	public BookHotels hotlCost() {
		verifyTextByXpath(prop.getProperty("BookHotels.HotlCost.xpath"), roomCost);
		return this;
	}
	
	public BookHotels clickPageDown() {
		pageDown();
		return this;
	}
	
	public BookHotels clickWaitProperty() {
		waitProperty(3000);
		return this;
	}
	/*public BookHotels continues() {
		clickByXpath("//button[@class='ContinueBtn']");
		return this;
	}*/
	
	/*public BookHotels termsAndCondtions() {
		clickByXpath("//div[@class='TnCChkBox']");
		return this;
	}*/
	
	public BookHotels makePayment() {
		clickByXpath(prop.getProperty("BookHotels.MakePayment.xpath"));
		return this;
	}
	
	public BookHotels verifyOtp() {
		clickByXpath(prop.getProperty("BookHotels.VerifyOtp.xpath"));
		return this;
	}
	
	public BookHotels otpRequired(String data) {
		verifyTextByXpath(prop.getProperty("BookHotels.OtpRequired.xpath"), data);
		return this;
	}
	
	
 }
