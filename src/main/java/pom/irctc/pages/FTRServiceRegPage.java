package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRServiceRegPage extends GenericWrappers {
	
	
	
	public FTRServiceRegPage userId(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.UserId.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage passWord(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.Password.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage confirmPassword(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.ConfirmPassword.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage secQues(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.SecQues.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage secAnswer(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.SecAnswer.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage dateOfBirth() {
		clickByXpath(prop.getProperty("FTRServiceRegPage.DateOfBirth.xpath"));
		return this;
	}
	
	public FTRServiceRegPage month(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.DobMonth.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage year(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.DobYear.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage date(){
		clickByXpath(prop.getProperty("FTRServiceRegPage.DobDay.xpath"));
		return this;
	}
	
	public FTRServiceRegPage gender() {
		clickByXpath(prop.getProperty("FTRServiceRegPage.Gender.xpath"));
		return this;
	}
	
	public FTRServiceRegPage maritalStatus() {
		clickByXpath(prop.getProperty("FTRServiceRegPage.MaritalStatus.xpath"));
		return this;
	}
	
	public FTRServiceRegPage mailId(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.MailId.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage occupation(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.Occuption.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage firstName(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.FirstName.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage middleName(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.MiddleName.xpath"), data);
		//pageDown();
		return this;
	}
	
	public FTRServiceRegPage lastName(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.LastName.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage nation(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.Nation.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage flatNo(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.FlatNo.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage street(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.Street.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage area(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.Area.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage country(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.Country.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage mobile(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.mobile.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage pinCode(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.Pincode.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage tab1() {
		tab();
		return this;
	}
	
	public FTRServiceRegPage city(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.City.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage tab3() {
		tab();
		return this;
	}
	
	/*public FTRServiceRegPage state(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.state.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage tab4() {
		tab();
		return this;
	}*/
	
	public FTRServiceRegPage postOfz(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.PostOfz.xpath"), data);
		//pageDown();
		//waitProperty(2000);
		return this;
	}
	
	public FTRServiceRegPage clickPageDown() {
		pageDown();
		return this;
	}
	
	public FTRServiceRegPage clickWaitProperty1() {
		waitProperty(2000);
		return this;
	}
	
	public FTRServiceRegPage sameAddress() {
		clickByXpath(prop.getProperty("FTRServiceRegPage.SameAddress.xpath"));
		return this;
	}
	
	public FTRServiceRegPage offFlatNo(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.OffFlatNo.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage offStreet(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.OffStreet.xpath"), data);
		return this;
	}
	public FTRServiceRegPage offArea(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.OffArea.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage offCountry(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.OffCountry.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage offMobile(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.OffMobile.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage offPinCode(String data) {
		enterByXpath(prop.getProperty("FTRServiceRegPage.OffPincode.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage tab2() {
		tab();
		return this;
	}
	
	public FTRServiceRegPage offCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.OffCity.xpath"), data);
		return this;
	}
	
	public FTRServiceRegPage offPostOfz(String data) {
		selectVisibileTextByXpath(prop.getProperty("FTRServiceRegPage.OffPostOfz.xpath"), data);
		return this;
	}
}
