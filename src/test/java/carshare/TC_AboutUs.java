package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;

import AboutUs.AboutPage;

public class TC_AboutUs extends BaseTestCase {
	@Test
	public void AboutUs() {

		AboutPage about = new AboutPage(driver);
		about.clickAboutUs();
		String title = about.getTitle();
		Assert.assertEquals(title, "About Us");
	}
}
