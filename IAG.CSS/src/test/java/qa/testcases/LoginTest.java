package qa.testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

//import org.apache.http.impl.io.SocketOutputBuffer;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestData.DataProviderClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

//import com.sun.tools.internal.xjc.Driver;

import qa.base.TestBase;
import qa.pages.AddClientpage;
import qa.pages.AddProjectPage;
import qa.pages.HomePage;
import qa.pages.loginPage;

//@Listeners(utility.Listener.class)

public class LoginTest extends TestBase{

	
	loginPage LoginPage = new loginPage();
	String data;

	
	@BeforeMethod()
	
		public void setUp() throws IOException {
		TestBase testBase = new TestBase();
		testBase.setup();
	    data = testBase.readExcel();
	}

	@Test(priority = 1)
	public void AdminLogin() throws InterruptedException, IOException {
		 String arr[] = data.split(" ");
	     String tittle = LoginPage.validatepageTittle();
		Assert.assertEquals(tittle, "IAG-CSS - Login");
		loginPage LoginPage = new loginPage();
		LoginPage.login(arr[0], arr[1]); // Passing the values from exls file using POI
       Thread.sleep(2000);		
     // LoginPage.toolTip();
       }
	

	@Test(priority = 2, dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
	
	public void AdminLogin(String data) throws InterruptedException, IOException {
		// String arr[] = data.split(" ");
	     //String tittle = LoginPage.validatepageTittle();
		//Assert.assertEquals(tittle, "IAG-CSS - Login");
		loginPage LoginPage = new loginPage();
		LoginPage.login(data,data); // Passing the values from exls file using POI
       Thread.sleep(2000);		
     // LoginPage.toolTip(); 
       }


	@Test(priority = 3)
	public void add_Project() throws Throwable {
		AdminLogin();
		HomePage HP = new HomePage();
		HP.clickOnAddP();
		AddProjectPage addP = new AddProjectPage();
		addP.set_pName("BA1011");
		addP.set_pCode("GDC");
		addP.set_ProjectManager("Sumit");
		addP.set_DeliveryManager("Viren");
		addP.selectCSS_Frequency("3");
		addP.selectpArea("CssDelivery");
		addP.setStartDate("10/04/2019");
		addP.setEndDate("20/05/2019");
		addP.selectpOpco("BA");
		addP.click_pod();
		Thread.sleep(2000);
		takeScreenShort();
	}

	@Test(priority = 4)

	public void add_Client() throws InterruptedException, IOException, AWTException {
		AdminLogin();
		AddClientpage addC = new AddClientpage();
		addC.clickOnAddC();
		addC.setClientDetails();
		addC.selectClientData();
		addC.submitClientDetails();
		Thread.sleep(2000);
			
		takeScreenShort();

	}
	
	
	//@Test(priority=5)

//	void frame() throws  StaleElementReferenceException
//	{
//		int i = driver.findElements(By.tagName("frame")).size();
//		for (int j=0;j<=i;j++)
//		{
//			driver.switchTo().frame(j);
//			try {
//				WebElement el = driver.findElement(By.xpath("123"));
//				if(el.isDisplayed()) 
//				{
//					el.sendKeys("hello");
//				}
//			}
//			catch(Exception e)
//			{
//				
//			}
//			
//			
//		}
//	}
//	
//	@Test(priority = 6)
//	void windowhandle() throws InterruptedException
//	{
//		Set <String> set = driver.getWindowHandles();
//		
//		for(String str : set)
//		{
//			driver.switchTo().window(str);
//		}
//	
//	}
	


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
