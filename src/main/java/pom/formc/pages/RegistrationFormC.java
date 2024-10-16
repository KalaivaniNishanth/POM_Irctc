package pom.formc.pages;

import wrappers.GenericWrappers;

public class RegistrationFormC extends GenericWrappers{
	
	public RegistrationFormC userId(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.UserId.xpath"), data);
		return this;
	}
	
	public RegistrationFormC passWord(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Password.xpath"), data);
		return this;
	}
	
	public RegistrationFormC confirmPasswod(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.ConfirmPassword.xpath"), data);
		return this;
	}
	
	public RegistrationFormC secQuestion(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.SecQuestion.xpath"), data);
		return this;
	}
	
	public RegistrationFormC secAnswer(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.SecAnswer.xpath"), data);
		return this;
	}
	
	public RegistrationFormC name(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Name.xpath"), data);
		return this;
	}
	
	public RegistrationFormC gender(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.Gender.xpath"), data);
		return this;
	}
	
	public RegistrationFormC dateOfBirth(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.DateOfBirth.xpath"), data);
		return this;
	}
	
	public RegistrationFormC designation(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Designation.xpath"), data);
		return this;
	}
	
	public RegistrationFormC email(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Email.xpath"), data);
		return this;
	}
	
	public RegistrationFormC mobile(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Mobile.xpath"), data);
		return this;
	}
	
	public RegistrationFormC phoneNum(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.PhoneNum.xpath"), data);
		return this;
	}
	
	public RegistrationFormC nation(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.Nation.xpath"), data);
		return this;
	}
	
	public RegistrationFormC nameHotel(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.NameHotel.xpath"), data);
		return this;
	}
	
	public RegistrationFormC capacity(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Capacity.xpath"), data);
		return this;
	}
	
	public RegistrationFormC address(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Address.xpath"), data);
		return this;
	}
	
	public RegistrationFormC state(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.State.xpath"), data);
		waitProperty(5000);
		return this;
	}
	
	public RegistrationFormC city(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.City.xpath"), data);
		return this;
	}
	
	public RegistrationFormC accommodation(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.Accomodation.xpath"), data);
		return this;
	}
	
	public RegistrationFormC accoGrade(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.AccoGrade.xpath"), data);
		//waitProperty(3000);
		return this;
	}
	
	public RegistrationFormC mail(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Mail.xpath"), data);
		return this;
	}
	
	public RegistrationFormC contact(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.Contact.Xpath"), data);
		return this;
	}
	
	public RegistrationFormC phoneContact(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.PhoneContact.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerName(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnerName.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnerAddress.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerState(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.OwnerState.xpath"), data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationFormC ownerCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.OwnerCity.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerMail(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnerEmail.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerPhoneNum(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnerPhone.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownerMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnerMobile.xpath"), data);
		return this;
	}
	
	public RegistrationFormC clickAdd() {
		clickByXpath(prop.getProperty("RegistrationFormC.ClickAdd.xpath"));
		return this;
	}
	
	public RegistrationFormC ownName(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnName.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownAddress(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnAddress.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownState(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.OwnState.xpath"), data);
		waitProperty(3000);
		return this;
	}
	
	public RegistrationFormC ownCity(String data) {
		selectVisibileTextByXpath(prop.getProperty("RegistrationFormC.OwnCity.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownMail(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnMail.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownPhoneNum(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnPhoneNum.xpath"), data);
		return this;
	}
	
	public RegistrationFormC ownMobile(String data) {
		enterByXpath(prop.getProperty("RegistrationFormC.OwnMobile.xpath"), data);
		return this;
	}

}
