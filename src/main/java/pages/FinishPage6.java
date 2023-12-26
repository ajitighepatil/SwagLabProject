package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FinishPage6 extends TestBase
{
	// object repository 
	
	@FindBy(xpath = "//span[@class='title']") private WebElement checkoutText;
	@FindBy(xpath = "//img[@alt='Pony Express']") private WebElement image;
	@ FindBy(xpath = "//h2[@class='complete-header']") private WebElement header;
	@FindBy(xpath = "//div[@class='complete-text']") private WebElement text2;
	@FindBy(xpath = "//button[@name ='back-to-products']") private WebElement backHomwbtn;
	
    public FinishPage6()
  {
	PageFactory.initElements(driver, this);
  }
	// methods 
    
	public String verifycheckoutText()
	{
		return checkoutText.getText();
		
	}
	
	public boolean verifyimage()
	{
		return image.isDisplayed();
		
	}
	
	public String verifyheader()
	{
		return header.getText();
		
	}
	
	public String verifytext2()
	{
		return text2.getText();
		
	}
	
	public String verifybackHomwbtn()
	{
		backHomwbtn.click();
		return driver.getCurrentUrl();
		
	}


	
}
