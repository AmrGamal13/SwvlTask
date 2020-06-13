package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {


	AndroidDriver<MobileElement> driver;

	public LoginPage(AndroidDriver<MobileElement> driver) 
	{
		this.driver = driver;

	}

	public void LoginToMyAcc() {
		MobileElement passwordTxt= driver.findElement(By.id("password_edit_text"));

		passwordTxt.sendKeys("adel01148494829");

		MobileElement Nextbuttn_Password = driver.findElement(By.id("next_btn"));

		Nextbuttn_Password.click();
	}
}
