package Com.Infogain.Automation.MakeMyTrip;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Com.Infogain.Automation.MakeMytrip.Pages.FlightListingPage;
import Com.Infogain.Automation.MakeMytrip.Pages.HomePage;

public class HomeTest extends BasePage{
	
	HomePage hp;
	FlightListingPage flightListingPage;
	
	@Test
	public void SelectFlights() throws IOException
	{
	  setup();	
	  hp = new HomePage();
	  hp.SearchFlight();
	  takeScreenShort();
	  flightListingPage = new  FlightListingPage();
	  flightListingPage.selectFlightGoAir();
	  System.out.println(flightListingPage.getTitle());
	  
	}

	
	@AfterMethod
	void closeTest()
	{
		driver.quit();
	}
	
}
