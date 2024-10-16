package pom.alerts.pages;

import wrappers.GenericWrappers;

public class AlertsPage extends GenericWrappers {

	public AlertsPage enterText(String data) {
		alertText(data);
		return this;
	}
	public AlertsPage returnAlertText() {
		getAlertText();
		return this;
	}
	public W3SchoolsAlertPage acceptAlertText() {
		acceptAlert();
		return new W3SchoolsAlertPage();
	}
	public W3SchoolsAlertPage dismissAlertText() {
		dismissAlert();
		return new W3SchoolsAlertPage();
	}
	
}
