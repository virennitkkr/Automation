package TestData;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="data-provider")
	
	public static Object[][] dataProviderMethid(){
		
		return new Object[][] {{"admin@ba.com"}, {"admin@ba.com"}};
	}

}
