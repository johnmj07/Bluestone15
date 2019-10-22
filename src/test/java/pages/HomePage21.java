package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage21 extends BaseTest{
	@FindBy(xpath ="//input[@class='form-text typeahead']")
	private WebElement typeahead;
  
	@FindBy(xpath="//input [@name='submit_search']")
    private WebElement submit;
	
	@FindBy(xpath="//section [@id='Price-form']")
    private WebElement price;
	
	@FindBy(xpath="//span [@data-displayname='below rs 10000']")
    private WebElement select;
    
    public void typeaheadd()
    {
    	typeahead.sendKeys("Rings");
    	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
    }
    
    public void submit_search()
    {
    	submit.click();
    }

    public void priceform(WebDriver driver)
    {
    	Actions act = new Actions(driver);
		act.moveToElement(price).perform();
    }
    
    public void selectbelowrs()
    {
    	select.click();
    	driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);

    }
    
  
    public HomePage21(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
