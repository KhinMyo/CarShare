package carshare;

import java.time.LocalDate;
import FindCar.FindCarPage;
import org.testng.annotations.Test;
import java.time.format.DateTimeFormatter;

public class TC_FindCar extends BaseTestCase {

	@Test
	public void FindCar() {

		FindCarPage onboard = new FindCarPage(driver);
		LocalDate today = LocalDate.now().plusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
		String todaysDate = today.format(formatter);
		LocalDate nextMonth = LocalDate.now().plusMonths(1);
		String nextDate = nextMonth.format(formatter);
		onboard.clickPickLocation();
		onboard.enterPickupDate(todaysDate);
		onboard.enterReturnDate(nextDate);
		onboard.clickFindCarBtn();
	}

}
