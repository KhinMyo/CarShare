package Signup;

import Common.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage extends CommonPage {

	public SignupPage(ChromeDriver dvr) {
		driver = dvr;
	}

	public void clickSignup() {
		driver.findElement(By.linkText("SIGN UP")).click();
	}

	public void clickJoinNow() {
		driver.findElement(By.xpath("//button[text()='Join Now' and not(@disabled)]")).click();
	}

	public void enterFullName(String fullName) {
		driver.findElement(By.id("fullName")).sendKeys(fullName);
	}

	public void enterEmail(String email) {
		driver.findElement(By.name("username")).sendKeys(email);
	}

	public void enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	public void enterConfirmPassword(String confirmPassword) {
		driver.findElement(By.name("confirmPassword")).sendKeys(confirmPassword);
	}

//	public void clickSubmitBtn() {
//		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
//	}
}
