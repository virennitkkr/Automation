package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class SignupPage extends BasePage {
	

	@FindBy(xpath="(//input[@class='form-text-input signup-form__input'])[1]")
	 WebElement EmailID;
	
	@FindBy(xpath="(//input[@class='form-text-input signup-form__input'])[2]")
	 WebElement userName;
	
	@FindBy(xpath="(//input[@class='form-text-input signup-form__input'])[3]")
	 WebElement userpassword;
	
	@FindBy(xpath="//button[contains(text(), 'Create your account')]")
	WebElement CreateButton;
	
	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean Register( String emailId, String userID, String pass)
	{
		EmailID.sendKeys(emailId);
		userName.sendKeys(userID);
		userpassword.sendKeys(pass);
		if(CreateButton.isDisplayed())
		{
			CreateButton.click();
			return true;}
		else {
			return false;}
	 }
	
	public void login(String userID, String pass)
	{
		userName.sendKeys(userID);
		userpassword.sendKeys(pass);
	}

  
}
