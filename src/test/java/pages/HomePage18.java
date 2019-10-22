package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class HomePage18 extends BaseTest{
	@FindBy(xpath ="//li[@class='menuparent gold-coins']")
	private WebElement goldcoins;
	
	@FindBy(xpath="//span[@data-p='all-jewellery-goldcoins-lakshmi,m']")
	private WebElement goldcoin_lakshmi;
  
	@FindBy(xpath="//span[@data-p='l-gold-coins-weight-2gms,m']")
    private WebElement grams;
  
    @FindBy(xpath="//h1[@class='title-5']")
    private WebElement title;
    
    public void Gold_coin(WebDriver driver)
    {
    	Actions act = new Actions(driver);
		act.moveToElement(goldcoins).perform();
    }
    
    public void Gold_coinLakshmi(WebDriver driver)
    {
    	Actions act = new Actions(driver);
		act.moveToElement(goldcoin_lakshmi).perform();
    }
    public void gramss()
    {
    	grams.click();
    }
    public void titlee()
    {
    	String t = title.getText();
    	if(t.equals("2 gram 24 KT Lakshmi Gold Coin"))
    	{
    		System.out.println("Testcase Pass");
    	}
    	else
    	{
    		System.out.println("TestCase Fail");
    	}
    }
    public HomePage18(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }

}
