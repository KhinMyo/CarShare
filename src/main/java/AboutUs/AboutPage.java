package AboutUs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutPage {
	ChromeDriver driver;

	public AboutPage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickAboutUs() throws InterruptedException {
		driver.findElement(By.linkText("About Us")).click();
	}

	public String getTitle() {
		return driver.findElement(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='About Us']"))
				.getText();
	}
}
