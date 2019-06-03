package FlightApp.FlightApp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectFlightsTest {
	public WebDriver driver;
	BookFlight bf;
		   
	@BeforeTest
	    
	public void launchBrowser() throws IOException {
	driver = LaunchBrowser.launchBrowser();
	    
	}  
	
	@Test (priority = 1)
		  
	public void selectToDropDown() throws IOException, InterruptedException {
			
	bf = new BookFlight(driver);
	
	bf.bookFlight();
			
	}
	
/*	@AfterClass
	
	public void closeBrowser(){
		
	driver.quit();
	}*/

}
