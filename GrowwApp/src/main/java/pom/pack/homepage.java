package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	@FindBy(xpath="//a[@href='/user/watchlist/stocks']")private WebElement MyWatchlist ;	
	@FindBy(xpath="//img[@class='circle']")private WebElement circle ;
	@FindBy(xpath="//div[text()='Log Out']")private WebElement logout ;	
	@FindBy(xpath="//div[text()='Log Out']")private WebElement logout125 ;
	@FindBy(xpath="//div[text()='Log Out']")private WebElement logoutanku ;
		
	public homepage(WebDriver driver) 
	{
	 PageFactory.initElements(driver, this);
	}

	public void clickOnMyWatchlist() 
	{
		MyWatchlist.click();
		System.out.println("clickOnMyWatchlist");
	}
	public void clickcirclebtn() 
	{
		circle.click();
	}

	public void clicklogoutbtn() 
	{
		logout.click();
		System.out.println("logoutsuccessful");
	}
}
