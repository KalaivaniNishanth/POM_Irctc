package pom.formc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.FormCHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC006";
		testCaseDescription="To verify Frro form c registration";
		author="Kalaivani";
		category="smoke";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		sheetName="TC006";
	}
	

@Test(dataProvider="fetchData")
public void formCRegistration(String userId, String userPassword, String confirmPassword, String secQues, String securityAnswer, String userName, String gender, String dateOfBirth, String designation,String mailId,
		String mobileNum, String phoneNum, String nation, String name, String capacity, String address, String state, String city, String acco, String starRate, String email, String mobileContact, String contact, String oName, String ownerAddress, 
		String state1, String district1, String emailId, String phone, String mobile, String name2, String address2, String state2, String district2, String emailId2, String phone2, String mobile2) {
	new FormCHomePage()
		.signUp()
		.userId(userId)
		.passWord(userPassword)
		.confirmPasswod(confirmPassword)
		.secQuestion(secQues)
		.secAnswer(securityAnswer)
		.name(userName)
		.gender(gender)
		.dateOfBirth(dateOfBirth)
		.designation(designation)
		.email(mailId)
		.mobile(mobileNum)
		.phoneNum(phoneNum)
		.nation(nation)
		.nameHotel(name)
		.capacity(capacity)
		.address(address)
		.state(state)
		.city(city)
		.accommodation(acco)
		.accoGrade(starRate)
		.mail(email)
		.contact(mobileContact)
		.phoneContact(contact)
		.ownerName(oName)
		.ownerAddress(ownerAddress)
		.ownerState(state1)
		.ownerCity(district1)
		.ownerMail(emailId)
		.ownerPhoneNum(phone)
		.ownerMobile(mobile)
		.clickAdd()
		.ownName(name2)
		.ownAddress(address2)
		.ownState(state2)
		.ownCity(district2)
		.ownMail(emailId2)
		.ownPhoneNum(phone2)
		.ownMobile(mobile2);
}
}
