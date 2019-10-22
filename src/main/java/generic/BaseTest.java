package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements IAUTOCONSTANT
{
  public WebDriver driver;
  static {
//	  System.setProperty(CHROME_KEY, CHROME_VALUE);
//	  System.setProperty(GECKO_KEY, GECKO_VALUE);
	  WebDriverManager.chromedriver().setup();
	  WebDriverManager.edgedriver().setup();
	  WebDriverManager.firefoxdriver().setup();
  }
  
  
  @BeforeMethod
  @Parameters("browser")
  public void before(@Optional("chrome") String browser)
  {
	  System.out.println(browser);
	  if(browser.equals("firefox")) {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	  }
	  if(browser.equals("chrome")){
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	  }
  }
  @AfterMethod
  public void after() throws Exception
  {
	  Thread.sleep(2000);
	  driver.close();
  }
}

