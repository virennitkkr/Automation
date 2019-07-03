package Com.Infogain.Automation.MakeMytrip.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class FlightListingPage extends BasePage{
	
	@FindBy(xpath = "(//span[text() = 'Go Air'])[1]")
	WebElement GOAirCheck;
	
	public FlightListingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}
	
	
    public void selectFlightGoAir()
    {
    	GOAirCheck.click();
    }

}
