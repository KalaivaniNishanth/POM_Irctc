package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC008 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="To Verify the simple alert text";
		author="Kalaivani";
		category="functional";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		sheetName="TC008";
	}

	
@Test
public void simpleAlert() {
	new W3SchoolsAlertPage()
		.switchToFrame()
		.tryIt()
		.returnAlertText()
		.acceptAlertText()
		.returnToDefault()
		.clickHome()
		.switchToLastWindow1();
}

}
