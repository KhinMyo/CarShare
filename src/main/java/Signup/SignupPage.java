package Signup;

import Common.CommonPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends CommonPage {

	public SignupPage(ChromeDriver dvr) {
		driver = dvr;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public void clickSignup() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("SIGN UP"))).click();
	}

	public void clickJoinNow() {
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[text()='Join Now' and not(@disabled)]"))).click();
	}

	public void enterFullName(String fullName) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fullName"))).sendKeys(fullName);
	}

	public void enterEmail(String email) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(email);
	}

	public void enterPassword(String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("confirmPassword"))).sendKeys(confirmPassword);
	}

	public void clickSubmitBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type = 'submit']"))).click();
	}
}
