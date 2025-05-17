package SelfDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfDrivePage {
	ChromeDriver driver;

	public SelfDrivePage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickSelfDrive() throws InterruptedException {
		driver.findElement(By.linkText("Self-Drive Tips")).click();
	}

	public String getTitle() {
		return driver.findElement(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='Self Drive Tips']"))
				.getText();
	}
}
