package JsonReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	public static WebDriver driver;
    String baseUrl="http://css.open-tech.in/";
    public DriverManager()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\virendra.bhagat\\eclipse-workspace\\com.automation\\dirv\\chromedriver.exe");
    	
        driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }


}
