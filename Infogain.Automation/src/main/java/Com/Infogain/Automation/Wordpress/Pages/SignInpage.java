package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class SignInpage extends BasePage {
	
	
	@FindBy(xpath="//input[@id='usernameOrEmail']")
	WebElement username;
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement Continue;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement LogIN;
	
	
	
	public SignInpage(){
	PageFactory.initElements(driver, this);}
	
	
	public void userID(String userID)
	{
		username.sendKeys(userID);
		Continue.click();
	}
	
	public void userPassword(String pass)
	{
		Password.sendKeys(pass);
		LogIN.click();
		
	}

}
