package pom.irctc.pages;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers {
	
	public RegistrationPage enterUserName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.USerName.xpath"), data);
		return this;
	}
	
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Password.xpath"), data);
		return this;
	}

	public RegistrationPage confirmPassword(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.ConfirmPassword.xpath"), data);
		return this;
	}
	
	public RegistrationPage prefLanguage() {
		clickByXpath(prop.getProperty("RegistrationPage.PrefLanguage.xpath"));
		return this;
	}
	
	public RegistrationPage prefLangAnswer() {
		clickByXpath(prop.getProperty("RegistrationPage.PrefLanguageAnswer.xpath"));
		waitProperty(2000);
		return this;
	}
	
	public RegistrationPage secQuestion() {
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestion.xpath"));
		return this;
	}
	
	public RegistrationPage secQuestionSelect() {
		clickByXpath(prop.getProperty("RegistrationPage.SecQuestionSelect.xpath"));
		return this;
	}
	
	
	public RegistrationPage secAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.SecAnswer.xpath"), data);
		return this;
	}
	
	public RegistrationPage continued() {
		clickByXpath(prop.getProperty("RegistrationPage.Continued.xpath"));
		return this;
	}
	
	public RegistrationPage firstName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FirstName.xpath"), data);
		return this;
	}
	
	public RegistrationPage middleName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.MiddleName.xpath"), data);
		return this;
	}
	
	public RegistrationPage lastName(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.LastName.xpath"), data);
		return this;
	}
	
	public RegistrationPage occupation() {
		clickByXpath(prop.getProperty("RegistrationPage.Occupation.xpath"));
		return this;
	}
	
	public RegistrationPage occuSelect() {
		clickByXpath(prop.getProperty("RegistrationPage.OccupationSelect.xpath"));
		return this;
	}
	
	public RegistrationPage dateOfBirth() {
		clickByXpath(prop.getProperty("RegistrationPage.DateOfBirth.xpath"));
		return this;
	}
	
	public RegistrationPage dobYear(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.DobYear.xpath"), data);
		return this;
	}
	
	public RegistrationPage dobMonth(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.DobMonth.xpath"), data);
		return this;
	}
	
	public RegistrationPage dobDate() {
		clickByXpath(prop.getProperty("RegistrationPage.DobDate.xpath"));
		//waitProperty(3000);
		return this;
	}
	public RegistrationPage maritalStatus() {
		clickByXpath(prop.getProperty("RegistrationPage.MaritalStatus.xpath"));
		return this;
	}
	
	public RegistrationPage country(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.country.xpath"), data);
		return this;
	}
	
	public RegistrationPage gender() {
		clickByXpath(prop.getProperty("RegistrationPage.gender.xpath"));
		return this;
	}
	
	public RegistrationPage email(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Email.xpath"), data);
		return this;
	}
	
	public RegistrationPage phone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Phone.xpath"), data);
		return this;
	}
	
	public RegistrationPage nation(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.Nation.xpath"), data);
		return this;
	}
	
	public RegistrationPage submit() {
		clickByXpath(prop.getProperty("RegistrationPage.Submit.xpath"));
		return this;
	}
	
	public RegistrationPage flatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.FlatNo.xpath"), data);
		return this;
	}
	
	public RegistrationPage street(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Street.xpath"), data);
		return this;
	}
	
	public RegistrationPage area(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Area.xpath"), data);
		return this;
	}
	
	public RegistrationPage pinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.PinCode.xpath"), data);
		//waitProperty(2000);
		return this;
	}
	public RegistrationPage clickTab() {
		tab();
		return this;
	}
	public RegistrationPage city(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.City.xpath"), data);
		return this;
	}
	
	public RegistrationPage postOfz(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.PostOfz.xpath"), data);
		return this;
	}
	
	public RegistrationPage mobile(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.Mobile.xpath"), data);
		return this;
	}
	
	public RegistrationPage copyAddress() {
		clickByXpath(prop.getProperty("RegistrationPage.CopyAddress.xpath"));
		return this;
	}
	
	public RegistrationPage offFlatNo(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffFlatNo.xpath"), data);
		return this;
	}
	
	public RegistrationPage offStreet(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffStreet.xpath"), data);
		return this;
	}
	
	public RegistrationPage offArea(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffArea.xpath"), data);
		return this;
	}
	
	public RegistrationPage offCountry(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.OffCountry.xpath"), data);
		return this;
	}
	
	public RegistrationPage offPinCode(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPinCode.xpath"), data);
		return this;
	}
	
	public RegistrationPage clickPageDown() {
		pageDown();
		return this;
	}
	public RegistrationPage offCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.OffCity.xpath"), data);
		return this;
	}
	
	public RegistrationPage offPostOfz(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationPage.OfzPostOffice.xpath"), data);
		return this;
	}
	
	public RegistrationPage offPhone(String data) {
		enterByXpath(prop.getProperty("RegistrationPage.OffPhone.xpath"), data);
		return this;
	}
	
}