package Com.Infogain.Automation.Bookmyshow;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Com.Infogain.Automation.BookMyShow.Pages.MoviesListPage;
import Com.Infogain.Automation.BookMyShow.Pages.HomePage;

public class BookMyshowTest extends BasePage {
	HomePage homePage;
	
	
	@BeforeTest()
	void  Configration()
	{
    setup();
	}
	
	
	@Test(priority =1)
	
	void bookMyShowLanding() throws IOException, InterruptedException{  
		HomePage homePage = new HomePage();
		
		homePage.SelectCity();
		
		MoviesListPage moviesListPage = new MoviesListPage();
	
		moviesListPage.AllmoviesList();
	}
	
	
	
	@BeforeTest()
	public void tearDown()

	{
		driver.quit();
	}
}
