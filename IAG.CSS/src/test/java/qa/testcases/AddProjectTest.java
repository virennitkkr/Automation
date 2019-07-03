package qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.AddProjectPage;
import qa.pages.HomePage;
import qa.pages.loginPage;

public class AddProjectTest extends TestBase {
	 
	//loginPage Obj = new loginPage();

	AddProjectPage addP = new AddProjectPage();
	
  
     @Test
	 public  void AddProject()
		{ 

			
			addP.set_pName("BA1011");
			addP.set_pCode("GARAF1");
			addP.set_ProjectManager("Sumit1");
			addP.set_DeliveryManager("Viren1");
			addP.selectCSS_Frequency("3");
			addP.selectpArea("BA");
			addP.selectpOpco("BA");
			addP.click_pod();
		}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
	

}
