package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage16;

public class TestBlue16 extends BaseTest{
	@Test
	  public void twentygmgoldcoin()
	  {
         HomePage16 hp=new  HomePage16(driver);
         hp.Gold_coin(driver);
         hp.gramss();
         hp.titlee();
	  }
}
