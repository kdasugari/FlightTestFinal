package FlightApp.FlightApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class BookFlight {
	
	public static WebDriver driver;
	@FindBy (xpath = "//input[@id='rboneway']") WebElement oneWay;
	@FindBy (xpath = "//span[@aria-controls='kendoDepartFrom_listbox']") WebElement fromButton;
	@FindBy (xpath = "//input[@name='kendoDepartFrom_input']") WebElement fromTextbox;
	@FindBy (xpath = "//div[@class='city']") WebElement selectTampa;
		
	@FindBy (xpath = "//span[@aria-controls='kendoArrivalTo_listbox']") WebElement toButton;
	@FindBy (xpath = "//input[@name='kendoArrivalTo_input']") WebElement toTextbox;
	@FindBy (xpath = "//div[@class='city' and contains(text(), 'Austin')]") WebElement selectAustin;
	
	public BookFlight (WebDriver driver){
		
		 this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
public void bookFlight() throws InterruptedException{
	
	oneWay.click();
	fromButton.click();
	fromTextbox.sendKeys("TPA");
	Thread.sleep(2000);
	selectTampa.click();
	
	toButton.click();
	toTextbox.sendKeys("AUS");
	Thread.sleep(2000);
	selectAustin.click();
		
}

}



