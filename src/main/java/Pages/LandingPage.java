package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LandingPage {

	AndroidDriver<MobileElement> driver;

	public LandingPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}

	public void ClickOnPhoneNumber() throws InterruptedException {

		 WebDriverWait wait = new WebDriverWait(driver, 10);
		MobileElement PhoneNumber = driver.findElement(By.id("hint"));
		wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
		PhoneNumber.click();

		Thread.sleep(5000);
		MobileElement phoneNumberTxt= driver.findElement(By.id("phone_edit_text"));

		phoneNumberTxt.sendKeys("1148494829");
	}
	
	
	public void ClickOnNextToBook() 
	{
		
		MobileElement Nextbuttn = driver.findElement(By.id("next_btn"));

		Nextbuttn.click();
	}
}
