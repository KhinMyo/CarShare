package carshare;

import org.testng.Assert;
import SelfDrive.SelfDrivePage;
import org.testng.annotations.Test;


public class TC_SelfDriveTips extends BaseTestCase {
	@Test
	public void SelfDrive() {

		SelfDrivePage selfDrive = new SelfDrivePage(driver);
		selfDrive.clickSelfDrive();
		String title = selfDrive.getTitle();
		Assert.assertEquals(title, "Self Drive Tips");
	}
}
