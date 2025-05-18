package FindCar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindCarPage {
	ChromeDriver driver;

	public FindCarPage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickPickLocation() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div.select__dropdown-indicator")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Bagan Airport , Bagan']")).click();

	}

	public void enterPickupDate(String pickupDate) {
		driver.findElement(By.xpath("//input[@name='pickup_date']")).click();
		driver.findElement(By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + pickupDate + "']")).click();
	}

	public void enterPickupTime(String pickupTime) {
		driver.findElement(By.xpath("//input[@name='pickup_time']")).sendKeys(pickupTime);
	}

	public void enterReturnDate(String returnDate) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='return_date']")).click();
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[local-name()='svg' and @xmlns='http://www.w3.org/2000/svg']")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/span[2]/*[name()='svg'][1]")).click();
		
		driver.findElement(By.xpath("//div[@class='dayContainer']//*[@aria-label= '" + returnDate + "']")).click();
	}

	public void enterReturnTime(String returnTime) {
		driver.findElement(By.xpath("//input[@name='return_time']")).sendKeys(returnTime);
	}

	public void clickFindCarBtn() {
		driver.findElement(By.id("SimulateButton")).click();
	}
}
