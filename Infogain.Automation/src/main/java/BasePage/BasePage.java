package BasePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import dataProvider.ConfigFileReader;

public class BasePage {

	public static WebDriver driver;	
	public  ConfigFileReader data;
	public String readExcel() throws IOException
	{

	    //Create an object of File class to open xlsx file

	    File file =    new File("C:\\Users\\virendra.bhagat\\eclipse-workspace\\IAG.CSS\\src\\main\\java\\TestData\\myTest.xls");

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook CMSWorkbook = null;
	    
	    CMSWorkbook = new HSSFWorkbook(inputStream);
	    
	  //Read sheet inside the workbook by its name

	    Sheet cmsSheet = CMSWorkbook.getSheetAt(0);
	    
	    Row row = cmsSheet.getRow(1);
	    
	    String id = row.getCell(0).getStringCellValue();
	    String pass = row.getCell(1).getStringCellValue();
	    
	    String str = id + " "+ pass;
	   
	    return str;
	}  
	    
	
	public void setup() {
		data = new ConfigFileReader();
	    String driverpath=data.driverPath(); 
		//String url= data.url();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get(url);
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://in.bookmyshow.com/");
	}	
	
	

public int timestamp()
	
	{
		
		  int random = (int)(Math.random() * 50 + 1);
		  return random;
		
	}
	public  void takeScreenShort() throws IOException
	{
	

		 File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File DestFile=new File(System.getProperty("user.dir")+"\\screenshots\\"+ driver.getTitle()+" "+timestamp()+"1.png");
         FileUtils.copyFile(SrcFile, DestFile);
         
	}
			 
	public void Scroll() throws InterruptedException
	{
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		action.sendKeys(Keys.PAGE_UP).build().perform();
	    action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Actions act = action.sendKeys(Keys.PAGE_DOWN);
	    
	}	
	

}
