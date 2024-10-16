package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PhpTravelsHomePage extends GenericWrappers{

	public PhpTravelsHomePage firstName(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.FirstName.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage lastName(String data) {
		enterByXpath(prop.getProperty("phpTravelsHomePage.LastName.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage email(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.Email.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage phoneCode() {
		clickByXpath(prop.getProperty("PhpTravelsHomePage.PhoneCode.xpath"));
		return this;
	}
	
	public PhpTravelsHomePage phoneCodeSelect() {
		clickByXpath(prop.getProperty("PhpTravelsHomePage.PhoneCodeSelect.xpath"));
		return this;
	}
	
	public PhpTravelsHomePage phoneNumber(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.PhoneNumber.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage companyName(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.CompanyName.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage address(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.Address.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage streetAddress(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.StreetAddress.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage city(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.City.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage state(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.State.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage postCode(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.PostCode.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage country(String data) {
		selectVisibileTextByXpath(prop.getProperty("PhpTravelsHomePage.Country.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage mobileWhatsapp(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.MobileWhatsapp.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage password(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.Password.xpath"), data);
		return this;
	}
	
	public PhpTravelsHomePage confirmPassword(String data) {
		enterByXpath(prop.getProperty("PhpTravelsHomePage.ConfirmPassword.xpath"), data);
		return this;
	}
	
	
}
