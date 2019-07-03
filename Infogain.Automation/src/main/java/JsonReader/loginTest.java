package JsonReader;


import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static JsonReader.DriverManager.*;

import static JsonReader.DriverManager.driver;

public class loginTest {
	
	
	@BeforeSuite(groups = {"regression"})
    public void initDriver(){
        DriverManager manager = new DriverManager();
    }


    @DataProvider(name= "login")
    public static java.lang.Object[][] loginData(){

        return new Object[][]{{"admin@ba.com","admin@ba.com"}};
    }
    
    
    @Test(dataProvider = "login")
    public void verifyValidLoginWithDataProvider(String userName,String password)
    {
        LoginSteps loginSteps= new LoginSteps();
        HomePage ex=loginSteps.Login(userName,password);
        Assert.assertTrue(driver.getPageSource().contains("Hello Naveen"));

    }

}
