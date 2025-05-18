package AboutUs;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AboutPage extends CommonPage {

	public AboutPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickAboutUs() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("About Us"))).click();
	}

	public String getTitle() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='About Us']")))
				.getText();
	}
}
