package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage25 extends BaseTest{
	@FindBy(xpath="//input[@class='form-text typeahead']")
	private WebElement search;
	@FindBy(xpath="//input [@name='submit_search']")
	private WebElement submit;
	@FindBy(xpath="//section[@id='Gender-form']")
	private WebElement gender;
	@FindBy(xpath="//span[@data-displayname='women']")
	private WebElement women;
	
	public void searchbar()
	{
		search.sendKeys("rings");
	}
	
	public void submitbutton()
	{
		submit.click();
	}

	public void genders(WebDriver driver)
	{
		Actions act = new Actions(driver);
		 act.moveToElement(gender).perform();
		
		
	}
	
	public void countwomen()
	{
		
		String s = women.getText();
		System.out.println(s);
	}
  
    public HomePage25(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
