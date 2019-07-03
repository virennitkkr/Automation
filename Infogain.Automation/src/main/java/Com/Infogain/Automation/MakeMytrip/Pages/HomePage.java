package Com.Infogain.Automation.MakeMytrip.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class HomePage extends BasePage{
	
	
	@FindBy(xpath = "//a[text() = 'Search']")
	WebElement SearchButton;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public FlightListingPage SearchFlight() throws IOException
	{
		takeScreenShort();
		SearchButton.click();
		return new FlightListingPage();
		
	}


	public void SelectCity() {
		// TODO Auto-generated method stub
		
	}

}
