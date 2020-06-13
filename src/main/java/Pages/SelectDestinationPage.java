package Pages;

import org.openqa.selenium.By;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SelectDestinationPage {

	
	AndroidDriver<MobileElement> driver;

	public SelectDestinationPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}
	
	public void SelectMyDestination() {
		MobileElement Destination_bttn = driver.findElement(By.id("where_to"));

		Destination_bttn.click();
		
		MobileElement Pickup_bttn = driver.findElement(By.id("pickup_et"));

		Pickup_bttn.click();
		
		MobileElement close = driver.findElement(By.id("pickup_side_icon_iv"));
		close.click();
		
		MobileElement SelectPickUp = driver.findElement(By.xpath("//android.view.ViewGroup[@index='0']"));
		SelectPickUp.click();
		
		
		MobileElement dropoff_Searcg = driver.findElement(By.id("dropoff_et"));
		dropoff_Searcg.sendKeys("Nasr City");
		
		driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "done"));
		
		MobileElement SelectdropOff = driver.findElement(By.xpath("//android.view.ViewGroup[@index='2']"));
		
		SelectdropOff.click();
	}
}
