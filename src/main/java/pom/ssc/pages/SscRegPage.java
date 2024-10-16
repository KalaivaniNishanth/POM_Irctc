package pom.ssc.pages;

import wrappers.GenericWrappers;

public class SscRegPage extends GenericWrappers {

	
	public SscRegPage aadhar() {
		clickByXpath("(//input[@name='selected'])[1]");
		return this;
	}
	
	public SscRegPage aadharNum(String data) {
		enterByXpath("//input[@aria-describedby='aadharInfo']", data);
		return this;
	}
	
	public SscRegPage verifyAadhar(String data) {
		enterByXpath("//input[@aria-describedby='aadharInfoVerify']", data);
		return this;
	}
	
	public SscRegPage name(String data) {
		enterByXpath("//input[@aria-describedby='userName']", data);
		return this;
	}
	
	public SscRegPage verifyName(String data) {
		enterByXpath("//input[@aria-describedby='userInfoVerify']", data);
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage changeName() {
		pageDown();
		clickByXpath("(//input[@name='changed'])[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage newName(String data) {
		enterByXpath("//input[@aria-describedby='newName']", data);
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyNewName(String data) {
		enterByXpath("//input[@aria-describedby='newNameVerify']", data);
		waitProperty(2000);
		pageDown();
		return this;
	}
	
	public SscRegPage gender() {
		clickByXpath("//div[text()=' 5. Gender ']/following::div[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage genderSelection() {
		clickByXpath("//li[text()=' Female ']");
		pageDown();
		//waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyGender() {
		clickByXpath("//div[text()=' a. Verify Gender ']/following::div[1]");
		//pageDown();
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyGenderSelect() {
		clickByXpath("//li[text()=' Female ']");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage datePicker() {
		clickByXpath("(//button[@type='button'])[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage downArrow() {
		clickByXpath("(//span[@class='mdc-button__label'])[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage sideBar() {
		clickByXpath("(//button[@type='button'])[5]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage year(String data) {
		clickByXpath("//span[text()="+data+"]");
		return this;
	}
	
	public SscRegPage month() {
		//clickByXpath("//span[text()="+data+"]");
		clickByXpath("//button[@aria-label='Sun Oct 01 1995']/span[1]");
		return this;
	}
	
	public SscRegPage day(String data) {
		clickByXpath("//span[text()="+data+"]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage veriyDatePicker() {
		//pageDown();
		clickByXpath("(//button[@type='button'])[2]");
		return this;
	}
	
	public SscRegPage verifyDownArrow() {
		clickByXpath("(//span[@class='mdc-button__label'])[1]");
		return this;
	}
	
	public SscRegPage verifySideBar() {
		clickByXpath("(//button[@type='button'])[5]");
		return this;
	}
	
	public SscRegPage verifyYear(String data) {
		clickByXpath("//span[text()="+data+"]");
		return this;
	}
	
	public SscRegPage verifyMonth() {
		clickByXpath("//button[@aria-label='Sun Oct 01 1995']/span[1]");
		return this;
	}
	
	public SscRegPage verifyDay(String data) {
		clickByXpath("//span[text()="+data+"]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage fatherName(String data) {
		enterByXpath("(//input[@aria-describedby='userFatherName'])[1]", data);
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyFatherName(String data) {
		enterByXpath("(//input[@aria-describedby='userFatherName'])[2]", data);
		//pageDown();
		return this;
	}
	
	public SscRegPage motherName(String data) {
		enterByXpath("//input[@aria-describedby='userMotherrName']", data);
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyMotherName(String data) {
		enterByXpath("//input[@aria-describedby='userMotherNameVerify']", data);
		//waitProperty(2000);
		pageDown();
		return this;
	}
	
	public SscRegPage educationBoardSelect() {
		//waitProperty(2000);
		//clickByXpath("//div[text()=' 9. Matriculation (10th class) Education Board ']/following::div[1]");
		clickByXpath("//div[text()=' 9. Matriculation (10th class) Education Board ']/following-sibling::div");
		//waitProperty(2000);
		return this;
	}
	
	public SscRegPage educationBoard() {
		//waitProperty(2000);
		clickByXpath("//li[text()=' Central Board of Secondary Education (CBSE) ']");
		waitProperty(2000);
		return this;
	}
	
	public  SscRegPage verifyEducationBoardSelect() {
		//clickByXpath("//div[text()=' a. Verify Matriculation (10th class) Education Board ']/following::div[1]");
		clickByXpath("//div[text()=' a. Verify Matriculation (10th class) Education Board ']/following-sibling::div");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyEducationBoard() {
		clickByXpath("//li[text()=' Central Board of Secondary Education (CBSE) ']");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage rollNumber(String data) {
		enterByXpath("//input[@aria-describedby='metricRollInfo']", data);
		return this;
	}
	
	public SscRegPage verifyRollNumber(String data) {
		enterByXpath("//input[@aria-describedby='metricRollInfoVerify']", data);
		//pageDown();
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage yearSelect() {
		clickByXpath("//div[text()=' 11. Year of Passing ']/following::div[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage yearOfPassing(String data) {
		clickByXpath("//li[text()="+data+"]");
		pageDown();
		//waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyYearSelect() {
		clickByXpath("//div[text()=' a. Verify Year of Passing ']/following::div[1]");
		//waitProperty(2000);
		return this;
	}
	
	public SscRegPage verifyYearOfPassing(String data) {
		clickByXpath("//li[text()="+data+"]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage highestEducationSelect() {
		clickByXpath("//div[text()=' 12. Highest Level of Education Qualification ']/following::div[1]");
		waitProperty(2000);
		return this;
	}
	
	public SscRegPage highestEducation() {
		clickByXpath("//li[text()=' Graduation ']");
		waitProperty(2000);
		return this;
	}
	
	
	public SscRegPage verifyHighestEducationSelect() {
		clickByXpath("//div[text()=' a. Verify Highest Level of Education Qualification ']/following::div[1]");
		return this;
	}
	
	public SscRegPage verifyHighestEducation() {
		clickByXpath("//li[text()=' Graduation ']");
		return this;
	}
	
	public SscRegPage mobile(String data) {
		enterByXpath("//input[@aria-describedby='mobileInfo']", data);
		return this;
	}
		
	public SscRegPage email(String data) {
		enterByXpath("//input[@aria-describedby='userEmail']", data);
		return this;
	}
}
