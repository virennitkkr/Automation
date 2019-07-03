package qa.pages;

import qa.base.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddProjectPage extends TestBase {
	
	@FindBy(id = "pName")
	WebElement pName;

	@FindBy(id = "pCode")
	WebElement pCode;

	@FindBy(id = "ProjectManager")
	WebElement ProjectManager;

	@FindBy(id = "DeliveryManager")
	WebElement DeliveryManager;
	
	@FindBy(xpath = "//input[@id=\"pStartDate\"]")
	WebElement StartDate;
	
	@FindBy(xpath = "//input[@id=\"pEndDate\"]")
	WebElement EndDate;
	
	@FindBy(xpath = "//input[@name='addProject']")
	public WebElement finaddProject;
	
	@FindBy(xpath="(//*[@id=\"pagesDropdown\"])[1]")
	public WebElement addProject;
	 
	@FindBy(xpath="//a[@href=\"addProject.php\"]")
	public WebElement addSubProject;
	
	

	public void setStartDate(String sDate) {
		
		StartDate.sendKeys(sDate);
	
	}


	public void setEndDate(String endDate) {
		EndDate.sendKeys(endDate);
	}
	

	
	public AddProjectPage()
	{
		//initialize elements
		PageFactory.initElements(driver,this);
	}
	

	public void set_pName(String usern)
    {
		pName.clear();
		pName.sendKeys(usern);
    }
	public void set_pCode(String usern)
    {
		pCode.clear();
		pCode.sendKeys(usern);
    }
	public void set_ProjectManager(String usern)
    {
		ProjectManager.clear();
		ProjectManager.sendKeys(usern);
    }
	public void set_DeliveryManager(String usern)
    {
		DeliveryManager.clear();
		DeliveryManager.sendKeys(usern);
    }

	public void selectpArea(String str) {

		Select select = new Select(driver.findElement(By.id("pArea")));
		select.selectByValue(str);
	}

	public void selectpOpco(String str) {

		Select select = new Select(driver.findElement(By.id("pOpco")));
		select.selectByValue(str);
	}

	public void selectCSS_Frequency(String str) {

		Select select = new Select(driver.findElement(By.id("CSS_Frequency")));
		select.selectByValue(str);
	}
	
	public void clickOnAddP()
	{
	
		addProject.click();
		addSubProject.click();
	}
	public void click_pod()
    {
		finaddProject.click();

		
     
    }

}
