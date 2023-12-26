package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ReadData;

public class TestBase
{
  /*      // for login to application
	
	public static EdgeDriver driver; // declared globally , applicablle over the project
	                                  // here we use particularly chromedriver.
	
	public void initialization() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();// meaning = setup of chromrdriver through webdrivermanager.
		                                       // in selenium we uses the ( System.setProperty("webdriver.chrome.driver","C:\\jar files\\Seleniumm\\chromedriver.exe")) to set the path of chromedriver.
	
		driver = new EdgeDriver();// upcasting
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/");
	Thread.sleep(4000);

	}
	*/
	
	// for cross browesr testing
	
	public static WebDriver driver;// public= access throughout the project. //static= no change required. 
	                              // here we use webdriver, (anyone among chrome, firefox,edge)
	public void initialization() throws IOException, InterruptedException
	{
	String browser = ReadData.readPropertyFile("Browser");// it checks the browser name present in the (config.properties), and according to that below blocks are run.
		                                                  //ReadData.readPropertyFile("Browser")= from ReadData class , readPropertyFile mehod-- read the property
	                                                             // and then stored it in a variable browser(name stored in config.properties)
	if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get(ReadData.readPropertyFile("URL"));
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
		
		
	}
	
	
}
