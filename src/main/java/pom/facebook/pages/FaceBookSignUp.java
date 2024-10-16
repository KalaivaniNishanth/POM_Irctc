package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookSignUp extends GenericWrappers {

	
	
	public FaceBookSignUp firstName(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUp.FirstName.xpath"), data);
		return this;
	}
	
	public FaceBookSignUp lastName(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUp.LastName.xpath"), data);
		return this;
	}
	
	public FaceBookSignUp email(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUp.Email.xpath"), data);
		return this;
	}
	
	public FaceBookSignUp emailConfirmation(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUp.EmailConfirm"), data);
		return this;
	}
	
	public FaceBookSignUp password(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUp.Password"), data);
		return this;
	}
	
	public FaceBookSignUp dobDate(String data) {
		selectVisibileTextByXpath(prop.getProperty("FaceBookSignUp.DateOfBirth"), data);
		return this;
	}
	
	public FaceBookSignUp dobMonth(String data) {
		selectVisibileTextByXpath(prop.getProperty("FaceBookSignUp.DobMonth"), data);
		return this;
	}
	
	public FaceBookSignUp dobYear(String data) {
		selectVisibileTextByXpath(prop.getProperty("FaceBookSignUp.DobYear"), data);
		return this;
	}
	
	public FaceBookSignUp gender() {
		clickByXpath(prop.getProperty("FaceBookSignUp.Gender"));
		return this;
	}
	

}
