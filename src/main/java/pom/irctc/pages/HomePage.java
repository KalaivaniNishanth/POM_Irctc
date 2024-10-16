package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers {
	
	
	public RegistrationPage clickOnRegister() {
		 
		clickByXpath(prop.getProperty("HomePage.Register.xpath"));
		
		//waitProperty(5000);
		
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {

		mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnHolidays.xpath"));
		
		return this;
	}
	
	public HomePage mouseHoverOnStays() {
		
		mouseHoverByXpath(prop.getProperty("HomePage.mouseHoverOnStays.xpath"));
		
		return this;
		
	}
	
	public AccommodationPage clickOnLounge() {
		
		clickByXpath(prop.getProperty("AccommodationPage.ClickOnLounge.xpath"));
		
		return new AccommodationPage();
	}
	
	}
