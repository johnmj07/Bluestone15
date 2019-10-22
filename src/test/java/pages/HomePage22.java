package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage22 extends BaseTest{
	@FindBy(xpath="//input[@class='form-text typeahead']")
	private WebElement search;
	@FindBy(xpath="//input [@name='submit_search']")
	private WebElement submit;
	@FindBy(xpath="//section[@id='Delivery Time-form']")
	private WebElement delivery;
	@FindBy(xpath="//span[@data-displayname='next day delivery']")
	private WebElement ndd;
    
	public void searchbar()
	{
		search.sendKeys("rings");
	}
	
	public void submitbutton()
	{
		submit.click();
	}

	public void deliverytime(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(delivery).perform();
	}
	
	public void nextdelivery()
	{
		
		String s = ndd.getText();
		System.out.println(s);
	}
    
  
    public HomePage22(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
