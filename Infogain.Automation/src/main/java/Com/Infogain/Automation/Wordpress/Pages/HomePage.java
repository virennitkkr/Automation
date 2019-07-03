package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class HomePage extends BasePage {

	//Home page elements
	
	@FindBy(xpath="(//a[contains(text(),'Get Started')])[1]")
	 WebElement SignUP;
	@FindBy(xpath="(//a[contains(text(),'Log In')])[1]")
	WebElement SignIn;
	
	

  //Login page elements
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Sign_UP() throws InterruptedException {
		Thread.sleep(2000);
		SignUP.click();
	}
	
	
	public void Sign_IN() {
	
		SignIn.click();
		
	}
	
	
//	public void logOut()
//	   {
//		driver.findElement(By.xpath("(//img[@class='gravatar'])[1]")).click();
//		
//		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
//	   }
//	
	
}
