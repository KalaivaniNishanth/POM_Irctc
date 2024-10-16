package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="To book coach in the train";
		author="Kalaivani";
		category="regression";
		url="https://www.irctc.co.in";
		sheetName="TC002";
	}
	
	
@Test(dataProvider = "fetchData")
public void bookYourCoach(String userId, String password, String confirmPassword, String secQues, String secAns, String month, String year, String mail, String occupation,
        String firstName, String middleName, String lastName, String nation, String flatNo, String street, String area, String country, String phoneNum, 
        String pincode, String city, String postOff, String cFlatno, String cStreet, String cArea, String cCountry, String cPhonenum, String cPincode, 
        String cCity, String cPostOff) {
	new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindow1()
		.sideBar()
		.bookYourCoach()
		.switchToLastWindow2()
		.newUser()
		.userId(userId)
		.passWord(password)
		.confirmPassword(confirmPassword)
		.secQues(secQues)
		.secAnswer(secAns)
		.dateOfBirth()
		.month(month)
		.year(year)
		.date()
		.gender()
		.maritalStatus()
		.mailId(mail)
		.occupation(occupation)
		.firstName(firstName)
		.middleName(middleName)
		.lastName(lastName)
		.nation(nation)
		.flatNo(flatNo)
		.street(street)
		.area(area)
		.country(country)
		.mobile(phoneNum)
		.pinCode(pincode)
		.tab1()
		.city(city)
		.tab3()
		.postOfz(postOff)
		.clickPageDown()
		.clickWaitProperty1()
		.sameAddress()
		.offFlatNo(cFlatno)
		.offStreet(cStreet)
		.offArea(cArea)
		.offCountry(cCountry)
		.offMobile(cPhonenum)
		.offPinCode(cPincode)
		.tab2()
		.offCity(cCity)
		.offPostOfz(cPostOff);
		
	
}



		
}
