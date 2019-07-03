package Com.Infogain.Automation.BookMyShow.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;

public class MoviesListPage  extends BasePage {


	@FindBy(xpath = "(//*[@class='view-all'])[1]")
	WebElement viewAll;

	
	@FindBy(xpath = "//div[@class='card-right']//div/h4")
	List<WebElement>  AllmoviesList;
	
	
	@FindBy(xpath = "//div[@class='card-right']//div/h4")
     List  AllmoviesName;

	
	// *[@id="navbar"]/div[2]/div[2]/div[2]/div[2]/ul/li[4]/div/div[3]/div[2]/ul/li[2]/a

	public MoviesListPage() {
		PageFactory.initElements(driver, this);}

	public void AllmoviesList() throws IOException, InterruptedException
	{
		viewAll.click();
	//	List<WebElement>  AllmoviesList=driver.findElements(By.xpath("//div[@class='card-right']//div/h4"));
		
		System.out.println("Total movies in NCR :"+AllmoviesList.size());
		for(WebElement el: AllmoviesList)
		{
			 System.out.println("Movie :"+ el.getText());
			 String MovieName = el.getText();
			 takeScreenShort();
			
			// Scroll();
		} 
			
		
	}
	
		
	}

	