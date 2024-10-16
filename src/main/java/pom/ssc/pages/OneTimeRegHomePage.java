package pom.ssc.pages;

import wrappers.GenericWrappers;

public class OneTimeRegHomePage extends GenericWrappers{

	public SscRegPage continues() {
		clickByXpath("//button[text()='Continue']");
		return new SscRegPage();
	}
}
