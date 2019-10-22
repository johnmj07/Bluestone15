package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage24 extends BaseTest{
	@FindBy(xpath="//input[@class='form-text typeahead']")
	private WebElement search;
	@FindBy(xpath="//input [@name='submit_search']")
	private WebElement submit;
	@FindBy(xpath="//span[@class='style-fill title']")
	private WebElement filters;
	@FindBy(xpath="//span[@data-displayname='22k']")
	private WebElement ttkarat;
	
	public void searchbar()
	{
		search.sendKeys("rings");
	}
	
	public void submitbutton()
	{
		submit.click();
	}

	public void morefilters(WebDriver driver)
	{
		Actions act = new Actions(driver);
		 act.moveToElement(filters).perform();
		 filters.click();
		
	}
	
	public void twentytwokarat()
	{
		
		String s = ttkarat.getText();
		System.out.println(s);
	}
    
  
    public HomePage24(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
