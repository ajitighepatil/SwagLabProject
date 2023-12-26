package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.devtools.v109.page.Page.CaptureScreenshotFormat;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage1;
import utility.Capturescreenshot;
import utility.ReadData;

public class LoginPageTest extends TestBase  // after extends , click on import that class
                                             // name of this class should be similar to the class created in pages for understand purpose.
                                            // in this class we write the testcases of login page.
{
	 LoginPage1 login; // object creation for LoginPage1 class // to access this class data
	                 // object created globally , this object is used for all methods .
	@BeforeMethod(alwaysRun = true)
	public void setup() throws InterruptedException, IOException
	{
		initialization(); // method calling
		 login=new LoginPage1();// object for login page , for this method
	}
	
	@Test(priority = 1,enabled = true,dependsOnMethods = "verifyUrlofApplicationtest",groups = {"retesting","sanity"})//"verifyUrlofApplicationtest no ()is used
	
	public void loginToApplicationtest() throws IOException  // test case for login to application
	{
		//String expUrl="https://www.saucedemo.com/inventory.html";
		String expUrl= ReadData.readExcel(0, 0)  ;// parameterization (0,0) // read the data from readdata class and readexcel method
		String actUrl=login.loginToApplication(); // from login class , loginToApplication method.
		Assert.assertEquals(expUrl, actUrl);  // assert used for comparison
		
	}
	@Test(priority=2,enabled =true,dependsOnMethods = "verifyUrlofApplicationtest",groups = "retesting")
	public void verifyTitleofApplicationtest () throws EncryptedDocumentException, IOException
	{
		//String expTitle="Swag Labs";
		String expTitle=ReadData.readExcel(0, 1) ; // parameterization(0,1)
		String actTitle=login.verifyTitleofApplication();
		Assert.assertEquals(expTitle, actTitle);// select (Assert) from testng , and select boolean actual, booleanm expected.
	
	}
	
	@Test (priority=0,enabled = true,groups = {"sanity","regression"})// for each method @test is different
	public void verifyUrlofApplicationtest() throws EncryptedDocumentException, IOException
	{
		//String expUrl="https://www.saucedemo.com/";
		String expUrl=ReadData.readExcel(0, 2) ; // parameterization(0,2)
		String actUrl=login.verifyUrlofApplication();
        Assert.assertEquals(expUrl, actUrl);   //Assert = class
		
	}
	
	@AfterMethod(alwaysRun = true)
	
	public void closeBrowser(ITestResult it) throws IOException // ITestResult= from testng , it = object for ITestResult
	{
		if(it.FAILURE==it.getStatus()) // if test result fails then capture screenshot
		{
			Capturescreenshot.screenshot(it.getName());// Capturescreenshot(classs name) = from utility , screenshot = string name of method
		              // meaning =capture the screenshot with that method name.
		}
		
		driver.close();
	}
	
	
}

// by using priority, testcases will run according to the priority.(priority start from 0,1,2.....)OR(start from 1,2,3,.....)
//enabled = true ==> then only test case will run
//enabled = false==> then testcase will not run 
// dependsOnMethod" " ==> write for those methods, which are depends on the other methods,