package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckOutPageOne4 extends TestBase
{
//object repository
	
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement swaglabLable;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")private WebElement cartlogo; // cart logo with count
	@FindBy(xpath = "//span[text()='Checkout: Your Information']") private WebElement checkout_informationText;
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement FirstName ;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement LastName;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']") private WebElement postalCode ;
	@FindBy(xpath = "//input[@name='continue']") private WebElement continueBtn;
	@ FindBy(xpath = "//button[@data-test='cancel']") private WebElement cancelBtn;
	
	//constructor
	
	public CheckOutPageOne4()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	// methods
	
	public String verifyswaglabtext()
	{
		return swaglabLable.getText();
		
	}
	
	public boolean verifycartlogo()
	{
		
		return cartlogo.isDisplayed();
		
	}
	
	public String verifycheckout_informationText()
	{
		return checkout_informationText.getText();
		
	}
	
	public String verifyInputInforation()
	{
		FirstName.sendKeys("ajit"); // first name , lastname , postal code, continue button all are rrelated to each other .... hence all are written in one method.		
		LastName.sendKeys("patil");  // to complete this process all these elements are compulsary.
		postalCode.sendKeys("431110"); // by writing single element process can't complete.
		continueBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifycontinueBtn()
	{
		FirstName.sendKeys("ajit");
		LastName.sendKeys("patil");
		postalCode.sendKeys("431110");
		continueBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	public String verifycancelBtn()
	{
		cancelBtn.click();
		return driver.getCurrentUrl();
		
	}
	
	
}
