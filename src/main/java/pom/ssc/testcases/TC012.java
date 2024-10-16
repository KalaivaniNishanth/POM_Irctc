package pom.ssc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.ssc.pages.HomePage;
import wrappers.ProjectWrappers;

public class TC012 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC012";
		testCaseDescription="To register in the ssc portal";
		author="Kalaivani";
		category="smoke";
		url="https:ssc.gov.in";
	}
	
	
	
	@Test
	public void sscLogin() {
	new HomePage()
		.login()
		.register()
		.continues()
		.aadhar()
		.aadharNum("895578998578")
		.verifyAadhar("895578998578")
		.name("kalaivani")
		.verifyName("kalaivani")
		.changeName()
		.newName("Kalaivani Nishanth")
		.verifyNewName("Kalaivani Nishanth")
		.gender()
		.genderSelection()
		.verifyGender()
		.verifyGenderSelect()
		.datePicker()
		.downArrow()
		.sideBar()
		.year("1995")
		.month()
		.day("16")
		.veriyDatePicker()
		.verifyDownArrow()
		.verifySideBar()
		.verifyYear("1995")
		.verifyMonth()
		.verifyDay("16")
		.fatherName("M Thiyagarajan")
		.verifyFatherName("M Thiyagarajan")
		.motherName("T Mangalam")
		.verifyMotherName("T Mangalam")
		.educationBoard()
		.verifyEducationBoardSelect()
		.rollNumber("563245")
		.verifyRollNumber("563245")
		.yearSelect()
		.yearOfPassing("2011")
		.verifyYearSelect()
		.verifyYearOfPassing("2011")
		.highestEducationSelect()
		.highestEducation()
		.verifyHighestEducationSelect()
		.verifyHighestEducation()
		.mobile("6589688952")
		.email("kalai16@gmail.com");
		
	}
}
