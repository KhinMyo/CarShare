package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;

import WhyYomaCarShare.CarSharePage;

public class TC_WhyCarShare extends BaseTestCase {
	@Test
	public void WhyCarShare() {

		CarSharePage about = new CarSharePage(driver);
		about.clickWhyCarShare();
		String title = about.getTitle();
		Assert.assertEquals(title, "Why Yoma Car Share?");
	}
}
