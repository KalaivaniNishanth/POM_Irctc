package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers {
	

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC003";
		testCaseDescription="To book hotels without Gst";
		author="Kalaivani";
		category="regression";
		url="https://www.irctc.co.in";
		sheetName="TC003";
	}
	
	
	
@Test(dataProvider = "fetchData")	
public void bookHotels(String mail, String phoneNum, String room, String adult, String mail2, String phoneNum2, String title, String firstName, String lastName, String state, String gst, String otpReq) {
	
	new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindow1()
		.sideBar()
		.hotel()
		.switchToLastWindow3()
		.login()
		.guestUser()
		.email(mail)
		.mobile(phoneNum)
		.guestLogin()
		.clickWaitProperty1()
		.where()
		.city()
		.checkInDate()
		.day()
		.checkOutDate()
		.checkOutDay()
		.guest()
		.rooms(room)
		.adults(adult)
		.done()
		.searchHotel()
		.hotelNameSelect()
		.switchToLastWindow4()
		.hotelName()
		.price()
		.continueToBook()
		.guestUserLogin()
		.userEmail(mail2)
		.mobileNum(phoneNum2)
		.login1()
		.title(title)
		.firstName(firstName)
		.lastName(lastName)
		.state(state)
		.gst(gst)
		.hotlName()
		.hotlCost()
		.clickPageDown()
		.clickWaitProperty()
		//.termsAndCondtions()
		.makePayment()
		.verifyOtp()
		.otpRequired(otpReq);
		
}		

}
