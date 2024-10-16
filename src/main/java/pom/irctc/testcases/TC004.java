package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC004";
		testCaseDescription="To book hotels with Gst";
		author="Kalaivani";
		category="regression";
		url="https://www.irctc.co.in";
		sheetName="TC004";
	}
	

@Test(dataProvider="fetchData")	
public void bookHotelswithGst(String mail, String phoneNum, String room, String adult, String mail2, String phoneNum2, String title, String firstname, String lastname,
		 String state, String gst, String gstNumber, String company, String address, String text) {
	new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindow1()
		.sideBar()
		.gstYes()
		.switchToLastWindow5()
		.login()
		.guestUser()
		.userName(mail)
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
		.room(room)
		.adult(adult)
		.done()
		.searchHotel()
		.hotelNameSelect()
		.switchToLastWindow6()
		.hotelName()
		.price()
		.continueToBook()
		.guestUserLogin()
		.userEmail(mail2)
		.mobileNum(phoneNum2)
		.login1()
		.title(title)
		.firstName(firstname)
		.lastName(lastname)
		.state(state)
		.gst(gst)
		.gstNumber(gstNumber)
		.companyName(company)
		.companyAddress(address)
		.makePayment()
		.gstRequired(text);
		
}
}

