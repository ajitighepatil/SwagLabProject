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
import pages.Inventory_page2;
import pages.LoginPage1;
import utility.Capturescreenshot;
import utility.ReadData;

public class CartPage3Test extends TestBase
{
	 LoginPage1 login;// object for login page1 class , declared globally , (we require thw data present in that class, for login to application)
	 Inventory_page2 invent;// object for inventory page2 class, declared globally
	 CartPage3 cartPage; // object for CartPage3Test class, declared globally

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
			
			
			}
	
	 @Test
	public void loginToCartPageTest() throws InterruptedException
	{
		String expUrl="https://www.saucedemo.com/cart.html";
		String actUrl= cartPage.loginToCartPage();
        Assert.assertEquals(expUrl, actUrl);
        Reporter.log("url after login to cart page ="+actUrl);
	
	}
	 
	@Test
	public void verifyswaglabtextTest() throws EncryptedDocumentException, IOException
	{
		//String explabletext="Swag Labs";
		String explabletext =ReadData.readExcel(0, 4) ; // parameterization(0,4)
		String actlabletext= cartPage.verifyswaglabtext();
		Assert.assertEquals(explabletext, actlabletext);
		Reporter.log( "lable of inventory page "+actlabletext);
	
	}
	
	@Test
	
	public void verifycartlogoTest()
	{
		boolean result= cartPage.verifycartlogo();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of cart logo = "+result);
		
	}
	
	@Test
	public void verifyyourCartLableTest()
	{
		String expText="Your Cart";
		String actText= cartPage.verifyyourCartLable();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of lable is ="+actText);
	}

	@Test
	public void verifyquantityLableTest()
	{
		String expText="QTY";
		String actText= cartPage.verifyquantityLable();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of lable is ="+actText);
	}
	 
	@Test
	public void verifydescriptionLableTest()
	{
		String expText="Description";
		String actText= cartPage.verifydescriptionLable();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of lable is ="+actText);
	} 
	 
	@Test
	public void verifybackpackQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifybackpackQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	}  
	 
	@Test
	public void verifybikeLightQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifybikeLightQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	}  
	 
	@Test
	public void verifyboltTShirtQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifyboltTShirtQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	} 
	 
	@Test
	public void verifyfleeceJacjetQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifyfleeceJacjetQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	} 
	 
	@Test
	public void verifyonesieQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifyonesieQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	} 
	 
	@Test
	public void verifytShirtRedQtyTest()
	{
		String expText="1";
		String actText= cartPage.verifytShirtRedQty();
		Assert.assertEquals(expText, actText);
	    Reporter.log(" text of quantity is ="+actText);
	} 
	 
	@Test
	public void verifybackpaktextTest() throws EncryptedDocumentException, IOException
	{
	    String acttext="Sauce Labs Backpack";
		//String acttext= ReadData.readExcel(0, 9);   // parameterization (0,9)
		String exptext=cartPage.verifybackpaktext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifybikeLightProducttextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Bike Light";
		String acttext= ReadData.readExcel(0, 10); // parameterization(0,10)
		String exptext=cartPage.verifybikeLightProducttext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifybolttshirttextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Bolt T-Shirt";
		String acttext= ReadData.readExcel(0, 11); // parameterization(0,11)
		String exptext=cartPage.verifybolttshirttext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifyfleecejackettextTest() throws EncryptedDocumentException, IOException
	{

		//String acttext="Sauce Labs Fleece Jacket";
		String acttext = ReadData.readExcel(0, 12);
		String exptext=cartPage.verifyfleecejackettext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifyonesietextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Onesie";
		String acttext= ReadData.readExcel(0, 13);
		String exptext=cartPage.verifyonesietext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifytshirtredtextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Test.allTheThings() T-Shirt (Red)";
		String acttext= ReadData.readExcel(0, 14); 
		String exptext=cartPage.verifytshirtredtext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifybackPackProduct_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		String acttext= ReadData.readExcel(0, 15);
		String exptext=cartPage.verifybackPackProduct_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifybikeLightProduct_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
		String acttext= ReadData.readExcel(0, 16);
		String exptext=cartPage.verifybikeLightProduct_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifybolttshirt_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
		String acttext= ReadData.readExcel(0, 17);
		String exptext=cartPage.verifybolttshirt_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifyfleecejacket_textTest() throws EncryptedDocumentException, IOException
	{
    	//String acttext="It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
		String acttext= ReadData.readExcel(0, 18);
		String exptext=cartPage.verifyfleecejacket_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifyonesie_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
		String acttext= ReadData.readExcel(0, 19);
		String exptext=cartPage.verifyonesie_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test
	public void verifytshirtred_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
		String acttext= ReadData.readExcel(0, 20);
		String exptext=cartPage.verifytshirtred_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	} 
	 
	@Test
	public void verifybackPackProductpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$29.99";
		String actprice= ReadData.readExcel(0, 21);
		String expprice=cartPage.verifybackPackProductprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test
	public void verifybikeLightProductpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$9.99";
		String actprice= ReadData.readExcel(0, 22);
		String expprice=cartPage.verifybikeLightProductprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test
	public void verifybolttshirtpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$15.99";
		String actprice=ReadData.readExcel(0, 23);
		String expprice=cartPage.verifybolttshirtprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test
	public void verifyfleecejacketprice() throws EncryptedDocumentException, IOException
	{
		//String actprice="$49.99";
		String actprice=ReadData.readExcel(0, 24);
		String expprice=cartPage.verifyfleecejacketprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test
	public void verifyonesiepriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$7.99";
		String actprice= ReadData.readExcel(0, 25);
		String expprice=cartPage.verifyonesieprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test
	public void verifytshirtredpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$15.99";
		String actprice= ReadData.readExcel(0, 26);
		String expprice=cartPage.verifytshirtredprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	 
	 @Test
		public void verifybackPackProduct_removeTest()  //logo
		{
			String actCount= "5";
			String expCount = cartPage.verifybackPackProduct_remove();// count after removing this item
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
		
	    @Test
		public void verifybikeLightProduct_removeTest()  //logo
		{

			String actCount= "5";  // every time 6 items are added in cart from before method , hence alwaysbcount is 5
			String expCount = cartPage.verifybikeLightProduct_remove();
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
		
	    @Test 
	    public void verifybolttshirt_removeTest()  //logo
		{
			String actCount= "5";
			String expCount = cartPage.verifybolttshirt_remove();
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
		
	    @Test
		public void verifyfleecejacket_removeTest()  //logo
		{

			String actCount= "5";
			String expCount = cartPage.verifyfleecejacket_remove();
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
		
	    @Test
		public void verifyonesie_removeTest()  //logo
		{
			String actCount= "5";
			String expCount = cartPage.verifyonesie_remove();
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
		
	    @Test
		public void verifytshirtred_removeTest()  //logo
		{

			String actCount= "5";
			String expCount = cartPage.verifytshirtred_remove();
			Assert.assertEquals(actCount, expCount);
			Reporter.log("visibility of remove button"+ expCount);
		}
	 
	    @Test
	 public void verifycontinueShoppingbtnTest()
	 {
		 String expUrl="https://www.saucedemo.com/inventory.html";
		 String actUrl= cartPage.verifycontinueShoppingbtn();
		 Assert.assertEquals(expUrl, actUrl);
		 Reporter.log(" url after click on continue shopping button "+actUrl);
	 }
	 
	    @Test
	 public void verifycheckoutbtnTest()
	 {
		 String expUrl="https://www.saucedemo.com/checkout-step-one.html";
		 String actUrl= cartPage.verifycheckoutbtn();
		 Assert.assertEquals(expUrl, actUrl);
		 Reporter.log(" url after click on checkout button "+actUrl);
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
