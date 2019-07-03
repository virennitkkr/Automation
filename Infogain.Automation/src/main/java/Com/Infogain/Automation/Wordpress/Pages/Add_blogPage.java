package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class Add_blogPage extends BasePage {
	
	@FindBy(xpath="(//*[@class='site-type__option-label'])[1]")
	WebElement addBlog;
	
	
	public Add_blogPage() {
	PageFactory.initElements(driver, this);
	}
	
	
	public void addBlog()
	{
		addBlog.clear();
	}

}
