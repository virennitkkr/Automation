package JsonReader;

import org.openqa.selenium.support.PageFactory;

public class LoginSteps {

	public HomePage Login(String nam, String pas) {
        HomePage homePageObj = PageFactory.initElements(DriverManager.driver, HomePage.class);
        homePageObj.userLogin(nam,pas);

        return homePageObj;
    }
}
