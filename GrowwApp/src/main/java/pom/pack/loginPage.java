package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage
{
	@FindBy(xpath="//span[text()='Login/Register']")private WebElement loginbtn ;
	@FindBy(xpath="//input[@type='text']")private WebElement mailid;
	@FindBy(xpath="//span[text()='Continue']")private WebElement Contibtn ;
	@FindBy(xpath="//input[@type='password']")private WebElement pwd ;
	@FindBy(xpath="//span[text()='Submit']")private WebElement submitbtn ;	
	@FindBy(xpath="//input[@type='number']")private WebElement pin ;	
	@FindBy(xpath="//a[text () = 'Explore']")private WebElement explore;
	
	public loginPage(WebDriver driver) 
	{
		 PageFactory.initElements(driver, this);
	}

	public void enteremail() 
	{
		mailid.sendKeys("ankitathakare663@gmail.com");
	}

	public void clickcontinuebtn() 
	{
		Contibtn.click();
	}

	public void clickloginbtn() 
	{
		loginbtn.click();
	}
	
	public void enterpwd() 
	{
		pwd.sendKeys("ankita@25");
	}

	public void clicksubmitbtn() 
	{
		submitbtn.click();
	}

	public void enterpin() 
	{
		pin.sendKeys("1212");
		System.out.println("loginsuccessful");
	}

	public void clickOnExplorebtn() 
	{
		explore.click();
		System.out.println("clickOnExplorebtn");
	}
}
