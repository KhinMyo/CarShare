package HowCarShareWork;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowCarShareWorkPage {
	ChromeDriver driver;

	public HowCarShareWorkPage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickHowCarShareWork() throws InterruptedException {
		driver.findElement(By.linkText("How Yoma Car Share works")).click();
	}

	public String getTitle() {
		return driver.findElement(By.xpath(
				"//h1[@class='font-serif font-bold leading-tight text-2xl my-8 text-center text-black dark:text-textWhite' and text()='How Yoma Car Share Works']"))
				.getText();
	}
}
