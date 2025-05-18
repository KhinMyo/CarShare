package carshare;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.testng.Assert;
import org.testng.annotations.Test;

import AboutUs.AboutPage;
import FindCar.FindCarPage;
import HowCarShareWork.HowCarShareWorkPage;
import SelfDrive.SelfDrivePage;
import Signup.SignupPage;
import WhyYomaCarShare.CarSharePage;

public class TestCase extends BaseTest {
	@Test
	public void signup() throws InterruptedException {
		SignupPage signup = new SignupPage(driver);
//		Thread.sleep(2000);
		signup.clickSignup();
		signup.clickJoinNow();
//		Thread.sleep(2000);
		signup.enterFullName("Khin Myo Win");
		signup.enterEmail("khinmyowin@gmail.com");
		signup.enterPassword("NewPass1!");
		signup.enterConfirmPassword("NewPass1!");
//		signup.clickSubmitBtn();
	}

	@Test
	public void AboutUs() throws InterruptedException {
		AboutPage about = new AboutPage(driver);

		about.clickAboutUs();
		String title = about.getTitle();

		Assert.assertEquals(title, "About Us");
	}

	@Test
	public void WhyCarShare() throws InterruptedException {
		CarSharePage about = new CarSharePage(driver);

		about.clickWhyCarShare();
		String title = about.getTitle();

		Assert.assertEquals(title, "Why Yoma Car Share?");
	}

	@Test
	public void HowCarShareWork() throws InterruptedException {
		HowCarShareWorkPage about = new HowCarShareWorkPage(driver);

		about.clickHowCarShareWork();
		String title = about.getTitle();

		Assert.assertEquals(title, "How Yoma Car Share Works");
	}

	@Test
	public void SelfDrive() throws InterruptedException {
		SelfDrivePage selfDrive = new SelfDrivePage(driver);

		selfDrive.clickSelfDrive();
		String title = selfDrive.getTitle();

		Assert.assertEquals(title, "Self Drive Tips");
	}

	@Test
	public void FindCar() throws InterruptedException {
		FindCarPage onboard = new FindCarPage(driver);

		LocalDate today = LocalDate.now().plusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		String todaysDate = today.format(formatter);

		LocalDate nextMonth = LocalDate.now().plusMonths(1);
		String nextDate = nextMonth.format(formatter);

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
		String currentTime = LocalTime.now().format(timeFormatter);

		Thread.sleep(2000);
		onboard.clickPickLocation();
		Thread.sleep(2000);
		onboard.enterPickupDate(todaysDate);
//		onboard.enterPickupTime(currentTime);
		onboard.enterReturnDate(nextDate);
//		onboard.enterReturnTime(currentTime);
		onboard.clickFindCarBtn();
	}

}
