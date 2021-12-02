package base.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base 
{
	public static WebDriver openChromeBrowser()
	 {
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver new\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 return driver;
	 }
}
