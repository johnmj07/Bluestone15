package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage22;
import pages.HomePage25;

public class TestBlue25 extends BaseTest{


	@Test
	public void platinumrings()
	{
		HomePage25 ln = new HomePage25(driver);
		ln.searchbar();
		ln.submitbutton();
		ln.genders(driver);
		ln.countwomen();
	}

}
