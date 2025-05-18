package carshare;

import org.testng.Assert;
import org.testng.annotations.Test;

import HowCarShareWork.HowCarShareWorkPage;

public class TC_HowCarShareWork extends BaseTestCase {
	@Test
	public void HowCarShareWork() {

		HowCarShareWorkPage about = new HowCarShareWorkPage(driver);
		about.clickHowCarShareWork();
		String title = about.getTitle();
		Assert.assertEquals(title, "How Yoma Car Share Works");
	}
}
