package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage3;
import pages.CheckOutPageOne4;
import pages.CheckOutPageTwo5;
import pages.FinishPage6;
import pages.Inventory_page2;
import pages.LoginPage1;
import utility.Capturescreenshot;

public class FinishPage6Test extends TestBase
{
	LoginPage1 login;// object for login page1 class , declared globally , (we require thw data present in that class, for login to application)
	 Inventory_page2 invent;// object for inventory page2 class, declared globally
	 CartPage3 cartPage; // object for CartPage3Test class, declared globally
	 CheckOutPageOne4 checkOutPage; // object for checkout page
	 CheckOutPageTwo5 checkoutPage2;
	 FinishPage6 finish;
	
	 @BeforeMethod
	 public void setup() throws IOException, InterruptedException
	 {
		 initialization();   /// calling of method
		    login=new LoginPage1();// object for login page1 class , for this method
			invent = new Inventory_page2(); // object for inventory page2 class 
			cartPage=new CartPage3();
			login.loginToApplication(); // login to the application is necessary
			invent.add6Products();
			cartPage.loginToCartPage(); // this method includes the clicking on cart logo , to login the cart page
			checkOutPage= new CheckOutPageOne4();
			cartPage.verifycheckoutbtn();
			checkoutPage2 =new CheckOutPageTwo5();
			checkOutPage.verifycontinueBtn();
			finish = new FinishPage6();
			checkoutPage2.verifyfinishbtn();
	 }
	
	 @Test
	 public void verifycheckoutTextTest()
	 {
		 String expText="Checkout: Complete!";
		 String actText= finish.verifycheckoutText();
		 Assert.assertEquals(expText, actText);
				Reporter.log(actText);
	 }
	 
	 @Test
	 public void verifyverifyimageTest()
	 {
		 boolean result= finish.verifyimage();
		 Assert.assertEquals(result, true);
		 Reporter.log("visibility of image ="+result);
	 }
	 
	 @Test
	 public void verifyheaderTest()
	 {
		 String expText="Thank you for your order!";
		 String actText= finish.verifyheader();
		 Assert.assertEquals(expText, actText);
				Reporter.log(actText);
	 }
	 
	 @Test
	 public void verifytext2Test()
	 {
		 String expText="Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		 String actText= finish.verifytext2();
		 Assert.assertEquals(expText, actText);
				Reporter.log(actText);
	 }
	 
	 @Test
	public void verifybackHomwbtnTest()
	{
		String expUrl="https://www.saucedemo.com/inventory.html";
		String actUrl= finish.verifybackHomwbtn();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log(actUrl);
	}
	 
	 
	 @AfterMethod
		public void closeBrowser(ITestResult it) throws IOException
		{
			if(it.FAILURE==it.getStatus())
			{
				Capturescreenshot.screenshot(it.getName());
			}
			
			
			driver.close();
		}
	


}
