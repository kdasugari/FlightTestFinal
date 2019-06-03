package FlightApp.FlightApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kisho\\Documents\\Downloads\\Drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flyfrontier.com/travel/book/flight/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       	driver.manage().window().maximize();
       	return driver;
		
	}

}
