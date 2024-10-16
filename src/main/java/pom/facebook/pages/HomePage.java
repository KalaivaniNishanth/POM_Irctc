package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	public FaceBookSignUp createAccount() {
		clickByXpath(prop.getProperty("HomePage.CreateAccount.xpath"));
		return new FaceBookSignUp();
	}

}
