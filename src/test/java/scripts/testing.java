package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");
        WebDriverManager.firefoxdriver().setup();	

	}

}
