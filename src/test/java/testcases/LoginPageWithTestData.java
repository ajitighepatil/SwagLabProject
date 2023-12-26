   // same loginPage1 class is applicable for it.
    // we also write this program in LoginPageTest class, but it makes more mixing  .
  // before and after method are same , only ==> change is (dataprovider , @ test)
package testcases;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.TestBase;
import pages.LoginPage1;
import utility.Capturescreenshot;

public class LoginPageWithTestData extends TestBase
{

	 LoginPage1 login; // object creation for LoginPage1 class // to access this class data
	                 // object created globally , this object is used for all methods .
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		initialization(); // method calling
		 login=new LoginPage1();// object for login page , for this method
	}

	@DataProvider(name="Credentials") //@DataProvider = class pro ided by testng , name = keyword,
	public Object[][] getData()//Object=datatype(Supermost class). , 2 dimenssional array is used for username , password 
	{
		return new Object [][] 
		 {                                             // there are 6 pairs of username and password.
			{"standard_user","secret_sauce"}, 
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"},
			{"error_user","secret_sauce"},
			{"visual_user","secret_sauce"},
		 };
	
	}
	
	@Test(dataProvider = "Credentials") // meaning = dataprovider is used for this test.
	public void verifyloginToAppWithMultiCredsTest(String UN,String PASS) throws IOException
	{
		SoftAssert s = new SoftAssert();  // soft assert is used  , s= object for soft assert (for soft assert object is to be created)
		String expUrl="https://www.saucedemo.com/inventory.html";
		String actUrl= login.loginToAppWithMultiCreds(UN,PASS);
		s.assertEquals(expUrl,actUrl); // compare the exp and actual result
		s.assertAll(); //  to throw an exception ; shows the exception or error occurs.
	}
 

@AfterMethod
	
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

// soft assert = need to create the object ,shows the exception or error message after completing the method , not immediately when the error occurs.
// hard assert = no need to create the object , it shows the error message immediately, when error occurs , 
//               and skip the remaining lines after error occuring in the same method , and continue for next method .