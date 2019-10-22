package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage14;


public class TestBlue14 extends BaseTest
{
	@Test
	  public void onegmgoldcoin()
	  {
		HomePage14 lp = new HomePage14(driver);
	  lp.gold_coins(driver);
	  lp.grams();
	  lp.get_title();
	  }
	  
      
}
