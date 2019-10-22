package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage21;

public class TestBlue21 extends BaseTest{
	@Test
	  public void twentygmgoldcoin()
	  {
         HomePage21 hp=new  HomePage21(driver);
        hp.typeaheadd();
        hp.submit_search();
        hp.priceform(driver);
        hp.selectbelowrs();
	  }
}
