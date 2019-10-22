package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage23 extends BaseTest{

	@FindBy(xpath="//input[@class='form-text typeahead']")
	private WebElement search;
	@FindBy(xpath="//input [@name='submit_search']")
	private WebElement submit;
	@FindBy(xpath="//section[@id='Metal-form']")
	private WebElement metal;
	@FindBy(xpath="//span[@data-displayname='platinum']")
	private WebElement platinum;
	
	public void searchbar()
	{
		search.sendKeys("rings");
	}
	
	public void submitbutton()
	{
		submit.click();
	}

	public void metaldd(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(metal).perform();
	}
	
	public void pltmcount()
	{
		
		String s = platinum.getText();
		System.out.println(s);
	}
    
  
    public HomePage23(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
