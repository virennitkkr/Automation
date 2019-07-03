package qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import qa.base.TestBase;

public class AddClientpage extends TestBase {

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "inputEmail")
	WebElement inputEmail;

	@FindBy(id = "projectCode")
	WebElement projectCode;

	@FindBy(id = "customerType")
	WebElement customerType;

	@FindBy(xpath = "//input[@id='addClient']")
	WebElement submitClient;
	
	@FindBy(xpath="(//*[@id=\"pagesDropdown\"])[1]")
	WebElement addClient;
	
	@FindBy(xpath="//a[@href=\"addClient.php\"]")
	WebElement addSubClient;

	public AddClientpage() {
		// initialize elements
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddC()
	{
		addClient.click();
		addSubClient.click();
	}
	public void setClientDetails() {
		
		
		firstName.sendKeys("InfoSingh1");
		lastName.sendKeys("Noid1a");
		inputEmail.sendKeys("abc@gmail.com");
		projectCode.sendKeys("dsda");
		
	}

	public void selectClientData() {
		Select select_Parea = new Select(driver.findElement(By.id("projectCode")));
		select_Parea.selectByIndex(1);
		Select select_Ctype = new Select(driver.findElement(By.id("customerType")));
		select_Ctype.selectByValue("IT");;

	}

	public void submitClientDetails() {
		submitClient.click();
	}
}
