package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage22;
import pages.HomePage23;

public class TestBlue23 extends BaseTest{

	@Test
	public void platinumrings()
	{
		HomePage23 ln = new HomePage23(driver);
		ln.searchbar();
		ln.submitbutton();
		ln.metaldd(driver);
		ln.pltmcount();
	}
}
