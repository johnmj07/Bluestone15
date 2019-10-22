package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage14 extends BaseTest
{
	@FindBy(xpath = "//li[@class='menuparent gold-coins']")
	private WebElement goldcoins;
	
	@FindBy(xpath = "//span[@data-p='gold-coins-weight-1gms,m']")
	private WebElement grams;
	
	@FindBy(xpath="//h1[@class='title-5']")
	private WebElement title;
	
	public void gold_coins(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(goldcoins).perform();
		
	}
	public void grams()
	{
		
		grams.click();
	}
	public void get_title()
	{
		String s = title.getText();
		System.out.println(s);
		if(s.equals("1 gram 24 KT Gold Coin"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	}

	public HomePage14(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
