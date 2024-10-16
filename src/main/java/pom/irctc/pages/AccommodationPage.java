package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccommodationPage extends GenericWrappers{
	
	public AccommodationPage switchToLastWindow1() {
		switchToLastWindow();
		return this;
	}

	public AccommodationPage sideBar() {
		clickByXpath(prop.getProperty("AccommodationPage.SideBar.xpath"));
		return this;
		}
	
	public FTRServicePage bookYourCoach() {
		clickByXpath(prop.getProperty("FTRServicePage.BookYourCoach.xpath"));
		return new FTRServicePage();
	}
	
	public CharterPage charter() {
		clickByXpath(prop.getProperty("CharterPage.Charter.xpath"));
		return new CharterPage();
	}
	
	public BookHotels hotel() {
		clickByXpath(prop.getProperty("BookHotels.Hotel.xpath"));
		//switchToLastWindow();
		return new BookHotels();
	}
	
	public BookHotelsWithGst gstYes() {
		clickByXpath(prop.getProperty("BookHotelsWithGst.GstYes.xpath"));
		//switchToLastWindow();
		return new BookHotelsWithGst();
	}
	
}
