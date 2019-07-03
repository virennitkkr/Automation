package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class SiteTypePage extends BasePage {
	
	
	
	@FindBy(xpath="(//*[@class='site-type__option-label'])[1]")
	WebElement SiteType;
	
	
	public SiteTypePage() {
		PageFactory.initElements(driver, this);
		} 
	
	
	public void SelectSiteType()
	{
		SiteType.click();
	}

}
