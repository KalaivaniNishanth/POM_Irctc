package pom.alerts.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.alerts.pages.W3SchoolsAlertPage;
import wrappers.ProjectWrappers;

public class TC010 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="To verify the prompt alert Page in w3school";
		author="Kalaivani";
		category="fucntional";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
		sheetName="TC010";
	}

@Test(dataProvider="fetchData")
public void promptAlert(String name, String text1, String name2, String text2) {
	new W3SchoolsAlertPage()
		.switchToFrame()
		.tryIt()
		.enterText(name)
		.acceptAlertText()
		.verifyAlertText(text1)
		.clickRefresh()
		.switchToFrame()
		.tryIt()
		.enterText(name2)
		.dismissAlertText()
		.verifyAlertText(text2)
		.clickRefresh()
		.returnToDefault()
		.clickHome()
		.switchToLastWindow1();
	}
}
