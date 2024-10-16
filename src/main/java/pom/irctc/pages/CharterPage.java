package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers {
	
	public CharterPage switchToLastWindow7() {
		switchToLastWindow();
		return this;
	}
	
	public CharterPage dismiss() {
		clickByXpath(prop.getProperty("CharterPage.Dismiss.xpath"));
		return this;
	}
	
	public CharterPage enquiryForm() {
		waitProperty(3000);
		clickByXpath(prop.getProperty("CharterPage.EnquiryForm.xpath"));
		return this;
	}
	
	public CharterPage name(String data) {
		enterByXpath(prop.getProperty("CharterPage.Name.xpath"), data);
		return this;
	}
	 
	public CharterPage organisation(String data) {
		enterByXpath(prop.getProperty("CharterPage.Organisation.xpath"), data);
		return this;
	}
	
	public CharterPage address(String data) {
		enterByXpath(prop.getProperty("CharterPage.address.xpath"), data);
		return this;
	}
	
	public CharterPage mobile(String data) {
		enterByXpath(prop.getProperty("CharterPage.Mobile.xpath"), data);
		return this;
	}
	
	public CharterPage email(String data) {
		enterByXpath(prop.getProperty("CharterPage.Email.xpath"), data);
		return this;
	}
	
	public CharterPage requestFor(String data) {
		selectVisibileTextByXpath(prop.getProperty("CharterPage.RequestFor.xpath"), data);
		return this;
	}
	
	public CharterPage originStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.OriginStation.xpath"), data);
		return this;
	}
	
	public CharterPage destStation(String data) {
		enterByXpath(prop.getProperty("CharterPage.DestStation.xpath"), data);
		return this;
	}
	
	public CharterPage dateOfDeparture() {
		
		clickByXpathNoSnap(prop.getProperty("CharterPage.DateOfDeparture.xpath"));
		return this;
	}
	
	public CharterPage selectDate() {
		clickByXpathNoSnap(prop.getProperty("CharterPage.SelectDate.xpath"));
		return this;
	}
	
	public CharterPage dateOfArrival() {
		clickByXpathNoSnap(prop.getProperty("CharterPage.DateOfArrival.xpath"));
		return this;
	}
	
	public CharterPage selectDateOfArrival() {
		clickByXpathNoSnap(prop.getProperty("CharterPage.SelectDateOfArrival.xpath"));
		return this;
	}
	
	public CharterPage durationPeriod(String data) {
		enterByXpath(prop.getProperty("CharterPage.DurationPeriod.xpath"), data);
		return this;
	}
	
	public CharterPage coachDetails(String data) {
		enterByXpath(prop.getProperty("CharterPage.CoachDetails.xpath"), data);
		return this;
	}
	
	public CharterPage numOfPassengers(String data) {
		enterByXpath(prop.getProperty("CharterPage.NumOfPassengers.xpath"), data);
		return this;
	}
	
	public CharterPage charterPurpose(String data) {
		enterByXpath(prop.getProperty("CharterPage.CharterPurpose.xpath"), data);
		return this;
	}
	
	public CharterPage additionalServices(String data) {
		enterByXpath(prop.getProperty("CharterPage.AdditionalServices.xpath"), data);
		return this;
	}
	
	public CharterPage submit() {
		clickByXpath(prop.getProperty("CharterPage.submit.xpath"));
		return this;
	}
	
	public CharterPage text(String data) {
		verifyTextEqualsByXpath(prop.getProperty("CharterPage.text.xpath"), data);
		return this;
	}
	
}
