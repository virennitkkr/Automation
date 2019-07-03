package JsonReader;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	@FindBy(how= How.NAME, using = "inputEmail")
    WebElement username;
    @FindBy(how=How.NAME, using = "inputPassword")
    WebElement password;
    @FindBy(how=How.NAME, using="inputPassword" )
    WebElement button;

    //enter  username
    public void  userLogin(String user, String pass)
    {
        username.sendKeys(user);
        password.sendKeys(pass);
        button.click();
    }
}
