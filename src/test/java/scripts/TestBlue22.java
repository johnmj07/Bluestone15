package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage22;

public class TestBlue22 extends BaseTest{

	@Test
	public void searchrings()
	{
		HomePage22 ln = new HomePage22(driver);
		ln.searchbar();
		ln.submitbutton();
		ln.deliverytime(driver);
		ln.nextdelivery();
	}
}
