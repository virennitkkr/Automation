package Com.Infogain.Automation.BookMyShow.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class HomePage extends BasePage  {
	
	@FindBy(xpath = "(//*[@class='__top-cities']//li[2]//following::a[1])[2]")
	WebElement EnterCity;

	// *[@id="navbar"]/div[2]/div[2]/div[2]/div[2]/ul/li[4]/div/div[3]/div[2]/ul/li[2]/a

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void SelectCity() {

		EnterCity.click();

	}
	

}

