package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "//*[@id=\"wrapper\"]/ul/li[2]/div/a[121]")
	public WebElement adddButton;
	
	@FindBy(xpath="(//*[@id=\"pagesDropdown\"])[1]")
	public WebElement addProject;
	 
	@FindBy(xpath="//a[@href=\"addProject.php\"]")
	public WebElement addSubProject;
	
	public HomePage()
	{
		//initialize elements
				PageFactory.initElements(driver,this);
	}
	
	public void clickOnAddP()
	{
	
		addProject.click();
		addSubProject.click();
	}
	public void click_pod()
    {
		adddButton.click();
		
     
    }

	
}
