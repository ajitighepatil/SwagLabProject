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
import pages.Inventory_page2;
import pages.LoginPage1;
import utility.Capturescreenshot;
import utility.ReadData;

public class Inventory_page2Test extends TestBase
{
	 LoginPage1 login;// object for login page1 class , declared globally , (we require thw data present in that class, for login to application)
	 Inventory_page2 invent;// object for inventory page2 class, declared globally
	
	
	
	@BeforeMethod(alwaysRun = true)
	public void setup() throws InterruptedException, IOException
	{
	initialization();   /// calling of method
    login=new LoginPage1();// object for login page1 class , for this method
	invent = new Inventory_page2(); // object for inventory page2 class 
	login.loginToApplication(); // for login to the application is necessary //calling loginToApplication() method from login(object for loginpage1 class) class.
	invent.add6Products();
	}
	@Test(groups = {"retesting","regression"})
	
	public void verifyproductsLableTest() throws EncryptedDocumentException, IOException
	{
		//String expLable="Products";
		String expLable= ReadData.readExcel(0, 3);// parameterization(0,3)
		String actLable=invent.verifyproductsLable();
		Assert.assertEquals(expLable, actLable);
		Reporter.log("lable of inventory page="+ actLable); // Reporter= gives detailed information in projectb report.
		
	}
	
	@Test(groups = "retesting")
	public void verifyswaglabtextTest() throws EncryptedDocumentException, IOException
	{
		//String explabletext="Swag Labs";
		String explabletext =ReadData.readExcel(0, 4) ; // parameterization(0,4)
		String actlabletext= invent.verifyswaglabtext();
		Assert.assertEquals(explabletext, actlabletext);
		Reporter.log( "lable of inventory page "+actlabletext);
	
	}
	
	@Test(groups = "regression")
	public void verifyverifymenubuttonTest()  //logo
	{
		boolean result=invent.verifymenubutton();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of menu button"+result);
	}
	
	@Test(groups ="sanity")
	public void verifyallitem_linkTest() throws EncryptedDocumentException, IOException
	{
		String actlinktext="All Items";
		//String actlinktext= ReadData.readExcel(0, 5); // parameterization 
		String explinktext=invent.verifyallitem_link();	
		Assert.assertEquals(actlinktext, explinktext);
		Reporter.log(actlinktext);
	}
	
	@Test(groups = {"sanity"})
	public void verifyabout_linkTest() throws EncryptedDocumentException, IOException
	{
		//String actlinktext="About";
		String actlinktext= ReadData.readExcel(0, 6);// parameterization (0,6)
		String explinktext=invent.verifyabout_link();
		Assert.assertEquals(actlinktext, explinktext);
		Reporter.log(actlinktext);
	}
	
	@Test(groups = {"regression"})
	public void verifylogout_linkTest() throws EncryptedDocumentException, IOException
	{
		//String actlinktext="Logout";
		String actlinktext= ReadData.readExcel(0, 7); // parameterization (0,7)
		String explinktext=invent.verifylogout_link();		
		Assert.assertEquals(actlinktext, explinktext);
		Reporter.log(actlinktext);
	}
	
