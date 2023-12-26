package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
import utility.Handle_dropdownLiist;

public class Inventory_page2 extends TestBase 
{
       // object repository
	@FindBy(xpath = "//span[@class='title']") private WebElement productsLable;// x path for product label
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement swaglabtext;// swag labs text
	
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement menubutton;// 3 horizental lines , menu
	@FindBy(xpath = "//a[@id='inventory_sidebar_link']") private WebElement allitem_link;
	@FindBy(xpath = "//a[@id='about_sidebar_link']")private WebElement about_link;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement logout_link;
	@FindBy(xpath = "//a[@id='reset_sidebar_link']") private WebElement reset_link;
	
	
	@FindBy(xpath = "//a[@class='shopping_cart_link']")WebElement emptyAddToCart; // x path of add to cart basket when basket is empty
	@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartCount; // xpath of count (only) present on cart
	
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement dropDown;// xpath of listbox(name a-z)
	
	// images
	@FindBy(xpath = "//img[@alt='Sauce Labs Backpack']")private WebElement backPackProduct_image;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bike Light']") private WebElement bikeLightProduct_image;
	@FindBy(xpath = "//img[@alt='Sauce Labs Bolt T-Shirt']") private WebElement bolttshirt_image;
	@FindBy(xpath = "//img[@alt='Sauce Labs Fleece Jacket']") private WebElement fleecejacket_image;
	@FindBy(xpath = "//img[@alt='Sauce Labs Onesie']") private WebElement onesie_image;
	@FindBy(xpath = "//img[@alt='Test.allTheThings() T-Shirt (Red)']") private WebElement tshirtred_image;
	
	//text
	@FindBy(xpath = "//div[text()='Sauce Labs Backpack']") private WebElement backpaktext;
	@FindBy(xpath = "//div[text()='Sauce Labs Bike Light']")private WebElement bikeLightProducttext;
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")private WebElement bolttshirttext;
	@FindBy(xpath = "//div[text()='Sauce Labs Fleece Jacket']")private WebElement fleecejackettext;
	@FindBy(xpath = "//div[text()='Sauce Labs Onesie']")private WebElement onesietext;
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")private WebElement tshirtredtext;
	
	//text
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[1]") private WebElement backPackProduct_text;
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[2]") private WebElement bikeLightProduct_text;
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[3]") private WebElement bolttshirt_text;
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[4]") private WebElement fleecejacket_text;
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[5]") private WebElement onesie_text;
	@FindBy(xpath = "(//div[@class='inventory_item_desc'])[6]") private WebElement tshirtred_text;
	
