package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage3 extends TestBase
{

	// object repository 
	
	@FindBy(xpath = "//div[text()='Swag Labs']") private WebElement swaglabLable;// swag labs text
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement cartlogo; // cart logo with count 
	@FindBy(xpath = "//span[@class='title']") private WebElement yourCartLable ;   // your cart text
	@ FindBy(xpath = "//div[@class='cart_quantity_label']") private WebElement quantityLable; // quantity
	@FindBy(xpath = "//div[@class='cart_desc_label']") private WebElement descriptionLable;  // description lable
	
	//itemNumber
	@FindBy(xpath = "(//div[text()='1'])[1]") private WebElement backpackQty ;
	@FindBy(xpath = "(//div[text()='1'])[2]") private WebElement bikeLightQty ;
	@FindBy(xpath = "(//div[text()='1'])[3]") private WebElement boltTShirtQty ;
	@FindBy(xpath = "(//div[text()='1'])[4]") private WebElement fleeceJacjetQty ;
	@FindBy(xpath = "(//div[text()='1'])[5]") private WebElement onesieQty ;
	@FindBy(xpath = "(//div[text()='1'])[6]") private WebElement tShirtRedQty ;
	
	//labletext
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
	
	// add to cart buttons for removing items(i.e.remove)
	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']") private WebElement backPackProduct_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']") private WebElement bikeLightProduct_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")private WebElement bolttshirt_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']") private WebElement fleecejacket_remove;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']") private WebElement onesie_remove;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']") private WebElement tshirtred_remove ;
		
	@FindBy(xpath = "//button[@data-test='continue-shopping']")	private WebElement continueShoppingbtn;
	@FindBy(xpath = "//button[@class='btn btn_action btn_medium checkout_button ']") private WebElement checkoutbtn;	
	
	// add to cart buttons for adding items(i.e.add to cart)
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") private WebElement backPackProduct;// xpath for bagpack add to cart button
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;// x path for bike light add to cart btn
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement bolttshirt;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']") private WebElement fleecejacket;
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']") private WebElement onesie;
		@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement tshirtred ;
		
		@FindBy(xpath = "//span[@class='shopping_cart_badge']") private WebElement cartCount; // xpath of count (only) present on cart
		
	//constructor
	
	public CartPage3()
	{
		PageFactory.initElements(driver, this);
	}
	
	//testcases
	
	public String verifycartCount()
	{
		return cartCount.getText();
		
	}
	
	public String loginToCartPage() throws InterruptedException
	{
		cartlogo.click();
		//Thread.sleep(5000);
		return driver.getCurrentUrl();
	}
	
	public String verifyswaglabtext()
	{
		return swaglabLable.getText();
		
	}
	
	public boolean verifycartlogo()
	{
		cartlogo.click();
		return cartlogo.isDisplayed();
		
	}
	
	public String verifyyourCartLable()
	{
		return yourCartLable.getText();
		
	}
	
	public String verifyquantityLable()
	{
		return quantityLable.getText();
		
	}
	
	public String verifydescriptionLable()
	{
		return descriptionLable.getText();
		
	}
	
	public String verifybackpackQty()
	{
		return backpackQty.getText();
		
	}
	
	public String verifybikeLightQty()
	{
		return bikeLightQty.getText();
		
	}
	
	public String verifyboltTShirtQty()
	{
		return boltTShirtQty.getText();
		
	}
	
	public String verifyfleeceJacjetQty()
	{
		return fleeceJacjetQty.getText();
		
	}
	
	public String verifyonesieQty()
	{
		return onesieQty.getText();
		
	}
	
	public String verifytShirtRedQty()
	{
		return tShirtRedQty.getText();
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
	
	public String verifycontinueShoppingbtn()
	{
		continueShoppingbtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifycheckoutbtn()
	{
		checkoutbtn.click();
		return driver.getCurrentUrl();
		
	}
	
	
	
}