	@Test(groups = {"retesting"})
	public void verifyreset_linkTest() throws EncryptedDocumentException, IOException
	{
		//String actlinktext="Reset App State";
		String actlinktext= ReadData.readExcel(0, 8); // parameterization (0,8)
		String explinktext=	invent.verifyreset_link();	
		Assert.assertEquals(actlinktext, explinktext);
		Reporter.log(actlinktext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyemptyAddToCartTest()
	{
		boolean result = invent.verifyemptyAddToCart();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of empty add to cart"+result);
	}
	
	@Test  ( groups = {"sanity","regression"})                                    //this method will running after adding items to the cart
	public void verifycartCountTest()
	{
		boolean result= invent.verifycartCount();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of cart count "+result);
		
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifydropDownTest()
	{
		boolean result = invent.verifydropDown();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of dropdown list"+result);
		
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybackPackProduct_imageTest()
	{
		boolean result= invent.verifybackPackProduct_image();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of backpack product image= "+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybikeLightProduct_imageTest()
	{
		boolean result= invent.verifybikeLightProduct_image();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of bike light product image ="+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyfleecejacket_imageTest()
	{
		boolean result= invent.verifyfleecejacket_image();
		Assert.assertEquals(result, true);
	    Reporter.log("visibility of jacket image ="+result);	
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybolttshirt_imageTest()
	{
		
		boolean result = invent.verifybolttshirt_image();
		Assert.assertEquals(result, true);
		Reporter.log("visibilty of bolt t shirt image ="+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyonesie_imageTest()
	{
		boolean result= invent.verifyonesie_image();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of onesie image ="+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifytshirtred_imageTest()
	{
		boolean result =invent.verifytshirtred_image();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of red shirt image ="+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybackpaktextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Backpack";
		String acttext= ReadData.readExcel(0, 9);   // parameterization (0,9)
		String exptext=invent.verifybackpaktext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybikeLightProducttextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Bike Light";
		String acttext= ReadData.readExcel(0, 10); // parameterization(0,10)
		String exptext=invent.verifybikeLightProducttext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybolttshirttextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Bolt T-Shirt";
		String acttext= ReadData.readExcel(0, 11); // parameterization(0,11)
		String exptext=invent.verifybolttshirttext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyfleecejackettextTest() throws EncryptedDocumentException, IOException
	{

		//String acttext="Sauce Labs Fleece Jacket";
		String acttext = ReadData.readExcel(0, 12);
		String exptext=invent.verifyfleecejackettext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyonesietextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Sauce Labs Onesie";
		String acttext= ReadData.readExcel(0, 13);
		String exptext=invent.verifyonesietext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifytshirtredtextTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Test.allTheThings() T-Shirt (Red)";
		String acttext= ReadData.readExcel(0, 14); 
		String exptext=invent.verifytshirtredtext();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybackPackProduct_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		String acttext= ReadData.readExcel(0, 15);
		String exptext=invent.verifybackPackProduct_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybikeLightProduct_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
		String acttext= ReadData.readExcel(0, 16);
		String exptext=invent.verifybikeLightProduct_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybolttshirt_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
		String acttext= ReadData.readExcel(0, 17);
		String exptext=invent.verifybolttshirt_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyfleecejacket_textTest() throws EncryptedDocumentException, IOException
	{
    	//String acttext="It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
		String acttext= ReadData.readExcel(0, 18);
		String exptext=invent.verifyfleecejacket_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyonesie_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
		String acttext= ReadData.readExcel(0, 19);
		String exptext=invent.verifyonesie_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifytshirtred_textTest() throws EncryptedDocumentException, IOException
	{
		//String acttext="This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
		String acttext= ReadData.readExcel(0, 20);
		String exptext=invent.verifytshirtred_text();
		Assert.assertEquals(acttext, exptext);
		Reporter.log(acttext);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybackPackProductpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$29.99";
		String actprice= ReadData.readExcel(0, 21);
		String expprice=invent.verifybackPackProductprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybikeLightProductpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$9.99";
		String actprice= ReadData.readExcel(0, 22);
		String expprice=invent.verifybikeLightProductprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifybolttshirtpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$15.99";
		String actprice=ReadData.readExcel(0, 23);
		String expprice=invent.verifybolttshirtprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyfleecejacketprice() throws EncryptedDocumentException, IOException
	{
		//String actprice="$49.99";
		String actprice=ReadData.readExcel(0, 24);
		String expprice=invent.verifyfleecejacketprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyonesiepriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$7.99";
		String actprice= ReadData.readExcel(0, 25);
		String expprice=invent.verifyonesieprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifytshirtredpriceTest() throws EncryptedDocumentException, IOException
	{
		//String actprice="$15.99";
		String actprice= ReadData.readExcel(0, 26);
		String expprice=invent.verifytshirtredprice();
		Assert.assertEquals(actprice, expprice);
		Reporter.log(actprice);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifybackPackProductTest()  //logo
	{
		boolean result=invent.verifybackPackProduct();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifybikeLightProductTest()  //logo
	{
		boolean result=invent.verifybikeLightProduct();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifybolttshirtTest()  //logo
	{
		boolean result=invent.verifybolttshirt();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifyfleecejacketTest()  //logo
	{
		boolean result=invent.verifyfleecejacket();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifyonesieTest()  //logo
	{
		boolean result=invent.verifyonesie();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifytshirtredTest()  //logo
	{
		boolean result=invent.verifytshirtred();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of add to cart button"+result);
	}
	

	/*@Test
	public void add6ProductsTest() throws EncryptedDocumentException, IOException
	{
		String expCount="6";
		//String expCount= ReadData.readExcel(0, 28);
		String actCount=invent.add6Products();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("total products added to cart ="+ actCount); 
		
	}*/
    @Test( groups = {"sanity","regression"})
	public void verifybackPackProduct_removeTest()  //logo
	{
    	
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifybikeLightProduct_removeTest()  //logo
	{
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
    @Test ( groups = {"sanity","regression"})
    public void verifybolttshirt_removeTest()  //logo
	{
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
    @Test( groups = {"retesting","regression"})
	public void verifyfleecejacket_removeTest()  //logo
	{
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
    @Test( groups = {"sanity","regression"})
	public void verifyonesie_removeTest()  //logo
	{
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
    @Test( groups = {"retesting"})
	public void verifytshirtred_removeTest()  //logo
	{
    	String actCount= "5";
		String expCount = invent.verifybackPackProduct_remove();// count after removing this item
		Assert.assertEquals(actCount, expCount);
		Reporter.log("visibility of remove button"+ expCount);
	}
	
	
	@Test( groups = {"regression"})
	public void verifytwitterLogoTest()
	{
		boolean result=invent.verifytwitterLogo();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of twitter logo="+ result); 
	}
	
	@Test( groups = {"sanity"})
	public void verifyfacebooklogoTest()
	{
		boolean result=invent.verifyfacebooklogo();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of facebook logo ="+result);
	}
	
	@Test( groups = {"sanity","retesting"})
	public void verifylinkedinlogoTest()
	{
		boolean result=invent.verifylinkedinlogo();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of facebook logo ="+result);
	}
	
	@Test( groups = {"sanity","regression"})
	public void verifyfootertextTest() throws EncryptedDocumentException, IOException
	{
		boolean result=invent.verifyfootertext();
		Assert.assertEquals(result, true);
		Reporter.log("visibility of footer text ="+result);
	}

	
	
	@Test( groups = {"retesting","regression"})
	public void remove6ProductsTest() throws EncryptedDocumentException, IOException
	{
		//String expCount="2"; // because we are removing 4 items , if we remove only 2 items , then expcount=4(6-2)
		String expCount= ReadData.readExcel(0, 29);
		String actCount=invent.remove6Products();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("total products present to cart after removing  ="+ actCount); 
	}
	
	@Test( groups = {"sanity","regression"})
	public void add6ProductsTest() throws EncryptedDocumentException, IOException
	{
		String expCount="6";
		//String expCount= ReadData.readExcel(0, 28);
		String actCount=invent.add6Products();
		Assert.assertEquals(expCount, actCount);
		Reporter.log("total products added to cart ="+ actCount); 
		
	}
	@AfterMethod(alwaysRun = true)
	public void closeBrowser(ITestResult it) throws IOException
	{
		if(it.FAILURE==it.getStatus())
		{
			Capturescreenshot.screenshot(it.getName());
		}
		
		
		driver.close();
	}
	
	
}
