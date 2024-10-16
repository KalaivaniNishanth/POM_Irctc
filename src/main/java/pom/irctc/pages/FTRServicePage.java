package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FTRServicePage extends GenericWrappers{

	
	public FTRServicePage switchToLastWindow2() {
		switchToLastWindow();
		return this;
	}
	public FTRServiceRegPage newUser() {
		clickByXpath(prop.getProperty("FTRServiceRegPage.NewUser.xpath"));
		return new FTRServiceRegPage();
	}
	
	
}
