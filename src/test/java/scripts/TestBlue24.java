package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage22;
import pages.HomePage24;

public class TestBlue24 extends BaseTest{

	@Test
	public void platinumrings()
	{
		HomePage24 ln = new HomePage24(driver);
		ln.searchbar();
		ln.submitbutton();
		ln.morefilters(driver);
		ln.twentytwokarat();
	}
}
