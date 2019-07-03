package Com.Infogain.Automation.Wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class AddPostPage extends BasePage {

	
	@FindBy(xpath="//input[@id='usernameOrEmail']")
	WebElement username;
	
	@FindBy(xpath="//*[@class='gridicon gridicons-user-circle']")
	WebElement userIcon;
	
	@FindBy(xpath="//a[@title='Create a New Post']")
	WebElement Write;
	
	
	
	
	//button[contains(text(),'Log Out')]
	
	public AddPostPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addPost() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='Create a New Post']")).click();
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(By.className("is-iframe-loaded")));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add title']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@placeholder='Add title']")).sendKeys("My name is Robot");
		
	}
	
}
