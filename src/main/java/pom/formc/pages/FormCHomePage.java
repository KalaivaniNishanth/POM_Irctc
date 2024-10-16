package pom.formc.pages;

import wrappers.GenericWrappers;

public class FormCHomePage extends GenericWrappers{

	public RegistrationFormC signUp() {
		clickByXpath(prop.getProperty("FormCHomePage.SignUp.xpath"));
		return new RegistrationFormC();
	}
}