	//price
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[1]")private WebElement backPackProductprice;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[2]")private WebElement bikeLightProductprice;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[3]")private WebElement bolttshirtprice;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[4]")private WebElement fleecejacketprice;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[5]")private WebElement onesieprice;
	@FindBy(xpath = "(//div[@class='inventory_item_price'])[6]")private WebElement tshirtredprice;
	
	
	
	// add to cart buttons for adding items(i.e.add to cart)
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backPackProduct;// xpath for bagpack add to cart button
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;// x path for bike light add to cart btn
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement bolttshirt;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleecejacket;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesie;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtred ;
	
	// add to cart buttons for removing items(i.e.remove)
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement backPackProduct_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement bikeLightProduct_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement bolttshirt_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement fleecejacket_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']") private WebElement onesie_remove;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement tshirtred_remove ;
	
	//logo
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement twitterLogo;// x path for twitter logo
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement facebooklogo;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkedinlogo;
	
	//text
	@FindBy(xpath = "//div[@class='footer_copy']") private WebElement footertext;
	
	//constructor 
	
	public Inventory_page2()// after object repository , create the constructor for that respective class, and write below method.
	{
		PageFactory.initElements(driver, this);//initElements= initializes the elements present in this webpage., this= that particular webelement.
	}
	
	// TESTCASES //
	
	public String verifyproductsLable()
	{
		return productsLable.getText(); // productsLable= from object repository(x path object)
		
	}
	
	public String verifyswaglabtext()
	{
		return swaglabtext.getText();
		
	}
	
	 public boolean verifymenubutton() // logo hence use boolean
	 {
		 menubutton.click();
		return menubutton.isDisplayed();
		
	 }
	
	public String verifyallitem_link()
	{
		allitem_link.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifyabout_link()
	{
		about_link.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifylogout_link()
	{
		logout_link.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifyreset_link()
	{
		reset_link.click();
		return driver.getCurrentUrl();
	}
	
	public boolean verifyemptyAddToCart()
	{
		return emptyAddToCart.isDisplayed();
	}
	
	public boolean verifycartCount()
	{
		backPackProduct.click();
		fleecejacket.click();
		return cartCount.isDisplayed();
		
	}
	
	public boolean verifydropDown()
	{
		
		return dropDown.isDisplayed();
		
	}
	
	public boolean verifybackPackProduct_image()
	{
		return backPackProduct_image.isDisplayed();
		
	}
	
	public boolean verifybikeLightProduct_image()
	{
		return bikeLightProduct_image.isDisplayed();
		
	}
	
	public boolean verifyfleecejacket_image()
	{
		return fleecejacket_image.isDisplayed();
		
	}
	
	public boolean verifybolttshirt_image()
	{
		return bolttshirt_image.isDisplayed();
		
	}
	
	public boolean verifyonesie_image()
	{
		return onesie_image.isDisplayed();
		
	}
	
	public boolean verifytshirtred_image()
	{
		return tshirtred_image.isDisplayed();
		
	}
	
	public String verifybackpaktext()
	{
		return backpaktext.getText();
		
	}
	
	public String verifybikeLightProducttext()
	{
		return bikeLightProducttext.getText();
		
	}
	
	public String verifybolttshirttext()
	{
		return bolttshirttext.getText();
		
	}
	
	public String verifyfleecejackettext()
	{
		return fleecejackettext.getText();
		
	}
	
	public String verifyonesietext()
	{
		return onesietext.getText();
		
	}
	
	public String verifytshirtredtext()
	{
		return tshirtredtext.getText();
		
	}
	
	public String verifybackPackProduct_text()
	{
		return backPackProduct_text.getText();
		
	}
	
	public String verifybikeLightProduct_text()
	{
		return bikeLightProduct_text.getText();
		
	}
	
	public String verifybolttshirt_text()
	{
		return bolttshirt_text.getText();
		
	}
	
	public String verifyfleecejacket_text()
	{
		return fleecejacket_text.getText();
		
	}
	
	public String verifyonesie_text()
	{
		return onesie_text.getText();
		
	}
	
	public String verifytshirtred_text()
	{
		return tshirtred_text.getText();
		
	}
	
	public String verifybackPackProductprice()
	{
		return backPackProductprice.getText();
		
	}
	
	public String verifybikeLightProductprice()
	{
		return bikeLightProductprice.getText();
		
	}
	
	public String verifybolttshirtprice()
	{
		return bolttshirtprice.getText();
		
	}
	
	public String verifyfleecejacketprice()
	{
		return fleecejacketprice.getText();
		
	}
	
	public String verifyonesieprice()
	{
		return onesieprice.getText();
		
	}
	
	public String verifytshirtredprice()
	{
		return tshirtredprice.getText();
		
	}
	
	public boolean verifybackPackProduct()
	{
		backPackProduct.click();
		return backPackProduct.isDisplayed();
		
	}
	
	public boolean verifybikeLightProduct()
	{
		bikeLightProduct.click();
		return bikeLightProduct.isDisplayed();
		
	}
	
	public boolean verifybolttshirt()
	{
		bolttshirt.click();
		return bolttshirt.isDisplayed();
		
	}
	
	public boolean verifyfleecejacket()
	{
		fleecejacket.click();
		return fleecejacket.isDisplayed();
		
	}
	
	public boolean verifyonesie()
	{
		onesie.click();
		return onesie.isDisplayed();
		
	}
	
	public boolean verifytshirtred()
	{
		tshirtred.click();
		return tshirtred.isDisplayed();
		
	}
	
	public String verifybackPackProduct_remove()
	{
		
		backPackProduct_remove.click();
		return cartCount.getText();
		
	}
	
	public String verifybikeLightProduct_remove()
	{
		bikeLightProduct_remove.click();
		return cartCount.getText();
		
	}
	
	public String verifybolttshirt_remove()
	{
		bolttshirt_remove.click();
		return cartCount.getText();
		
	}
	
	public String verifyfleecejacket_remove()
	{
		fleecejacket_remove.click();
		return cartCount.getText();
		
	}
	
	public String verifyonesie_remove()
	{
		onesie_remove.click();
		return cartCount.getText();
		
	}
	
	public String verifytshirtred_remove()
	{
		tshirtred_remove.click();
		return cartCount.getText();
		
	}
	
	public boolean verifytwitterLogo() // for image,logo use boolean datatype , it provide output in true or false***********
	{
		return twitterLogo.isDisplayed(); // isDisplayed= logo is present or not 
		                                  // twitterLogo= x path is stored in this object
		
	}
	
	public boolean verifyfacebooklogo()
	{
		return facebooklogo.isDisplayed();
		
		
	}
	
	public boolean verifylinkedinlogo()
	{
		return linkedinlogo.isDisplayed();
		
	}
	
	public boolean verifyfootertext()
	{
		return footertext.isDisplayed();
		
	}
	
	public String add6Products() // add to cart buttons, dependent on the add to cart basket , hence declared it in one method.
	{
		// before selecting the items , we have to choose the filter(listbox), after selecting anyone option , then we add the items.
		// hence before adding the items we have to handle the listbox.
		// to add the items we have to click on the add to cart buttn for each element
		
		Handle_dropdownLiist.handleSelectClass(dropDown, "Price (low to high)"); //class_name.method(element,value)
		
		backPackProduct.click();
		bikeLightProduct.click();
		bolttshirt.click();
		fleecejacket.click();
		onesie.click();
		tshirtred.click();
		
		return cartCount.getText();//cartCount = object = when cart is having some items.
		                               // return the count present in add to cart basket after adding items.
		                              
	}
	
	public String remove6Products()
	{
		// for removing the items we have to click on the remove button for each item
		
		add6Products(); // declare the add element method.( for removing the items we have to add the first , then only we can remove it)
		
		backPackProduct_remove.click();// here we remove 4 elements , if we have to remove only 2 items , then declared only 2 items in this method
		bikeLightProduct_remove.click();
		bolttshirt_remove.click();
		fleecejacket_remove.click();
		
		
		
		return cartCount.getText();//cartCount = object =when cart contains the items
		                          // return the count present in add to cart basket after removing items.
	}
	
}
