package WhyYomaCarShare;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarSharePage {
	ChromeDriver driver;

	public CarSharePage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickWhyCarShare() throws InterruptedException {
		driver.findElement(By.linkText("Why Yoma Car Share?")).click();
	}

	public String getTitle() {
		return driver.findElement(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='Why Yoma Car Share?']"))
				.getText();
	}
}
