package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BookingPage {


	AndroidDriver<MobileElement> driver;

	public BookingPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}

	public void BookMyTrip() 
	{

		MobileElement BookBtn = driver.findElement(By.id("book_btn"));
		BookBtn.click();

	}


	public String GetSuccessMessage() {
		MobileElement SuccessMessage = driver.findElement(By.id("title_tv"));
		return SuccessMessage.getText();
	}
}
