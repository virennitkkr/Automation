package Com.Infogain.Automation.Wordpress;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Com.Infogain.Automation.Wordpress.Pages.AddPostPage;
import Com.Infogain.Automation.Wordpress.Pages.HomePage;
import Com.Infogain.Automation.Wordpress.Pages.SignInpage;
import Com.Infogain.Automation.Wordpress.Pages.SignupPage;
import Com.Infogain.Automation.Wordpress.Pages.SiteTopicPage;
import Com.Infogain.Automation.Wordpress.Pages.SiteTypePage;

public class WordpressTest extends BasePage {

	public String emailID = "gdchf1314543qq1@ifg.com";
	public String userID = "gdchf5344q1q";
	public String Pass = "gdchf13@12314q1q";

	HomePage homePage;
	SignupPage signupPage;
	SignInpage signInpage;
	
//	 String email = data.emilId();
//	 String userID = data.userID();
//	  String Pass = data.password();

	@BeforeTest()
 public	void setUP() {
		BasePage basePage = new BasePage();
		basePage.setup();
		
	}

	@Test(priority = 1)
	void Sign_UP() throws InterruptedException {

		homePage = new HomePage();
		homePage.Sign_UP();
		 String email = data.emilId();
		 String userID = data.userID();
		  String Pass = data.password();

		signupPage = new SignupPage();

		signupPage.Register(email, userID, Pass);

		Assert.assertEquals(driver.getTitle(), "Create a site — WordPress.com");
		
		// Create Blog tye website to share post
		
		 SiteTypePage  siteType = new  SiteTypePage();
		 siteType.SelectSiteType();
		SiteTopicPage sitePage = new SiteTopicPage();
		sitePage.SelectTravel();
		sitePage.submit();
		sitePage.addTitle();
	}

	@Test(priority = 2)
	void Sign_IN() throws InterruptedException {
		homePage = new HomePage();
		homePage.Sign_IN();
		// Thread.sleep(10000);	
		signInpage = new SignInpage();
		signInpage.userID(userID);
		signInpage.userPassword(Pass);	
		AddPostPage obj = new AddPostPage();
		obj.addPost();
		//Thread.sleep(1000);
		//homePage.logOut();
	}


//	void LogOut() throws InterruptedException {
//		AddPostPage obj = new AddPostPage();
//		Sign_IN();
//		Thread.sleep(1000);
//
//		obj.logOut();
//	}

	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
}
