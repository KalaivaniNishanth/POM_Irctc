package pom.ssc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	public HomePage login() {
		clickByXpath("//button[text()=' Login or Register ']");
		return this;
	}
	
	public OneTimeRegHomePage register() {
		clickByXpath("//p[text()=' Register Now ']");
		return new OneTimeRegHomePage();
	}
	
	
}
