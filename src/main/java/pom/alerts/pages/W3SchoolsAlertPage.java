package pom.alerts.pages;

import wrappers.GenericWrappers;

public class W3SchoolsAlertPage extends GenericWrappers{
	
	public W3SchoolsAlertPage switchToFrame() {
		waitProperty(5000);
		switchToNewFrame(prop.getProperty("W3SchoolsAlertPage.SwitchToFrame.xpath"));
		return this;
	}
	 
	public AlertsPage tryIt() {
		clickByXpathNoSnap(prop.getProperty("W3SchoolsAlertPage.TryIt.xpath"));
		waitProperty(3000);
		return new AlertsPage();
	}
	public W3SchoolsAlertPage verifyAlertText(String data) {
		verifyTextByXpath(prop.getProperty("W3SchoolsAlertPage.VerifyAlert.xpath"), data);
		return this;
	}
	
	public HomePage clickHome() {
		clickByXpath(prop.getProperty("HomePage.ClickHome.xpath"));
		return new HomePage();
	}
	
	public W3SchoolsAlertPage clickRefresh() {
		refresh();
		return this;
	}
	
	public W3SchoolsAlertPage returnToDefault() {
		switchToDefault();
		return this;
	}
 

}
