package qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.loginPage;

public class FrameTest {


	
	@Test
	void frame() throws  StaleElementReferenceException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\virendra.bhagat\\eclipse-workspace\\com.automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		int i = driver.findElements(By.tagName("frame")).size();
		System.out.println("frame size = " +i);
		for (int j=0;j<=i;j++)
		{
			driver.switchTo().frame(j);
			try {
				WebElement el = driver.findElement(By.xpath("123"));
				if(el.isDisplayed()) 
				{
					el.sendKeys("hello");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
			
			
		}
	}
}
