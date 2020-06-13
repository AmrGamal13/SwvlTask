package Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChooseMyTripPage {

	static Random ran ;
	AndroidDriver<MobileElement> driver;

	public ChooseMyTripPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}
	
	public void SelectRandomDay() 
	{
		List<MobileElement> days = driver.findElements(By.id("date_btn"));
	     ran = new Random();
		 int dayNo = ran.nextInt(days.size());
		 
		 MobileElement selectedDay = days.get(dayNo);
		 selectedDay.click();
		
	}
	
	public void SelectRandomRide() 
	{
		
		 List<MobileElement> rideCards = driver.findElements(By.id("ride_card_view"));
		 int rideCardNo = ran.nextInt(rideCards.size());
		 MobileElement selectedMyRide = rideCards.get(rideCardNo);
		 
		 selectedMyRide.click();
	}
}
