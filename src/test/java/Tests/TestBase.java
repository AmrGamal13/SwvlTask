package Tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

public class TestBase {

	static AndroidDriver<MobileElement> driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	@BeforeSuite
	public void StartDriver() throws MalformedURLException {


		htmlReporter = new ExtentHtmlReporter("extent.html"); 
		String OsType = "Android";

		// create ExtentReports and attach reporter(s) 
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		DesiredCapabilities cap = new DesiredCapabilities();
		if (OsType.equalsIgnoreCase("Android")) 
		{ 
			cap.setCapability("deviceName", "HUAWEI P30 lite");
			cap.setCapability("udid", "FFY5T18116015518");
			cap.setCapability("platformName","Android");
			cap.setCapability("platformVersion", "8.0.0");
			cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.swvl.customer");
			cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"io.swvl.customer.features.LaunchScreenActivity");
			cap.setCapability("noReset", "true");  

			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url ,cap); 
			System.out.println("Swvl Application Started ....");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

	}


	@AfterSuite
	public void closeDriver() {
		driver.quit();
		extent.flush();
	}

}
