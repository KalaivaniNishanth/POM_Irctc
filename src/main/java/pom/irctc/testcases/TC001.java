package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001";
		testCaseDescription="For new user Registration in IRCTC";
		author="Kalaivani";
		category="regression";
		url="https://www.irctc.co.in";
		sheetName="TC001";
	}

	
	@Test(dataProvider = "fetchData")
	public void irctcRegistration(String userName, String password, String confirmPassword, String secAnswer, String firstName, String middleName, String lastName, String year,
            String month, String country, String mailId, String phoneNum, String nationality, String flatNo, String street, String area, String pincode,
            String city, String postOfz, String phone, String oFlatNo, String oStreet, String oArea, String oCountry, String oPincode,
            String oState, String oCity, String oPostOfz, String oPhonenum) {
	new HomePage()
		.clickOnRegister()
		.enterUserName(userName)
		.enterPassword(password)
		.confirmPassword(confirmPassword)
		.prefLanguage()
		.prefLangAnswer()
		.secQuestion()
		.secQuestionSelect()
		.secAnswer(secAnswer)
		.continued()
		.firstName(firstName)
		.middleName(middleName)
		.lastName(lastName)
		.occupation()
		.occuSelect()
		.dateOfBirth()
		.dobYear(year)
		.dobMonth(month)
		.dobDate()
		.maritalStatus()
		.country(country)
		.gender()
		.email(mailId)
		.phone(phoneNum)
		.nation(nationality)
		.submit()
		.flatNo(flatNo)
		.street(street)
		.area(area)
		.pinCode(pincode)
		.clickTab()
		.city(city)
		.postOfz(postOfz)
		.mobile(phone)
		.copyAddress()
		.offFlatNo(oFlatNo)
		.offStreet(oStreet)
		.offArea(oArea)
		.offCountry(oCountry)
		.offPinCode(oPincode)
		.clickPageDown()
		.offCity(oCity)
		.offPostOfz(oPostOfz)
		.offPhone(oPhonenum);
		
	}	

}
