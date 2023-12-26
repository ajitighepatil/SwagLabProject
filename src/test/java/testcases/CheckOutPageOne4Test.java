package testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage3;
import pages.CheckOutPageOne4;
import pages.Inventory_page2;
import pages.LoginPage1;
import utility.Capturescreenshot;
import utility.ReadData;

public class CheckOutPageOne4Test extends TestBase 
{
	LoginPage1 login;// object for login page1 class , declared globally , (we require thw data present in that class, for login to application)
	 Inventory_page2 invent;// object for inventory page2 class, declared globally
	 CartPage3 cartPage; // object for CartPage3Test class, declared globally
	 CheckOutPageOne4 checkOutPage; // object for checkout page
	
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
			}
	 @Test
		public void verifyswaglabtextTest() throws EncryptedDocumentException, IOException
		{
			//String explabletext="Swag Labs";
			String explabletext =ReadData.readExcel(0, 4) ; // parameterization(0,4)
			String actlabletext= checkOutPage.verifyswaglabtext();
			Assert.assertEquals(explabletext, actlabletext);
			Reporter.log( "lable of inventory page "+actlabletext);
		
		}
		
		@Test
		
		public void verifycartlogoTest()
		{
			boolean result= checkOutPage.verifycartlogo();
			Assert.assertEquals(result, true);
			Reporter.log("visibility of cart logo = "+result);
			
		}
		@Test
		public void verifycheckout_informationTextTest()
		{
			String expText="Checkout: Your Information";
			String actText= checkOutPage.verifycheckout_informationText();
			Assert.assertEquals(expText, actText);
			Reporter.log("the text present on this page is ="+actText);
		}
	@Test
	public void verifyInputInforationTest()
	{
		String expUrl="https://www.saucedemo.com/checkout-step-two.html";
		String actUrl= checkOutPage.verifyInputInforation();
		 Assert.assertEquals(expUrl, actUrl);
		 Reporter.log(actUrl);
		
		
	}
	 @Test
	 public void verifycontinueBtnTest()
	 {
      	String expUrl="https://www.saucedemo.com/checkout-step-two.html";
		String actUrl= checkOutPage.verifycontinueBtn();
		 Assert.assertEquals(expUrl, actUrl);
		 Reporter.log(actUrl);
	 }
	 @Test
	 public void verifycancelBtnTest()
	 {
		String expUrl="https://www.saucedemo.com/cart.html";
		String actUrl= checkOutPage.verifycancelBtn();
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
