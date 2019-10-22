package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage18;

public class TestBlue18 extends BaseTest{
	@Test
	  public void twentygmgoldcoin()
	  {
         HomePage18 hp=new  HomePage18(driver);
         hp.Gold_coin(driver);
         hp.Gold_coinLakshmi(driver);
         hp.gramss();
         hp.titlee();
	  }
}
