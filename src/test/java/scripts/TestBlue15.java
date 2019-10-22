package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage15;

public class TestBlue15 extends BaseTest
{
	@Test
	  public void twogmgoldcoin()
	  {
		HomePage15 hp=new HomePage15(driver);
		hp.Gold_coin(driver);
		hp.gramss();
		hp.titlee();
	  }
}
