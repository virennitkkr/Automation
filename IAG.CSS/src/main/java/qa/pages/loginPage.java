package qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sun.javafx.css.StyleCache.Key;

import qa.base.TestBase;
import qa.util.Log;

public class loginPage extends TestBase {
	
	//public static WebDriver driver;
	
	//Pagefactor OR

    @FindBy(id="inputEmail")
    WebElement username;
    
    @FindBy(id="inputPassword")
    WebElement password;
    
    @FindBy(name="login")
    WebElement button;
    
    @FindBy(xpath="//input[@type='submit']")
    
    WebElement tooltip;
    
    @FindBy(xpath="//input[@type='submit'][1]")
    
    WebElement cssbtn;
    
    //Initializing the page Object
    
    public loginPage()
    {
    	PageFactory.initElements(driver, this);
    }
    
    //Actions
    
    public String validatepageTittle()
    {
    	return driver.getTitle();
    }
    

    
    public void login(String un, String pwd)  throws InterruptedException 
    { 
    	PageFactory.initElements(driver, this);
    	username.sendKeys(un);
    	password.sendKeys(pwd);
    	button.click();

   	  Log.info("My Account link element found");
    	//return new HomePage();
    }
    
    public void toolTip()
    {
    	//Actions action = new Actions(driver);
    	//action.moveToElement(tooltip).build().perform();
    	String atr =tooltip.getAttribute("title");
    	System.out.println("tittle"+atr);
    	Assert.assertEquals(atr, "Send Email for CSS!");
    	Log.warn("Send Email for CSS!");
    }

}
