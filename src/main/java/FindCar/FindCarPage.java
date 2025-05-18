package FindCar;

import Common.CommonPage;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindCarPage extends CommonPage {

	public FindCarPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickPickLocation() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.select__dropdown-indicator")))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Bagan Airport , Bagan']")))
				.click();

	}

	public void enterPickupDate(String pickupDate) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='pickup_date']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + pickupDate + "']"))).click();
	}

	public void enterReturnDate(String returnDate) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='return_date']"))).click();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[4]/div[1]/span[2]/*[name()='svg'][1]")))
				.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + returnDate + "']"))).click();
	}

	public void clickFindCarBtn() {
		driver.findElement(By.id("SimulateButton")).click();
	}
}
