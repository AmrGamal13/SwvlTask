package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Pages.BookingPage;
import Pages.ChooseMyTripPage;
import Pages.LandingPage;
import Pages.LoginPage;
import Pages.SelectDestinationPage;
import Pages.TripDetailsPage;

public class BookARide extends TestBase {
	ExtentTest test;

	LandingPage landObj;
	LoginPage logObj;
	BookingPage BookObj;
	ChooseMyTripPage ChooseTripObj;
	SelectDestinationPage SelectDestObj;
	TripDetailsPage TripDetaObj;

	@Test
	public void BookRideTestCase() throws InterruptedException {

		landObj = new LandingPage(driver);
		logObj = new LoginPage(driver);
		BookObj = new BookingPage(driver);
		ChooseTripObj = new ChooseMyTripPage(driver);
		SelectDestObj = new SelectDestinationPage(driver);
		TripDetaObj = new TripDetailsPage(driver);

		// creates a toggle for the given test, adds all log events under it    
		test = extent.createTest("Place an Order Test", "E2E Scenario ordering an Item ");

		landObj.ClickOnPhoneNumber();
		test.log(Status.INFO, "Clicking on Phone Number Field to Enter My Number");

		landObj.ClickOnNextToBook();
		test.log(Status.INFO, "Clicking Next Button to navigate to the next page");

		logObj.LoginToMyAcc();
		test.log(Status.INFO, "Logging to my account by adding my password of my Acc");
		Thread.sleep(5000);

		SelectDestObj.SelectMyDestination();
		test.log(Status.INFO, "Selecting My PickUp & Drop Off locations of my Trip");

		Thread.sleep(5000);

		ChooseTripObj.SelectRandomDay();
		test.log(Status.INFO, "Selecting a random day from the given days of my Trip");

		ChooseTripObj.SelectRandomRide();
		test.log(Status.INFO, "Selecting a random ride from the given rides of my Trip");

		TripDetaObj.ClickOnContinue();
		test.log(Status.INFO, "Clicking Next Button in trip details page to navigate to the next page");

		BookObj.BookMyTrip();
		test.log(Status.INFO, "Booking My ride by clicking on Book option");

		Assert.assertTrue(BookObj.GetSuccessMessage().contains("Trip Successfully Booked"));
		test.log(Status.PASS, "The Trip has been booked successfully & Added to my Account");
	}
}
