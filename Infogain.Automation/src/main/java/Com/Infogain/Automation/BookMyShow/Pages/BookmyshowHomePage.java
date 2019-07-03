package Com.Infogain.Automation.BookMyShow.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class BookmyshowHomePage extends BasePage{
	
	public BookmyshowHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "(//*[@class='__top-cities']//li[2]//following::a[1])[2]")
	WebElement City;
	
	
	public void ClickCity()
	{
		City.click();
	}
}
