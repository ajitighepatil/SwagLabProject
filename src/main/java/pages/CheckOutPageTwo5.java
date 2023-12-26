package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPageTwo5 extends TestBase
{
	//object repository
	
	@FindBy(xpath = "//span[@class='title']") private WebElement checkoutText;
	@FindBy(xpath = "//div[text()='Payment Information']") private WebElement paymentInfo;
	@FindBy(xpath = "//div[text()='SauceCard #31337']")private WebElement saucecard;
	@FindBy(xpath = "//div[text()='Shipping Information']") private WebElement shippingInfo;
	@FindBy(xpath = "//div[text()='Free Pony Express Delivery!']") private WebElement fpeDelivery;
	@FindBy(xpath = "//div[text()='Price Total']") private WebElement priceTotal;
	@FindBy(xpath = "//button[@name='cancel']") private WebElement cancelbtn;
	@FindBy(xpath = "//button[@name='finish']") private WebElement finishbtn;

	
	//constructor 
	
	public CheckOutPageTwo5()
	{
		PageFactory.initElements(driver, this);
	}
	
	// methods 
	
	public String verifycheckoutText()
	{
		return checkoutText.getText();
		
	}
	
	public String verifypaymentInfo()
	{
		return paymentInfo.getText();
		
	}
	
	public String verifysaucecard()
	{
		return saucecard.getText();
		
	}
	
	public String verifyshippingInfo()
	{
		return shippingInfo.getText();
		
	}
	
	public String verifyfpeDelivery()
	{
		return fpeDelivery.getText();
		
	}
	
	public String verifypriceTotal()
	{
		return priceTotal.getText();
		
	}
	
	public String verifycancelbtn()
	{
		cancelbtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifyfinishbtn()
	{
		finishbtn.click();
		return driver.getCurrentUrl();
		
	}
	
	
}
