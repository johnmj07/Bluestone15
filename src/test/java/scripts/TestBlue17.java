package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import pages.HomePage17;

public class TestBlue17 extends BaseTest{
	@Test
	  public void twentygmgoldcoin()
	  {
         HomePage17 hp=new  HomePage17(driver);
         hp.Gold_coin(driver);
         hp.gramss();
         hp.titlee();
	  }
}
