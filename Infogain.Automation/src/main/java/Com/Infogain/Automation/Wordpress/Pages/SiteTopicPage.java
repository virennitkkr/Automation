package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePage.BasePage;

public class SiteTopicPage extends BasePage {
	
	@FindBy(xpath="//*[@id='primary']//button[2]")
	WebElement SelectTravel;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement addTitle;
	
	@FindBy(xpath="//button[@type='button' and @class='button domain-suggestion__action is-primary' ]")
	WebElement addTitlea;
	
	public SiteTopicPage() {
	PageFactory.initElements(driver, this);
	} 
	
	public void SelectTravel()
	{
		//Select select = new Select(SelectTravel);
		//select.selectByValue("Travel");
		SelectTravel.click();
	}
	
	public void submit()
	{
		submit.click();
	}
	
	public void addTitle() throws InterruptedException
	{
		addTitle.click();
		
		Thread.sleep(1000);
		
	}

}
