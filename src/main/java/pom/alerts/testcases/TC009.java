package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="To Verify the confirm alert text page";
		author="Kalaivani";
		category="functional";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
		sheetName="TC009";
	}
	
@Test(dataProvider="fetchData")
public void confirmAlert(String text1, String text2) {
	new W3SchoolsAlertPage()
		.switchToFrame()
		.tryIt()
		.returnAlertText()
		.acceptAlertText()
		.verifyAlertText(text1)
		.clickRefresh()
		.switchToFrame()
		.tryIt()
		.returnAlertText()
		.dismissAlertText()
		.verifyAlertText(text2)
		.returnToDefault()
		.clickHome()
		.switchToLastWindow1();
		
}
}
