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
import pages.Inventory_page2;
import pages.LoginPage1;
import utility.Capturescreenshot;

public class CheckOutPageTwo5Test extends TestBase
{
	LoginPage1 login;// object for login page1 class , declared globally , (we require thw data present in that class, for login to application)
	 Inventory_page2 invent;// object for inventory page2 class, declared globally
	 CartPage3 cartPage; // object for CartPage3Test class, declared globally
	 CheckOutPageOne4 checkOutPage; // object for checkout page
	 CheckOutPageTwo5 checkoutPage2;
	 
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
	 }
	 
	@Test
      public void verifycheckoutTextTest()
       {
    	  String actText="Checkout: Overview";
    	  String expText=checkoutPage2.verifycheckoutText();
    	  Assert.assertEquals(actText, expText);
    	  Reporter.log(expText);
    	  
	   }
	 
	@Test
	 public void verifypaymentInfoTest()
	 {
	  String actText="Payment Information";
   	  String expText=checkoutPage2.verifypaymentInfo();
   	  Assert.assertEquals(actText, expText);
   	  Reporter.log(expText);
		 
	 }
	 
	@Test
	 public void verifysaucecardTest()
	 {
		 String actText="SauceCard #31337";
	   	  String expText=checkoutPage2.verifysaucecard();
	   	  Assert.assertEquals(actText, expText);
	   	  Reporter.log(expText);
	 }
	 
	@Test
	 public void verifyshippingInfoTest()
	 {

		 String actText="Shipping Information";
	   	  String expText=checkoutPage2.verifyshippingInfo();
	   	  Assert.assertEquals(actText, expText);
	   	  Reporter.log(expText);
	 }
	 
	@Test
	 public void verifyfpeDeliveryTest()
	 {
		 String actText="Free Pony Express Delivery!";
	   	  String expText=checkoutPage2.verifyfpeDelivery();
	   	  Assert.assertEquals(actText, expText);
	   	  Reporter.log(expText);
	 }
	 
	@Test
	 public void verifypriceTotalTest()
	 {
		 String actText="Price Total";
	   	  String expText=checkoutPage2.verifypriceTotal();
	   	  Assert.assertEquals(actText, expText);
	   	  Reporter.log(expText);
	 }
	 
	@Test
	 public void verifycancelbtnTest()
	 {
		 String actUrl="https://www.saucedemo.com/inventory.html";
	   	  String expUrl=checkoutPage2.verifycancelbtn();
	   	  Assert.assertEquals(actUrl, expUrl);
	   	  Reporter.log(expUrl);
	 }
	 
	@Test
	 public void verifyfinishbtnTest()
	 {
		 String actUrl="https://www.saucedemo.com/checkout-complete.html";
	   	  String expUrl=checkoutPage2.verifyfinishbtn();
	   	  Assert.assertEquals(actUrl, expUrl);
	   	  Reporter.log(expUrl);
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
