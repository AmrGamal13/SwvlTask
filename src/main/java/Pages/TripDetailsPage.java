package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TripDetailsPage {

	AndroidDriver<MobileElement> driver;

	public TripDetailsPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}
	
	public void ClickOnContinue() 
	{
		
		 MobileElement NextBttnToReservation = driver.findElement(By.id("next_btn"));
		 NextBttnToReservation.click();
	}
	
}
