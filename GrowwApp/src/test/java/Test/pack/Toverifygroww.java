package Test.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.pack.Base;
import pom.pack.homepage;
import pom.pack.loginPage;

public class Toverifygroww extends Base
{
	private WebDriver driver;
	loginPage login;
	homepage home;

@BeforeTest
@Parameters("browser")
public void launchBrowser(String browser)
{
	if(browser.equals("Chrome"))
	{
		driver = openChromeBrowser();
	}
/*	if(browser.equals("Firefox"))
	{
		driver = openFirefoxBrowser();
	}*/
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
 @BeforeClass
 public void openBrowser() 
 {
	 driver.get("https://groww.in/");

	 login = new loginPage(driver);
     home = new homepage(driver);
 }
 
 @BeforeMethod
 public void loginToGroww() 
 {
	 login.clickloginbtn();
	 login.enteremail();
	 login.clickcontinuebtn();
	 login.enterpwd();
	 login.clicksubmitbtn();
	 login.enterpin();
    
 }
 
 @Test
 public void verifyExplorebtn() 
	{
    login.clickOnExplorebtn();
    }
 
 @Test
 public void clickOnMyWatchlist() 
    {
      home.clickOnMyWatchlist();
	}
 
	
@AfterMethod()
public void thelogoutGroww() 
  {
	 home.clickcirclebtn();
	 home.clicklogoutbtn();
  }

 @AfterClass
 public void afterClass() 
 {
	login = null;
	home = null;
 }

 @AfterTest
 public void closeBrowser()
 {
	 driver.quit();
	 driver = null;
	 System.gc();   //garbeg collector
 }
 
 
}
