package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007 extends ProjectWrappers{


	@BeforeClass
	public void beforeClass() {
		testCaseName="TC007";
		testCaseDescription="To verify facebook sign up for a new user registration";
		author="Kalaivani";
		category="smoke";
		url="https://www.facebook.com";
		sheetName="TC007";
	}
	
@Test(dataProvider = "fetchData")
public void faceBookRegistration(String firstName, String lastName, String mailID, String confirmMailID, String password, String day, String month, String year ) {	
	new HomePage() 
		.createAccount()
		.firstName(firstName)
		.lastName(lastName)
		.email(mailID)
		.emailConfirmation(confirmMailID)
		.password(password)
		.dobDate(day)
		.dobMonth(month)
		.dobYear(year)
		.gender();
	}
}
