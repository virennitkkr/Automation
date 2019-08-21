package qa.base;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public  class TestBase {
	public static WebDriver driver;	
	
	public String readExcel() throws IOException
	{

	    //Create an object of File class to open xlsx file

	    File file =    new File("C:\\Users\\vbhagat\\git\\Automation\\IAG.CSS\\src\\main\\java\\TestData\\myTest.xls");

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook CMSWorkbook = null;
	    
	    CMSWorkbook = new HSSFWorkbook(inputStream);
	    
	  //Read sheet inside the workbook by its name

	    Sheet cmsSheet = CMSWorkbook.getSheetAt(0);
	    
	    Row row = cmsSheet.getRow(1);
	    
	    String id   = row.getCell(0).getStringCellValue();
	    String pass = row.getCell(1).getStringCellValue();
	    
	    String str = id + " "+ pass;
	   
	    return str;
	}  
	    
	
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbhagat\\git\\Automation\\IAG.CSS\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://css.open-tech.in");
	}	
	
	//Generating Unique File Name
    /*public  String getFileName() {
    	return new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(new Date(0));
       
       
    }*/

	
	public String timestamp()
	
	{
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
	}
	public  void takeScreenShort() throws IOException
	{

		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File(System.getProperty("user.dir")+"\\screenshots\\"+ driver.getTitle()+" "+timestamp()+"1.png");
        // FileUtils.copyFile(SrcFile, DestFile);
   
	}
			 
	
					
	}
	
