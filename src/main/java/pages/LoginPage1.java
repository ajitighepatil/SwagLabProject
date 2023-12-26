package pages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.ReadData;

public class LoginPage1 extends TestBase // for each web pages different class is created in (pages) package. // inheritance concept
{
	//object repository
	@FindBy(xpath = "//input[@name='user-name']") private WebElement usernameTextBox;// x path for username text box. // variables are private
	@FindBy(xpath = "//input[@name='password']") private WebElement passwordTextBox; // x path for password textbox
	@FindBy(xpath = "//input[@name='login-button']")private WebElement loginButton; // x path for log in button.
	
	public LoginPage1()// this is constructor , name is same as class
	{  // constructor checks the element is present or not
		PageFactory.initElements(driver, this);// to initialize data member in page factory we need to use initElements method in constructor
		                                       // select init element =lement locator factory factory,object page
		                                       // PageFactory= class,
	}
	
	public String  loginToApplication() throws IOException   // method is created for every task.// instead of void primitive datatype is used// methods are public
	{
		
		 // ********* login to application by using values directly.
		
		/*usernameTextBox.sendKeys("standard_user");  // for login to application username, password and login button are compulsory, --- hence they all written in one method 
		passwordTextBox.sendKeys("secret_sauce");
		loginButton.click();
		
		return driver.getCurrentUrl();// after login new page opens , return that page url.
		*/
		
		//***********  login to application by using config.properties file data
		
		usernameTextBox.sendKeys(ReadData.readPropertyFile("UserName"));// takes the values from ReadData class
		passwordTextBox.sendKeys(ReadData.readPropertyFile("Password"));
		loginButton.click();
		
		return driver.getCurrentUrl();
	}
	
	public String loginToAppWithMultiCreds(String UN,String PASS) throws IOException // this method is for multi testdata.
	 // in this method we have to pass multi username, and multi password values , Hence pass parameters for it.
	{
		usernameTextBox.sendKeys(UN);
		passwordTextBox.sendKeys(PASS);
		loginButton.click();
		
		return driver.getCurrentUrl();
		
	}
	
	
	public String verifyTitleofApplication () // method to get the title of the page.
	                                          // this is return type method( no void is used)
	{
		return driver.getTitle();
		
	}
	
	public String verifyUrlofApplication ()
	{
		return driver.getCurrentUrl();
		
	}
	
	
}
// encapsulation = methods are public and variables are private.