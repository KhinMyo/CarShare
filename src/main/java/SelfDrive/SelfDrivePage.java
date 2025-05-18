package SelfDrive;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelfDrivePage extends CommonPage {

	public SelfDrivePage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickSelfDrive() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Self-Drive Tips"))).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='Self Drive Tips']")))
				.getText();
	}
}
