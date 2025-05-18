package carshare;

import Signup.SignupPage;
import org.testng.annotations.Test;


public class TC_Signup extends BaseTestCase {
	@Test
	public void signup() {

		SignupPage signup = new SignupPage(driver);
		signup.clickSignup();
		signup.clickJoinNow();
		signup.enterFullName("Khin Myo Win");
		signup.enterEmail("khinmyowin@gmail.com");
		signup.enterPassword("NewPass1!");
		signup.enterConfirmPassword("NewPass1!");
//		signup.clickSubmitBtn();
	}
}
