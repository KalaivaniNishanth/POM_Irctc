package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC005";
		testCaseDescription="To fill up the enquiry form in saloon charter";
		author="Kalaivani";
		category="regression";
		url="https://www.irctc.co.in";
		sheetName="TC005";
	}
	
	

@Test(dataProvider="fetchData")
public void charterPage(String name, String org, String address, String mobile, String email, String reqFor, String origStation, String destStation,
		String durationOfTour, String noAndType, String numOfPass, String purpose, String addServices, String text) {
	new HomePage()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToLastWindow1()
		.sideBar()
		.charter()
		.switchToLastWindow7()
		.dismiss()
		.enquiryForm()
		.name(name)
		.organisation(org)
		.address(address)
		.mobile(mobile)
		.email(email)
		.requestFor(reqFor)
		.originStation(origStation)
		.destStation(destStation)
		.dateOfDeparture()
		.selectDate()
		.dateOfArrival()
		.selectDateOfArrival()
		.durationPeriod(durationOfTour)
		.coachDetails(noAndType)
		.numOfPassengers(numOfPass)
		.charterPurpose(purpose)
		.additionalServices(addServices)
		.submit()
		.text(text);
		
}
}