package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PhpTravelsHomePage;
import wrappers.ProjectWrappers;

public class TC011 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC011";
		testCaseDescription="To register in the Travels";
		author="Kalaivani";
		category="functional";
		url="https://www.phptravels.org/register.php";
		sheetName="TC011";
	}
	
	@Test(dataProvider="fetchData")
	public void phpTravels(String firstName, String lastName, String mail, String phone, String company, String address, String address2, String city, 
			String state, String pincode, String country, String mobile, String password, String confirmPassword) {
	new PhpTravelsHomePage()
		.firstName(firstName)
		.lastName(lastName)
		.email(mail)
		.phoneCode()
		.phoneCodeSelect()
		.phoneNumber(phone)
		.companyName(company)
		.address(address)
		.streetAddress(address2)
		.city(city)
		.state(state)
		.postCode(pincode)
		.country(country)
		.mobileWhatsapp(mobile)
		.password(password)
		.confirmPassword(confirmPassword);
		
}
}