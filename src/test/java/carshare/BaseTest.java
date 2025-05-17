package carshare;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

	public ChromeDriver driver;

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {
		driver.get("https://carshare.yomafleet.com");
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
				
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
		
//		initializeTestData();
	}

	@AfterSuite
	public void afterSuite() {
	}

}

